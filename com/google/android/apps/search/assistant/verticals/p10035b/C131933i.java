package com.google.android.apps.search.assistant.verticals.p10035b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.b.i */
/* compiled from: PG */
public final class C131933i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C131933i f360231d;

    /* renamed from: f */
    private static volatile C63010eb f360232f;

    /* renamed from: a */
    public String f360233a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f360234b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f360235c;

    /* renamed from: e */
    private int f360236e;

    static {
        C131933i iVar = new C131933i();
        f360231d = iVar;
        C62942bv.registerDefaultInstance(C131933i.class, iVar);
    }

    private C131933i() {
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
                return newMessageInfo(f360231d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C131933i();
            case 4:
                return new C131932h();
            case 5:
                return f360231d;
            case 6:
                C63010eb ebVar = f360232f;
                if (ebVar == null) {
                    synchronized (C131933i.class) {
                        ebVar = f360232f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f360231d);
                            f360232f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
