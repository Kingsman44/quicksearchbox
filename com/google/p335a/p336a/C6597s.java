package com.google.p335a.p336a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.a.a.s */
/* compiled from: PG */
public final class C6597s extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C6597s f19616d;

    /* renamed from: e */
    private static volatile C63010eb f19617e;

    /* renamed from: a */
    public int f19618a;

    /* renamed from: b */
    public String f19619b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f19620c = BuildConfig.FLAVOR;

    static {
        C6597s sVar = new C6597s();
        f19616d = sVar;
        C62942bv.registerDefaultInstance(C6597s.class, sVar);
    }

    private C6597s() {
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
                return newMessageInfo(f19616d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C6597s();
            case 4:
                return new C6596r();
            case 5:
                return f19616d;
            case 6:
                C63010eb ebVar = f19617e;
                if (ebVar == null) {
                    synchronized (C6597s.class) {
                        ebVar = f19617e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19616d);
                            f19617e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
