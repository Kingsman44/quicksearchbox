package com.google.android.apps.auto.p450a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.d */
/* compiled from: PG */
public final class C8958d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8958d f31045c;

    /* renamed from: e */
    private static volatile C63010eb f31046e;

    /* renamed from: a */
    public int f31047a;

    /* renamed from: b */
    public String f31048b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f31049d;

    static {
        C8958d dVar = new C8958d();
        f31045c = dVar;
        C62942bv.registerDefaultInstance(C8958d.class, dVar);
    }

    private C8958d() {
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
                return newMessageInfo(f31045c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", C8959e.f31050a, "b"});
            case 3:
                return new C8958d();
            case 4:
                return new C8957c();
            case 5:
                return f31045c;
            case 6:
                C63010eb ebVar = f31046e;
                if (ebVar == null) {
                    synchronized (C8958d.class) {
                        ebVar = f31046e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31045c);
                            f31046e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
