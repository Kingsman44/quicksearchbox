package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.j */
/* compiled from: PG */
public final class C128109j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C128109j f352484c;

    /* renamed from: d */
    private static volatile C63010eb f352485d;

    /* renamed from: a */
    public int f352486a;

    /* renamed from: b */
    public int f352487b;

    static {
        C128109j jVar = new C128109j();
        f352484c = jVar;
        C62942bv.registerDefaultInstance(C128109j.class, jVar);
    }

    private C128109j() {
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
                return newMessageInfo(f352484c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C128116q.m209219b()});
            case 3:
                return new C128109j();
            case 4:
                return new C128108i();
            case 5:
                return f352484c;
            case 6:
                C63010eb ebVar = f352485d;
                if (ebVar == null) {
                    synchronized (C128109j.class) {
                        ebVar = f352485d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352484c);
                            f352485d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
