package com.google.p4283bv.p4380j.p4385b.p4386a.p4410d;

import com.google.p4283bv.p4380j.p4385b.p4386a.C57780l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.j.b.a.d.f */
/* compiled from: PG */
public final class C57763f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57763f f154347a;

    /* renamed from: b */
    public static final C62940bt f154348b;

    /* renamed from: c */
    private static volatile C63010eb f154349c;

    static {
        C57763f fVar = new C57763f();
        f154347a = fVar;
        C62942bv.registerDefaultInstance(C57763f.class, fVar);
        f154348b = C62942bv.newSingularGeneratedExtension(C57780l.f154376c, fVar, fVar, (C62958ce) null, 7, C63066gd.MESSAGE, C57763f.class);
    }

    private C57763f() {
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
                return newMessageInfo(f154347a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57763f();
            case 4:
                return new C57762e();
            case 5:
                return f154347a;
            case 6:
                C63010eb ebVar = f154349c;
                if (ebVar == null) {
                    synchronized (C57763f.class) {
                        ebVar = f154349c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154347a);
                            f154349c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
