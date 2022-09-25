package com.google.assistant.p3886c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.c.v */
/* compiled from: PG */
public final class C50850v extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C50850v f132407g;

    /* renamed from: h */
    private static volatile C63010eb f132408h;

    /* renamed from: a */
    public int f132409a;

    /* renamed from: b */
    public int f132410b;

    /* renamed from: c */
    public String f132411c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63042fg f132412d;

    /* renamed from: e */
    public boolean f132413e;

    /* renamed from: f */
    public int f132414f;

    static {
        C50850v vVar = new C50850v();
        f132407g = vVar;
        C62942bv.registerDefaultInstance(C50850v.class, vVar);
    }

    private C50850v() {
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
                return newMessageInfo(f132407g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C50850v();
            case 4:
                return new C50849u();
            case 5:
                return f132407g;
            case 6:
                C63010eb ebVar = f132408h;
                if (ebVar == null) {
                    synchronized (C50850v.class) {
                        ebVar = f132408h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132407g);
                            f132408h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
