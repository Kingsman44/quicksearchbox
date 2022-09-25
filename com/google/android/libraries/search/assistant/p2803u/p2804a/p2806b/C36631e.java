package com.google.android.libraries.search.assistant.p2803u.p2804a.p2806b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.u.a.b.e */
/* compiled from: PG */
public final class C36631e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C36631e f95474b;

    /* renamed from: e */
    private static volatile C63010eb f95475e;

    /* renamed from: a */
    public C62995dn f95476a = C62995dn.f170057a;

    /* renamed from: c */
    private C62995dn f95477c;

    /* renamed from: d */
    private C62995dn f95478d;

    static {
        C36631e eVar = new C36631e();
        f95474b = eVar;
        C62942bv.registerDefaultInstance(C36631e.class, eVar);
    }

    private C36631e() {
        C62995dn dnVar = C62995dn.f170057a;
        this.f95477c = dnVar;
        this.f95478d = dnVar;
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
                return newMessageInfo(f95474b, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0003\u0000\u0000\u00012\u00022\u00032", new Object[]{"a", C36629c.f95472a, C45240c.f118157a, C36627a.f95471a, "d", C36630d.f95473a});
            case 3:
                return new C36631e();
            case 4:
                return new C36628b();
            case 5:
                return f95474b;
            case 6:
                C63010eb ebVar = f95475e;
                if (ebVar == null) {
                    synchronized (C36631e.class) {
                        ebVar = f95475e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95474b);
                            f95475e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
