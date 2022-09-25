package com.google.p4160bf.p4164b.p4165a.p4166a;

import com.google.p4160bf.p4164b.p4165a.C55661cq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.a.bi */
/* compiled from: PG */
public final class C55556bi extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55556bi f146580c;

    /* renamed from: e */
    private static volatile C63010eb f146581e;

    /* renamed from: a */
    public C55564bq f146582a;

    /* renamed from: b */
    public C62971cq f146583b = emptyProtobufList();

    /* renamed from: d */
    private int f146584d;

    static {
        C55556bi biVar = new C55556bi();
        f146580c = biVar;
        C62942bv.registerDefaultInstance(C55556bi.class, biVar);
    }

    private C55556bi() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f146580c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C55661cq.class});
            case 3:
                return new C55556bi();
            case 4:
                return new C55555bh();
            case 5:
                return f146580c;
            case 6:
                C63010eb ebVar = f146581e;
                if (ebVar == null) {
                    synchronized (C55556bi.class) {
                        ebVar = f146581e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146580c);
                            f146581e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
