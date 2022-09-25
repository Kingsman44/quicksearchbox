package com.google.common.p4552o.p4563i;

import com.google.common.p4552o.aas;
import com.google.common.p4552o.apr;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.i.bk */
/* compiled from: PG */
public final class C59902bk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59902bk f161903c;

    /* renamed from: d */
    public static final C62940bt f161904d;

    /* renamed from: e */
    private static volatile C63010eb f161905e;

    /* renamed from: a */
    public int f161906a;

    /* renamed from: b */
    public aas f161907b;

    static {
        C59902bk bkVar = new C59902bk();
        f161903c = bkVar;
        C62942bv.registerDefaultInstance(C59902bk.class, bkVar);
        f161904d = C62942bv.newSingularGeneratedExtension(apr.f159695c, bkVar, bkVar, (C62958ce) null, 380323657, C63066gd.MESSAGE, C59902bk.class);
    }

    private C59902bk() {
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
                return newMessageInfo(f161903c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59902bk();
            case 4:
                return new C59901bj();
            case 5:
                return f161903c;
            case 6:
                C63010eb ebVar = f161905e;
                if (ebVar == null) {
                    synchronized (C59902bk.class) {
                        ebVar = f161905e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161903c);
                            f161905e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
