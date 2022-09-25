package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.bb */
/* compiled from: PG */
public final class C57585bb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57585bb f153848e;

    /* renamed from: g */
    private static volatile C63010eb f153849g;

    /* renamed from: a */
    public C57601br f153850a;

    /* renamed from: b */
    public C62971cq f153851b = emptyProtobufList();

    /* renamed from: c */
    public C57566aj f153852c;

    /* renamed from: d */
    public C57566aj f153853d;

    /* renamed from: f */
    private byte f153854f = 2;

    static {
        C57585bb bbVar = new C57585bb();
        f153848e = bbVar;
        C62942bv.registerDefaultInstance(C57585bb.class, bbVar);
    }

    private C57585bb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153854f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153854f = b;
                return null;
            case 2:
                return newMessageInfo(f153848e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0001\u0001\t\u0002Л\u0003\t\u0004\t", new Object[]{"a", "b", C57663x.class, C45240c.f118157a, "d"});
            case 3:
                return new C57585bb();
            case 4:
                return new C57584ba();
            case 5:
                return f153848e;
            case 6:
                C63010eb ebVar = f153849g;
                if (ebVar == null) {
                    synchronized (C57585bb.class) {
                        ebVar = f153849g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153848e);
                            f153849g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
