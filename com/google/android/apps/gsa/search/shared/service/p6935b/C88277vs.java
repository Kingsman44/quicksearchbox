package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5208h.C66667eg;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.vs */
/* compiled from: PG */
public final class C88277vs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88277vs f238760c;

    /* renamed from: d */
    private static volatile C63010eb f238761d;

    /* renamed from: a */
    public int f238762a;

    /* renamed from: b */
    public int f238763b;

    static {
        C88277vs vsVar = new C88277vs();
        f238760c = vsVar;
        C62942bv.registerDefaultInstance(C88277vs.class, vsVar);
    }

    private C88277vs() {
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
                return newMessageInfo(f238760c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C66667eg.m97299b()});
            case 3:
                return new C88277vs();
            case 4:
                return new C88276vr();
            case 5:
                return f238760c;
            case 6:
                C63010eb ebVar = f238761d;
                if (ebVar == null) {
                    synchronized (C88277vs.class) {
                        ebVar = f238761d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238760c);
                            f238761d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
