package com.google.protobuf;

/* renamed from: com.google.protobuf.dk */
/* compiled from: PG */
final class C62992dk {

    /* renamed from: b */
    private static final C62999dr f170050b = new C62990di();

    /* renamed from: a */
    public final C62999dr f170051a;

    public C62992dk() {
        this(m95597a());
    }

    /* renamed from: a */
    public static C62999dr m95597a() {
        C62999dr drVar;
        C62999dr[] drVarArr = new C62999dr[2];
        drVarArr[0] = C62933bm.f169960a;
        try {
            drVar = (C62999dr) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            drVar = f170050b;
        }
        drVarArr[1] = drVar;
        return new C62991dj(drVarArr);
    }

    /* renamed from: b */
    public static boolean m95598b(C62998dq dqVar) {
        return dqVar.mo58990b() == C63012ed.PROTO2;
    }

    public C62992dk(C62999dr drVar) {
        C62972cr.m95549i(drVar, "messageInfoFactory");
        this.f170051a = drVar;
    }
}
