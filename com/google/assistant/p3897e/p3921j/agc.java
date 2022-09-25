package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.agc */
/* compiled from: PG */
public final class agc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final agc f135031e;

    /* renamed from: f */
    private static volatile C63010eb f135032f;

    /* renamed from: a */
    public int f135033a;

    /* renamed from: b */
    public String f135034b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f135035c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public float f135036d;

    static {
        agc agc = new agc();
        f135031e = agc;
        C62942bv.registerDefaultInstance(agc.class, agc);
    }

    private agc() {
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
                return newMessageInfo(f135031e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0005ခ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new agc();
            case 4:
                return new agb();
            case 5:
                return f135031e;
            case 6:
                C63010eb ebVar = f135032f;
                if (ebVar == null) {
                    synchronized (agc.class) {
                        ebVar = f135032f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135031e);
                            f135032f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
