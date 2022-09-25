package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ft */
/* compiled from: PG */
public final class C14344ft extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14344ft f43402d;

    /* renamed from: e */
    private static volatile C63010eb f43403e;

    /* renamed from: a */
    public int f43404a;

    /* renamed from: b */
    public long f43405b;

    /* renamed from: c */
    public String f43406c = BuildConfig.FLAVOR;

    static {
        C14344ft ftVar = new C14344ft();
        f43402d = ftVar;
        C62942bv.registerDefaultInstance(C14344ft.class, ftVar);
    }

    private C14344ft() {
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
                return newMessageInfo(f43402d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\f\u0002\u0003\u0004Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C14344ft();
            case 4:
                return new C14343fs();
            case 5:
                return f43402d;
            case 6:
                C63010eb ebVar = f43403e;
                if (ebVar == null) {
                    synchronized (C14344ft.class) {
                        ebVar = f43403e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43402d);
                            f43403e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
