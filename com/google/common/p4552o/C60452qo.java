package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.qo */
/* compiled from: PG */
public final class C60452qo extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60452qo f163594e;

    /* renamed from: g */
    private static volatile C63010eb f163595g;

    /* renamed from: a */
    public int f163596a = 0;

    /* renamed from: b */
    public Object f163597b;

    /* renamed from: c */
    public int f163598c = 0;

    /* renamed from: d */
    public Object f163599d;

    /* renamed from: f */
    private byte f163600f = 2;

    static {
        C60452qo qoVar = new C60452qo();
        f163594e = qoVar;
        C62942bv.registerDefaultInstance(C60452qo.class, qoVar);
    }

    private C60452qo() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f163600f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f163600f = b;
                return null;
            case 2:
                return newMessageInfo(f163594e, "\u0001\u0005\u0002\u0000\u0001\u0005\u0005\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ᐼ\u0001\u0003ᐼ\u0000\u0004ျ\u0000\u0005ျ\u0001", new Object[]{"b", "a", "d", C45240c.f118157a, C60220t.class, C60214n.class, C60218r.class});
            case 3:
                return new C60452qo();
            case 4:
                return new C60451qn();
            case 5:
                return f163594e;
            case 6:
                C63010eb ebVar = f163595g;
                if (ebVar == null) {
                    synchronized (C60452qo.class) {
                        ebVar = f163595g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163594e);
                            f163595g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
