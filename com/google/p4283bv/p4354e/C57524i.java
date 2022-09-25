package com.google.p4283bv.p4354e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C7737ib;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.i */
/* compiled from: PG */
public final class C57524i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57524i f153652e;

    /* renamed from: g */
    private static volatile C63010eb f153653g;

    /* renamed from: a */
    public int f153654a;

    /* renamed from: b */
    public C62971cq f153655b = emptyProtobufList();

    /* renamed from: c */
    public C57526k f153656c;

    /* renamed from: d */
    public C62971cq f153657d = emptyProtobufList();

    /* renamed from: f */
    private byte f153658f = 2;

    static {
        C57524i iVar = new C57524i();
        f153652e = iVar;
        C62942bv.registerDefaultInstance(C57524i.class, iVar);
    }

    private C57524i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153658f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153658f = b;
                return null;
            case 2:
                return newMessageInfo(f153652e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0003\u0001Л\u0002ᐉ\u0000\u0003Л", new Object[]{"a", "b", C7726hr.class, C45240c.f118157a, "d", C7737ib.class});
            case 3:
                return new C57524i();
            case 4:
                return new C57523h();
            case 5:
                return f153652e;
            case 6:
                C63010eb ebVar = f153653g;
                if (ebVar == null) {
                    synchronized (C57524i.class) {
                        ebVar = f153653g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153652e);
                            f153653g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
