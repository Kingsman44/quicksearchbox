package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.no */
/* compiled from: PG */
public final class C60302no extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60302no f163173d;

    /* renamed from: e */
    private static volatile C63010eb f163174e;

    /* renamed from: a */
    public int f163175a;

    /* renamed from: b */
    public String f163176b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f163177c = BuildConfig.FLAVOR;

    static {
        C60302no noVar = new C60302no();
        f163173d = noVar;
        C62942bv.registerDefaultInstance(C60302no.class, noVar);
    }

    private C60302no() {
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
                return newMessageInfo(f163173d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60302no();
            case 4:
                return new C60301nn();
            case 5:
                return f163173d;
            case 6:
                C63010eb ebVar = f163174e;
                if (ebVar == null) {
                    synchronized (C60302no.class) {
                        ebVar = f163174e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163173d);
                            f163174e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
