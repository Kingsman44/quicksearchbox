package com.google.p4283bv.p4380j.p4385b.p4386a.p4410d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.a.d.m */
/* compiled from: PG */
public final class C57770m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57770m f154356b;

    /* renamed from: c */
    private static volatile C63010eb f154357c;

    /* renamed from: a */
    public C62995dn f154358a = C62995dn.f170057a;

    static {
        C57770m mVar = new C57770m();
        f154356b = mVar;
        C62942bv.registerDefaultInstance(C57770m.class, mVar);
    }

    private C57770m() {
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
                return newMessageInfo(f154356b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C57769l.f154355a});
            case 3:
                return new C57770m();
            case 4:
                return new C57768k();
            case 5:
                return f154356b;
            case 6:
                C63010eb ebVar = f154357c;
                if (ebVar == null) {
                    synchronized (C57770m.class) {
                        ebVar = f154357c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154356b);
                            f154357c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
