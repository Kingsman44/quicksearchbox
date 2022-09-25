package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.p4361a;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4364d.C57206l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.e.b.b.b.a.d */
/* compiled from: PG */
public final class C57116d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57116d f152465b;

    /* renamed from: c */
    public static final C62940bt f152466c;

    /* renamed from: d */
    private static volatile C63010eb f152467d;

    /* renamed from: a */
    public C62971cq f152468a = emptyProtobufList();

    static {
        C57116d dVar = new C57116d();
        f152465b = dVar;
        C62942bv.registerDefaultInstance(C57116d.class, dVar);
        f152466c = C62942bv.newRepeatedGeneratedExtension(C57206l.f152722a, dVar, (C62958ce) null, 1000, C63066gd.MESSAGE, false, C57116d.class);
    }

    private C57116d() {
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
                return newMessageInfo(f152465b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C57114b.class});
            case 3:
                return new C57116d();
            case 4:
                return new C57115c();
            case 5:
                return f152465b;
            case 6:
                C63010eb ebVar = f152467d;
                if (ebVar == null) {
                    synchronized (C57116d.class) {
                        ebVar = f152467d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152465b);
                            f152467d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
