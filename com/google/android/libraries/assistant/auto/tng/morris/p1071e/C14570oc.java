package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.oc */
/* compiled from: PG */
public final class C14570oc extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14570oc f44050d;

    /* renamed from: e */
    private static volatile C63010eb f44051e;

    /* renamed from: a */
    public String f44052a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f44053b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f44054c;

    static {
        C14570oc ocVar = new C14570oc();
        f44050d = ocVar;
        C62942bv.registerDefaultInstance(C14570oc.class, ocVar);
    }

    private C14570oc() {
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
                return newMessageInfo(f44050d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C14570oc();
            case 4:
                return new C14569ob();
            case 5:
                return f44050d;
            case 6:
                C63010eb ebVar = f44051e;
                if (ebVar == null) {
                    synchronized (C14570oc.class) {
                        ebVar = f44051e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44050d);
                            f44051e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
