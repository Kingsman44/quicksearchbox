package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.z */
/* compiled from: PG */
public final class C53815z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53815z f141237c;

    /* renamed from: d */
    private static volatile C63010eb f141238d;

    /* renamed from: a */
    public int f141239a;

    /* renamed from: b */
    public long f141240b;

    static {
        C53815z zVar = new C53815z();
        f141237c = zVar;
        C62942bv.registerDefaultInstance(C53815z.class, zVar);
    }

    private C53815z() {
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
                return newMessageInfo(f141237c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53815z();
            case 4:
                return new C53814y();
            case 5:
                return f141237c;
            case 6:
                C63010eb ebVar = f141238d;
                if (ebVar == null) {
                    synchronized (C53815z.class) {
                        ebVar = f141238d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141237c);
                            f141238d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
