package com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9058b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.c.c.a.b.q */
/* compiled from: PG */
public final class C120141q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C120141q f334384c;

    /* renamed from: d */
    private static volatile C63010eb f334385d;

    /* renamed from: a */
    public int f334386a;

    /* renamed from: b */
    public int f334387b;

    static {
        C120141q qVar = new C120141q();
        f334384c = qVar;
        C62942bv.registerDefaultInstance(C120141q.class, qVar);
    }

    private C120141q() {
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
                return newMessageInfo(f334384c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C120140p.m199080b()});
            case 3:
                return new C120141q();
            case 4:
                return new C120138n();
            case 5:
                return f334384c;
            case 6:
                C63010eb ebVar = f334385d;
                if (ebVar == null) {
                    synchronized (C120141q.class) {
                        ebVar = f334385d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f334384c);
                            f334385d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
