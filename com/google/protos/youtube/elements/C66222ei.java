package com.google.protos.youtube.elements;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.youtube.elements.ei */
/* compiled from: PG */
public final class C66222ei extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66222ei f180073f;

    /* renamed from: g */
    public static final C62940bt f180074g;

    /* renamed from: h */
    private static volatile C63010eb f180075h;

    /* renamed from: a */
    public int f180076a;

    /* renamed from: b */
    public int f180077b;

    /* renamed from: c */
    public float f180078c;

    /* renamed from: d */
    public float f180079d;

    /* renamed from: e */
    public float f180080e;

    static {
        C66222ei eiVar = new C66222ei();
        f180073f = eiVar;
        C62942bv.registerDefaultInstance(C66222ei.class, eiVar);
        f180074g = C62942bv.newSingularGeneratedExtension(C66208dv.f180040a, eiVar, eiVar, (C62958ce) null, 200077771, C63066gd.MESSAGE, C66222ei.class);
    }

    private C66222ei() {
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
                return newMessageInfo(f180073f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C66222ei();
            case 4:
                return new C66221eh();
            case 5:
                return f180073f;
            case 6:
                C63010eb ebVar = f180075h;
                if (ebVar == null) {
                    synchronized (C66222ei.class) {
                        ebVar = f180075h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180073f);
                            f180075h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
