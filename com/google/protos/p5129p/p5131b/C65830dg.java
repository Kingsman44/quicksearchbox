package com.google.protos.p5129p.p5131b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.p.b.dg */
/* compiled from: PG */
public final class C65830dg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65830dg f178957b;

    /* renamed from: c */
    public static final C62940bt f178958c;

    /* renamed from: d */
    private static volatile C63010eb f178959d;

    /* renamed from: a */
    public C62971cq f178960a = C62942bv.emptyProtobufList();

    static {
        C65830dg dgVar = new C65830dg();
        f178957b = dgVar;
        C62942bv.registerDefaultInstance(C65830dg.class, dgVar);
        f178958c = C62942bv.newSingularGeneratedExtension(C65808cl.f178897d, dgVar, dgVar, (C62958ce) null, 274192245, C63066gd.MESSAGE, C65830dg.class);
    }

    private C65830dg() {
    }

    /* renamed from: a */
    public final void mo59432a() {
        C62971cq cqVar = this.f178960a;
        if (!cqVar.mo58948c()) {
            this.f178960a = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f178957b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C65830dg();
            case 4:
                return new C65829df();
            case 5:
                return f178957b;
            case 6:
                C63010eb ebVar = f178959d;
                if (ebVar == null) {
                    synchronized (C65830dg.class) {
                        ebVar = f178959d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178957b);
                            f178959d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
