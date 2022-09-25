package com.google.p4715m.p4716a.p4720b.p4721a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.m.a.b.a.z */
/* compiled from: PG */
public final class C62698z extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C62698z f169271g;

    /* renamed from: h */
    private static volatile C63010eb f169272h;

    /* renamed from: a */
    public int f169273a;

    /* renamed from: b */
    public String f169274b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62696x f169275c;

    /* renamed from: d */
    public int f169276d;

    /* renamed from: e */
    public int f169277e;

    /* renamed from: f */
    public int f169278f;

    static {
        C62698z zVar = new C62698z();
        f169271g = zVar;
        C62942bv.registerDefaultInstance(C62698z.class, zVar);
    }

    private C62698z() {
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
                return newMessageInfo(f169271g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0004င\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C62698z();
            case 4:
                return new C62697y();
            case 5:
                return f169271g;
            case 6:
                C63010eb ebVar = f169272h;
                if (ebVar == null) {
                    synchronized (C62698z.class) {
                        ebVar = f169272h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169271g);
                            f169272h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
