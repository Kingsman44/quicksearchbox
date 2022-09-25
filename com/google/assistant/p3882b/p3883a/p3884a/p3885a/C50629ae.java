package com.google.assistant.p3882b.p3883a.p3884a.p3885a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.b.a.a.a.ae */
/* compiled from: PG */
public final class C50629ae extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50629ae f131712d;

    /* renamed from: e */
    private static volatile C63010eb f131713e;

    /* renamed from: a */
    public int f131714a;

    /* renamed from: b */
    public C50638an f131715b;

    /* renamed from: c */
    public boolean f131716c;

    static {
        C50629ae aeVar = new C50629ae();
        f131712d = aeVar;
        C62942bv.registerDefaultInstance(C50629ae.class, aeVar);
    }

    private C50629ae() {
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
                return newMessageInfo(f131712d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50629ae();
            case 4:
                return new C50628ad();
            case 5:
                return f131712d;
            case 6:
                C63010eb ebVar = f131713e;
                if (ebVar == null) {
                    synchronized (C50629ae.class) {
                        ebVar = f131713e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131712d);
                            f131713e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
