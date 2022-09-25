package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ox */
/* compiled from: PG */
public final class C7921ox extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7921ox f27834d;

    /* renamed from: e */
    private static volatile C63010eb f27835e;

    /* renamed from: a */
    public int f27836a;

    /* renamed from: b */
    public String f27837b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f27838c;

    static {
        C7921ox oxVar = new C7921ox();
        f27834d = oxVar;
        C62942bv.registerDefaultInstance(C7921ox.class, oxVar);
    }

    private C7921ox() {
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
                return newMessageInfo(f27834d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, C7915or.m22890b()});
            case 3:
                return new C7921ox();
            case 4:
                return new C7920ow();
            case 5:
                return f27834d;
            case 6:
                C63010eb ebVar = f27835e;
                if (ebVar == null) {
                    synchronized (C7921ox.class) {
                        ebVar = f27835e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27834d);
                            f27835e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
