package com.google.p4438c.p4439a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4419bx.C57863d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.c.a.b */
/* compiled from: PG */
public final class C57913b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57913b f154898e;

    /* renamed from: g */
    private static volatile C63010eb f154899g;

    /* renamed from: a */
    public int f154900a;

    /* renamed from: b */
    public C57920i f154901b;

    /* renamed from: c */
    public C57863d f154902c;

    /* renamed from: d */
    public C57915d f154903d;

    /* renamed from: f */
    private byte f154904f = 2;

    static {
        C57913b bVar = new C57913b();
        f154898e = bVar;
        C62942bv.registerDefaultInstance(C57913b.class, bVar);
    }

    private C57913b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154904f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154904f = b;
                return null;
            case 2:
                return newMessageInfo(f154898e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0004ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C57913b();
            case 4:
                return new C57912a();
            case 5:
                return f154898e;
            case 6:
                C63010eb ebVar = f154899g;
                if (ebVar == null) {
                    synchronized (C57913b.class) {
                        ebVar = f154899g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154898e);
                            f154899g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
