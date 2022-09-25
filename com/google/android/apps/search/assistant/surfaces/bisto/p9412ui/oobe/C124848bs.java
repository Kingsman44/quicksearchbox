package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bs */
/* compiled from: PG */
public final class C124848bs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C124848bs f344436c;

    /* renamed from: d */
    private static volatile C63010eb f344437d;

    /* renamed from: a */
    public int f344438a;

    /* renamed from: b */
    public C124844bo f344439b;

    static {
        C124848bs bsVar = new C124848bs();
        f344436c = bsVar;
        C62942bv.registerDefaultInstance(C124848bs.class, bsVar);
    }

    private C124848bs() {
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
                return newMessageInfo(f344436c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C124848bs();
            case 4:
                return new C124847br();
            case 5:
                return f344436c;
            case 6:
                C63010eb ebVar = f344437d;
                if (ebVar == null) {
                    synchronized (C124848bs.class) {
                        ebVar = f344437d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344436c);
                            f344437d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
