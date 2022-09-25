package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.bb */
/* compiled from: PG */
public final class C37397bb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37397bb f99320c;

    /* renamed from: d */
    private static volatile C63010eb f99321d;

    /* renamed from: a */
    public int f99322a;

    /* renamed from: b */
    public long f99323b;

    static {
        C37397bb bbVar = new C37397bb();
        f99320c = bbVar;
        C62942bv.registerDefaultInstance(C37397bb.class, bbVar);
    }

    private C37397bb() {
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
                return newMessageInfo(f99320c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37397bb();
            case 4:
                return new C37396ba();
            case 5:
                return f99320c;
            case 6:
                C63010eb ebVar = f99321d;
                if (ebVar == null) {
                    synchronized (C37397bb.class) {
                        ebVar = f99321d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99320c);
                            f99321d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
