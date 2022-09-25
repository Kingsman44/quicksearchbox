package com.google.lens.p4707j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.bh */
/* compiled from: PG */
public final class C62431bh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62431bh f168521d;

    /* renamed from: e */
    private static volatile C63010eb f168522e;

    /* renamed from: a */
    public int f168523a;

    /* renamed from: b */
    public int f168524b;

    /* renamed from: c */
    public String f168525c = BuildConfig.FLAVOR;

    static {
        C62431bh bhVar = new C62431bh();
        f168521d = bhVar;
        C62942bv.registerDefaultInstance(C62431bh.class, bhVar);
    }

    private C62431bh() {
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
                return newMessageInfo(f168521d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62431bh();
            case 4:
                return new C62430bg();
            case 5:
                return f168521d;
            case 6:
                C63010eb ebVar = f168522e;
                if (ebVar == null) {
                    synchronized (C62431bh.class) {
                        ebVar = f168522e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168521d);
                            f168522e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
