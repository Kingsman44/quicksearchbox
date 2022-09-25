package com.google.android.libraries.p1657ba.p1664c.p1668c.p1669a;

import com.google.android.libraries.p1657ba.p1664c.p1668c.C19668f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.ba.c.c.a.b */
/* compiled from: PG */
public final class C19651b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C19651b f54657d;

    /* renamed from: e */
    private static volatile C63010eb f54658e;

    /* renamed from: a */
    public int f54659a;

    /* renamed from: b */
    public C19668f f54660b;

    /* renamed from: c */
    public int f54661c = -1;

    static {
        C19651b bVar = new C19651b();
        f54657d = bVar;
        C62942bv.registerDefaultInstance(C19651b.class, bVar);
    }

    private C19651b() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f54657d, "\u0001\u0002\u0000\u0001\u0002\n\u0002\u0000\u0000\u0000\u0002င\u0007\nဉ\u0003", new Object[]{"a", C45240c.f118157a, "b"});
            case 3:
                return new C19651b();
            case 4:
                return new C19650a();
            case 5:
                return f54657d;
            case 6:
                C63010eb ebVar = f54658e;
                if (ebVar == null) {
                    synchronized (C19651b.class) {
                        ebVar = f54658e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f54657d);
                            f54658e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
