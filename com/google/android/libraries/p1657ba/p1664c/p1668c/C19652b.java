package com.google.android.libraries.p1657ba.p1664c.p1668c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.ba.c.c.b */
/* compiled from: PG */
public final class C19652b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C19652b f54662e;

    /* renamed from: g */
    private static volatile C63010eb f54663g;

    /* renamed from: a */
    public int f54664a;

    /* renamed from: b */
    public int f54665b;

    /* renamed from: c */
    public int f54666c;

    /* renamed from: d */
    public int f54667d;

    /* renamed from: f */
    private int f54668f;

    static {
        C19652b bVar = new C19652b();
        f54662e = bVar;
        C62942bv.registerDefaultInstance(C19652b.class, bVar);
    }

    private C19652b() {
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
                return newMessageInfo(f54662e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C19652b();
            case 4:
                return new C19649a();
            case 5:
                return f54662e;
            case 6:
                C63010eb ebVar = f54663g;
                if (ebVar == null) {
                    synchronized (C19652b.class) {
                        ebVar = f54663g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f54662e);
                            f54663g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
