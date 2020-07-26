package main;

import "fmt"

func gcd(m, n int) int {

	if n == 0 {
		return m
	}

	return gcd(n, m%n)
}

func gcd2( m, n int) int {
	
	for (n != 0) {
		r := m % n;
		m = n;
		n = r
	}
	return m
}

func main() {

	fmt.Println(gcd(60,24))

	fmt.Println(gcd2(60,24))
}