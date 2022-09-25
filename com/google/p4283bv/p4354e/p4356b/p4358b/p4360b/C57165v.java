package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57292ct;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4399b.C57711j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.e.b.b.b.v */
/* compiled from: PG */
public final class C57165v extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57165v f152611b;

    /* renamed from: c */
    public static final C62940bt f152612c;

    /* renamed from: d */
    private static volatile C63010eb f152613d;

    /* renamed from: a */
    public C62971cq f152614a = emptyProtobufList();

    static {
        C57165v vVar = new C57165v();
        f152611b = vVar;
        C62942bv.registerDefaultInstance(C57165v.class, vVar);
        f152612c = C62942bv.newSingularGeneratedExtension(C57292ct.f152935b, vVar, vVar, (C62958ce) null, 330939752, C63066gd.MESSAGE, C57165v.class);
    }

    private C57165v() {
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
                return newMessageInfo(f152611b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C57711j.class});
            case 3:
                return new C57165v();
            case 4:
                return new C57164u();
            case 5:
                return f152611b;
            case 6:
                C63010eb ebVar = f152613d;
                if (ebVar == null) {
                    synchronized (C57165v.class) {
                        ebVar = f152613d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152611b);
                            f152613d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
