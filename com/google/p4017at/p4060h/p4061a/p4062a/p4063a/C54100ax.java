package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.google.p4283bv.p4380j.p4385b.p4386a.p4410d.C57764g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.ax */
/* compiled from: PG */
public final class C54100ax extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54100ax f141947c;

    /* renamed from: d */
    private static volatile C63010eb f141948d;

    /* renamed from: a */
    public int f141949a;

    /* renamed from: b */
    public int f141950b;

    static {
        C54100ax axVar = new C54100ax();
        f141947c = axVar;
        C62942bv.registerDefaultInstance(C54100ax.class, axVar);
    }

    private C54100ax() {
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
                return newMessageInfo(f141947c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C57764g.f154350a});
            case 3:
                return new C54100ax();
            case 4:
                return new C54099aw();
            case 5:
                return f141947c;
            case 6:
                C63010eb ebVar = f141948d;
                if (ebVar == null) {
                    synchronized (C54100ax.class) {
                        ebVar = f141948d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141947c);
                            f141948d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
