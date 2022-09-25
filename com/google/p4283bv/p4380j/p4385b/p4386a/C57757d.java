package com.google.p4283bv.p4380j.p4385b.p4386a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.C66198dl;

/* renamed from: com.google.bv.j.b.a.d */
/* compiled from: PG */
public final class C57757d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57757d f154311a;

    /* renamed from: b */
    public static final C62940bt f154312b = C62942bv.newSingularGeneratedExtension(C66198dl.f180008b, C57696b.f154137l, C57696b.f154137l, (C62958ce) null, 336074812, C63066gd.MESSAGE, C57696b.class);

    /* renamed from: c */
    private static volatile C63010eb f154313c;

    static {
        C57757d dVar = new C57757d();
        f154311a = dVar;
        C62942bv.registerDefaultInstance(C57757d.class, dVar);
    }

    private C57757d() {
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
                return newMessageInfo(f154311a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57757d();
            case 4:
                return new C57754c();
            case 5:
                return f154311a;
            case 6:
                C63010eb ebVar = f154313c;
                if (ebVar == null) {
                    synchronized (C57757d.class) {
                        ebVar = f154313c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154311a);
                            f154313c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
