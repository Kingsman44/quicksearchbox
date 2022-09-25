package com.google.p4017at.p4027c.p4031b.p4038c.p4039a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.c.b.c.a.o */
/* compiled from: PG */
public final class C53903o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53903o f141437d;

    /* renamed from: e */
    private static volatile C63010eb f141438e;

    /* renamed from: a */
    public int f141439a = 0;

    /* renamed from: b */
    public Object f141440b;

    /* renamed from: c */
    public String f141441c = BuildConfig.FLAVOR;

    static {
        C53903o oVar = new C53903o();
        f141437d = oVar;
        C62942bv.registerDefaultInstance(C53903o.class, oVar);
    }

    private C53903o() {
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
                return newMessageInfo(f141437d, "\u0000\u0002\u0001\u0000\u0002d\u0002\u0000\u0000\u0000\u0002Ȉd<\u0000", new Object[]{"b", "a", C45240c.f118157a, C53897i.class});
            case 3:
                return new C53903o();
            case 4:
                return new C53902n();
            case 5:
                return f141437d;
            case 6:
                C63010eb ebVar = f141438e;
                if (ebVar == null) {
                    synchronized (C53903o.class) {
                        ebVar = f141438e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141437d);
                            f141438e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
