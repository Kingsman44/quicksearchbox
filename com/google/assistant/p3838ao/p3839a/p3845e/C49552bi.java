package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ao.a.e.bi */
/* compiled from: PG */
public final class C49552bi extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49552bi f127859b;

    /* renamed from: c */
    public static final C62940bt f127860c;

    /* renamed from: e */
    private static volatile C63010eb f127861e;

    /* renamed from: a */
    public int f127862a;

    /* renamed from: d */
    private int f127863d;

    static {
        C49552bi biVar = new C49552bi();
        f127859b = biVar;
        C62942bv.registerDefaultInstance(C49552bi.class, biVar);
        f127860c = C62942bv.newSingularGeneratedExtension(C49621l.f128062b, biVar, biVar, (C62958ce) null, 297196335, C63066gd.MESSAGE, C49552bi.class);
    }

    private C49552bi() {
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
                return newMessageInfo(f127859b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"d", "a"});
            case 3:
                return new C49552bi();
            case 4:
                return new C49551bh();
            case 5:
                return f127859b;
            case 6:
                C63010eb ebVar = f127861e;
                if (ebVar == null) {
                    synchronized (C49552bi.class) {
                        ebVar = f127861e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127859b);
                            f127861e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
