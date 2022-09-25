package com.google.p4283bv.p4354e.p4356b.p4358b.p4364d;

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

/* renamed from: com.google.bv.e.b.b.d.b */
/* compiled from: PG */
public final class C57196b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57196b f152702a;

    /* renamed from: b */
    public static final C62940bt f152703b;

    /* renamed from: c */
    private static volatile C63010eb f152704c;

    static {
        C57196b bVar = new C57196b();
        f152702a = bVar;
        C62942bv.registerDefaultInstance(C57196b.class, bVar);
        f152703b = C62942bv.newSingularGeneratedExtension(C57315dp.f152986c, bVar, bVar, (C62958ce) null, 1001, C63066gd.MESSAGE, C57196b.class);
    }

    private C57196b() {
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
                return newMessageInfo(f152702a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57196b();
            case 4:
                return new C57195a();
            case 5:
                return f152702a;
            case 6:
                C63010eb ebVar = f152704c;
                if (ebVar == null) {
                    synchronized (C57196b.class) {
                        ebVar = f152704c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152702a);
                            f152704c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
