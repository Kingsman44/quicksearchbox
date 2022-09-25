package com.google.assistant.p3781ad.p3789d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.h */
/* compiled from: PG */
public final class C48750h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48750h f126140a;

    /* renamed from: d */
    private static volatile C63010eb f126141d;

    /* renamed from: b */
    private C62995dn f126142b = C62995dn.f170057a;

    /* renamed from: c */
    private C62995dn f126143c = C62995dn.f170057a;

    static {
        C48750h hVar = new C48750h();
        f126140a = hVar;
        C62942bv.registerDefaultInstance(C48750h.class, hVar);
    }

    private C48750h() {
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
                return newMessageInfo(f126140a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"b", C48748f.f126138a, C45240c.f118157a, C48749g.f126139a});
            case 3:
                return new C48750h();
            case 4:
                return new C48747e();
            case 5:
                return f126140a;
            case 6:
                C63010eb ebVar = f126141d;
                if (ebVar == null) {
                    synchronized (C48750h.class) {
                        ebVar = f126141d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126140a);
                            f126141d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
