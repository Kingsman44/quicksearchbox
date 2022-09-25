package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.wj */
/* compiled from: PG */
public final class C60613wj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60613wj f164441e;

    /* renamed from: f */
    private static volatile C63010eb f164442f;

    /* renamed from: a */
    public int f164443a;

    /* renamed from: b */
    public int f164444b;

    /* renamed from: c */
    public boolean f164445c;

    /* renamed from: d */
    public String f164446d = BuildConfig.FLAVOR;

    static {
        C60613wj wjVar = new C60613wj();
        f164441e = wjVar;
        C62942bv.registerDefaultInstance(C60613wj.class, wjVar);
    }

    private C60613wj() {
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
                return newMessageInfo(f164441e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C60611wh.f164440a, C45240c.f118157a, "d"});
            case 3:
                return new C60613wj();
            case 4:
                return new C60612wi();
            case 5:
                return f164441e;
            case 6:
                C63010eb ebVar = f164442f;
                if (ebVar == null) {
                    synchronized (C60613wj.class) {
                        ebVar = f164442f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164441e);
                            f164442f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
