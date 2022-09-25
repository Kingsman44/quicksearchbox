package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.assistant.p3897e.p3921j.aas;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.bi */
/* compiled from: PG */
public final class C80131bi extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80131bi f219906c;

    /* renamed from: e */
    private static volatile C63010eb f219907e;

    /* renamed from: a */
    public int f219908a;

    /* renamed from: b */
    public aas f219909b;

    /* renamed from: d */
    private byte f219910d = 2;

    static {
        C80131bi biVar = new C80131bi();
        f219906c = biVar;
        C62942bv.registerDefaultInstance(C80131bi.class, biVar);
    }

    private C80131bi() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f219910d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f219910d = b;
                return null;
            case 2:
                return newMessageInfo(f219906c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80131bi();
            case 4:
                return new C80130bh();
            case 5:
                return f219906c;
            case 6:
                C63010eb ebVar = f219907e;
                if (ebVar == null) {
                    synchronized (C80131bi.class) {
                        ebVar = f219907e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219906c);
                            f219907e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
