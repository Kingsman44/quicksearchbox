package com.google.common.p4552o.p4560f;

import com.google.common.p4552o.apr;
import com.google.p363ad.p364a.C6702z;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.f.b */
/* compiled from: PG */
public final class C59772b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59772b f161506c;

    /* renamed from: d */
    public static final C62940bt f161507d;

    /* renamed from: e */
    private static volatile C63010eb f161508e;

    /* renamed from: a */
    public int f161509a;

    /* renamed from: b */
    public C6702z f161510b;

    static {
        C59772b bVar = new C59772b();
        f161506c = bVar;
        C62942bv.registerDefaultInstance(C59772b.class, bVar);
        f161507d = C62942bv.newSingularGeneratedExtension(apr.f159695c, bVar, bVar, (C62958ce) null, 341721238, C63066gd.MESSAGE, C59772b.class);
    }

    private C59772b() {
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
                return newMessageInfo(f161506c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59772b();
            case 4:
                return new C59771a();
            case 5:
                return f161506c;
            case 6:
                C63010eb ebVar = f161508e;
                if (ebVar == null) {
                    synchronized (C59772b.class) {
                        ebVar = f161508e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161506c);
                            f161508e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
