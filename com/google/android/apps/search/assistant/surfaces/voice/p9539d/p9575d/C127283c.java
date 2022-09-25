package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d;

import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.d.c */
/* compiled from: PG */
public final class C127283c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127283c f350547c;

    /* renamed from: d */
    private static volatile C63010eb f350548d;

    /* renamed from: a */
    public int f350549a = 0;

    /* renamed from: b */
    public Object f350550b;

    static {
        C127283c cVar = new C127283c();
        f350547c = cVar;
        C62942bv.registerDefaultInstance(C127283c.class, cVar);
    }

    private C127283c() {
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
                return newMessageInfo(f350547c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C62912at.class, C62912at.class});
            case 3:
                return new C127283c();
            case 4:
                return new C127281a();
            case 5:
                return f350547c;
            case 6:
                C63010eb ebVar = f350548d;
                if (ebVar == null) {
                    synchronized (C127283c.class) {
                        ebVar = f350548d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350547c);
                            f350548d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
