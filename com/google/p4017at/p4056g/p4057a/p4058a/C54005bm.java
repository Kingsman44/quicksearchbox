package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.lens.p4699e.C62223d;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.bm */
/* compiled from: PG */
public final class C54005bm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54005bm f141696c;

    /* renamed from: e */
    private static volatile C63010eb f141697e;

    /* renamed from: a */
    public C56220aa f141698a;

    /* renamed from: b */
    public C62971cq f141699b = emptyProtobufList();

    /* renamed from: d */
    private byte f141700d = 2;

    static {
        C54005bm bmVar = new C54005bm();
        f141696c = bmVar;
        C62942bv.registerDefaultInstance(C54005bm.class, bmVar);
    }

    private C54005bm() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141700d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141700d = b;
                return null;
            case 2:
                return newMessageInfo(f141696c, "\u0000\u0002\u0000\u0000\u0004\u0005\u0002\u0000\u0001\u0002\u0004Љ\u0005Л", new Object[]{"a", "b", C62223d.class});
            case 3:
                return new C54005bm();
            case 4:
                return new C54004bl();
            case 5:
                return f141696c;
            case 6:
                C63010eb ebVar = f141697e;
                if (ebVar == null) {
                    synchronized (C54005bm.class) {
                        ebVar = f141697e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141696c);
                            f141697e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
