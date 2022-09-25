package com.google.p4281bu.p4282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.bl */
/* compiled from: PG */
public final class C56528bl extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56528bl f150956b;

    /* renamed from: c */
    private static volatile C63010eb f150957c;

    /* renamed from: a */
    public C56587m f150958a;

    static {
        C56528bl blVar = new C56528bl();
        f150956b = blVar;
        C62942bv.registerDefaultInstance(C56528bl.class, blVar);
    }

    private C56528bl() {
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
                return newMessageInfo(f150956b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C56528bl();
            case 4:
                return new C56527bk();
            case 5:
                return f150956b;
            case 6:
                C63010eb ebVar = f150957c;
                if (ebVar == null) {
                    synchronized (C56528bl.class) {
                        ebVar = f150957c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150956b);
                            f150957c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
