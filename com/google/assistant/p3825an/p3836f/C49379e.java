package com.google.assistant.p3825an.p3836f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.f.e */
/* compiled from: PG */
public final class C49379e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49379e f127623d;

    /* renamed from: e */
    private static volatile C63010eb f127624e;

    /* renamed from: a */
    public int f127625a;

    /* renamed from: b */
    public String f127626b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f127627c = BuildConfig.FLAVOR;

    static {
        C49379e eVar = new C49379e();
        f127623d = eVar;
        C62942bv.registerDefaultInstance(C49379e.class, eVar);
    }

    private C49379e() {
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
                return newMessageInfo(f127623d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C49379e();
            case 4:
                return new C49378d();
            case 5:
                return f127623d;
            case 6:
                C63010eb ebVar = f127624e;
                if (ebVar == null) {
                    synchronized (C49379e.class) {
                        ebVar = f127624e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127623d);
                            f127624e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
