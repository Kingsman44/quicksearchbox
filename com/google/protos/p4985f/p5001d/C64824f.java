package com.google.protos.p4985f.p5001d;

import com.google.knowledge.p4661a.p4662a.C61754p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.f.d.f */
/* compiled from: PG */
public final class C64824f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64824f f175667c;

    /* renamed from: d */
    public static final C62940bt f175668d;

    /* renamed from: e */
    private static volatile C63010eb f175669e;

    /* renamed from: a */
    public int f175670a;

    /* renamed from: b */
    public int f175671b;

    static {
        C64824f fVar = new C64824f();
        f175667c = fVar;
        C62942bv.registerDefaultInstance(C64824f.class, fVar);
        f175668d = C62942bv.newSingularGeneratedExtension(C61754p.f166816a, fVar, fVar, (C62958ce) null, 345256281, C63066gd.MESSAGE, C64824f.class);
    }

    private C64824f() {
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
                return newMessageInfo(f175667c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C64822d.f175666a});
            case 3:
                return new C64824f();
            case 4:
                return new C64823e();
            case 5:
                return f175667c;
            case 6:
                C63010eb ebVar = f175669e;
                if (ebVar == null) {
                    synchronized (C64824f.class) {
                        ebVar = f175669e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175667c);
                            f175669e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
