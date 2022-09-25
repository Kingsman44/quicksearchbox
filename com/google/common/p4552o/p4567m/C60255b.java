package com.google.common.p4552o.p4567m;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.m.b */
/* compiled from: PG */
public final class C60255b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C60255b f163024g;

    /* renamed from: h */
    private static volatile C63010eb f163025h;

    /* renamed from: a */
    public int f163026a;

    /* renamed from: b */
    public int f163027b;

    /* renamed from: c */
    public String f163028c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C60259f f163029d;

    /* renamed from: e */
    public String f163030e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f163031f = BuildConfig.FLAVOR;

    static {
        C60255b bVar = new C60255b();
        f163024g = bVar;
        C62942bv.registerDefaultInstance(C60255b.class, bVar);
    }

    private C60255b() {
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
                return newMessageInfo(f163024g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C60256c.f163032a, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C60255b();
            case 4:
                return new C60254a();
            case 5:
                return f163024g;
            case 6:
                C63010eb ebVar = f163025h;
                if (ebVar == null) {
                    synchronized (C60255b.class) {
                        ebVar = f163025h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163024g);
                            f163025h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
