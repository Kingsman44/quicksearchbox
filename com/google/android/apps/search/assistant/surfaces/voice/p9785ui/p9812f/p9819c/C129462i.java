package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.i */
/* compiled from: PG */
public final class C129462i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C129462i f355457a;

    /* renamed from: b */
    private static volatile C63010eb f355458b;

    static {
        C129462i iVar = new C129462i();
        f355457a = iVar;
        C62942bv.registerDefaultInstance(C129462i.class, iVar);
    }

    private C129462i() {
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
                return newMessageInfo(f355457a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C129462i();
            case 4:
                return new C129461h();
            case 5:
                return f355457a;
            case 6:
                C63010eb ebVar = f355458b;
                if (ebVar == null) {
                    synchronized (C129462i.class) {
                        ebVar = f355458b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f355457a);
                            f355458b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
