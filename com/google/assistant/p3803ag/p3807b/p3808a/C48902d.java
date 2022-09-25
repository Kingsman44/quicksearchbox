package com.google.assistant.p3803ag.p3807b.p3808a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ag.b.a.d */
/* compiled from: PG */
public final class C48902d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48902d f126549a;

    /* renamed from: b */
    public static final C62940bt f126550b;

    /* renamed from: c */
    private static volatile C63010eb f126551c;

    static {
        C48902d dVar = new C48902d();
        f126549a = dVar;
        C62942bv.registerDefaultInstance(C48902d.class, dVar);
        f126550b = C62942bv.newSingularGeneratedExtension(C48904f.f126552a, dVar, dVar, (C62958ce) null, 411916450, C63066gd.MESSAGE, C48902d.class);
    }

    private C48902d() {
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
                return newMessageInfo(f126549a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48902d();
            case 4:
                return new C48901c();
            case 5:
                return f126549a;
            case 6:
                C63010eb ebVar = f126551c;
                if (ebVar == null) {
                    synchronized (C48902d.class) {
                        ebVar = f126551c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126549a);
                            f126551c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
