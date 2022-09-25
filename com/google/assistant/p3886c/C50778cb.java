package com.google.assistant.p3886c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.c.cb */
/* compiled from: PG */
public final class C50778cb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50778cb f132140c;

    /* renamed from: d */
    public static final C62940bt f132141d;

    /* renamed from: e */
    private static volatile C63010eb f132142e;

    /* renamed from: a */
    public int f132143a;

    /* renamed from: b */
    public C50699ak f132144b;

    static {
        C50778cb cbVar = new C50778cb();
        f132140c = cbVar;
        C62942bv.registerDefaultInstance(C50778cb.class, cbVar);
        f132141d = C62942bv.newSingularGeneratedExtension(C50813dj.f132278a, cbVar, cbVar, (C62958ce) null, 358152643, C63066gd.MESSAGE, C50778cb.class);
    }

    private C50778cb() {
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
                return newMessageInfo(f132140c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50778cb();
            case 4:
                return new C50777ca();
            case 5:
                return f132140c;
            case 6:
                C63010eb ebVar = f132142e;
                if (ebVar == null) {
                    synchronized (C50778cb.class) {
                        ebVar = f132142e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132140c);
                            f132142e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
