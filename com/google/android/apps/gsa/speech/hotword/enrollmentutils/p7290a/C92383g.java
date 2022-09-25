package com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.g */
/* compiled from: PG */
public final class C92383g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C92383g f257629d;

    /* renamed from: e */
    private static volatile C63010eb f257630e;

    /* renamed from: a */
    public int f257631a;

    /* renamed from: b */
    public String f257632b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f257633c = BuildConfig.FLAVOR;

    static {
        C92383g gVar = new C92383g();
        f257629d = gVar;
        C62942bv.registerDefaultInstance(C92383g.class, gVar);
    }

    private C92383g() {
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
                return newMessageInfo(f257629d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C92383g();
            case 4:
                return new C92382f();
            case 5:
                return f257629d;
            case 6:
                C63010eb ebVar = f257630e;
                if (ebVar == null) {
                    synchronized (C92383g.class) {
                        ebVar = f257630e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f257629d);
                            f257630e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
