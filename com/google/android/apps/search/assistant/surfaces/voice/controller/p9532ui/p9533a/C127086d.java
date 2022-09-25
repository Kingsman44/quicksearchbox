package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.d */
/* compiled from: PG */
public final class C127086d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127086d f349939c;

    /* renamed from: d */
    private static volatile C63010eb f349940d;

    /* renamed from: a */
    public int f349941a;

    /* renamed from: b */
    public boolean f349942b;

    static {
        C127086d dVar = new C127086d();
        f349939c = dVar;
        C62942bv.registerDefaultInstance(C127086d.class, dVar);
    }

    private C127086d() {
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
                return newMessageInfo(f349939c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C127086d();
            case 4:
                return new C127085c();
            case 5:
                return f349939c;
            case 6:
                C63010eb ebVar = f349940d;
                if (ebVar == null) {
                    synchronized (C127086d.class) {
                        ebVar = f349940d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f349939c);
                            f349940d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
