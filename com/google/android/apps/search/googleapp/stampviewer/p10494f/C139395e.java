package com.google.android.apps.search.googleapp.stampviewer.p10494f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.f.e */
/* compiled from: PG */
public final class C139395e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C139395e f379042b;

    /* renamed from: c */
    private static volatile C63010eb f379043c;

    /* renamed from: a */
    public C62995dn f379044a = C62995dn.f170057a;

    static {
        C139395e eVar = new C139395e();
        f379042b = eVar;
        C62942bv.registerDefaultInstance(C139395e.class, eVar);
    }

    private C139395e() {
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
                return newMessageInfo(f379042b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C139394d.f379041a});
            case 3:
                return new C139395e();
            case 4:
                return new C139393c();
            case 5:
                return f379042b;
            case 6:
                C63010eb ebVar = f379043c;
                if (ebVar == null) {
                    synchronized (C139395e.class) {
                        ebVar = f379043c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f379042b);
                            f379043c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
