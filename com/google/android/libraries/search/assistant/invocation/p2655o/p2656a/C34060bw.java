package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.bw */
/* compiled from: PG */
public final class C34060bw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62962ci f90761e = new C34058bu();

    /* renamed from: f */
    public static final C34060bw f90762f;

    /* renamed from: h */
    private static volatile C63010eb f90763h;

    /* renamed from: a */
    public int f90764a;

    /* renamed from: b */
    public C34114w f90765b;

    /* renamed from: c */
    public C34049bl f90766c;

    /* renamed from: d */
    public C62961ch f90767d = emptyIntList();

    /* renamed from: g */
    private byte f90768g = 2;

    static {
        C34060bw bwVar = new C34060bw();
        f90762f = bwVar;
        C62942bv.registerDefaultInstance(C34060bw.class, bwVar);
    }

    private C34060bw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f90768g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f90768g = b;
                return null;
            case 2:
                return newMessageInfo(f90762f, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003\u001e", new Object[]{"a", "b", C45240c.f118157a, "d", C34043bf.m62693b()});
            case 3:
                return new C34060bw();
            case 4:
                return new C34059bv();
            case 5:
                return f90762f;
            case 6:
                C63010eb ebVar = f90763h;
                if (ebVar == null) {
                    synchronized (C34060bw.class) {
                        ebVar = f90763h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90762f);
                            f90763h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
