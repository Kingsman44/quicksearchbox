package com.google.p4283bv.p4354e.p4356b.p4358b.p4364d;

import com.google.common.p4552o.C59722dg;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bv.e.b.b.d.f */
/* compiled from: PG */
public final class C57200f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57200f f152711c;

    /* renamed from: d */
    public static final C62940bt f152712d;

    /* renamed from: f */
    private static volatile C63010eb f152713f;

    /* renamed from: a */
    public C57204j f152714a;

    /* renamed from: b */
    public C59722dg f152715b;

    /* renamed from: e */
    private int f152716e;

    static {
        C57200f fVar = new C57200f();
        f152711c = fVar;
        C62942bv.registerDefaultInstance(C57200f.class, fVar);
        f152712d = C62942bv.newSingularGeneratedExtension(C57315dp.f152986c, fVar, fVar, (C62958ce) null, 1002, C63066gd.MESSAGE, C57200f.class);
    }

    private C57200f() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f152711c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b"});
            case 3:
                return new C57200f();
            case 4:
                return new C57199e();
            case 5:
                return f152711c;
            case 6:
                C63010eb ebVar = f152713f;
                if (ebVar == null) {
                    synchronized (C57200f.class) {
                        ebVar = f152713f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152711c);
                            f152713f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
