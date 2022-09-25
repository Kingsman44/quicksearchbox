package com.google.common.p4552o.p4571q;

import com.google.common.p4552o.apr;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.q.e */
/* compiled from: PG */
public final class C60437e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60437e f163559c;

    /* renamed from: d */
    public static final C62940bt f163560d;

    /* renamed from: e */
    private static volatile C63010eb f163561e;

    /* renamed from: a */
    public int f163562a;

    /* renamed from: b */
    public int f163563b;

    static {
        C60437e eVar = new C60437e();
        f163559c = eVar;
        C62942bv.registerDefaultInstance(C60437e.class, eVar);
        f163560d = C62942bv.newSingularGeneratedExtension(apr.f159695c, eVar, eVar, (C62958ce) null, 436942871, C63066gd.MESSAGE, C60437e.class);
    }

    private C60437e() {
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
                return newMessageInfo(f163559c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C60436d.f163558a});
            case 3:
                return new C60437e();
            case 4:
                return new C60435c();
            case 5:
                return f163559c;
            case 6:
                C63010eb ebVar = f163561e;
                if (ebVar == null) {
                    synchronized (C60437e.class) {
                        ebVar = f163561e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163559c);
                            f163561e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
