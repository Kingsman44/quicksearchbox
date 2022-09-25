package com.google.speech.p5208h.p5210b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5224k.p5225a.C67197ao;

/* renamed from: com.google.speech.h.b.d */
/* compiled from: PG */
public final class C66574d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66574d f181090a;

    /* renamed from: b */
    public static final C62940bt f181091b = C62942bv.newSingularGeneratedExtension(C66572b.f181083d, C67197ao.f182649b, C67197ao.f182649b, (C62958ce) null, 230949979, C63066gd.MESSAGE, C67197ao.class);

    /* renamed from: c */
    private static volatile C63010eb f181092c;

    static {
        C66574d dVar = new C66574d();
        f181090a = dVar;
        C62942bv.registerDefaultInstance(C66574d.class, dVar);
    }

    private C66574d() {
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
                return newMessageInfo(f181090a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66574d();
            case 4:
                return new C66573c();
            case 5:
                return f181090a;
            case 6:
                C63010eb ebVar = f181092c;
                if (ebVar == null) {
                    synchronized (C66574d.class) {
                        ebVar = f181092c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181090a);
                            f181092c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
