package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.r */
/* compiled from: PG */
public final class C13705r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13705r f41801c;

    /* renamed from: e */
    private static volatile C63010eb f41802e;

    /* renamed from: a */
    public int f41803a = 0;

    /* renamed from: b */
    public Object f41804b;

    /* renamed from: d */
    private byte f41805d = 2;

    static {
        C13705r rVar = new C13705r();
        f41801c = rVar;
        C62942bv.registerDefaultInstance(C13705r.class, rVar);
    }

    private C13705r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f41805d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f41805d = b;
                return null;
            case 2:
                return newMessageInfo(f41801c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001м\u0000\u0002<\u0000", new Object[]{"b", "a", C13703p.class, C13707t.class});
            case 3:
                return new C13705r();
            case 4:
                return new C13704q();
            case 5:
                return f41801c;
            case 6:
                C63010eb ebVar = f41802e;
                if (ebVar == null) {
                    synchronized (C13705r.class) {
                        ebVar = f41802e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41801c);
                            f41802e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
