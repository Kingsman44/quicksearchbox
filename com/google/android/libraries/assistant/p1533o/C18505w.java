package com.google.android.libraries.assistant.p1533o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.o.w */
/* compiled from: PG */
public final class C18505w extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C18505w f52458d;

    /* renamed from: e */
    private static volatile C63010eb f52459e;

    /* renamed from: a */
    public String f52460a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f52461b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f52462c = C63088z.f170246b;

    static {
        C18505w wVar = new C18505w();
        f52458d = wVar;
        C62942bv.registerDefaultInstance(C18505w.class, wVar);
    }

    private C18505w() {
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
                return newMessageInfo(f52458d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C18505w();
            case 4:
                return new C18504v();
            case 5:
                return f52458d;
            case 6:
                C63010eb ebVar = f52459e;
                if (ebVar == null) {
                    synchronized (C18505w.class) {
                        ebVar = f52459e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52458d);
                            f52459e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
