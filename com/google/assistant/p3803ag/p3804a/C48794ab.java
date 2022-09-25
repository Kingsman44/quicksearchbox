package com.google.assistant.p3803ag.p3804a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ag.a.ab */
/* compiled from: PG */
public final class C48794ab extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48794ab f126254b;

    /* renamed from: c */
    public static final C62940bt f126255c;

    /* renamed from: e */
    private static volatile C63010eb f126256e;

    /* renamed from: a */
    public C48851br f126257a;

    /* renamed from: d */
    private int f126258d;

    static {
        C48794ab abVar = new C48794ab();
        f126254b = abVar;
        C62942bv.registerDefaultInstance(C48794ab.class, abVar);
        f126255c = C62942bv.newSingularGeneratedExtension(C48862e.f126439a, abVar, abVar, (C62958ce) null, 104, C63066gd.MESSAGE, C48794ab.class);
    }

    private C48794ab() {
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
                return newMessageInfo(f126254b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C48794ab();
            case 4:
                return new C48793aa();
            case 5:
                return f126254b;
            case 6:
                C63010eb ebVar = f126256e;
                if (ebVar == null) {
                    synchronized (C48794ab.class) {
                        ebVar = f126256e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126254b);
                            f126256e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
