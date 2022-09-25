package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.ai */
/* compiled from: PG */
public final class C80830ai extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80830ai f221749a;

    /* renamed from: b */
    private static volatile C63010eb f221750b;

    static {
        C80830ai aiVar = new C80830ai();
        f221749a = aiVar;
        C62942bv.registerDefaultInstance(C80830ai.class, aiVar);
    }

    private C80830ai() {
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
                return newMessageInfo(f221749a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80830ai();
            case 4:
                return new C80829ah();
            case 5:
                return f221749a;
            case 6:
                C63010eb ebVar = f221750b;
                if (ebVar == null) {
                    synchronized (C80830ai.class) {
                        ebVar = f221750b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221749a);
                            f221750b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
