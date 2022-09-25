package com.google.assistant.p3803ag.p3804a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ag.a.ad */
/* compiled from: PG */
public final class C48796ad extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48796ad f126259b;

    /* renamed from: c */
    public static final C62940bt f126260c;

    /* renamed from: f */
    private static volatile C63010eb f126261f;

    /* renamed from: a */
    public C48871n f126262a;

    /* renamed from: d */
    private int f126263d;

    /* renamed from: e */
    private byte f126264e = 2;

    static {
        C48796ad adVar = new C48796ad();
        f126259b = adVar;
        C62942bv.registerDefaultInstance(C48796ad.class, adVar);
        f126260c = C62942bv.newSingularGeneratedExtension(C48862e.f126439a, adVar, adVar, (C62958ce) null, 103, C63066gd.MESSAGE, C48796ad.class);
    }

    private C48796ad() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126264e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126264e = b;
                return null;
            case 2:
                return newMessageInfo(f126259b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C48796ad();
            case 4:
                return new C48795ac();
            case 5:
                return f126259b;
            case 6:
                C63010eb ebVar = f126261f;
                if (ebVar == null) {
                    synchronized (C48796ad.class) {
                        ebVar = f126261f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126259b);
                            f126261f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
