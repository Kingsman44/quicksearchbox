package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.al */
/* compiled from: PG */
public final class C80097al extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80097al f219798c;

    /* renamed from: d */
    private static volatile C63010eb f219799d;

    /* renamed from: a */
    public int f219800a;

    /* renamed from: b */
    public long f219801b;

    static {
        C80097al alVar = new C80097al();
        f219798c = alVar;
        C62942bv.registerDefaultInstance(C80097al.class, alVar);
    }

    private C80097al() {
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
                return newMessageInfo(f219798c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80097al();
            case 4:
                return new C80096ak();
            case 5:
                return f219798c;
            case 6:
                C63010eb ebVar = f219799d;
                if (ebVar == null) {
                    synchronized (C80097al.class) {
                        ebVar = f219799d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219798c);
                            f219799d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
