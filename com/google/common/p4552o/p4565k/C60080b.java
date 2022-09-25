package com.google.common.p4552o.p4565k;

import com.google.common.p4552o.apr;
import com.google.p4225bm.p4228b.C56111b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.k.b */
/* compiled from: PG */
public final class C60080b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60080b f162433c;

    /* renamed from: d */
    public static final C62940bt f162434d;

    /* renamed from: e */
    private static volatile C63010eb f162435e;

    /* renamed from: a */
    public int f162436a;

    /* renamed from: b */
    public C56111b f162437b;

    static {
        C60080b bVar = new C60080b();
        f162433c = bVar;
        C62942bv.registerDefaultInstance(C60080b.class, bVar);
        f162434d = C62942bv.newSingularGeneratedExtension(apr.f159695c, bVar, bVar, (C62958ce) null, 373816161, C63066gd.MESSAGE, C60080b.class);
    }

    private C60080b() {
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
                return newMessageInfo(f162433c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C60080b();
            case 4:
                return new C60079a();
            case 5:
                return f162433c;
            case 6:
                C63010eb ebVar = f162435e;
                if (ebVar == null) {
                    synchronized (C60080b.class) {
                        ebVar = f162435e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162433c);
                            f162435e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
