package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.bg */
/* compiled from: PG */
public final class C79959bg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C79959bg f219291c;

    /* renamed from: d */
    private static volatile C63010eb f219292d;

    /* renamed from: a */
    public int f219293a;

    /* renamed from: b */
    public C79957be f219294b;

    static {
        C79959bg bgVar = new C79959bg();
        f219291c = bgVar;
        C62942bv.registerDefaultInstance(C79959bg.class, bgVar);
    }

    private C79959bg() {
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
                return newMessageInfo(f219291c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C79959bg();
            case 4:
                return new C79958bf();
            case 5:
                return f219291c;
            case 6:
                C63010eb ebVar = f219292d;
                if (ebVar == null) {
                    synchronized (C79959bg.class) {
                        ebVar = f219292d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219291c);
                            f219292d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
