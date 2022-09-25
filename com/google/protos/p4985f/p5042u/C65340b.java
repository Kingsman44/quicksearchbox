package com.google.protos.p4985f.p5042u;

import com.google.assistant.p3897e.p3921j.p3926e.C52030ib;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.f.u.b */
/* compiled from: PG */
public final class C65340b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65340b f176696a;

    /* renamed from: b */
    public static final C62940bt f176697b;

    /* renamed from: c */
    private static volatile C63010eb f176698c;

    static {
        C65340b bVar = new C65340b();
        f176696a = bVar;
        C62942bv.registerDefaultInstance(C65340b.class, bVar);
        f176697b = C62942bv.newSingularGeneratedExtension(C52030ib.f136561a, bVar, bVar, (C62958ce) null, 381279255, C63066gd.MESSAGE, C65340b.class);
    }

    private C65340b() {
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
                return newMessageInfo(f176696a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65340b();
            case 4:
                return new C65339a();
            case 5:
                return f176696a;
            case 6:
                C63010eb ebVar = f176698c;
                if (ebVar == null) {
                    synchronized (C65340b.class) {
                        ebVar = f176698c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176696a);
                            f176698c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
