package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aac */
/* compiled from: PG */
public final class aac extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final aac f158079h;

    /* renamed from: i */
    private static volatile C63010eb f158080i;

    /* renamed from: a */
    public int f158081a;

    /* renamed from: b */
    public int f158082b;

    /* renamed from: c */
    public boolean f158083c;

    /* renamed from: d */
    public C60705zu f158084d;

    /* renamed from: e */
    public C60710zz f158085e;

    /* renamed from: f */
    public aab f158086f;

    /* renamed from: g */
    public C60708zx f158087g;

    static {
        aac aac = new aac();
        f158079h = aac;
        C62942bv.registerDefaultInstance(aac.class, aac);
    }

    private aac() {
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
                return newMessageInfo(f158079h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new aac();
            case 4:
                return new C60706zv();
            case 5:
                return f158079h;
            case 6:
                C63010eb ebVar = f158080i;
                if (ebVar == null) {
                    synchronized (aac.class) {
                        ebVar = f158080i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158079h);
                            f158080i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
