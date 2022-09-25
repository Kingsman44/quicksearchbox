package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.g.c */
/* compiled from: PG */
public final class C127455c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C127455c f350936b;

    /* renamed from: c */
    private static volatile C63010eb f350937c;

    /* renamed from: a */
    public int f350938a;

    static {
        C127455c cVar = new C127455c();
        f350936b = cVar;
        C62942bv.registerDefaultInstance(C127455c.class, cVar);
    }

    private C127455c() {
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
                return newMessageInfo(f350936b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C127455c();
            case 4:
                return new C127453a();
            case 5:
                return f350936b;
            case 6:
                C63010eb ebVar = f350937c;
                if (ebVar == null) {
                    synchronized (C127455c.class) {
                        ebVar = f350937c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350936b);
                            f350937c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
