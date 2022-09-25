package com.google.protos.youtube.elements;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.da */
/* compiled from: PG */
public final class C66187da extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66187da f179977f;

    /* renamed from: g */
    private static volatile C63010eb f179978g;

    /* renamed from: a */
    public int f179979a;

    /* renamed from: b */
    public int f179980b = 0;

    /* renamed from: c */
    public Object f179981c;

    /* renamed from: d */
    public int f179982d;

    /* renamed from: e */
    public int f179983e;

    static {
        C66187da daVar = new C66187da();
        f179977f = daVar;
        C62942bv.registerDefaultInstance(C66187da.class, daVar);
    }

    private C66187da() {
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
                return newMessageInfo(f179977f, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ျ\u0000\u0002ွ\u0000\u0003ြ\u0000\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{C45240c.f118157a, "b", "a", C66178cw.class, "d", "e"});
            case 3:
                return new C66187da();
            case 4:
                return new C66181cz();
            case 5:
                return f179977f;
            case 6:
                C63010eb ebVar = f179978g;
                if (ebVar == null) {
                    synchronized (C66187da.class) {
                        ebVar = f179978g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179977f);
                            f179978g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
