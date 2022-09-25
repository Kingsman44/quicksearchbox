package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4399b;

import com.google.p4283bv.p4380j.p4385b.p4386a.C57780l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.j.b.a.b.b.b.h */
/* compiled from: PG */
public final class C57709h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57709h f154176b;

    /* renamed from: c */
    public static final C62940bt f154177c;

    /* renamed from: d */
    private static volatile C63010eb f154178d;

    /* renamed from: a */
    public C62971cq f154179a = emptyProtobufList();

    static {
        C57709h hVar = new C57709h();
        f154176b = hVar;
        C62942bv.registerDefaultInstance(C57709h.class, hVar);
        f154177c = C62942bv.newSingularGeneratedExtension(C57780l.f154376c, hVar, hVar, (C62958ce) null, 6, C63066gd.MESSAGE, C57709h.class);
    }

    private C57709h() {
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
                return newMessageInfo(f154176b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C57707f.class});
            case 3:
                return new C57709h();
            case 4:
                return new C57708g();
            case 5:
                return f154176b;
            case 6:
                C63010eb ebVar = f154178d;
                if (ebVar == null) {
                    synchronized (C57709h.class) {
                        ebVar = f154178d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154176b);
                            f154178d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
