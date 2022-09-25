package com.google.android.apps.gsa.proactive;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.proactive.o */
/* compiled from: PG */
public final class C84179o extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C84179o f229121f;

    /* renamed from: g */
    private static volatile C63010eb f229122g;

    /* renamed from: a */
    public int f229123a;

    /* renamed from: b */
    public String f229124b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f229125c;

    /* renamed from: d */
    public boolean f229126d;

    /* renamed from: e */
    public long f229127e;

    static {
        C84179o oVar = new C84179o();
        f229121f = oVar;
        C62942bv.registerDefaultInstance(C84179o.class, oVar);
    }

    private C84179o() {
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
                return newMessageInfo(f229121f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C84179o();
            case 4:
                return new C84178n();
            case 5:
                return f229121f;
            case 6:
                C63010eb ebVar = f229122g;
                if (ebVar == null) {
                    synchronized (C84179o.class) {
                        ebVar = f229122g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f229121f);
                            f229122g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
