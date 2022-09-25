package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.cr */
/* compiled from: PG */
public final class C66872cr extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66872cr f181810b;

    /* renamed from: c */
    private static volatile C63010eb f181811c;

    /* renamed from: a */
    public C62995dn f181812a = C62995dn.f170057a;

    static {
        C66872cr crVar = new C66872cr();
        f181810b = crVar;
        C62942bv.registerDefaultInstance(C66872cr.class, crVar);
    }

    private C66872cr() {
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
                return newMessageInfo(f181810b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C66871cq.f181809a});
            case 3:
                return new C66872cr();
            case 4:
                return new C66868cn();
            case 5:
                return f181810b;
            case 6:
                C63010eb ebVar = f181811c;
                if (ebVar == null) {
                    synchronized (C66872cr.class) {
                        ebVar = f181811c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181810b);
                            f181811c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
