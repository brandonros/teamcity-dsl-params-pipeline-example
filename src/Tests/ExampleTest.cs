using Moq;
using System.Collections.Generic;
using System.IO;
using Xunit.Abstractions;
using Xunit;

namespace Tests;

public class ExampleTest
{
    private ITestOutputHelper output;
    public ExampleTest(ITestOutputHelper output)
    {
        this.output = output;
    }

    [Fact]
    public void ShouldBeHappy()
    {
        Assert.Equal(2 + 2, 4);
    }
}
