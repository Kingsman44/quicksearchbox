package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.aj */
/* compiled from: PG */
public final class C81245aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C81245aj f222421c;

    /* renamed from: d */
    private static volatile C63010eb f222422d;

    /* renamed from: a */
    public int f222423a;

    /* renamed from: b */
    public long f222424b;

    static {
        C81245aj ajVar = new C81245aj();
        f222421c = ajVar;
        C62942bv.registerDefaultInstance(C81245aj.class, ajVar);
    }

    private C81245aj() {
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
                return newMessageInfo(f222421c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C81245aj();
            case 4:
                return new C81244ai();
            case 5:
                return f222421c;
            case 6:
                C63010eb ebVar = f222422d;
                if (ebVar == null) {
                    synchronized (C81245aj.class) {
                        ebVar = f222422d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222421c);
                            f222422d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
