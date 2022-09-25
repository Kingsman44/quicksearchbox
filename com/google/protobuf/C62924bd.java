package com.google.protobuf;

/* renamed from: com.google.protobuf.bd */
/* compiled from: PG */
final class C62924bd {

    /* renamed from: a */
    public static final C62922bb f169873a = new C62923bc();

    /* renamed from: b */
    private static final C62922bb f169874b;

    static {
        C62922bb bbVar;
        try {
            bbVar = (C62922bb) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            bbVar = null;
        }
        f169874b = bbVar;
    }

    /* renamed from: a */
    static C62922bb m95393a() {
        C62922bb bbVar = f169874b;
        if (bbVar != null) {
            return bbVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
