using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using DemoJenkins_NetClient.BussLog;

namespace DemoJenkins_NetClient.Test
{
    [TestClass]
    public class UnitTestCalculadora
    {
        [TestMethod]
        public void TestSuma()
        {
            Assert.AreEqual(6, CalculadoraFacade.Suma(2, 4));
        }

        [TestMethod]
        public void TestResta()
        {
            Assert.AreEqual(6, CalculadoraFacade.Resta(10, 4));
        }
    }
}
