package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.l.a.f */
/* compiled from: PG */
public final class C128369f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C128369f f353045c;

    /* renamed from: d */
    private static volatile C63010eb f353046d;

    /* renamed from: a */
    public int f353047a;

    /* renamed from: b */
    public int f353048b;

    static {
        C128369f fVar = new C128369f();
        f353045c = fVar;
        C62942bv.registerDefaultInstance(C128369f.class, fVar);
    }

    private C128369f() {
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
                return newMessageInfo(f353045c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C128368e.m209481b()});
            case 3:
                return new C128369f();
            case 4:
                return new C128366c();
            case 5:
                return f353045c;
            case 6:
                C63010eb ebVar = f353046d;
                if (ebVar == null) {
                    synchronized (C128369f.class) {
                        ebVar = f353046d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f353045c);
                            f353046d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
