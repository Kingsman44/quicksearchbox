package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.a.g */
/* compiled from: PG */
public final class C115437g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C115437g f320275d;

    /* renamed from: e */
    private static volatile C63010eb f320276e;

    /* renamed from: a */
    public int f320277a;

    /* renamed from: b */
    public String f320278b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f320279c = BuildConfig.FLAVOR;

    static {
        C115437g gVar = new C115437g();
        f320275d = gVar;
        C62942bv.registerDefaultInstance(C115437g.class, gVar);
    }

    private C115437g() {
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
                return newMessageInfo(f320275d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C115437g();
            case 4:
                return new C115436f();
            case 5:
                return f320275d;
            case 6:
                C63010eb ebVar = f320276e;
                if (ebVar == null) {
                    synchronized (C115437g.class) {
                        ebVar = f320276e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f320275d);
                            f320276e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
