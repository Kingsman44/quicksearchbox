package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.nm */
/* compiled from: PG */
public final class C14553nm extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14553nm f44006a;

    /* renamed from: b */
    private static volatile C63010eb f44007b;

    static {
        C14553nm nmVar = new C14553nm();
        f44006a = nmVar;
        C62942bv.registerDefaultInstance(C14553nm.class, nmVar);
    }

    private C14553nm() {
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
                return newMessageInfo(f44006a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14553nm();
            case 4:
                return new C14552nl();
            case 5:
                return f44006a;
            case 6:
                C63010eb ebVar = f44007b;
                if (ebVar == null) {
                    synchronized (C14553nm.class) {
                        ebVar = f44007b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44006a);
                            f44007b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
