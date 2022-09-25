package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.lu */
/* compiled from: PG */
public final class C53381lu extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53381lu f140072e;

    /* renamed from: f */
    private static volatile C63010eb f140073f;

    /* renamed from: a */
    public int f140074a;

    /* renamed from: b */
    public String f140075b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f140076c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f140077d;

    static {
        C53381lu luVar = new C53381lu();
        f140072e = luVar;
        C62942bv.registerDefaultInstance(C53381lu.class, luVar);
    }

    private C53381lu() {
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
                return newMessageInfo(f140072e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C53381lu();
            case 4:
                return new C53380lt();
            case 5:
                return f140072e;
            case 6:
                C63010eb ebVar = f140073f;
                if (ebVar == null) {
                    synchronized (C53381lu.class) {
                        ebVar = f140073f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140072e);
                            f140073f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
