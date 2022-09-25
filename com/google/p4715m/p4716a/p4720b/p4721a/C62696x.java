package com.google.p4715m.p4716a.p4720b.p4721a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.m.a.b.a.x */
/* compiled from: PG */
public final class C62696x extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62696x f169266d;

    /* renamed from: e */
    private static volatile C63010eb f169267e;

    /* renamed from: a */
    public int f169268a;

    /* renamed from: b */
    public String f169269b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f169270c = BuildConfig.FLAVOR;

    static {
        C62696x xVar = new C62696x();
        f169266d = xVar;
        C62942bv.registerDefaultInstance(C62696x.class, xVar);
    }

    private C62696x() {
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
                return newMessageInfo(f169266d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62696x();
            case 4:
                return new C62695w();
            case 5:
                return f169266d;
            case 6:
                C63010eb ebVar = f169267e;
                if (ebVar == null) {
                    synchronized (C62696x.class) {
                        ebVar = f169267e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169266d);
                            f169267e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
