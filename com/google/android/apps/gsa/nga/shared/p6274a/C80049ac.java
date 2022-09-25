package com.google.android.apps.gsa.nga.shared.p6274a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.a.ac */
/* compiled from: PG */
public final class C80049ac extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80049ac f219666e;

    /* renamed from: f */
    private static volatile C63010eb f219667f;

    /* renamed from: a */
    public int f219668a;

    /* renamed from: b */
    public float f219669b;

    /* renamed from: c */
    public float f219670c;

    /* renamed from: d */
    public boolean f219671d;

    static {
        C80049ac acVar = new C80049ac();
        f219666e = acVar;
        C62942bv.registerDefaultInstance(C80049ac.class, acVar);
    }

    private C80049ac() {
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
                return newMessageInfo(f219666e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C80049ac();
            case 4:
                return new C80048ab();
            case 5:
                return f219666e;
            case 6:
                C63010eb ebVar = f219667f;
                if (ebVar == null) {
                    synchronized (C80049ac.class) {
                        ebVar = f219667f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219666e);
                            f219667f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
