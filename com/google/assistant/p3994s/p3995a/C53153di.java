package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.di */
/* compiled from: PG */
public final class C53153di extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C53153di f139315c;

    /* renamed from: e */
    private static volatile C63010eb f139316e;

    /* renamed from: a */
    public int f139317a;

    /* renamed from: b */
    public String f139318b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private byte f139319d = 2;

    static {
        C53153di diVar = new C53153di();
        f139315c = diVar;
        C62942bv.registerDefaultInstance(C53153di.class, diVar);
    }

    private C53153di() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139319d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139319d = b;
                return null;
            case 2:
                return newMessageInfo(f139315c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53153di();
            case 4:
                return new C53152dh();
            case 5:
                return f139315c;
            case 6:
                C63010eb ebVar = f139316e;
                if (ebVar == null) {
                    synchronized (C53153di.class) {
                        ebVar = f139316e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139315c);
                            f139316e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
