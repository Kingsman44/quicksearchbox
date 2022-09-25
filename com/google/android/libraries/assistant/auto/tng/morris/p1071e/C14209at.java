package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.at */
/* compiled from: PG */
public final class C14209at extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14209at f42991a;

    /* renamed from: b */
    private static volatile C63010eb f42992b;

    static {
        C14209at atVar = new C14209at();
        f42991a = atVar;
        C62942bv.registerDefaultInstance(C14209at.class, atVar);
    }

    private C14209at() {
        emptyProtobufList();
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
                return newMessageInfo(f42991a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14209at();
            case 4:
                return new C14208as();
            case 5:
                return f42991a;
            case 6:
                C63010eb ebVar = f42992b;
                if (ebVar == null) {
                    synchronized (C14209at.class) {
                        ebVar = f42992b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f42991a);
                            f42992b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
