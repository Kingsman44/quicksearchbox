package com.google.android.libraries.search.assistant.p2786t.p2787a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.a.d */
/* compiled from: PG */
public final class C36453d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C36453d f95179d;

    /* renamed from: e */
    private static volatile C63010eb f95180e;

    /* renamed from: a */
    public int f95181a;

    /* renamed from: b */
    public String f95182b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f95183c;

    static {
        C36453d dVar = new C36453d();
        f95179d = dVar;
        C62942bv.registerDefaultInstance(C36453d.class, dVar);
    }

    private C36453d() {
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
                return newMessageInfo(f95179d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C36453d();
            case 4:
                return new C36452c();
            case 5:
                return f95179d;
            case 6:
                C63010eb ebVar = f95180e;
                if (ebVar == null) {
                    synchronized (C36453d.class) {
                        ebVar = f95180e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95179d);
                            f95180e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
