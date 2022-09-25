package com.google.android.libraries.search.rendering.xuikit.p3130c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.c.ab */
/* compiled from: PG */
public final class C40262ab extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C40262ab f105754b;

    /* renamed from: c */
    private static volatile C63010eb f105755c;

    /* renamed from: a */
    public C62995dn f105756a = C62995dn.f170057a;

    static {
        C40262ab abVar = new C40262ab();
        f105754b = abVar;
        C62942bv.registerDefaultInstance(C40262ab.class, abVar);
    }

    private C40262ab() {
    }

    /* renamed from: a */
    public final C62995dn mo42367a() {
        C62995dn dnVar = this.f105756a;
        if (!dnVar.f170058b) {
            this.f105756a = dnVar.mo58980a();
        }
        return this.f105756a;
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
                return newMessageInfo(f105754b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C40261aa.f105753a});
            case 3:
                return new C40262ab();
            case 4:
                return new C40302z();
            case 5:
                return f105754b;
            case 6:
                C63010eb ebVar = f105755c;
                if (ebVar == null) {
                    synchronized (C40262ab.class) {
                        ebVar = f105755c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f105754b);
                            f105755c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
