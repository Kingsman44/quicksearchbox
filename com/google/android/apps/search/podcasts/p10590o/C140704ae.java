package com.google.android.apps.search.podcasts.p10590o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.o.ae */
/* compiled from: PG */
public final class C140704ae extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C140704ae f382118b;

    /* renamed from: c */
    private static volatile C63010eb f382119c;

    /* renamed from: a */
    public C62995dn f382120a = C62995dn.f170057a;

    static {
        C140704ae aeVar = new C140704ae();
        f382118b = aeVar;
        C62942bv.registerDefaultInstance(C140704ae.class, aeVar);
    }

    private C140704ae() {
    }

    /* renamed from: a */
    public final C62995dn mo115838a() {
        C62995dn dnVar = this.f382120a;
        if (!dnVar.f170058b) {
            this.f382120a = dnVar.mo58980a();
        }
        return this.f382120a;
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
                return newMessageInfo(f382118b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"a", C140703ad.f382117a});
            case 3:
                return new C140704ae();
            case 4:
                return new C140702ac();
            case 5:
                return f382118b;
            case 6:
                C63010eb ebVar = f382119c;
                if (ebVar == null) {
                    synchronized (C140704ae.class) {
                        ebVar = f382119c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f382118b);
                            f382119c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
