class NonNullOnParameter extends Thread {
	NonNullOnParameter(@lombok.NonNull String arg) {
		this(arg, "");
		if (arg == null) {
			throw new java.lang.NullPointerException("arg is marked non-null but is null");
		}
	}
	NonNullOnParameter(@lombok.NonNull String arg, @lombok.NonNull String arg2) {
		super(arg);
		if (arg2 == null) {
			throw new java.lang.NullPointerException("arg2 is marked non-null but is null");
		}
		if (arg == null) throw new NullPointerException();
	}
	public void test2(@lombok.NonNull String arg, @lombok.NonNull String arg2, @lombok.NonNull String arg3) {
		if (arg == null) {
			throw new java.lang.NullPointerException("arg is marked non-null but is null");
		}
		if (arg3 == null) {
			throw new java.lang.NullPointerException("arg3 is marked non-null but is null");
		}
		if (arg2 == null) {
			throw new NullPointerException("arg2");
		}
		if (arg == null) System.out.println("Hello");
	}
	public void test3(@lombok.NonNull String arg) {
		if (arg == null) {
			throw new java.lang.NullPointerException("arg is marked non-null but is null");
		}
		if (arg != null) throw new IllegalStateException();
	}
	public void test(@lombok.NonNull String stringArg, @lombok.NonNull String arg2, @lombok.NonNull int primitiveArg) {
		if (stringArg == null) {
			throw new java.lang.NullPointerException("stringArg is marked non-null but is null");
		}
		if (arg2 == null) {
			throw new java.lang.NullPointerException("arg2 is marked non-null but is null");
		}
	}
	public void test(@lombok.NonNull String arg) {
		if (arg == null) {
			throw new java.lang.NullPointerException("arg is marked non-null but is null");
		}
		System.out.println("Hey");
		if (arg == null) throw new NullPointerException();
	}
	public void testWithAssert(@lombok.NonNull String param) {
		assert param != null;
	}
	public void testWithAssertAndMessage(@lombok.NonNull String param) {
		assert param != null : "Oops";
	}
}
