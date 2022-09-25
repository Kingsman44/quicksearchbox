package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.ax */
/* compiled from: PG */
public final class C48608ax extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48608ax f125621a;

    /* renamed from: c */
    private static volatile C63010eb f125622c;

    /* renamed from: b */
    private C62995dn f125623b = C62995dn.f170057a;

    static {
        C48608ax axVar = new C48608ax();
        f125621a = axVar;
        C62942bv.registerDefaultInstance(C48608ax.class, axVar);
    }

    private C48608ax() {
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
                return newMessageInfo(f125621a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C48605au.f125618a});
            case 3:
                return new C48608ax();
            case 4:
                return new C48604at();
            case 5:
                return f125621a;
            case 6:
                C63010eb ebVar = f125622c;
                if (ebVar == null) {
                    synchronized (C48608ax.class) {
                        ebVar = f125622c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125621a);
                            f125622c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
