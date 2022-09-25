package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.kz */
/* compiled from: PG */
public final class C14485kz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14485kz f43772d;

    /* renamed from: e */
    private static volatile C63010eb f43773e;

    /* renamed from: a */
    public int f43774a;

    /* renamed from: b */
    public String f43775b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f43776c;

    static {
        C14485kz kzVar = new C14485kz();
        f43772d = kzVar;
        C62942bv.registerDefaultInstance(C14485kz.class, kzVar);
    }

    private C14485kz() {
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
                return newMessageInfo(f43772d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\u0004", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C14485kz();
            case 4:
                return new C14483kx();
            case 5:
                return f43772d;
            case 6:
                C63010eb ebVar = f43773e;
                if (ebVar == null) {
                    synchronized (C14485kz.class) {
                        ebVar = f43773e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43772d);
                            f43773e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
