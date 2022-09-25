package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.hm */
/* compiled from: PG */
public final class C14391hm extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14391hm f43529d;

    /* renamed from: e */
    private static volatile C63010eb f43530e;

    /* renamed from: a */
    public int f43531a;

    /* renamed from: b */
    public boolean f43532b;

    /* renamed from: c */
    public boolean f43533c;

    static {
        C14391hm hmVar = new C14391hm();
        f43529d = hmVar;
        C62942bv.registerDefaultInstance(C14391hm.class, hmVar);
    }

    private C14391hm() {
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
                return newMessageInfo(f43529d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C14391hm();
            case 4:
                return new C14390hl();
            case 5:
                return f43529d;
            case 6:
                C63010eb ebVar = f43530e;
                if (ebVar == null) {
                    synchronized (C14391hm.class) {
                        ebVar = f43530e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43529d);
                            f43530e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
