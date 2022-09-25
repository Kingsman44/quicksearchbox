package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.mh */
/* compiled from: PG */
public final class C51562mh extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51562mh f134390e;

    /* renamed from: f */
    private static volatile C63010eb f134391f;

    /* renamed from: a */
    public int f134392a;

    /* renamed from: b */
    public String f134393b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C51560mf f134394c;

    /* renamed from: d */
    public boolean f134395d;

    static {
        C51562mh mhVar = new C51562mh();
        f134390e = mhVar;
        C62942bv.registerDefaultInstance(C51562mh.class, mhVar);
    }

    private C51562mh() {
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
                return newMessageInfo(f134390e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C51562mh();
            case 4:
                return new C51561mg();
            case 5:
                return f134390e;
            case 6:
                C63010eb ebVar = f134391f;
                if (ebVar == null) {
                    synchronized (C51562mh.class) {
                        ebVar = f134391f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134390e);
                            f134391f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
