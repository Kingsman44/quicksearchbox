package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.c.c */
/* compiled from: PG */
public final class C127426c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127426c f350863c;

    /* renamed from: d */
    private static volatile C63010eb f350864d;

    /* renamed from: a */
    public int f350865a = 0;

    /* renamed from: b */
    public Object f350866b;

    static {
        C127426c cVar = new C127426c();
        f350863c = cVar;
        C62942bv.registerDefaultInstance(C127426c.class, cVar);
    }

    private C127426c() {
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
                return newMessageInfo(f350863c, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"b", "a", C127435l.class});
            case 3:
                return new C127426c();
            case 4:
                return new C127424a();
            case 5:
                return f350863c;
            case 6:
                C63010eb ebVar = f350864d;
                if (ebVar == null) {
                    synchronized (C127426c.class) {
                        ebVar = f350864d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350863c);
                            f350864d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
