package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4406b;

import com.google.p4283bv.p4380j.p4385b.p4386a.C57786r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.j.b.a.b.c.a.b.b */
/* compiled from: PG */
public final class C57749b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57749b f154281b;

    /* renamed from: c */
    public static final C62940bt f154282c;

    /* renamed from: e */
    private static volatile C63010eb f154283e;

    /* renamed from: a */
    public boolean f154284a;

    /* renamed from: d */
    private int f154285d;

    static {
        C57749b bVar = new C57749b();
        f154281b = bVar;
        C62942bv.registerDefaultInstance(C57749b.class, bVar);
        f154282c = C62942bv.newSingularGeneratedExtension(C57786r.f154390a, bVar, bVar, (C62958ce) null, 367008027, C63066gd.MESSAGE, C57749b.class);
    }

    private C57749b() {
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
                return newMessageInfo(f154281b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C57749b();
            case 4:
                return new C57748a();
            case 5:
                return f154281b;
            case 6:
                C63010eb ebVar = f154283e;
                if (ebVar == null) {
                    synchronized (C57749b.class) {
                        ebVar = f154283e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154281b);
                            f154283e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
