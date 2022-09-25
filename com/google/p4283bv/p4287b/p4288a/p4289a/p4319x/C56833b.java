package com.google.p4283bv.p4287b.p4288a.p4289a.p4319x;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.x.b */
/* compiled from: PG */
public final class C56833b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56833b f151636c;

    /* renamed from: d */
    private static volatile C63010eb f151637d;

    /* renamed from: a */
    public int f151638a = 0;

    /* renamed from: b */
    public Object f151639b;

    static {
        C56833b bVar = new C56833b();
        f151636c = bVar;
        C62942bv.registerDefaultInstance(C56833b.class, bVar);
    }

    private C56833b() {
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
                return newMessageInfo(f151636c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001်\u0000", new Object[]{"b", "a"});
            case 3:
                return new C56833b();
            case 4:
                return new C56832a();
            case 5:
                return f151636c;
            case 6:
                C63010eb ebVar = f151637d;
                if (ebVar == null) {
                    synchronized (C56833b.class) {
                        ebVar = f151637d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151636c);
                            f151637d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
