package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.ai */
/* compiled from: PG */
public final class C128060ai extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C128060ai f352370c;

    /* renamed from: d */
    private static volatile C63010eb f352371d;

    /* renamed from: a */
    public int f352372a;

    /* renamed from: b */
    public int f352373b;

    static {
        C128060ai aiVar = new C128060ai();
        f352370c = aiVar;
        C62942bv.registerDefaultInstance(C128060ai.class, aiVar);
    }

    private C128060ai() {
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
                return newMessageInfo(f352370c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C128059ah.m209201b()});
            case 3:
                return new C128060ai();
            case 4:
                return new C128057af();
            case 5:
                return f352370c;
            case 6:
                C63010eb ebVar = f352371d;
                if (ebVar == null) {
                    synchronized (C128060ai.class) {
                        ebVar = f352371d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352370c);
                            f352371d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
