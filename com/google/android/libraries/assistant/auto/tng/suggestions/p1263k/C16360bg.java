package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.bg */
/* compiled from: PG */
public final class C16360bg extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C16360bg f48159g;

    /* renamed from: h */
    private static volatile C63010eb f48160h;

    /* renamed from: a */
    public int f48161a;

    /* renamed from: b */
    public boolean f48162b;

    /* renamed from: c */
    public C16356bc f48163c;

    /* renamed from: d */
    public String f48164d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C16359bf f48165e;

    /* renamed from: f */
    public boolean f48166f;

    static {
        C16360bg bgVar = new C16360bg();
        f48159g = bgVar;
        C62942bv.registerDefaultInstance(C16360bg.class, bgVar);
    }

    private C16360bg() {
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
                return newMessageInfo(f48159g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C16360bg();
            case 4:
                return new C16357bd();
            case 5:
                return f48159g;
            case 6:
                C63010eb ebVar = f48160h;
                if (ebVar == null) {
                    synchronized (C16360bg.class) {
                        ebVar = f48160h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48159g);
                            f48160h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
