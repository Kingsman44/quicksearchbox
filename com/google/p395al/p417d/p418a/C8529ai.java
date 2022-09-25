package com.google.p395al.p417d.p418a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.al.d.a.ai */
/* compiled from: PG */
public final class C8529ai extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8529ai f29583a;

    /* renamed from: b */
    public static final C62940bt f29584b;

    /* renamed from: c */
    private static volatile C63010eb f29585c;

    static {
        C8529ai aiVar = new C8529ai();
        f29583a = aiVar;
        C62942bv.registerDefaultInstance(C8529ai.class, aiVar);
        f29584b = C62942bv.newSingularGeneratedExtension(C8523ac.f29564e, aiVar, aiVar, (C62958ce) null, 103, C63066gd.MESSAGE, C8529ai.class);
    }

    private C8529ai() {
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
                return newMessageInfo(f29583a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8529ai();
            case 4:
                return new C8528ah();
            case 5:
                return f29583a;
            case 6:
                C63010eb ebVar = f29585c;
                if (ebVar == null) {
                    synchronized (C8529ai.class) {
                        ebVar = f29585c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29583a);
                            f29585c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
