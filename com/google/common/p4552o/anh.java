package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.anh */
/* compiled from: PG */
public final class anh extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final anh f159362e;

    /* renamed from: f */
    private static volatile C63010eb f159363f;

    /* renamed from: a */
    public int f159364a;

    /* renamed from: b */
    public String f159365b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f159366c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f159367d = BuildConfig.FLAVOR;

    static {
        anh anh = new anh();
        f159362e = anh;
        C62942bv.registerDefaultInstance(anh.class, anh);
    }

    private anh() {
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
                return newMessageInfo(f159362e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new anh();
            case 4:
                return new ang();
            case 5:
                return f159362e;
            case 6:
                C63010eb ebVar = f159363f;
                if (ebVar == null) {
                    synchronized (anh.class) {
                        ebVar = f159363f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159362e);
                            f159363f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
