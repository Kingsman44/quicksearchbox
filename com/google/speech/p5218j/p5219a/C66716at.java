package com.google.speech.p5218j.p5219a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.a.at */
/* compiled from: PG */
public final class C66716at extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66716at f181484b;

    /* renamed from: c */
    private static volatile C63010eb f181485c;

    /* renamed from: a */
    public C62995dn f181486a = C62995dn.f170057a;

    static {
        C66716at atVar = new C66716at();
        f181484b = atVar;
        C62942bv.registerDefaultInstance(C66716at.class, atVar);
    }

    private C66716at() {
    }

    /* renamed from: a */
    public final C62995dn mo59714a() {
        C62995dn dnVar = this.f181486a;
        if (!dnVar.f170058b) {
            this.f181486a = dnVar.mo58980a();
        }
        return this.f181486a;
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
                return newMessageInfo(f181484b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C66715as.f181483a});
            case 3:
                return new C66716at();
            case 4:
                return new C66714ar();
            case 5:
                return f181484b;
            case 6:
                C63010eb ebVar = f181485c;
                if (ebVar == null) {
                    synchronized (C66716at.class) {
                        ebVar = f181485c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181484b);
                            f181485c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
