package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.bo */
/* compiled from: PG */
public final class C79967bo extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C79967bo f219328f;

    /* renamed from: g */
    private static volatile C63010eb f219329g;

    /* renamed from: a */
    public int f219330a;

    /* renamed from: b */
    public float f219331b;

    /* renamed from: c */
    public float f219332c;

    /* renamed from: d */
    public float f219333d;

    /* renamed from: e */
    public float f219334e;

    static {
        C79967bo boVar = new C79967bo();
        f219328f = boVar;
        C62942bv.registerDefaultInstance(C79967bo.class, boVar);
    }

    private C79967bo() {
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
                return newMessageInfo(f219328f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C79967bo();
            case 4:
                return new C79966bn();
            case 5:
                return f219328f;
            case 6:
                C63010eb ebVar = f219329g;
                if (ebVar == null) {
                    synchronized (C79967bo.class) {
                        ebVar = f219329g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219328f);
                            f219329g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
