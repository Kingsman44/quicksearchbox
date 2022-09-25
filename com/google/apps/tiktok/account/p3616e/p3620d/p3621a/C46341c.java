package com.google.apps.tiktok.account.p3616e.p3620d.p3621a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.tiktok.account.e.d.a.c */
/* compiled from: PG */
public final class C46341c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C46341c f121332b;

    /* renamed from: c */
    private static volatile C63010eb f121333c;

    /* renamed from: a */
    public C62995dn f121334a = C62995dn.f170057a;

    static {
        C46341c cVar = new C46341c();
        f121332b = cVar;
        C62942bv.registerDefaultInstance(C46341c.class, cVar);
    }

    private C46341c() {
    }

    /* renamed from: a */
    public final C62995dn mo50323a() {
        C62995dn dnVar = this.f121334a;
        if (!dnVar.f170058b) {
            this.f121334a = dnVar.mo58980a();
        }
        return this.f121334a;
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
                return newMessageInfo(f121332b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C46340b.f121331a});
            case 3:
                return new C46341c();
            case 4:
                return new C46339a();
            case 5:
                return f121332b;
            case 6:
                C63010eb ebVar = f121333c;
                if (ebVar == null) {
                    synchronized (C46341c.class) {
                        ebVar = f121333c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f121332b);
                            f121333c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
