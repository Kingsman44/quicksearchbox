package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ny */
/* compiled from: PG */
public final class C14565ny extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C14565ny f44034e;

    /* renamed from: f */
    private static volatile C63010eb f44035f;

    /* renamed from: a */
    public String f44036a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f44037b;

    /* renamed from: c */
    public C14361gj f44038c;

    /* renamed from: d */
    public int f44039d;

    static {
        C14565ny nyVar = new C14565ny();
        f44034e = nyVar;
        C62942bv.registerDefaultInstance(C14565ny.class, nyVar);
    }

    private C14565ny() {
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
                return newMessageInfo(f44034e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\t\u0004\f", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C14565ny();
            case 4:
                return new C14564nx();
            case 5:
                return f44034e;
            case 6:
                C63010eb ebVar = f44035f;
                if (ebVar == null) {
                    synchronized (C14565ny.class) {
                        ebVar = f44035f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44034e);
                            f44035f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
