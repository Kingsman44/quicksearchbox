package com.google.android.apps.gsa.nga.shared.p6345h;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.by */
/* compiled from: PG */
public final class C81294by extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C81294by f222536c;

    /* renamed from: d */
    private static volatile C63010eb f222537d;

    /* renamed from: a */
    public int f222538a;

    /* renamed from: b */
    public String f222539b = BuildConfig.FLAVOR;

    static {
        C81294by byVar = new C81294by();
        f222536c = byVar;
        C62942bv.registerDefaultInstance(C81294by.class, byVar);
    }

    private C81294by() {
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
                return newMessageInfo(f222536c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C81294by();
            case 4:
                return new C81293bx();
            case 5:
                return f222536c;
            case 6:
                C63010eb ebVar = f222537d;
                if (ebVar == null) {
                    synchronized (C81294by.class) {
                        ebVar = f222537d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222536c);
                            f222537d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
