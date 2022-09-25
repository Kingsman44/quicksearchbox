package com.google.protos.p4880aq;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aq.w */
/* compiled from: PG */
public final class C63766w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63766w f172501c;

    /* renamed from: e */
    private static volatile C63010eb f172502e;

    /* renamed from: a */
    public int f172503a;

    /* renamed from: b */
    public C62995dn f172504b = C62995dn.f170057a;

    /* renamed from: d */
    private int f172505d;

    static {
        C63766w wVar = new C63766w();
        f172501c = wVar;
        C62942bv.registerDefaultInstance(C63766w.class, wVar);
    }

    private C63766w() {
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
                return newMessageInfo(f172501c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဌ\u0000\u00022", new Object[]{"d", "a", C63762s.f172499a, "b", C63765v.f172500a});
            case 3:
                return new C63766w();
            case 4:
                return new C63764u();
            case 5:
                return f172501c;
            case 6:
                C63010eb ebVar = f172502e;
                if (ebVar == null) {
                    synchronized (C63766w.class) {
                        ebVar = f172502e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172501c);
                            f172502e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
