package com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.f */
/* compiled from: PG */
public final class C127381f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127381f f350765c;

    /* renamed from: d */
    private static volatile C63010eb f350766d;

    /* renamed from: a */
    public int f350767a = 0;

    /* renamed from: b */
    public Object f350768b;

    static {
        C127381f fVar = new C127381f();
        f350765c = fVar;
        C62942bv.registerDefaultInstance(C127381f.class, fVar);
    }

    private C127381f() {
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
                return newMessageInfo(f350765c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C127379d.class, C127383h.class});
            case 3:
                return new C127381f();
            case 4:
                return new C127380e();
            case 5:
                return f350765c;
            case 6:
                C63010eb ebVar = f350766d;
                if (ebVar == null) {
                    synchronized (C127381f.class) {
                        ebVar = f350766d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350765c);
                            f350766d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
