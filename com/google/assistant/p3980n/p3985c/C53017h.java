package com.google.assistant.p3980n.p3985c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4813ah.p4814a.p4815a.C63171d;

/* renamed from: com.google.assistant.n.c.h */
/* compiled from: PG */
public final class C53017h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53017h f138964a;

    /* renamed from: f */
    private static volatile C63010eb f138965f;

    /* renamed from: b */
    private int f138966b;

    /* renamed from: c */
    private C51715bm f138967c;

    /* renamed from: d */
    private C63171d f138968d;

    /* renamed from: e */
    private byte f138969e = 2;

    static {
        C53017h hVar = new C53017h();
        f138964a = hVar;
        C62942bv.registerDefaultInstance(C53017h.class, hVar);
    }

    private C53017h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138969e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f138969e = b;
                return null;
            case 2:
                return newMessageInfo(f138964a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u0004ᐉ\u0003", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C53017h();
            case 4:
                return new C53016g();
            case 5:
                return f138964a;
            case 6:
                C63010eb ebVar = f138965f;
                if (ebVar == null) {
                    synchronized (C53017h.class) {
                        ebVar = f138965f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138964a);
                            f138965f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
