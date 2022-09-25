package com.google.android.apps.gsa.unifiedime;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.unifiedime.v */
/* compiled from: PG */
public final class C118604v extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C118604v f330885f;

    /* renamed from: g */
    private static volatile C63010eb f330886g;

    /* renamed from: a */
    public int f330887a;

    /* renamed from: b */
    public int f330888b;

    /* renamed from: c */
    public int f330889c;

    /* renamed from: d */
    public int f330890d;

    /* renamed from: e */
    public boolean f330891e;

    static {
        C118604v vVar = new C118604v();
        f330885f = vVar;
        C62942bv.registerDefaultInstance(C118604v.class, vVar);
    }

    private C118604v() {
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
                return newMessageInfo(f330885f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C118602t.f330884a, "e"});
            case 3:
                return new C118604v();
            case 4:
                return new C118601s();
            case 5:
                return f330885f;
            case 6:
                C63010eb ebVar = f330886g;
                if (ebVar == null) {
                    synchronized (C118604v.class) {
                        ebVar = f330886g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f330885f);
                            f330886g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
