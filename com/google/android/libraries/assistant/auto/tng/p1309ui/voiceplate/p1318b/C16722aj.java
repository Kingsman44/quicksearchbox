package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.aj */
/* compiled from: PG */
public final class C16722aj extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C16722aj f48891g;

    /* renamed from: h */
    private static volatile C63010eb f48892h;

    /* renamed from: a */
    public int f48893a;

    /* renamed from: b */
    public boolean f48894b;

    /* renamed from: c */
    public int f48895c;

    /* renamed from: d */
    public int f48896d;

    /* renamed from: e */
    public int f48897e;

    /* renamed from: f */
    public int f48898f;

    static {
        C16722aj ajVar = new C16722aj();
        f48891g = ajVar;
        C62942bv.registerDefaultInstance(C16722aj.class, ajVar);
    }

    private C16722aj() {
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
                return newMessageInfo(f48891g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C16722aj();
            case 4:
                return new C16721ai();
            case 5:
                return f48891g;
            case 6:
                C63010eb ebVar = f48892h;
                if (ebVar == null) {
                    synchronized (C16722aj.class) {
                        ebVar = f48892h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48891g);
                            f48892h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
