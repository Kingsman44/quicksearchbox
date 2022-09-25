package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.cw */
/* compiled from: PG */
public final class C56296cw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56296cw f150024a;

    /* renamed from: b */
    private static volatile C63010eb f150025b;

    static {
        C56296cw cwVar = new C56296cw();
        f150024a = cwVar;
        C62942bv.registerDefaultInstance(C56296cw.class, cwVar);
    }

    private C56296cw() {
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
                return newMessageInfo(f150024a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56296cw();
            case 4:
                return new C56295cv();
            case 5:
                return f150024a;
            case 6:
                C63010eb ebVar = f150025b;
                if (ebVar == null) {
                    synchronized (C56296cw.class) {
                        ebVar = f150025b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150024a);
                            f150025b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
