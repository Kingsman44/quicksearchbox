package com.google.common.p4552o.p4566l;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.an */
/* compiled from: PG */
public final class C60122an extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60122an f162600d;

    /* renamed from: e */
    private static volatile C63010eb f162601e;

    /* renamed from: a */
    public int f162602a;

    /* renamed from: b */
    public int f162603b = -1;

    /* renamed from: c */
    public String f162604c = BuildConfig.FLAVOR;

    static {
        C60122an anVar = new C60122an();
        f162600d = anVar;
        C62942bv.registerDefaultInstance(C60122an.class, anVar);
    }

    private C60122an() {
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
                return newMessageInfo(f162600d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60122an();
            case 4:
                return new C60121am();
            case 5:
                return f162600d;
            case 6:
                C63010eb ebVar = f162601e;
                if (ebVar == null) {
                    synchronized (C60122an.class) {
                        ebVar = f162601e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162600d);
                            f162601e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
