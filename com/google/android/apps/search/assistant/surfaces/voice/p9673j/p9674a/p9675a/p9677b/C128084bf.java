package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bf */
/* compiled from: PG */
public final class C128084bf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C128084bf f352418c;

    /* renamed from: d */
    private static volatile C63010eb f352419d;

    /* renamed from: a */
    public int f352420a;

    /* renamed from: b */
    public float f352421b;

    static {
        C128084bf bfVar = new C128084bf();
        f352418c = bfVar;
        C62942bv.registerDefaultInstance(C128084bf.class, bfVar);
    }

    private C128084bf() {
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
                return newMessageInfo(f352418c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C128084bf();
            case 4:
                return new C128083be();
            case 5:
                return f352418c;
            case 6:
                C63010eb ebVar = f352419d;
                if (ebVar == null) {
                    synchronized (C128084bf.class) {
                        ebVar = f352419d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352418c);
                            f352419d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
