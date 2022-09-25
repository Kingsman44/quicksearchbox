package com.google.android.apps.search.podcasts.p10590o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.o.ab */
/* compiled from: PG */
public final class C140701ab extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C140701ab f382113c;

    /* renamed from: d */
    private static volatile C63010eb f382114d;

    /* renamed from: a */
    public C140706ag f382115a;

    /* renamed from: b */
    public C62995dn f382116b = C62995dn.f170057a;

    static {
        C140701ab abVar = new C140701ab();
        f382113c = abVar;
        C62942bv.registerDefaultInstance(C140701ab.class, abVar);
    }

    private C140701ab() {
    }

    /* renamed from: a */
    public final C62995dn mo115836a() {
        C62995dn dnVar = this.f382116b;
        if (!dnVar.f170058b) {
            this.f382116b = dnVar.mo58980a();
        }
        return this.f382116b;
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
                return newMessageInfo(f382113c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\t\u00022", new Object[]{"a", "b", C140700aa.f382112a});
            case 3:
                return new C140701ab();
            case 4:
                return new C140733z();
            case 5:
                return f382113c;
            case 6:
                C63010eb ebVar = f382114d;
                if (ebVar == null) {
                    synchronized (C140701ab.class) {
                        ebVar = f382114d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f382113c);
                            f382114d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
