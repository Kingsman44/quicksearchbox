package com.google.assistant.p3886c.p3888b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.c.b.n */
/* compiled from: PG */
public final class C50729n extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C50729n f132007g;

    /* renamed from: h */
    private static volatile C63010eb f132008h;

    /* renamed from: a */
    public int f132009a;

    /* renamed from: b */
    public String f132010b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f132011c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f132012d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C63088z f132013e = C63088z.f170246b;

    /* renamed from: f */
    public boolean f132014f = true;

    static {
        C50729n nVar = new C50729n();
        f132007g = nVar;
        C62942bv.registerDefaultInstance(C50729n.class, nVar);
    }

    private C50729n() {
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
                return newMessageInfo(f132007g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ည\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C50729n();
            case 4:
                return new C50728m();
            case 5:
                return f132007g;
            case 6:
                C63010eb ebVar = f132008h;
                if (ebVar == null) {
                    synchronized (C50729n.class) {
                        ebVar = f132008h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132007g);
                            f132008h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
