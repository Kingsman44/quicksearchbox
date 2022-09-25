package com.google.android.apps.gsa.search.core.carassistant.p6778b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.b.l */
/* compiled from: PG */
public final class C85697l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C85697l f231736b;

    /* renamed from: c */
    private static volatile C63010eb f231737c;

    /* renamed from: a */
    public C62995dn f231738a = C62995dn.f170057a;

    static {
        C85697l lVar = new C85697l();
        f231736b = lVar;
        C62942bv.registerDefaultInstance(C85697l.class, lVar);
    }

    private C85697l() {
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
                return newMessageInfo(f231736b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C85696k.f231735a});
            case 3:
                return new C85697l();
            case 4:
                return new C85695j();
            case 5:
                return f231736b;
            case 6:
                C63010eb ebVar = f231737c;
                if (ebVar == null) {
                    synchronized (C85697l.class) {
                        ebVar = f231737c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f231736b);
                            f231737c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
