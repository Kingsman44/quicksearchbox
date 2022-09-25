package com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.aa */
/* compiled from: PG */
public final class C134867aa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C134867aa f367152d;

    /* renamed from: e */
    private static volatile C63010eb f367153e;

    /* renamed from: a */
    public int f367154a;

    /* renamed from: b */
    public int f367155b;

    /* renamed from: c */
    public int f367156c;

    static {
        C134867aa aaVar = new C134867aa();
        f367152d = aaVar;
        C62942bv.registerDefaultInstance(C134867aa.class, aaVar);
    }

    private C134867aa() {
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
                return newMessageInfo(f367152d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C134867aa();
            case 4:
                return new C134894z();
            case 5:
                return f367152d;
            case 6:
                C63010eb ebVar = f367153e;
                if (ebVar == null) {
                    synchronized (C134867aa.class) {
                        ebVar = f367153e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f367152d);
                            f367153e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
