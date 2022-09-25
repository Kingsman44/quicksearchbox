package com.google.p4281bu.p4282a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.k */
/* compiled from: PG */
public final class C56585k extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56585k f151076f;

    /* renamed from: g */
    private static volatile C63010eb f151077g;

    /* renamed from: a */
    public int f151078a;

    /* renamed from: b */
    public int f151079b;

    /* renamed from: c */
    public String f151080c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f151081d;

    /* renamed from: e */
    public C56590p f151082e;

    static {
        C56585k kVar = new C56585k();
        f151076f = kVar;
        C62942bv.registerDefaultInstance(C56585k.class, kVar);
    }

    private C56585k() {
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
                return newMessageInfo(f151076f, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003Ȉ\u0004\u0007\u0006\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C56585k();
            case 4:
                return new C56584j();
            case 5:
                return f151076f;
            case 6:
                C63010eb ebVar = f151077g;
                if (ebVar == null) {
                    synchronized (C56585k.class) {
                        ebVar = f151077g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151076f);
                            f151077g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
