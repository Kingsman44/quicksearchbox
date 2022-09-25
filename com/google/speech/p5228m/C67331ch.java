package com.google.speech.p5228m;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.ch */
/* compiled from: PG */
public final class C67331ch extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67331ch f183011d;

    /* renamed from: e */
    private static volatile C63010eb f183012e;

    /* renamed from: a */
    public int f183013a;

    /* renamed from: b */
    public long f183014b;

    /* renamed from: c */
    public String f183015c = BuildConfig.FLAVOR;

    static {
        C67331ch chVar = new C67331ch();
        f183011d = chVar;
        C62942bv.registerDefaultInstance(C67331ch.class, chVar);
    }

    private C67331ch() {
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
                return newMessageInfo(f183011d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဈ\u0001\u0004ဂ\u0000", new Object[]{"a", C45240c.f118157a, "b"});
            case 3:
                return new C67331ch();
            case 4:
                return new C67330cg();
            case 5:
                return f183011d;
            case 6:
                C63010eb ebVar = f183012e;
                if (ebVar == null) {
                    synchronized (C67331ch.class) {
                        ebVar = f183012e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183011d);
                            f183012e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
