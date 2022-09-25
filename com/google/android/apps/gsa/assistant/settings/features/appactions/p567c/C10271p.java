package com.google.android.apps.gsa.assistant.settings.features.appactions.p567c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.c.p */
/* compiled from: PG */
public final class C10271p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C10271p f34813c;

    /* renamed from: d */
    private static volatile C63010eb f34814d;

    /* renamed from: a */
    public int f34815a = 0;

    /* renamed from: b */
    public Object f34816b;

    static {
        C10271p pVar = new C10271p();
        f34813c = pVar;
        C62942bv.registerDefaultInstance(C10271p.class, pVar);
    }

    private C10271p() {
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
                return newMessageInfo(f34813c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဿ\u0000", new Object[]{"b", "a", C10254ab.f34764a, C10280y.f34838a});
            case 3:
                return new C10271p();
            case 4:
                return new C10270o();
            case 5:
                return f34813c;
            case 6:
                C63010eb ebVar = f34814d;
                if (ebVar == null) {
                    synchronized (C10271p.class) {
                        ebVar = f34814d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f34813c);
                            f34814d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
