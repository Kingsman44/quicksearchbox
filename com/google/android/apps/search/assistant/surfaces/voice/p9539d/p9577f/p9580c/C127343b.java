package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9577f.p9580c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.f.c.b */
/* compiled from: PG */
public final class C127343b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C127343b f350697a;

    /* renamed from: b */
    private static volatile C63010eb f350698b;

    static {
        C127343b bVar = new C127343b();
        f350697a = bVar;
        C62942bv.registerDefaultInstance(C127343b.class, bVar);
    }

    private C127343b() {
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
                return newMessageInfo(f350697a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C127343b();
            case 4:
                return new C127342a();
            case 5:
                return f350697a;
            case 6:
                C63010eb ebVar = f350698b;
                if (ebVar == null) {
                    synchronized (C127343b.class) {
                        ebVar = f350698b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350697a);
                            f350698b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
