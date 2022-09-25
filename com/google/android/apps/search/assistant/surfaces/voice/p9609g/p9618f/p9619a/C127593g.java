package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.f.a.g */
/* compiled from: PG */
public final class C127593g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127593g f351292c;

    /* renamed from: d */
    private static volatile C63010eb f351293d;

    /* renamed from: a */
    public int f351294a = 0;

    /* renamed from: b */
    public Object f351295b;

    static {
        C127593g gVar = new C127593g();
        f351292c = gVar;
        C62942bv.registerDefaultInstance(C127593g.class, gVar);
    }

    private C127593g() {
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
                return newMessageInfo(f351292c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C127588b.class, C127591e.class});
            case 3:
                return new C127593g();
            case 4:
                return new C127589c();
            case 5:
                return f351292c;
            case 6:
                C63010eb ebVar = f351293d;
                if (ebVar == null) {
                    synchronized (C127593g.class) {
                        ebVar = f351293d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351292c);
                            f351293d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
