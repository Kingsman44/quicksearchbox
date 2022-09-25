package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.cb */
/* compiled from: PG */
public final class C56275cb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56275cb f149977c;

    /* renamed from: d */
    private static volatile C63010eb f149978d;

    /* renamed from: a */
    public int f149979a;

    /* renamed from: b */
    public C56264br f149980b;

    static {
        C56275cb cbVar = new C56275cb();
        f149977c = cbVar;
        C62942bv.registerDefaultInstance(C56275cb.class, cbVar);
    }

    private C56275cb() {
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
                return newMessageInfo(f149977c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56275cb();
            case 4:
                return new C56274ca();
            case 5:
                return f149977c;
            case 6:
                C63010eb ebVar = f149978d;
                if (ebVar == null) {
                    synchronized (C56275cb.class) {
                        ebVar = f149978d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149977c);
                            f149978d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
