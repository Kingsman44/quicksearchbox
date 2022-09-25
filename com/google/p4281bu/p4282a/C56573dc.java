package com.google.p4281bu.p4282a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.dc */
/* compiled from: PG */
public final class C56573dc extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56573dc f151051d;

    /* renamed from: e */
    private static volatile C63010eb f151052e;

    /* renamed from: a */
    public int f151053a = 0;

    /* renamed from: b */
    public Object f151054b;

    /* renamed from: c */
    public String f151055c = BuildConfig.FLAVOR;

    static {
        C56573dc dcVar = new C56573dc();
        f151051d = dcVar;
        C62942bv.registerDefaultInstance(C56573dc.class, dcVar);
    }

    private C56573dc() {
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
                return newMessageInfo(f151051d, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"b", "a", C45240c.f118157a, C56571da.class});
            case 3:
                return new C56573dc();
            case 4:
                return new C56572db();
            case 5:
                return f151051d;
            case 6:
                C63010eb ebVar = f151052e;
                if (ebVar == null) {
                    synchronized (C56573dc.class) {
                        ebVar = f151052e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151051d);
                            f151052e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
