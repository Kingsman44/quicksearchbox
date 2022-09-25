package com.google.p4605f.p4606a;

import com.google.p3717aq.p3718a.p3719a.C47887u;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.f.a.f */
/* compiled from: PG */
public final class C61078f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61078f f165356c;

    /* renamed from: f */
    private static volatile C63010eb f165357f;

    /* renamed from: a */
    public C61077e f165358a;

    /* renamed from: b */
    public C47887u f165359b;

    /* renamed from: d */
    private int f165360d;

    /* renamed from: e */
    private byte f165361e = 2;

    static {
        C61078f fVar = new C61078f();
        f165356c = fVar;
        C62942bv.registerDefaultInstance(C61078f.class, fVar);
    }

    private C61078f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f165361e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f165361e = b;
                return null;
            case 2:
                return newMessageInfo(f165356c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C61078f();
            case 4:
                return new C61073a();
            case 5:
                return f165356c;
            case 6:
                C63010eb ebVar = f165357f;
                if (ebVar == null) {
                    synchronized (C61078f.class) {
                        ebVar = f165357f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165356c);
                            f165357f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
