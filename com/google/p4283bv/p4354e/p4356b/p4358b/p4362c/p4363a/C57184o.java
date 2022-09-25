package com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.c.a.o */
/* compiled from: PG */
public final class C57184o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57184o f152665c;

    /* renamed from: e */
    private static volatile C63010eb f152666e;

    /* renamed from: a */
    public String f152667a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f152668b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f152669d;

    static {
        C57184o oVar = new C57184o();
        f152665c = oVar;
        C62942bv.registerDefaultInstance(C57184o.class, oVar);
    }

    private C57184o() {
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
                return newMessageInfo(f152665c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C57184o();
            case 4:
                return new C57183n();
            case 5:
                return f152665c;
            case 6:
                C63010eb ebVar = f152666e;
                if (ebVar == null) {
                    synchronized (C57184o.class) {
                        ebVar = f152666e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152665c);
                            f152666e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
