package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.er */
/* compiled from: PG */
public final class C57474er extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C57474er f153542d;

    /* renamed from: f */
    private static volatile C63010eb f153543f;

    /* renamed from: a */
    public int f153544a;

    /* renamed from: b */
    public C62971cq f153545b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C57351ac f153546c;

    /* renamed from: e */
    private byte f153547e = 2;

    static {
        C57474er erVar = new C57474er();
        f153542d = erVar;
        C62942bv.registerDefaultInstance(C57474er.class, erVar);
    }

    private C57474er() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153547e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153547e = b;
                return null;
            case 2:
                return newMessageInfo(f153542d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C57474er();
            case 4:
                return new C57473eq();
            case 5:
                return f153542d;
            case 6:
                C63010eb ebVar = f153543f;
                if (ebVar == null) {
                    synchronized (C57474er.class) {
                        ebVar = f153543f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153542d);
                            f153543f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
