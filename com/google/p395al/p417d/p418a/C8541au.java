package com.google.p395al.p417d.p418a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.au */
/* compiled from: PG */
public final class C8541au extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8541au f29631c;

    /* renamed from: e */
    private static volatile C63010eb f29632e;

    /* renamed from: a */
    public long f29633a;

    /* renamed from: b */
    public long f29634b;

    /* renamed from: d */
    private int f29635d;

    static {
        C8541au auVar = new C8541au();
        f29631c = auVar;
        C62942bv.registerDefaultInstance(C8541au.class, auVar);
    }

    private C8541au() {
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
                return newMessageInfo(f29631c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C8541au();
            case 4:
                return new C8540at();
            case 5:
                return f29631c;
            case 6:
                C63010eb ebVar = f29632e;
                if (ebVar == null) {
                    synchronized (C8541au.class) {
                        ebVar = f29632e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29631c);
                            f29632e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
