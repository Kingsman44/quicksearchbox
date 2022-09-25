package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.as */
/* compiled from: PG */
public final class C53082as extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53082as f139099f;

    /* renamed from: h */
    private static volatile C63010eb f139100h;

    /* renamed from: a */
    public int f139101a;

    /* renamed from: b */
    public int f139102b = 0;

    /* renamed from: c */
    public Object f139103c;

    /* renamed from: d */
    public String f139104d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f139105e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f139106g = 2;

    static {
        C53082as asVar = new C53082as();
        f139099f = asVar;
        C62942bv.registerDefaultInstance(C53082as.class, asVar);
    }

    private C53082as() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139106g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139106g = b;
                return null;
            case 2:
                return newMessageInfo(f139099f, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ြ\u0000\u0002ᐼ\u0000\u0003ဈ\u0005\u0004ᐼ\u0000\u0005ဈ\u0006\u0006ြ\u0000\u0007ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", C53076am.class, C53074ak.class, "d", C53081ar.class, "e", C53079ap.class, C53072ai.class});
            case 3:
                return new C53082as();
            case 4:
                return new C53077an();
            case 5:
                return f139099f;
            case 6:
                C63010eb ebVar = f139100h;
                if (ebVar == null) {
                    synchronized (C53082as.class) {
                        ebVar = f139100h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139099f);
                            f139100h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
