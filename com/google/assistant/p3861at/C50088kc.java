package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.kc */
/* compiled from: PG */
public final class C50088kc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50088kc f130216e;

    /* renamed from: f */
    private static volatile C63010eb f130217f;

    /* renamed from: a */
    public int f130218a;

    /* renamed from: b */
    public String f130219b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130220c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f130221d;

    static {
        C50088kc kcVar = new C50088kc();
        f130216e = kcVar;
        C62942bv.registerDefaultInstance(C50088kc.class, kcVar);
    }

    private C50088kc() {
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
                return newMessageInfo(f130216e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဈ\u0003\u0006ဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", C49875cf.m85756b()});
            case 3:
                return new C50088kc();
            case 4:
                return new C50087kb();
            case 5:
                return f130216e;
            case 6:
                C63010eb ebVar = f130217f;
                if (ebVar == null) {
                    synchronized (C50088kc.class) {
                        ebVar = f130217f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130216e);
                            f130217f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
