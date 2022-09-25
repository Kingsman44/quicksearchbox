package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5208h.C66595bu;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.vp */
/* compiled from: PG */
public final class C88274vp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88274vp f238755c;

    /* renamed from: d */
    private static volatile C63010eb f238756d;

    /* renamed from: a */
    public int f238757a;

    /* renamed from: b */
    public C66595bu f238758b;

    static {
        C88274vp vpVar = new C88274vp();
        f238755c = vpVar;
        C62942bv.registerDefaultInstance(C88274vp.class, vpVar);
    }

    private C88274vp() {
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
                return newMessageInfo(f238755c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88274vp();
            case 4:
                return new C88273vo();
            case 5:
                return f238755c;
            case 6:
                C63010eb ebVar = f238756d;
                if (ebVar == null) {
                    synchronized (C88274vp.class) {
                        ebVar = f238756d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238755c);
                            f238756d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
