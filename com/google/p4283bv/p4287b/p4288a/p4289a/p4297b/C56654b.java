package com.google.p4283bv.p4287b.p4288a.p4289a.p4297b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.b.b */
/* compiled from: PG */
public final class C56654b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56654b f151243b;

    /* renamed from: d */
    private static volatile C63010eb f151244d;

    /* renamed from: a */
    public String f151245a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f151246c;

    static {
        C56654b bVar = new C56654b();
        f151243b = bVar;
        C62942bv.registerDefaultInstance(C56654b.class, bVar);
    }

    private C56654b() {
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
                return newMessageInfo(f151243b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C56654b();
            case 4:
                return new C56653a();
            case 5:
                return f151243b;
            case 6:
                C63010eb ebVar = f151244d;
                if (ebVar == null) {
                    synchronized (C56654b.class) {
                        ebVar = f151244d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151243b);
                            f151244d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
