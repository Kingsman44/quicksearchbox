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

/* renamed from: com.google.protos.youtube.elements.ee */
/* compiled from: PG */
public final class C66218ee extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66218ee f180062b;

    /* renamed from: c */
    public static final C62940bt f180063c;

    /* renamed from: e */
    private static volatile C63010eb f180064e;

    /* renamed from: a */
    public C62971cq f180065a = emptyProtobufList();

    /* renamed from: d */
    private byte f180066d = 2;

    static {
        C66218ee eeVar = new C66218ee();
        f180062b = eeVar;
        C62942bv.registerDefaultInstance(C66218ee.class, eeVar);
        f180063c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, eeVar, eeVar, (C62958ce) null, 170382688, C63066gd.MESSAGE, C66218ee.class);
    }

    private C66218ee() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180066d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180066d = b;
                return null;
            case 2:
                return newMessageInfo(f180062b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", CommandOuterClass$Command.class});
            case 3:
                return new C66218ee();
            case 4:
                return new C66217ed();
            case 5:
                return f180062b;
            case 6:
                C63010eb ebVar = f180064e;
                if (ebVar == null) {
                    synchronized (C66218ee.class) {
                        ebVar = f180064e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180062b);
                            f180064e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
