package com.google.p395al.p417d.p418a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.k */
/* compiled from: PG */
public final class C8584k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8584k f29710c;

    /* renamed from: d */
    private static volatile C63010eb f29711d;

    /* renamed from: a */
    public int f29712a;

    /* renamed from: b */
    public String f29713b = BuildConfig.FLAVOR;

    static {
        C8584k kVar = new C8584k();
        f29710c = kVar;
        C62942bv.registerDefaultInstance(C8584k.class, kVar);
    }

    private C8584k() {
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
                return newMessageInfo(f29710c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C8584k();
            case 4:
                return new C8583j();
            case 5:
                return f29710c;
            case 6:
                C63010eb ebVar = f29711d;
                if (ebVar == null) {
                    synchronized (C8584k.class) {
                        ebVar = f29711d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29710c);
                            f29711d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
