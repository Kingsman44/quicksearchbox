package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.nf */
/* compiled from: PG */
public final class C51587nf extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51587nf f134449e;

    /* renamed from: f */
    private static volatile C63010eb f134450f;

    /* renamed from: a */
    public int f134451a = 0;

    /* renamed from: b */
    public Object f134452b;

    /* renamed from: c */
    public String f134453c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f134454d;

    static {
        C51587nf nfVar = new C51587nf();
        f134449e = nfVar;
        C62942bv.registerDefaultInstance(C51587nf.class, nfVar);
    }

    private C51587nf() {
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
                return newMessageInfo(f134449e, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003<\u0000", new Object[]{"b", "a", C45240c.f118157a, "d", C51586ne.class});
            case 3:
                return new C51587nf();
            case 4:
                return new C51582na();
            case 5:
                return f134449e;
            case 6:
                C63010eb ebVar = f134450f;
                if (ebVar == null) {
                    synchronized (C51587nf.class) {
                        ebVar = f134450f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134449e);
                            f134450f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
