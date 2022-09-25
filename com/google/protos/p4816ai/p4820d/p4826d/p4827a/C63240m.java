package com.google.protos.p4816ai.p4820d.p4826d.p4827a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.d.a.m */
/* compiled from: PG */
public final class C63240m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63240m f170859b;

    /* renamed from: c */
    private static volatile C63010eb f170860c;

    /* renamed from: a */
    public C62995dn f170861a = C62995dn.f170057a;

    static {
        C63240m mVar = new C63240m();
        f170859b = mVar;
        C62942bv.registerDefaultInstance(C63240m.class, mVar);
    }

    private C63240m() {
    }

    /* renamed from: a */
    public final C62995dn mo59199a() {
        C62995dn dnVar = this.f170861a;
        if (!dnVar.f170058b) {
            this.f170861a = dnVar.mo58980a();
        }
        return this.f170861a;
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
                return newMessageInfo(f170859b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C63239l.f170858a});
            case 3:
                return new C63240m();
            case 4:
                return new C63238k();
            case 5:
                return f170859b;
            case 6:
                C63010eb ebVar = f170860c;
                if (ebVar == null) {
                    synchronized (C63240m.class) {
                        ebVar = f170860c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170859b);
                            f170860c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
