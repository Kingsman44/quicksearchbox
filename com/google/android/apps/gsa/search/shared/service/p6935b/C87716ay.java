package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16718af;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ay */
/* compiled from: PG */
public final class C87716ay extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87716ay f237186c;

    /* renamed from: d */
    private static volatile C63010eb f237187d;

    /* renamed from: a */
    public int f237188a;

    /* renamed from: b */
    public C16718af f237189b;

    static {
        C87716ay ayVar = new C87716ay();
        f237186c = ayVar;
        C62942bv.registerDefaultInstance(C87716ay.class, ayVar);
    }

    private C87716ay() {
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
                return newMessageInfo(f237186c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87716ay();
            case 4:
                return new C87715ax();
            case 5:
                return f237186c;
            case 6:
                C63010eb ebVar = f237187d;
                if (ebVar == null) {
                    synchronized (C87716ay.class) {
                        ebVar = f237187d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237186c);
                            f237187d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
