package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.c.d */
/* compiled from: PG */
public final class C115167d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C115167d f319614d;

    /* renamed from: f */
    private static volatile C63010eb f319615f;

    /* renamed from: a */
    public int f319616a;

    /* renamed from: b */
    public String f319617b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C88431bb f319618c;

    /* renamed from: e */
    private byte f319619e = 2;

    static {
        C115167d dVar = new C115167d();
        f319614d = dVar;
        C62942bv.registerDefaultInstance(C115167d.class, dVar);
    }

    private C115167d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f319619e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f319619e = b;
                return null;
            case 2:
                return newMessageInfo(f319614d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C115167d();
            case 4:
                return new C115166c();
            case 5:
                return f319614d;
            case 6:
                C63010eb ebVar = f319615f;
                if (ebVar == null) {
                    synchronized (C115167d.class) {
                        ebVar = f319615f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f319614d);
                            f319615f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
