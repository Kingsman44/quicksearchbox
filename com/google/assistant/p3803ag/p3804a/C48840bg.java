package com.google.assistant.p3803ag.p3804a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ag.a.bg */
/* compiled from: PG */
public final class C48840bg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48840bg f126386b;

    /* renamed from: c */
    public static final C62940bt f126387c;

    /* renamed from: e */
    private static volatile C63010eb f126388e;

    /* renamed from: a */
    public C48855bv f126389a;

    /* renamed from: d */
    private int f126390d;

    static {
        C48840bg bgVar = new C48840bg();
        f126386b = bgVar;
        C62942bv.registerDefaultInstance(C48840bg.class, bgVar);
        f126387c = C62942bv.newSingularGeneratedExtension(C48862e.f126439a, bgVar, bgVar, (C62958ce) null, 101, C63066gd.MESSAGE, C48840bg.class);
    }

    private C48840bg() {
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
                return newMessageInfo(f126386b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C48840bg();
            case 4:
                return new C48839bf();
            case 5:
                return f126386b;
            case 6:
                C63010eb ebVar = f126388e;
                if (ebVar == null) {
                    synchronized (C48840bg.class) {
                        ebVar = f126388e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126386b);
                            f126388e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
