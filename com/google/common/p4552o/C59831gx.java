package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.gx */
/* compiled from: PG */
public final class C59831gx extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C59831gx f161678f;

    /* renamed from: g */
    private static volatile C63010eb f161679g;

    /* renamed from: a */
    public int f161680a;

    /* renamed from: b */
    public C59838hb f161681b;

    /* renamed from: c */
    public C62961ch f161682c = emptyIntList();

    /* renamed from: d */
    public C62961ch f161683d = emptyIntList();

    /* renamed from: e */
    public String f161684e = BuildConfig.FLAVOR;

    static {
        C59831gx gxVar = new C59831gx();
        f161678f = gxVar;
        C62942bv.registerDefaultInstance(C59831gx.class, gxVar);
    }

    private C59831gx() {
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
                return newMessageInfo(f161678f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u0016\u0003\u0016\u0004ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C59831gx();
            case 4:
                return new C59830gw();
            case 5:
                return f161678f;
            case 6:
                C63010eb ebVar = f161679g;
                if (ebVar == null) {
                    synchronized (C59831gx.class) {
                        ebVar = f161679g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161678f);
                            f161679g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
