package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.j.ms */
/* compiled from: PG */
public final class C67145ms extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67145ms f182514a;

    /* renamed from: b */
    public static final C62940bt f182515b;

    /* renamed from: c */
    private static volatile C63010eb f182516c;

    static {
        C67145ms msVar = new C67145ms();
        f182514a = msVar;
        C62942bv.registerDefaultInstance(C67145ms.class, msVar);
        f182515b = C62942bv.newSingularGeneratedExtension(C67087ko.f182366n, msVar, msVar, (C62958ce) null, 334865984, C63066gd.MESSAGE, C67145ms.class);
    }

    private C67145ms() {
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
                return newMessageInfo(f182514a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67145ms();
            case 4:
                return new C67144mr();
            case 5:
                return f182514a;
            case 6:
                C63010eb ebVar = f182516c;
                if (ebVar == null) {
                    synchronized (C67145ms.class) {
                        ebVar = f182516c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182514a);
                            f182516c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
