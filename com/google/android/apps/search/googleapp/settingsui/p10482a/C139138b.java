package com.google.android.apps.search.googleapp.settingsui.p10482a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.a.b */
/* compiled from: PG */
public final class C139138b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C139138b f378426d;

    /* renamed from: e */
    private static volatile C63010eb f378427e;

    /* renamed from: a */
    public int f378428a;

    /* renamed from: b */
    public String f378429b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f378430c = BuildConfig.FLAVOR;

    static {
        C139138b bVar = new C139138b();
        f378426d = bVar;
        C62942bv.registerDefaultInstance(C139138b.class, bVar);
    }

    private C139138b() {
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
                return newMessageInfo(f378426d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C139138b();
            case 4:
                return new C139137a();
            case 5:
                return f378426d;
            case 6:
                C63010eb ebVar = f378427e;
                if (ebVar == null) {
                    synchronized (C139138b.class) {
                        ebVar = f378427e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f378426d);
                            f378427e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
