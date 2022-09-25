package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bc */
/* compiled from: PG */
public final class C128081bc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C128081bc f352410c;

    /* renamed from: d */
    private static volatile C63010eb f352411d;

    /* renamed from: a */
    public int f352412a;

    /* renamed from: b */
    public int f352413b;

    static {
        C128081bc bcVar = new C128081bc();
        f352410c = bcVar;
        C62942bv.registerDefaultInstance(C128081bc.class, bcVar);
    }

    private C128081bc() {
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
                return newMessageInfo(f352410c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C128078b.m209212b()});
            case 3:
                return new C128081bc();
            case 4:
                return new C128080bb();
            case 5:
                return f352410c;
            case 6:
                C63010eb ebVar = f352411d;
                if (ebVar == null) {
                    synchronized (C128081bc.class) {
                        ebVar = f352411d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352410c);
                            f352411d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
