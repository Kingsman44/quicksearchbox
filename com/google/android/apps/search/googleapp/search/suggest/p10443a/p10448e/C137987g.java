package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10448e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.e.g */
/* compiled from: PG */
public final class C137987g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C137987g f375406b;

    /* renamed from: c */
    private static volatile C63010eb f375407c;

    /* renamed from: a */
    public C62964ck f375408a = emptyLongList();

    static {
        C137987g gVar = new C137987g();
        f375406b = gVar;
        C62942bv.registerDefaultInstance(C137987g.class, gVar);
    }

    private C137987g() {
    }

    /* renamed from: a */
    public final void mo114071a() {
        C62964ck ckVar = this.f375408a;
        if (!ckVar.mo58948c()) {
            this.f375408a = C62942bv.mutableCopy(ckVar);
        }
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
                return newMessageInfo(f375406b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0014", new Object[]{"a"});
            case 3:
                return new C137987g();
            case 4:
                return new C137986f();
            case 5:
                return f375406b;
            case 6:
                C63010eb ebVar = f375407c;
                if (ebVar == null) {
                    synchronized (C137987g.class) {
                        ebVar = f375407c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375406b);
                            f375407c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
