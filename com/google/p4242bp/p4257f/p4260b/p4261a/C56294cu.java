package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.cu */
/* compiled from: PG */
public final class C56294cu extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56294cu f150021a;

    /* renamed from: c */
    private static volatile C63010eb f150022c;

    /* renamed from: b */
    private byte f150023b = 2;

    static {
        C56294cu cuVar = new C56294cu();
        f150021a = cuVar;
        C62942bv.registerDefaultInstance(C56294cu.class, cuVar);
    }

    private C56294cu() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150023b);
            case 1:
                this.f150023b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f150021a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56294cu();
            case 4:
                return new C56293ct();
            case 5:
                return f150021a;
            case 6:
                C63010eb ebVar = f150022c;
                if (ebVar == null) {
                    synchronized (C56294cu.class) {
                        ebVar = f150022c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150021a);
                            f150022c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
