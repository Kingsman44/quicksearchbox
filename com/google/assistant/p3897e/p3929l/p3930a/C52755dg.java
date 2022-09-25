package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.dg */
/* compiled from: PG */
public final class C52755dg extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52755dg f138444a;

    /* renamed from: c */
    private static volatile C63010eb f138445c;

    /* renamed from: b */
    private C62995dn f138446b = C62995dn.f170057a;

    static {
        C52755dg dgVar = new C52755dg();
        f138444a = dgVar;
        C62942bv.registerDefaultInstance(C52755dg.class, dgVar);
    }

    private C52755dg() {
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
                return newMessageInfo(f138444a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C52754df.f138443a});
            case 3:
                return new C52755dg();
            case 4:
                return new C52753de();
            case 5:
                return f138444a;
            case 6:
                C63010eb ebVar = f138445c;
                if (ebVar == null) {
                    synchronized (C52755dg.class) {
                        ebVar = f138445c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138444a);
                            f138445c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
