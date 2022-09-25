package com.google.assistant.p3803ag.p3804a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.afs;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.ax */
/* compiled from: PG */
public final class C48816ax extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48816ax f126302a;

    /* renamed from: d */
    private static volatile C63010eb f126303d;

    /* renamed from: b */
    private int f126304b;

    /* renamed from: c */
    private afs f126305c;

    static {
        C48816ax axVar = new C48816ax();
        f126302a = axVar;
        C62942bv.registerDefaultInstance(C48816ax.class, axVar);
    }

    private C48816ax() {
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
                return newMessageInfo(f126302a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C48816ax();
            case 4:
                return new C48815aw();
            case 5:
                return f126302a;
            case 6:
                C63010eb ebVar = f126303d;
                if (ebVar == null) {
                    synchronized (C48816ax.class) {
                        ebVar = f126303d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126302a);
                            f126303d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
