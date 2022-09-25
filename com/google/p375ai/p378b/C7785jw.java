package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.jw */
/* compiled from: PG */
public final class C7785jw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7785jw f27245c;

    /* renamed from: e */
    private static volatile C63010eb f27246e;

    /* renamed from: a */
    public String f27247a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f27248b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f27249d;

    static {
        C7785jw jwVar = new C7785jw();
        f27245c = jwVar;
        C62942bv.registerDefaultInstance(C7785jw.class, jwVar);
    }

    private C7785jw() {
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
                return newMessageInfo(f27245c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002", new Object[]{"d", "a", "b"});
            case 3:
                return new C7785jw();
            case 4:
                return new C7784jv();
            case 5:
                return f27245c;
            case 6:
                C63010eb ebVar = f27246e;
                if (ebVar == null) {
                    synchronized (C7785jw.class) {
                        ebVar = f27246e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27245c);
                            f27246e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
