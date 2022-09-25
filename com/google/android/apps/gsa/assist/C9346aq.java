package com.google.android.apps.gsa.assist;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.aq */
/* compiled from: PG */
public final class C9346aq extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C9346aq f32431g;

    /* renamed from: h */
    private static volatile C63010eb f32432h;

    /* renamed from: a */
    public int f32433a;

    /* renamed from: b */
    public int f32434b;

    /* renamed from: c */
    public int f32435c;

    /* renamed from: d */
    public int f32436d;

    /* renamed from: e */
    public int f32437e;

    /* renamed from: f */
    public String f32438f = BuildConfig.FLAVOR;

    static {
        C9346aq aqVar = new C9346aq();
        f32431g = aqVar;
        C62942bv.registerDefaultInstance(C9346aq.class, aqVar);
    }

    private C9346aq() {
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
                return newMessageInfo(f32431g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C9346aq();
            case 4:
                return new C9345ap();
            case 5:
                return f32431g;
            case 6:
                C63010eb ebVar = f32432h;
                if (ebVar == null) {
                    synchronized (C9346aq.class) {
                        ebVar = f32432h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32431g);
                            f32432h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
