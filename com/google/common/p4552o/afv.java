package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.afv */
/* compiled from: PG */
public final class afv extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final afv f158576h;

    /* renamed from: i */
    private static volatile C63010eb f158577i;

    /* renamed from: a */
    public int f158578a;

    /* renamed from: b */
    public int f158579b;

    /* renamed from: c */
    public boolean f158580c;

    /* renamed from: d */
    public boolean f158581d;

    /* renamed from: e */
    public boolean f158582e;

    /* renamed from: f */
    public int f158583f;

    /* renamed from: g */
    public boolean f158584g;

    static {
        afv afv = new afv();
        f158576h = afv;
        C62942bv.registerDefaultInstance(afv.class, afv);
    }

    private afv() {
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
                return newMessageInfo(f158576h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new afv();
            case 4:
                return new afu();
            case 5:
                return f158576h;
            case 6:
                C63010eb ebVar = f158577i;
                if (ebVar == null) {
                    synchronized (afv.class) {
                        ebVar = f158577i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158576h);
                            f158577i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
