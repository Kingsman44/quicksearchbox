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

/* renamed from: com.google.bv.j.b.a.d.o */
/* compiled from: PG */
public final class C57772o extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57772o f154359a;

    /* renamed from: b */
    public static final C62940bt f154360b = C62942bv.newSingularGeneratedExtension(C57780l.f154376c, C57770m.f154356b, C57770m.f154356b, (C62958ce) null, 2, C63066gd.MESSAGE, C57770m.class);

    /* renamed from: c */
    private static volatile C63010eb f154361c;

    static {
        C57772o oVar = new C57772o();
        f154359a = oVar;
        C62942bv.registerDefaultInstance(C57772o.class, oVar);
    }

    private C57772o() {
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
                return newMessageInfo(f154359a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57772o();
            case 4:
                return new C57771n();
            case 5:
                return f154359a;
            case 6:
                C63010eb ebVar = f154361c;
                if (ebVar == null) {
                    synchronized (C57772o.class) {
                        ebVar = f154361c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154359a);
                            f154361c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
