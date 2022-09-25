package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.h */
/* compiled from: PG */
public final class C104512h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C104512h f290683e;

    /* renamed from: f */
    private static volatile C63010eb f290684f;

    /* renamed from: a */
    public int f290685a;

    /* renamed from: b */
    public boolean f290686b;

    /* renamed from: c */
    public boolean f290687c;

    /* renamed from: d */
    public long f290688d;

    static {
        C104512h hVar = new C104512h();
        f290683e = hVar;
        C62942bv.registerDefaultInstance(C104512h.class, hVar);
    }

    private C104512h() {
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
                return newMessageInfo(f290683e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C104512h();
            case 4:
                return new C104511g();
            case 5:
                return f290683e;
            case 6:
                C63010eb ebVar = f290684f;
                if (ebVar == null) {
                    synchronized (C104512h.class) {
                        ebVar = f290684f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290683e);
                            f290684f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
