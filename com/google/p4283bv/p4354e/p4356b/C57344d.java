package com.google.p4283bv.p4354e.p4356b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4816ai.p4817a.C63192f;

/* renamed from: com.google.bv.e.b.d */
/* compiled from: PG */
public final class C57344d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57344d f153205a;

    /* renamed from: b */
    public static final C62940bt f153206b = C62942bv.newSingularGeneratedExtension(C63192f.f170699q, C57057b.f152311e, C57057b.f152311e, (C62958ce) null, 4368298, C63066gd.MESSAGE, C57057b.class);

    /* renamed from: c */
    private static volatile C63010eb f153207c;

    static {
        C57344d dVar = new C57344d();
        f153205a = dVar;
        C62942bv.registerDefaultInstance(C57344d.class, dVar);
    }

    private C57344d() {
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
                return newMessageInfo(f153205a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57344d();
            case 4:
                return new C57217c();
            case 5:
                return f153205a;
            case 6:
                C63010eb ebVar = f153207c;
                if (ebVar == null) {
                    synchronized (C57344d.class) {
                        ebVar = f153207c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153205a);
                            f153207c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
