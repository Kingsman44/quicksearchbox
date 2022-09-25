package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.j */
/* compiled from: PG */
public final class C14432j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14432j f43663a;

    /* renamed from: b */
    private static volatile C63010eb f43664b;

    static {
        C14432j jVar = new C14432j();
        f43663a = jVar;
        C62942bv.registerDefaultInstance(C14432j.class, jVar);
    }

    private C14432j() {
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
                return newMessageInfo(f43663a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14432j();
            case 4:
                return new C14405i();
            case 5:
                return f43663a;
            case 6:
                C63010eb ebVar = f43664b;
                if (ebVar == null) {
                    synchronized (C14432j.class) {
                        ebVar = f43664b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43663a);
                            f43664b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
