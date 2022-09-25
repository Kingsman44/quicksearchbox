package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9416c;

import com.google.android.p10712d.C142328bg;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.h */
/* compiled from: PG */
public final class C124865h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C124865h f344499d;

    /* renamed from: e */
    private static volatile C63010eb f344500e;

    /* renamed from: a */
    public int f344501a;

    /* renamed from: b */
    public C62961ch f344502b = emptyIntList();

    /* renamed from: c */
    public C142328bg f344503c;

    static {
        C124865h hVar = new C124865h();
        f344499d = hVar;
        C62942bv.registerDefaultInstance(C124865h.class, hVar);
    }

    private C124865h() {
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
                return newMessageInfo(f344499d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0000\u0003'\u0004ဉ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C124865h();
            case 4:
                return new C124864g();
            case 5:
                return f344499d;
            case 6:
                C63010eb ebVar = f344500e;
                if (ebVar == null) {
                    synchronized (C124865h.class) {
                        ebVar = f344500e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344499d);
                            f344500e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
