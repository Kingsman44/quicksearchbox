package com.google.common.p4552o.p4553a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.an */
/* compiled from: PG */
public final class C59463an extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C59463an f157742h;

    /* renamed from: i */
    private static volatile C63010eb f157743i;

    /* renamed from: a */
    public int f157744a;

    /* renamed from: b */
    public int f157745b;

    /* renamed from: c */
    public long f157746c;

    /* renamed from: d */
    public long f157747d;

    /* renamed from: e */
    public long f157748e;

    /* renamed from: f */
    public double f157749f;

    /* renamed from: g */
    public double f157750g;

    static {
        C59463an anVar = new C59463an();
        f157742h = anVar;
        C62942bv.registerDefaultInstance(C59463an.class, anVar);
    }

    private C59463an() {
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
                return newMessageInfo(f157742h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005က\u0004\u0006က\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C59463an();
            case 4:
                return new C59462am();
            case 5:
                return f157742h;
            case 6:
                C63010eb ebVar = f157743i;
                if (ebVar == null) {
                    synchronized (C59463an.class) {
                        ebVar = f157743i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157742h);
                            f157743i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
