package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.d.l */
/* compiled from: PG */
public final class C121248l extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C121248l f336794f;

    /* renamed from: g */
    private static volatile C63010eb f336795g;

    /* renamed from: a */
    public int f336796a;

    /* renamed from: b */
    public String f336797b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f336798c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f336799d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public double f336800e;

    static {
        C121248l lVar = new C121248l();
        f336794f = lVar;
        C62942bv.registerDefaultInstance(C121248l.class, lVar);
    }

    private C121248l() {
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
                return newMessageInfo(f336794f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004က\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C121248l();
            case 4:
                return new C121247k();
            case 5:
                return f336794f;
            case 6:
                C63010eb ebVar = f336795g;
                if (ebVar == null) {
                    synchronized (C121248l.class) {
                        ebVar = f336795g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336794f);
                            f336795g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
