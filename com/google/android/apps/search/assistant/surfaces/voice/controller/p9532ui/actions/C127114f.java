package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.actions.f */
/* compiled from: PG */
public final class C127114f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127114f f350009c;

    /* renamed from: d */
    private static volatile C63010eb f350010d;

    /* renamed from: a */
    public int f350011a;

    /* renamed from: b */
    public int f350012b;

    static {
        C127114f fVar = new C127114f();
        f350009c = fVar;
        C62942bv.registerDefaultInstance(C127114f.class, fVar);
    }

    private C127114f() {
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
                return newMessageInfo(f350009c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C127114f();
            case 4:
                return new C127113e();
            case 5:
                return f350009c;
            case 6:
                C63010eb ebVar = f350010d;
                if (ebVar == null) {
                    synchronized (C127114f.class) {
                        ebVar = f350010d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350009c);
                            f350010d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
