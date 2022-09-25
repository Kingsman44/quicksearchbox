package com.google.p4653i.p4654a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.bf */
/* compiled from: PG */
public final class C61692bf extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C61692bf f166671d;

    /* renamed from: e */
    private static volatile C63010eb f166672e;

    /* renamed from: a */
    public int f166673a;

    /* renamed from: b */
    public String f166674b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f166675c = BuildConfig.FLAVOR;

    static {
        C61692bf bfVar = new C61692bf();
        f166671d = bfVar;
        C62942bv.registerDefaultInstance(C61692bf.class, bfVar);
    }

    private C61692bf() {
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
                return newMessageInfo(f166671d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C61692bf();
            case 4:
                return new C61691be();
            case 5:
                return f166671d;
            case 6:
                C63010eb ebVar = f166672e;
                if (ebVar == null) {
                    synchronized (C61692bf.class) {
                        ebVar = f166672e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166671d);
                            f166672e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
