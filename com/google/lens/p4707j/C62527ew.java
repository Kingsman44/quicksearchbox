package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.ew */
/* compiled from: PG */
public final class C62527ew extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62527ew f168818f;

    /* renamed from: h */
    private static volatile C63010eb f168819h;

    /* renamed from: a */
    public int f168820a;

    /* renamed from: b */
    public long f168821b;

    /* renamed from: c */
    public C62971cq f168822c = emptyProtobufList();

    /* renamed from: d */
    public int f168823d;

    /* renamed from: e */
    public long f168824e;

    /* renamed from: g */
    private byte f168825g = 2;

    static {
        C62527ew ewVar = new C62527ew();
        f168818f = ewVar;
        C62942bv.registerDefaultInstance(C62527ew.class, ewVar);
    }

    private C62527ew() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168825g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168825g = b;
                return null;
            case 2:
                return newMessageInfo(f168818f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဂ\u0000\u0002Л\u0003ဌ\u0001\u0004ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, C62561gc.class, "d", C62526ev.f168817a, "e"});
            case 3:
                return new C62527ew();
            case 4:
                return new C62525eu();
            case 5:
                return f168818f;
            case 6:
                C63010eb ebVar = f168819h;
                if (ebVar == null) {
                    synchronized (C62527ew.class) {
                        ebVar = f168819h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168818f);
                            f168819h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
