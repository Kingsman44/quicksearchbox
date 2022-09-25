package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9610a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.a.b */
/* compiled from: PG */
public final class C127527b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C127527b f351163a;

    /* renamed from: b */
    private static volatile C63010eb f351164b;

    static {
        C127527b bVar = new C127527b();
        f351163a = bVar;
        C62942bv.registerDefaultInstance(C127527b.class, bVar);
    }

    private C127527b() {
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
                return newMessageInfo(f351163a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C127527b();
            case 4:
                return new C127526a();
            case 5:
                return f351163a;
            case 6:
                C63010eb ebVar = f351164b;
                if (ebVar == null) {
                    synchronized (C127527b.class) {
                        ebVar = f351164b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351163a);
                            f351164b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
