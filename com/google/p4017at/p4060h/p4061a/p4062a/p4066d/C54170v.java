package com.google.p4017at.p4060h.p4061a.p4062a.p4066d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.d.v */
/* compiled from: PG */
public final class C54170v extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54170v f142167d;

    /* renamed from: f */
    private static volatile C63010eb f142168f;

    /* renamed from: a */
    public int f142169a;

    /* renamed from: b */
    public C62971cq f142170b = emptyProtobufList();

    /* renamed from: c */
    public long f142171c;

    /* renamed from: e */
    private byte f142172e = 2;

    static {
        C54170v vVar = new C54170v();
        f142167d = vVar;
        C62942bv.registerDefaultInstance(C54170v.class, vVar);
    }

    private C54170v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142172e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142172e = b;
                return null;
            case 2:
                return newMessageInfo(f142167d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0001\u0001Л\u0004ဂ\u0000", new Object[]{"a", "b", C54168t.class, C45240c.f118157a});
            case 3:
                return new C54170v();
            case 4:
                return new C54169u();
            case 5:
                return f142167d;
            case 6:
                C63010eb ebVar = f142168f;
                if (ebVar == null) {
                    synchronized (C54170v.class) {
                        ebVar = f142168f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142167d);
                            f142168f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
