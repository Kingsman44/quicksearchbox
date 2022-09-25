package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.af */
/* compiled from: PG */
public final class C79931af extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C79931af f219094f;

    /* renamed from: g */
    private static volatile C63010eb f219095g;

    /* renamed from: a */
    public int f219096a;

    /* renamed from: b */
    public boolean f219097b;

    /* renamed from: c */
    public float f219098c;

    /* renamed from: d */
    public float f219099d;

    /* renamed from: e */
    public boolean f219100e;

    static {
        C79931af afVar = new C79931af();
        f219094f = afVar;
        C62942bv.registerDefaultInstance(C79931af.class, afVar);
    }

    private C79931af() {
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
                return newMessageInfo(f219094f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C79931af();
            case 4:
                return new C79930ae();
            case 5:
                return f219094f;
            case 6:
                C63010eb ebVar = f219095g;
                if (ebVar == null) {
                    synchronized (C79931af.class) {
                        ebVar = f219095g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219094f);
                            f219095g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
