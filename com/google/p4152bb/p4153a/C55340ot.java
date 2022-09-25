package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.ot */
/* compiled from: PG */
public final class C55340ot extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55340ot f145799e;

    /* renamed from: f */
    public static final C62940bt f145800f;

    /* renamed from: g */
    private static volatile C63010eb f145801g;

    /* renamed from: a */
    public int f145802a;

    /* renamed from: b */
    public C62971cq f145803b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C55339os f145804c;

    /* renamed from: d */
    public C62971cq f145805d = emptyProtobufList();

    static {
        C55340ot otVar = new C55340ot();
        f145799e = otVar;
        C62942bv.registerDefaultInstance(C55340ot.class, otVar);
        f145800f = C62942bv.newSingularGeneratedExtension(C55047dx.f144820j, otVar, otVar, (C62958ce) null, 70736604, C63066gd.MESSAGE, C55340ot.class);
    }

    private C55340ot() {
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
                return newMessageInfo(f145799e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001a\u0002ဉ\u0000\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C55336op.class});
            case 3:
                return new C55340ot();
            case 4:
                return new C55337oq();
            case 5:
                return f145799e;
            case 6:
                C63010eb ebVar = f145801g;
                if (ebVar == null) {
                    synchronized (C55340ot.class) {
                        ebVar = f145801g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145799e);
                            f145801g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
