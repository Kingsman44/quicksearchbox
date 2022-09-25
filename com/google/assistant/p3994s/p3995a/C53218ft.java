package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.s.a.ft */
/* compiled from: PG */
public final class C53218ft extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53218ft f139481a;

    /* renamed from: b */
    public static final C62940bt f139482b;

    /* renamed from: c */
    private static volatile C63010eb f139483c;

    static {
        C53218ft ftVar = new C53218ft();
        f139481a = ftVar;
        C62942bv.registerDefaultInstance(C53218ft.class, ftVar);
        f139482b = C62942bv.newSingularGeneratedExtension(C53153di.f139315c, ftVar, ftVar, (C62958ce) null, 118, C63066gd.MESSAGE, C53218ft.class);
    }

    private C53218ft() {
        emptyProtobufList();
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
                return newMessageInfo(f139481a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53218ft();
            case 4:
                return new C53217fs();
            case 5:
                return f139481a;
            case 6:
                C63010eb ebVar = f139483c;
                if (ebVar == null) {
                    synchronized (C53218ft.class) {
                        ebVar = f139483c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139481a);
                            f139483c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
