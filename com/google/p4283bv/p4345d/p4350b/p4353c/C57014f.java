package com.google.p4283bv.p4345d.p4350b.p4353c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.b.c.f */
/* compiled from: PG */
public final class C57014f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57014f f152189c;

    /* renamed from: d */
    private static volatile C63010eb f152190d;

    /* renamed from: a */
    public int f152191a;

    /* renamed from: b */
    public String f152192b = BuildConfig.FLAVOR;

    static {
        C57014f fVar = new C57014f();
        f152189c = fVar;
        C62942bv.registerDefaultInstance(C57014f.class, fVar);
    }

    private C57014f() {
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
                return newMessageInfo(f152189c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C57014f();
            case 4:
                return new C57013e();
            case 5:
                return f152189c;
            case 6:
                C63010eb ebVar = f152190d;
                if (ebVar == null) {
                    synchronized (C57014f.class) {
                        ebVar = f152190d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152189c);
                            f152190d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
