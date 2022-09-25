package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.adx */
/* compiled from: PG */
public final class adx extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final adx f158423e;

    /* renamed from: f */
    private static volatile C63010eb f158424f;

    /* renamed from: a */
    public int f158425a;

    /* renamed from: b */
    public String f158426b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f158427c;

    /* renamed from: d */
    public adv f158428d;

    static {
        adx adx = new adx();
        f158423e = adx;
        C62942bv.registerDefaultInstance(adx.class, adx);
    }

    private adx() {
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
                return newMessageInfo(f158423e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new adx();
            case 4:
                return new adw();
            case 5:
                return f158423e;
            case 6:
                C63010eb ebVar = f158424f;
                if (ebVar == null) {
                    synchronized (adx.class) {
                        ebVar = f158424f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158423e);
                            f158424f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
