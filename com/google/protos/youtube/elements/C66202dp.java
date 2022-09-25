package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.youtube.elements.dp */
/* compiled from: PG */
public final class C66202dp extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66202dp f180023b;

    /* renamed from: c */
    public static final C62940bt f180024c;

    /* renamed from: e */
    private static volatile C63010eb f180025e;

    /* renamed from: a */
    public C62971cq f180026a = emptyProtobufList();

    /* renamed from: d */
    private byte f180027d = 2;

    static {
        C66202dp dpVar = new C66202dp();
        f180023b = dpVar;
        C62942bv.registerDefaultInstance(C66202dp.class, dpVar);
        f180024c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dpVar, dpVar, (C62958ce) null, 170382656, C63066gd.MESSAGE, C66202dp.class);
    }

    private C66202dp() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180027d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180027d = b;
                return null;
            case 2:
                return newMessageInfo(f180023b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", CommandOuterClass$Command.class});
            case 3:
                return new C66202dp();
            case 4:
                return new C66201do();
            case 5:
                return f180023b;
            case 6:
                C63010eb ebVar = f180025e;
                if (ebVar == null) {
                    synchronized (C66202dp.class) {
                        ebVar = f180025e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180023b);
                            f180025e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
