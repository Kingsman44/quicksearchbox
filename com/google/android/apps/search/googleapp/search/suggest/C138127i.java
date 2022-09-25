package com.google.android.apps.search.googleapp.search.suggest;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.i */
/* compiled from: PG */
public final class C138127i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C138127i f375805b;

    /* renamed from: c */
    private static volatile C63010eb f375806c;

    /* renamed from: a */
    public C62995dn f375807a = C62995dn.f170057a;

    static {
        C138127i iVar = new C138127i();
        f375805b = iVar;
        C62942bv.registerDefaultInstance(C138127i.class, iVar);
    }

    private C138127i() {
    }

    /* renamed from: a */
    public final C62995dn mo114161a() {
        C62995dn dnVar = this.f375807a;
        if (!dnVar.f170058b) {
            this.f375807a = dnVar.mo58980a();
        }
        return this.f375807a;
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
                return newMessageInfo(f375805b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C138126h.f375804a});
            case 3:
                return new C138127i();
            case 4:
                return new C138125g();
            case 5:
                return f375805b;
            case 6:
                C63010eb ebVar = f375806c;
                if (ebVar == null) {
                    synchronized (C138127i.class) {
                        ebVar = f375806c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375805b);
                            f375806c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
