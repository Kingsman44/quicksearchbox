package com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.b.a.i */
/* compiled from: PG */
public final class C116430i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C116430i f322839b;

    /* renamed from: d */
    private static volatile C63010eb f322840d;

    /* renamed from: a */
    public C57569am f322841a;

    /* renamed from: c */
    private byte f322842c = 2;

    static {
        C116430i iVar = new C116430i();
        f322839b = iVar;
        C62942bv.registerDefaultInstance(C116430i.class, iVar);
    }

    private C116430i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f322842c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f322842c = b;
                return null;
            case 2:
                return newMessageInfo(f322839b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C116430i();
            case 4:
                return new C116429h();
            case 5:
                return f322839b;
            case 6:
                C63010eb ebVar = f322840d;
                if (ebVar == null) {
                    synchronized (C116430i.class) {
                        ebVar = f322840d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f322839b);
                            f322840d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
