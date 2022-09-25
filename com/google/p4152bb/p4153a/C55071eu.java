package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.eu */
/* compiled from: PG */
public final class C55071eu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55071eu f144875d;

    /* renamed from: e */
    private static volatile C63010eb f144876e;

    /* renamed from: a */
    public int f144877a;

    /* renamed from: b */
    public C55112gh f144878b;

    /* renamed from: c */
    public C55097ft f144879c;

    static {
        C55071eu euVar = new C55071eu();
        f144875d = euVar;
        C62942bv.registerDefaultInstance(C55071eu.class, euVar);
    }

    private C55071eu() {
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
                return newMessageInfo(f144875d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55071eu();
            case 4:
                return new C55070et();
            case 5:
                return f144875d;
            case 6:
                C63010eb ebVar = f144876e;
                if (ebVar == null) {
                    synchronized (C55071eu.class) {
                        ebVar = f144876e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144875d);
                            f144876e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
