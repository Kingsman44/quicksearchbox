package com.google.android.libraries.lens.p2014e.p2015a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.e.a.p */
/* compiled from: PG */
public final class C24197p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C24197p f66134e;

    /* renamed from: f */
    private static volatile C63010eb f66135f;

    /* renamed from: a */
    public int f66136a;

    /* renamed from: b */
    public C24195n f66137b;

    /* renamed from: c */
    public String f66138c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f66139d = BuildConfig.FLAVOR;

    static {
        C24197p pVar = new C24197p();
        f66134e = pVar;
        C62942bv.registerDefaultInstance(C24197p.class, pVar);
    }

    private C24197p() {
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
                return newMessageInfo(f66134e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\t\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C24197p();
            case 4:
                return new C24196o();
            case 5:
                return f66134e;
            case 6:
                C63010eb ebVar = f66135f;
                if (ebVar == null) {
                    synchronized (C24197p.class) {
                        ebVar = f66135f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f66134e);
                            f66135f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
