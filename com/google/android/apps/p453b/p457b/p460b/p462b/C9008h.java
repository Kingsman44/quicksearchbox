package com.google.android.apps.p453b.p457b.p460b.p462b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.b.b.b.b.h */
/* compiled from: PG */
public final class C9008h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C9008h f31125c;

    /* renamed from: d */
    private static volatile C63010eb f31126d;

    /* renamed from: a */
    public int f31127a;

    /* renamed from: b */
    public String f31128b = BuildConfig.FLAVOR;

    static {
        C9008h hVar = new C9008h();
        f31125c = hVar;
        C62942bv.registerDefaultInstance(C9008h.class, hVar);
    }

    private C9008h() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f31125c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0002", new Object[]{"a", "b"});
            case 3:
                return new C9008h();
            case 4:
                return new C9007g();
            case 5:
                return f31125c;
            case 6:
                C63010eb ebVar = f31126d;
                if (ebVar == null) {
                    synchronized (C9008h.class) {
                        ebVar = f31126d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31125c);
                            f31126d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
