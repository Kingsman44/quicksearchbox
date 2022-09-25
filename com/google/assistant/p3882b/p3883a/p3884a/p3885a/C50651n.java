package com.google.assistant.p3882b.p3883a.p3884a.p3885a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.b.a.a.a.n */
/* compiled from: PG */
public final class C50651n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50651n f131753e;

    /* renamed from: f */
    private static volatile C63010eb f131754f;

    /* renamed from: a */
    public int f131755a;

    /* renamed from: b */
    public boolean f131756b;

    /* renamed from: c */
    public boolean f131757c;

    /* renamed from: d */
    public boolean f131758d;

    static {
        C50651n nVar = new C50651n();
        f131753e = nVar;
        C62942bv.registerDefaultInstance(C50651n.class, nVar);
    }

    private C50651n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f131753e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50651n();
            case 4:
                return new C50650m();
            case 5:
                return f131753e;
            case 6:
                C63010eb ebVar = f131754f;
                if (ebVar == null) {
                    synchronized (C50651n.class) {
                        ebVar = f131754f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131753e);
                            f131754f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
