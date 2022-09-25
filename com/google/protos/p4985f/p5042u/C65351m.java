package com.google.protos.p4985f.p5042u;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.u.m */
/* compiled from: PG */
public final class C65351m extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65351m f177729a;

    /* renamed from: c */
    private static volatile C63010eb f177730c;

    /* renamed from: b */
    private byte f177731b = 2;

    static {
        C65351m mVar = new C65351m();
        f177729a = mVar;
        C62942bv.registerDefaultInstance(C65351m.class, mVar);
    }

    private C65351m() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f177731b);
            case 1:
                this.f177731b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f177729a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65351m();
            case 4:
                return new C65350l();
            case 5:
                return f177729a;
            case 6:
                C63010eb ebVar = f177730c;
                if (ebVar == null) {
                    synchronized (C65351m.class) {
                        ebVar = f177730c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177729a);
                            f177730c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
