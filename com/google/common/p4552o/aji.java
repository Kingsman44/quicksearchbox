package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aji */
/* compiled from: PG */
public final class aji extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aji f158874d;

    /* renamed from: e */
    private static volatile C63010eb f158875e;

    /* renamed from: a */
    public int f158876a;

    /* renamed from: b */
    public int f158877b;

    /* renamed from: c */
    public String f158878c = BuildConfig.FLAVOR;

    static {
        aji aji = new aji();
        f158874d = aji;
        C62942bv.registerDefaultInstance(aji.class, aji);
    }

    private aji() {
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
                return newMessageInfo(f158874d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", ajj.f158879a, C45240c.f118157a});
            case 3:
                return new aji();
            case 4:
                return new ajh();
            case 5:
                return f158874d;
            case 6:
                C63010eb ebVar = f158875e;
                if (ebVar == null) {
                    synchronized (aji.class) {
                        ebVar = f158875e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158874d);
                            f158875e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
