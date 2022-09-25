package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4407b.p4408a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.C66208dv;

/* renamed from: com.google.bv.j.b.a.b.c.b.a.d */
/* compiled from: PG */
public final class C57753d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57753d f154287b;

    /* renamed from: c */
    public static final C62940bt f154288c;

    /* renamed from: e */
    private static volatile C63010eb f154289e;

    /* renamed from: a */
    public int f154290a;

    /* renamed from: d */
    private int f154291d;

    static {
        C57753d dVar = new C57753d();
        f154287b = dVar;
        C62942bv.registerDefaultInstance(C57753d.class, dVar);
        f154288c = C62942bv.newSingularGeneratedExtension(C66208dv.f180040a, dVar, dVar, (C62958ce) null, 455467819, C63066gd.MESSAGE, C57753d.class);
    }

    private C57753d() {
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
                return newMessageInfo(f154287b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "a", C57751b.f154286a});
            case 3:
                return new C57753d();
            case 4:
                return new C57750a();
            case 5:
                return f154287b;
            case 6:
                C63010eb ebVar = f154289e;
                if (ebVar == null) {
                    synchronized (C57753d.class) {
                        ebVar = f154289e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154287b);
                            f154289e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
