package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.h */
/* compiled from: PG */
public final class C115464h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C115464h f320300c;

    /* renamed from: d */
    private static volatile C63010eb f320301d;

    /* renamed from: a */
    public int f320302a;

    /* renamed from: b */
    public int f320303b;

    static {
        C115464h hVar = new C115464h();
        f320300c = hVar;
        C62942bv.registerDefaultInstance(C115464h.class, hVar);
    }

    private C115464h() {
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
                return newMessageInfo(f320300c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C115463g.m191515b()});
            case 3:
                return new C115464h();
            case 4:
                return new C115461e();
            case 5:
                return f320300c;
            case 6:
                C63010eb ebVar = f320301d;
                if (ebVar == null) {
                    synchronized (C115464h.class) {
                        ebVar = f320301d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f320300c);
                            f320301d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
