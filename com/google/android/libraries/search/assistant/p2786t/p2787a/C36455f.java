package com.google.android.libraries.search.assistant.p2786t.p2787a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.a.f */
/* compiled from: PG */
public final class C36455f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C36455f f95184d;

    /* renamed from: e */
    private static volatile C63010eb f95185e;

    /* renamed from: a */
    public int f95186a;

    /* renamed from: b */
    public String f95187b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f95188c = BuildConfig.FLAVOR;

    static {
        C36455f fVar = new C36455f();
        f95184d = fVar;
        C62942bv.registerDefaultInstance(C36455f.class, fVar);
    }

    private C36455f() {
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
                return newMessageInfo(f95184d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C36455f();
            case 4:
                return new C36454e();
            case 5:
                return f95184d;
            case 6:
                C63010eb ebVar = f95185e;
                if (ebVar == null) {
                    synchronized (C36455f.class) {
                        ebVar = f95185e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95184d);
                            f95185e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
