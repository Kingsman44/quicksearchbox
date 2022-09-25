package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.gk */
/* compiled from: PG */
public final class C51403gk extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51403gk f133878b;

    /* renamed from: d */
    private static volatile C63010eb f133879d;

    /* renamed from: a */
    public String f133880a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f133881c;

    static {
        C51403gk gkVar = new C51403gk();
        f133878b = gkVar;
        C62942bv.registerDefaultInstance(C51403gk.class, gkVar);
    }

    private C51403gk() {
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
                return newMessageInfo(f133878b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C51403gk();
            case 4:
                return new C51402gj();
            case 5:
                return f133878b;
            case 6:
                C63010eb ebVar = f133879d;
                if (ebVar == null) {
                    synchronized (C51403gk.class) {
                        ebVar = f133879d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133878b);
                            f133879d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
