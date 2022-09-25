package com.google.android.libraries.gsa.monet.shared.p1894d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.monet.shared.d.d */
/* compiled from: PG */
public final class C23101d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C23101d f63447g;

    /* renamed from: h */
    private static volatile C63010eb f63448h;

    /* renamed from: a */
    public int f63449a;

    /* renamed from: b */
    public int f63450b = 0;

    /* renamed from: c */
    public Object f63451c;

    /* renamed from: d */
    public int f63452d;

    /* renamed from: e */
    public String f63453e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f63454f = BuildConfig.FLAVOR;

    static {
        C23101d dVar = new C23101d();
        f63447g = dVar;
        C62942bv.registerDefaultInstance(C23101d.class, dVar);
    }

    private C23101d() {
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
                return newMessageInfo(f63447g, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ျ\u0000\u0005ျ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C23102e.f63455a, "e", C10662f.f35572a});
            case 3:
                return new C23101d();
            case 4:
                return new C23100c();
            case 5:
                return f63447g;
            case 6:
                C63010eb ebVar = f63448h;
                if (ebVar == null) {
                    synchronized (C23101d.class) {
                        ebVar = f63448h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f63447g);
                            f63448h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
