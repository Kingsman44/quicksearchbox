package com.google.p4283bv.p4287b.p4288a.p4289a.p4310o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.o.ae */
/* compiled from: PG */
public final class C56751ae extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56751ae f151454c;

    /* renamed from: d */
    private static volatile C63010eb f151455d;

    /* renamed from: a */
    public int f151456a = 0;

    /* renamed from: b */
    public Object f151457b;

    static {
        C56751ae aeVar = new C56751ae();
        f151454c = aeVar;
        C62942bv.registerDefaultInstance(C56751ae.class, aeVar);
    }

    private C56751ae() {
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
                return newMessageInfo(f151454c, "\u0001\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000", new Object[]{"b", "a", C56750ad.class, C56748ab.class, C56775s.class, C56782z.class, C56780x.class, C56777u.class});
            case 3:
                return new C56751ae();
            case 4:
                return new C56773q();
            case 5:
                return f151454c;
            case 6:
                C63010eb ebVar = f151455d;
                if (ebVar == null) {
                    synchronized (C56751ae.class) {
                        ebVar = f151455d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151454c);
                            f151455d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
