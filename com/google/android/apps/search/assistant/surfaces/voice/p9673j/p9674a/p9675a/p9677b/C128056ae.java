package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.ae */
/* compiled from: PG */
public final class C128056ae extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C128056ae f352361c;

    /* renamed from: d */
    private static volatile C63010eb f352362d;

    /* renamed from: a */
    public int f352363a;

    /* renamed from: b */
    public int f352364b;

    static {
        C128056ae aeVar = new C128056ae();
        f352361c = aeVar;
        C62942bv.registerDefaultInstance(C128056ae.class, aeVar);
    }

    private C128056ae() {
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
                return newMessageInfo(f352361c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C128116q.m209219b()});
            case 3:
                return new C128056ae();
            case 4:
                return new C128055ad();
            case 5:
                return f352361c;
            case 6:
                C63010eb ebVar = f352362d;
                if (ebVar == null) {
                    synchronized (C128056ae.class) {
                        ebVar = f352362d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352361c);
                            f352362d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
