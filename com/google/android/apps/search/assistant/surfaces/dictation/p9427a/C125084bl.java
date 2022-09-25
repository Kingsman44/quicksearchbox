package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.bl */
/* compiled from: PG */
public final class C125084bl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C125084bl f345075c;

    /* renamed from: d */
    private static volatile C63010eb f345076d;

    /* renamed from: a */
    public int f345077a = 0;

    /* renamed from: b */
    public Object f345078b;

    static {
        C125084bl blVar = new C125084bl();
        f345075c = blVar;
        C62942bv.registerDefaultInstance(C125084bl.class, blVar);
    }

    private C125084bl() {
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
                return newMessageInfo(f345075c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000", new Object[]{"b", "a", C125083bk.class});
            case 3:
                return new C125084bl();
            case 4:
                return new C125081bi();
            case 5:
                return f345075c;
            case 6:
                C63010eb ebVar = f345076d;
                if (ebVar == null) {
                    synchronized (C125084bl.class) {
                        ebVar = f345076d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345075c);
                            f345076d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
