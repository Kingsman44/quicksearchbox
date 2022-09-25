package com.google.p395al.p417d.p418a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;

/* renamed from: com.google.al.d.a.ae */
/* compiled from: PG */
public final class C8525ae extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8525ae f29571a;

    /* renamed from: b */
    public static final C62940bt f29572b;

    /* renamed from: d */
    private static volatile C63010eb f29573d;

    /* renamed from: c */
    private byte f29574c = 2;

    static {
        C8525ae aeVar = new C8525ae();
        f29571a = aeVar;
        C62942bv.registerDefaultInstance(C8525ae.class, aeVar);
        f29572b = C62942bv.newSingularGeneratedExtension(C8523ac.f29564e, aeVar, aeVar, (C62958ce) null, 106, C63066gd.MESSAGE, C8525ae.class);
    }

    private C8525ae() {
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29574c);
            case 1:
                this.f29574c = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f29571a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8525ae();
            case 4:
                return new C8524ad();
            case 5:
                return f29571a;
            case 6:
                C63010eb ebVar = f29573d;
                if (ebVar == null) {
                    synchronized (C8525ae.class) {
                        ebVar = f29573d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29571a);
                            f29573d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
