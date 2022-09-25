package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.youtube.elements.dz */
/* compiled from: PG */
public final class C66212dz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66212dz f180050c;

    /* renamed from: d */
    public static final C62940bt f180051d;

    /* renamed from: e */
    private static volatile C63010eb f180052e;

    /* renamed from: a */
    public int f180053a;

    /* renamed from: b */
    public C66206dt f180054b;

    static {
        C66212dz dzVar = new C66212dz();
        f180050c = dzVar;
        C62942bv.registerDefaultInstance(C66212dz.class, dzVar);
        f180051d = C62942bv.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.f179521a, dzVar, dzVar, (C62958ce) null, 193804845, C63066gd.MESSAGE, C66212dz.class);
    }

    private C66212dz() {
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
                return newMessageInfo(f180050c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66212dz();
            case 4:
                return new C66211dy();
            case 5:
                return f180050c;
            case 6:
                C63010eb ebVar = f180052e;
                if (ebVar == null) {
                    synchronized (C66212dz.class) {
                        ebVar = f180052e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180050c);
                            f180052e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
