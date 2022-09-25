package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.f.a.e */
/* compiled from: PG */
public final class C127591e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C127591e f351290a;

    /* renamed from: b */
    private static volatile C63010eb f351291b;

    static {
        C127591e eVar = new C127591e();
        f351290a = eVar;
        C62942bv.registerDefaultInstance(C127591e.class, eVar);
    }

    private C127591e() {
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
                return newMessageInfo(f351290a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C127591e();
            case 4:
                return new C127590d();
            case 5:
                return f351290a;
            case 6:
                C63010eb ebVar = f351291b;
                if (ebVar == null) {
                    synchronized (C127591e.class) {
                        ebVar = f351291b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351290a);
                            f351291b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
