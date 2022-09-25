package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.i */
/* compiled from: PG */
public final class C52781i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52781i f138482a;

    /* renamed from: c */
    private static volatile C63010eb f138483c;

    /* renamed from: b */
    private C62995dn f138484b = C62995dn.f170057a;

    static {
        C52781i iVar = new C52781i();
        f138482a = iVar;
        C62942bv.registerDefaultInstance(C52781i.class, iVar);
    }

    private C52781i() {
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
                return newMessageInfo(f138482a, "\u0001\u0001\u0000\u0000\u0006\u0006\u0001\u0001\u0000\u0000\u00062", new Object[]{"b", C52780h.f138481a});
            case 3:
                return new C52781i();
            case 4:
                return new C52779g();
            case 5:
                return f138482a;
            case 6:
                C63010eb ebVar = f138483c;
                if (ebVar == null) {
                    synchronized (C52781i.class) {
                        ebVar = f138483c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138482a);
                            f138483c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
