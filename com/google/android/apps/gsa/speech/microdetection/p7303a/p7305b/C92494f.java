package com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.a.b.f */
/* compiled from: PG */
public final class C92494f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C92494f f258122e;

    /* renamed from: f */
    private static volatile C63010eb f258123f;

    /* renamed from: a */
    public int f258124a;

    /* renamed from: b */
    public int f258125b;

    /* renamed from: c */
    public int f258126c;

    /* renamed from: d */
    public String f258127d = BuildConfig.FLAVOR;

    static {
        C92494f fVar = new C92494f();
        f258122e = fVar;
        C62942bv.registerDefaultInstance(C92494f.class, fVar);
    }

    private C92494f() {
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
                return newMessageInfo(f258122e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C90584f.m147801b(), C45240c.f118157a, C92492d.f258121a, "d"});
            case 3:
                return new C92494f();
            case 4:
                return new C92491c();
            case 5:
                return f258122e;
            case 6:
                C63010eb ebVar = f258123f;
                if (ebVar == null) {
                    synchronized (C92494f.class) {
                        ebVar = f258123f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f258122e);
                            f258123f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
