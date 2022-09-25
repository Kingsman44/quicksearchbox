package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9741e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.e.e */
/* compiled from: PG */
public final class C128616e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C128616e f353611c;

    /* renamed from: d */
    private static volatile C63010eb f353612d;

    /* renamed from: a */
    public int f353613a;

    /* renamed from: b */
    public int f353614b;

    static {
        C128616e eVar = new C128616e();
        f353611c = eVar;
        C62942bv.registerDefaultInstance(C128616e.class, eVar);
    }

    private C128616e() {
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
                return newMessageInfo(f353611c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C128616e();
            case 4:
                return new C128615d();
            case 5:
                return f353611c;
            case 6:
                C63010eb ebVar = f353612d;
                if (ebVar == null) {
                    synchronized (C128616e.class) {
                        ebVar = f353612d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f353611c);
                            f353612d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
