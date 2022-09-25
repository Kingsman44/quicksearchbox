package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.e.fr */
/* compiled from: PG */
public final class C51965fr extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51965fr f136369d;

    /* renamed from: e */
    private static volatile C63010eb f136370e;

    /* renamed from: a */
    public int f136371a;

    /* renamed from: b */
    public C63088z f136372b = C63088z.f170246b;

    /* renamed from: c */
    public String f136373c = BuildConfig.FLAVOR;

    static {
        C51965fr frVar = new C51965fr();
        f136369d = frVar;
        C62942bv.registerDefaultInstance(C51965fr.class, frVar);
    }

    private C51965fr() {
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
                return newMessageInfo(f136369d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51965fr();
            case 4:
                return new C51964fq();
            case 5:
                return f136369d;
            case 6:
                C63010eb ebVar = f136370e;
                if (ebVar == null) {
                    synchronized (C51965fr.class) {
                        ebVar = f136370e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136369d);
                            f136370e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
