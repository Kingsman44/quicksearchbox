package com.google.android.apps.auto.p450a.p451a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.ah */
/* compiled from: PG */
public final class C8863ah extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8863ah f30783c;

    /* renamed from: e */
    private static volatile C63010eb f30784e;

    /* renamed from: a */
    public String f30785a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f30786b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f30787d;

    static {
        C8863ah ahVar = new C8863ah();
        f30783c = ahVar;
        C62942bv.registerDefaultInstance(C8863ah.class, ahVar);
    }

    private C8863ah() {
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
                return newMessageInfo(f30783c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C8863ah();
            case 4:
                return new C8862ag();
            case 5:
                return f30783c;
            case 6:
                C63010eb ebVar = f30784e;
                if (ebVar == null) {
                    synchronized (C8863ah.class) {
                        ebVar = f30784e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30783c);
                            f30784e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
