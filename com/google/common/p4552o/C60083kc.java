package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.kc */
/* compiled from: PG */
public final class C60083kc extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60083kc f162439d;

    /* renamed from: e */
    private static volatile C63010eb f162440e;

    /* renamed from: a */
    public int f162441a;

    /* renamed from: b */
    public int f162442b;

    /* renamed from: c */
    public String f162443c = BuildConfig.FLAVOR;

    static {
        C60083kc kcVar = new C60083kc();
        f162439d = kcVar;
        C62942bv.registerDefaultInstance(C60083kc.class, kcVar);
    }

    private C60083kc() {
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
                return newMessageInfo(f162439d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C60082kb.f162438a, C45240c.f118157a});
            case 3:
                return new C60083kc();
            case 4:
                return new C60081ka();
            case 5:
                return f162439d;
            case 6:
                C63010eb ebVar = f162440e;
                if (ebVar == null) {
                    synchronized (C60083kc.class) {
                        ebVar = f162440e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162439d);
                            f162440e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
