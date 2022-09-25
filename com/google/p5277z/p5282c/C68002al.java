package com.google.p5277z.p5282c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3824am.C49247f;
import com.google.p4129b.p4136c.p4138b.p4139a.C54749b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.z.c.al */
/* compiled from: PG */
public final class C68002al extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C68002al f184252a;

    /* renamed from: e */
    private static volatile C63010eb f184253e;

    /* renamed from: b */
    private int f184254b;

    /* renamed from: c */
    private C49247f f184255c;

    /* renamed from: d */
    private C54749b f184256d;

    static {
        C68002al alVar = new C68002al();
        f184252a = alVar;
        C62942bv.registerDefaultInstance(C68002al.class, alVar);
    }

    private C68002al() {
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
                return newMessageInfo(f184252a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C68002al();
            case 4:
                return new C68001ak();
            case 5:
                return f184252a;
            case 6:
                C63010eb ebVar = f184253e;
                if (ebVar == null) {
                    synchronized (C68002al.class) {
                        ebVar = f184253e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184252a);
                            f184253e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
