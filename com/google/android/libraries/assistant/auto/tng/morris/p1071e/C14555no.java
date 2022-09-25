package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.no */
/* compiled from: PG */
public final class C14555no extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14555no f44008d;

    /* renamed from: e */
    private static volatile C63010eb f44009e;

    /* renamed from: a */
    public String f44010a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f44011b;

    /* renamed from: c */
    public boolean f44012c;

    static {
        C14555no noVar = new C14555no();
        f44008d = noVar;
        C62942bv.registerDefaultInstance(C14555no.class, noVar);
    }

    private C14555no() {
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
                return newMessageInfo(f44008d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C14555no();
            case 4:
                return new C14554nn();
            case 5:
                return f44008d;
            case 6:
                C63010eb ebVar = f44009e;
                if (ebVar == null) {
                    synchronized (C14555no.class) {
                        ebVar = f44009e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44008d);
                            f44009e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
