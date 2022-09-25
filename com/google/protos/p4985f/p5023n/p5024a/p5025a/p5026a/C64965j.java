package com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a;

import com.google.knowledge.p4661a.p4662a.C61762x;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.f.n.a.a.a.j */
/* compiled from: PG */
public final class C64965j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64965j f175942c;

    /* renamed from: d */
    public static final C62940bt f175943d;

    /* renamed from: e */
    private static volatile C63010eb f175944e;

    /* renamed from: a */
    public int f175945a;

    /* renamed from: b */
    public C64964i f175946b;

    static {
        C64965j jVar = new C64965j();
        f175942c = jVar;
        C62942bv.registerDefaultInstance(C64965j.class, jVar);
        f175943d = C62942bv.newSingularGeneratedExtension(C61762x.f166835e, jVar, jVar, (C62958ce) null, 375567169, C63066gd.MESSAGE, C64965j.class);
    }

    private C64965j() {
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
                return newMessageInfo(f175942c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64965j();
            case 4:
                return new C64956a();
            case 5:
                return f175942c;
            case 6:
                C63010eb ebVar = f175944e;
                if (ebVar == null) {
                    synchronized (C64965j.class) {
                        ebVar = f175944e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175942c);
                            f175944e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
