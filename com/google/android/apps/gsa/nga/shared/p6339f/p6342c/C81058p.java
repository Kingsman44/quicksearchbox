package com.google.android.apps.gsa.nga.shared.p6339f.p6342c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.c.p */
/* compiled from: PG */
public final class C81058p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C81058p f222170c;

    /* renamed from: d */
    private static volatile C63010eb f222171d;

    /* renamed from: a */
    public int f222172a;

    /* renamed from: b */
    public String f222173b = BuildConfig.FLAVOR;

    static {
        C81058p pVar = new C81058p();
        f222170c = pVar;
        C62942bv.registerDefaultInstance(C81058p.class, pVar);
    }

    private C81058p() {
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
                return newMessageInfo(f222170c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C81058p();
            case 4:
                return new C81057o();
            case 5:
                return f222170c;
            case 6:
                C63010eb ebVar = f222171d;
                if (ebVar == null) {
                    synchronized (C81058p.class) {
                        ebVar = f222171d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222170c);
                            f222171d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
