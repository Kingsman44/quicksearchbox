package com.google.assistant.p3825an.p3830c.p3831a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.as */
/* compiled from: PG */
public final class C49273as extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49273as f127366d;

    /* renamed from: e */
    private static volatile C63010eb f127367e;

    /* renamed from: a */
    public int f127368a;

    /* renamed from: b */
    public String f127369b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f127370c = BuildConfig.FLAVOR;

    static {
        C49273as asVar = new C49273as();
        f127366d = asVar;
        C62942bv.registerDefaultInstance(C49273as.class, asVar);
    }

    private C49273as() {
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
                return newMessageInfo(f127366d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C49273as();
            case 4:
                return new C49272ar();
            case 5:
                return f127366d;
            case 6:
                C63010eb ebVar = f127367e;
                if (ebVar == null) {
                    synchronized (C49273as.class) {
                        ebVar = f127367e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127366d);
                            f127367e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
