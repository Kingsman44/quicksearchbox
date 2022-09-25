package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.f.a.o */
/* compiled from: PG */
public final class C127601o extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C127601o f351301a;

    /* renamed from: b */
    private static volatile C63010eb f351302b;

    static {
        C127601o oVar = new C127601o();
        f351301a = oVar;
        C62942bv.registerDefaultInstance(C127601o.class, oVar);
    }

    private C127601o() {
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
                return newMessageInfo(f351301a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C127601o();
            case 4:
                return new C127600n();
            case 5:
                return f351301a;
            case 6:
                C63010eb ebVar = f351302b;
                if (ebVar == null) {
                    synchronized (C127601o.class) {
                        ebVar = f351302b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351301a);
                            f351302b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
