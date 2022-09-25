package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ee */
/* compiled from: PG */
public final class C14302ee extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14302ee f43267d;

    /* renamed from: e */
    private static volatile C63010eb f43268e;

    /* renamed from: a */
    public int f43269a;

    /* renamed from: b */
    public String f43270b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f43271c = BuildConfig.FLAVOR;

    static {
        C14302ee eeVar = new C14302ee();
        f43267d = eeVar;
        C62942bv.registerDefaultInstance(C14302ee.class, eeVar);
    }

    private C14302ee() {
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
                return newMessageInfo(f43267d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C14302ee();
            case 4:
                return new C14300ec();
            case 5:
                return f43267d;
            case 6:
                C63010eb ebVar = f43268e;
                if (ebVar == null) {
                    synchronized (C14302ee.class) {
                        ebVar = f43268e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43267d);
                            f43268e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
