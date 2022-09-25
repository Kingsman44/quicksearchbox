package com.google.android.libraries.assistant.p1587q.p1588a;

import com.google.p4479cg.C58072d;
import com.google.p4479cg.C58081m;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.q.a.b */
/* compiled from: PG */
public final class C19120b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C19120b f53582c;

    /* renamed from: d */
    private static volatile C63010eb f53583d;

    /* renamed from: a */
    public int f53584a = 0;

    /* renamed from: b */
    public Object f53585b;

    static {
        C19120b bVar = new C19120b();
        f53582c = bVar;
        C62942bv.registerDefaultInstance(C19120b.class, bVar);
    }

    private C19120b() {
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
                return newMessageInfo(f53582c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", C58081m.class, C58072d.class, C62910ar.class});
            case 3:
                return new C19120b();
            case 4:
                return new C19119a();
            case 5:
                return f53582c;
            case 6:
                C63010eb ebVar = f53583d;
                if (ebVar == null) {
                    synchronized (C19120b.class) {
                        ebVar = f53583d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53582c);
                            f53583d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
