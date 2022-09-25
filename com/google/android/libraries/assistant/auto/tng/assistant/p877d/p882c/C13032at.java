package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.at */
/* compiled from: PG */
public final class C13032at extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C13032at f40457d;

    /* renamed from: e */
    private static volatile C63010eb f40458e;

    /* renamed from: a */
    public int f40459a;

    /* renamed from: b */
    public String f40460b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f40461c = BuildConfig.FLAVOR;

    static {
        C13032at atVar = new C13032at();
        f40457d = atVar;
        C62942bv.registerDefaultInstance(C13032at.class, atVar);
    }

    private C13032at() {
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
                return newMessageInfo(f40457d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C13032at();
            case 4:
                return new C13031as();
            case 5:
                return f40457d;
            case 6:
                C63010eb ebVar = f40458e;
                if (ebVar == null) {
                    synchronized (C13032at.class) {
                        ebVar = f40458e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40457d);
                            f40458e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
