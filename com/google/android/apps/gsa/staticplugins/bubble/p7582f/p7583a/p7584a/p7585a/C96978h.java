package com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.p7585a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.f.a.a.a.h */
/* compiled from: PG */
public final class C96978h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C96978h f271023c;

    /* renamed from: f */
    private static volatile C63010eb f271024f;

    /* renamed from: a */
    public long f271025a;

    /* renamed from: b */
    public C96977g f271026b;

    /* renamed from: d */
    private int f271027d;

    /* renamed from: e */
    private byte f271028e = 2;

    static {
        C96978h hVar = new C96978h();
        f271023c = hVar;
        C62942bv.registerDefaultInstance(C96978h.class, hVar);
    }

    private C96978h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f271028e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f271028e = b;
                return null;
            case 2:
                return newMessageInfo(f271023c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဂ\u0000\u0002ᐉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C96978h();
            case 4:
                return new C96975e();
            case 5:
                return f271023c;
            case 6:
                C63010eb ebVar = f271024f;
                if (ebVar == null) {
                    synchronized (C96978h.class) {
                        ebVar = f271024f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f271023c);
                            f271024f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
