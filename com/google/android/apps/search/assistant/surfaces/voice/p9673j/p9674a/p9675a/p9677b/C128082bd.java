package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bd */
/* compiled from: PG */
public final class C128082bd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C128082bd f352414c;

    /* renamed from: d */
    private static volatile C63010eb f352415d;

    /* renamed from: a */
    public int f352416a = 0;

    /* renamed from: b */
    public Object f352417b;

    static {
        C128082bd bdVar = new C128082bd();
        f352414c = bdVar;
        C62942bv.registerDefaultInstance(C128082bd.class, bdVar);
    }

    private C128082bd() {
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
                return newMessageInfo(f352414c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", C128081bc.class});
            case 3:
                return new C128082bd();
            case 4:
                return new C128079ba();
            case 5:
                return f352414c;
            case 6:
                C63010eb ebVar = f352415d;
                if (ebVar == null) {
                    synchronized (C128082bd.class) {
                        ebVar = f352415d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352414c);
                            f352415d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
