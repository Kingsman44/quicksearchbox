package com.google.android.libraries.search.assistant.appactions.appwidget;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.appactions.appwidget.i */
/* compiled from: PG */
public final class C32476i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C32476i f87025e;

    /* renamed from: f */
    private static volatile C63010eb f87026f;

    /* renamed from: a */
    public int f87027a;

    /* renamed from: b */
    public String f87028b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f87029c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f87030d = BuildConfig.FLAVOR;

    static {
        C32476i iVar = new C32476i();
        f87025e = iVar;
        C62942bv.registerDefaultInstance(C32476i.class, iVar);
    }

    private C32476i() {
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
                return newMessageInfo(f87025e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C32476i();
            case 4:
                return new C32475h();
            case 5:
                return f87025e;
            case 6:
                C63010eb ebVar = f87026f;
                if (ebVar == null) {
                    synchronized (C32476i.class) {
                        ebVar = f87026f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f87025e);
                            f87026f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
