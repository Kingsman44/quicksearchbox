package com.google.android.apps.search.googleapp.settingsui.p10482a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.a.i */
/* compiled from: PG */
public final class C139145i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C139145i f378437d;

    /* renamed from: e */
    private static volatile C63010eb f378438e;

    /* renamed from: a */
    public int f378439a;

    /* renamed from: b */
    public String f378440b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f378441c;

    static {
        C139145i iVar = new C139145i();
        f378437d = iVar;
        C62942bv.registerDefaultInstance(C139145i.class, iVar);
    }

    private C139145i() {
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
                return newMessageInfo(f378437d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C139145i();
            case 4:
                return new C139144h();
            case 5:
                return f378437d;
            case 6:
                C63010eb ebVar = f378438e;
                if (ebVar == null) {
                    synchronized (C139145i.class) {
                        ebVar = f378438e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f378437d);
                            f378438e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
