package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ki */
/* compiled from: PG */
public final class C53342ki extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53342ki f139973d;

    /* renamed from: g */
    private static volatile C63010eb f139974g;

    /* renamed from: a */
    public int f139975a;

    /* renamed from: b */
    public C53271hs f139976b;

    /* renamed from: c */
    public String f139977c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private C53253ha f139978e;

    /* renamed from: f */
    private byte f139979f = 2;

    static {
        C53342ki kiVar = new C53342ki();
        f139973d = kiVar;
        C62942bv.registerDefaultInstance(C53342ki.class, kiVar);
    }

    private C53342ki() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139979f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139979f = b;
                return null;
            case 2:
                return newMessageInfo(f139973d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002", new Object[]{"a", "e", "b", C45240c.f118157a});
            case 3:
                return new C53342ki();
            case 4:
                return new C53341kh();
            case 5:
                return f139973d;
            case 6:
                C63010eb ebVar = f139974g;
                if (ebVar == null) {
                    synchronized (C53342ki.class) {
                        ebVar = f139974g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139973d);
                            f139974g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
