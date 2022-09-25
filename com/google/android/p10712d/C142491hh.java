package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.hh */
/* compiled from: PG */
public final class C142491hh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C142491hh f386677d;

    /* renamed from: e */
    private static volatile C63010eb f386678e;

    /* renamed from: a */
    public int f386679a = 0;

    /* renamed from: b */
    public Object f386680b;

    /* renamed from: c */
    public String f386681c = BuildConfig.FLAVOR;

    static {
        C142491hh hhVar = new C142491hh();
        f386677d = hhVar;
        C62942bv.registerDefaultInstance(C142491hh.class, hhVar);
    }

    private C142491hh() {
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
                return newMessageInfo(f386677d, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"b", "a", C45240c.f118157a, C142478gv.class, C142508hy.class, C142504hu.class, C142506hw.class, C142499hp.class, C142480gx.class, C142495hl.class});
            case 3:
                return new C142491hh();
            case 4:
                return new C142490hg();
            case 5:
                return f386677d;
            case 6:
                C63010eb ebVar = f386678e;
                if (ebVar == null) {
                    synchronized (C142491hh.class) {
                        ebVar = f386678e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386677d);
                            f386678e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
