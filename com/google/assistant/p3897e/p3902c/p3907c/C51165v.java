package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.v */
/* compiled from: PG */
public final class C51165v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51165v f133190c;

    /* renamed from: f */
    private static volatile C63010eb f133191f;

    /* renamed from: a */
    public int f133192a;

    /* renamed from: b */
    public C51098gh f133193b;

    /* renamed from: d */
    private C51016dg f133194d;

    /* renamed from: e */
    private byte f133195e = 2;

    static {
        C51165v vVar = new C51165v();
        f133190c = vVar;
        C62942bv.registerDefaultInstance(C51165v.class, vVar);
    }

    private C51165v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133195e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133195e = b;
                return null;
            case 2:
                return newMessageInfo(f133190c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "d", "b"});
            case 3:
                return new C51165v();
            case 4:
                return new C51164u();
            case 5:
                return f133190c;
            case 6:
                C63010eb ebVar = f133191f;
                if (ebVar == null) {
                    synchronized (C51165v.class) {
                        ebVar = f133191f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133190c);
                            f133191f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
