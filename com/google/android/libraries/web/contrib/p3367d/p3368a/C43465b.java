package com.google.android.libraries.web.contrib.p3367d.p3368a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.web.contrib.d.a.b */
/* compiled from: PG */
public final class C43465b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C43465b f113539h;

    /* renamed from: i */
    private static volatile C63010eb f113540i;

    /* renamed from: a */
    public int f113541a;

    /* renamed from: b */
    public int f113542b;

    /* renamed from: c */
    public int f113543c;

    /* renamed from: d */
    public boolean f113544d;

    /* renamed from: e */
    public boolean f113545e;

    /* renamed from: f */
    public String f113546f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f113547g;

    static {
        C43465b bVar = new C43465b();
        f113539h = bVar;
        C62942bv.registerDefaultInstance(C43465b.class, bVar);
    }

    private C43465b() {
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
                return newMessageInfo(f113539h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C43465b();
            case 4:
                return new C43462a();
            case 5:
                return f113539h;
            case 6:
                C63010eb ebVar = f113540i;
                if (ebVar == null) {
                    synchronized (C43465b.class) {
                        ebVar = f113540i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f113539h);
                            f113540i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
