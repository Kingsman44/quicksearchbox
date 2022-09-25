package com.google.android.apps.search.assistant.verticals.automation.routines.p10028d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.d.d */
/* compiled from: PG */
public final class C131861d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C131861d f360092d;

    /* renamed from: e */
    private static volatile C63010eb f360093e;

    /* renamed from: a */
    public int f360094a;

    /* renamed from: b */
    public String f360095b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C131860c f360096c;

    static {
        C131861d dVar = new C131861d();
        f360092d = dVar;
        C62942bv.registerDefaultInstance(C131861d.class, dVar);
    }

    private C131861d() {
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
                return newMessageInfo(f360092d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C131861d();
            case 4:
                return new C131858a();
            case 5:
                return f360092d;
            case 6:
                C63010eb ebVar = f360093e;
                if (ebVar == null) {
                    synchronized (C131861d.class) {
                        ebVar = f360093e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f360092d);
                            f360093e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
