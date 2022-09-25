package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.ak.d */
/* compiled from: PG */
public final class C25265d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C25265d f68732c;

    /* renamed from: d */
    private static volatile C63010eb f68733d;

    /* renamed from: a */
    public C62995dn f68734a = C62995dn.f170057a;

    /* renamed from: b */
    public C62995dn f68735b = C62995dn.f170057a;

    static {
        C25265d dVar = new C25265d();
        f68732c = dVar;
        C62942bv.registerDefaultInstance(C25265d.class, dVar);
    }

    private C25265d() {
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
                return newMessageInfo(f68732c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0002\u0000\u0000\u00012\u00032", new Object[]{"a", C25248c.f68709a, "b", C25221b.f68660a});
            case 3:
                return new C25265d();
            case 4:
                return new C25194a();
            case 5:
                return f68732c;
            case 6:
                C63010eb ebVar = f68733d;
                if (ebVar == null) {
                    synchronized (C25265d.class) {
                        ebVar = f68733d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68732c);
                            f68733d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
