package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ay.d.a.a.a.a.ad */
/* compiled from: PG */
public final class C64285ad extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64285ad f173815c;

    /* renamed from: d */
    private static volatile C63010eb f173816d;

    /* renamed from: a */
    public int f173817a;

    /* renamed from: b */
    public String f173818b = BuildConfig.FLAVOR;

    static {
        C64285ad adVar = new C64285ad();
        f173815c = adVar;
        C62942bv.registerDefaultInstance(C64285ad.class, adVar);
    }

    private C64285ad() {
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
                return newMessageInfo(f173815c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64285ad();
            case 4:
                return new C64284ac();
            case 5:
                return f173815c;
            case 6:
                C63010eb ebVar = f173816d;
                if (ebVar == null) {
                    synchronized (C64285ad.class) {
                        ebVar = f173816d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173815c);
                            f173816d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
