package com.google.p3723ar.imp.view;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ar.imp.view.ae */
/* compiled from: PG */
public final class C47985ae extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C47985ae f124188h;

    /* renamed from: i */
    private static volatile C63010eb f124189i;

    /* renamed from: a */
    public int f124190a;

    /* renamed from: b */
    public String f124191b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f124192c = true;

    /* renamed from: d */
    public long f124193d;

    /* renamed from: e */
    public String f124194e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public float f124195f = 1.0f;

    /* renamed from: g */
    public int f124196g;

    static {
        C47985ae aeVar = new C47985ae();
        f124188h = aeVar;
        C62942bv.registerDefaultInstance(C47985ae.class, aeVar);
    }

    private C47985ae() {
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
                return newMessageInfo(f124188h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ခ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C47983ac.f124187a});
            case 3:
                return new C47985ae();
            case 4:
                return new C47982ab();
            case 5:
                return f124188h;
            case 6:
                C63010eb ebVar = f124189i;
                if (ebVar == null) {
                    synchronized (C47985ae.class) {
                        ebVar = f124189i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124188h);
                            f124189i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
