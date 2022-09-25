package com.google.android.apps.search.pronunciationlearning.p10630c.p10632b;

import com.google.p4017at.p4086k.p4087a.p4096d.p4097a.C54534d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.pronunciationlearning.c.b.i */
/* compiled from: PG */
public final class C141357i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C141357i f383748c;

    /* renamed from: d */
    private static volatile C63010eb f383749d;

    /* renamed from: a */
    public int f383750a = 0;

    /* renamed from: b */
    public Object f383751b;

    static {
        C141357i iVar = new C141357i();
        f383748c = iVar;
        C62942bv.registerDefaultInstance(C141357i.class, iVar);
    }

    private C141357i() {
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
                return newMessageInfo(f383748c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001့\u0000\u0002်\u0000\u0003ြ\u0000", new Object[]{"b", "a", C54534d.class});
            case 3:
                return new C141357i();
            case 4:
                return new C141356h();
            case 5:
                return f383748c;
            case 6:
                C63010eb ebVar = f383749d;
                if (ebVar == null) {
                    synchronized (C141357i.class) {
                        ebVar = f383749d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f383748c);
                            f383749d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
