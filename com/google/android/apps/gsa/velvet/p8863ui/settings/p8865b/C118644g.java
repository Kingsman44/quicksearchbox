package com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.b.g */
/* compiled from: PG */
public final class C118644g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C118644g f330989d;

    /* renamed from: e */
    private static volatile C63010eb f330990e;

    /* renamed from: a */
    public int f330991a;

    /* renamed from: b */
    public int f330992b;

    /* renamed from: c */
    public String f330993c = BuildConfig.FLAVOR;

    static {
        C118644g gVar = new C118644g();
        f330989d = gVar;
        C62942bv.registerDefaultInstance(C118644g.class, gVar);
    }

    private C118644g() {
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
                return newMessageInfo(f330989d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C118644g();
            case 4:
                return new C118643f();
            case 5:
                return f330989d;
            case 6:
                C63010eb ebVar = f330990e;
                if (ebVar == null) {
                    synchronized (C118644g.class) {
                        ebVar = f330990e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f330989d);
                            f330990e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
