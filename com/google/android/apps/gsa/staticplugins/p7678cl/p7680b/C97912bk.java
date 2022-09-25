package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.bk */
/* compiled from: PG */
public final class C97912bk extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C97912bk f273376g;

    /* renamed from: h */
    private static volatile C63010eb f273377h;

    /* renamed from: a */
    public int f273378a;

    /* renamed from: b */
    public String f273379b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f273380c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f273381d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public float f273382e;

    /* renamed from: f */
    public long f273383f;

    static {
        C97912bk bkVar = new C97912bk();
        f273376g = bkVar;
        C62942bv.registerDefaultInstance(C97912bk.class, bkVar);
    }

    private C97912bk() {
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
                return newMessageInfo(f273376g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ခ\u0003\u0005ဂ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C97912bk();
            case 4:
                return new C97911bj();
            case 5:
                return f273376g;
            case 6:
                C63010eb ebVar = f273377h;
                if (ebVar == null) {
                    synchronized (C97912bk.class) {
                        ebVar = f273377h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273376g);
                            f273377h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
