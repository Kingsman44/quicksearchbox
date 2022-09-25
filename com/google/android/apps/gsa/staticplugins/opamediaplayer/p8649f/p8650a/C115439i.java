package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.a.i */
/* compiled from: PG */
public final class C115439i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C115439i f320280c;

    /* renamed from: d */
    private static volatile C63010eb f320281d;

    /* renamed from: a */
    public int f320282a;

    /* renamed from: b */
    public boolean f320283b;

    static {
        C115439i iVar = new C115439i();
        f320280c = iVar;
        C62942bv.registerDefaultInstance(C115439i.class, iVar);
    }

    private C115439i() {
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
                return newMessageInfo(f320280c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C115439i();
            case 4:
                return new C115438h();
            case 5:
                return f320280c;
            case 6:
                C63010eb ebVar = f320281d;
                if (ebVar == null) {
                    synchronized (C115439i.class) {
                        ebVar = f320281d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f320280c);
                            f320281d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
