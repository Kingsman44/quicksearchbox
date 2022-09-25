package com.google.android.apps.search.googleapp.search.voicesearch.settings.p10476a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.a.q */
/* compiled from: PG */
public final class C138883q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C138883q f377761c;

    /* renamed from: d */
    private static volatile C63010eb f377762d;

    /* renamed from: a */
    public int f377763a;

    /* renamed from: b */
    public boolean f377764b;

    static {
        C138883q qVar = new C138883q();
        f377761c = qVar;
        C62942bv.registerDefaultInstance(C138883q.class, qVar);
    }

    private C138883q() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f377761c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C138883q();
            case 4:
                return new C138882p();
            case 5:
                return f377761c;
            case 6:
                C63010eb ebVar = f377762d;
                if (ebVar == null) {
                    synchronized (C138883q.class) {
                        ebVar = f377762d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f377761c);
                            f377762d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
