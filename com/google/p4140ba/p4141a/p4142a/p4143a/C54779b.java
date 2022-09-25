package com.google.p4140ba.p4141a.p4142a.p4143a;

import com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.a.a.b */
/* compiled from: PG */
public final class C54779b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54779b f143715b;

    /* renamed from: c */
    private static volatile C63010eb f143716c;

    /* renamed from: a */
    public C62961ch f143717a = emptyIntList();

    static {
        C54779b bVar = new C54779b();
        f143715b = bVar;
        C62942bv.registerDefaultInstance(C54779b.class, bVar);
    }

    private C54779b() {
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
                return newMessageInfo(f143715b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C57404cb.m88346b()});
            case 3:
                return new C54779b();
            case 4:
                return new C54778a();
            case 5:
                return f143715b;
            case 6:
                C63010eb ebVar = f143716c;
                if (ebVar == null) {
                    synchronized (C54779b.class) {
                        ebVar = f143716c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143715b);
                            f143716c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
