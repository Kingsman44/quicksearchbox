package com.google.android.apps.gsa.tasks;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.tasks.ak */
/* compiled from: PG */
public final class C118476ak extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C118476ak f328838a;

    /* renamed from: c */
    private static volatile C63010eb f328839c;

    /* renamed from: b */
    private byte f328840b = 2;

    static {
        C118476ak akVar = new C118476ak();
        f328838a = akVar;
        C62942bv.registerDefaultInstance(C118476ak.class, akVar);
    }

    private C118476ak() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f328840b);
            case 1:
                this.f328840b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f328838a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C118476ak();
            case 4:
                return new C118475aj();
            case 5:
                return f328838a;
            case 6:
                C63010eb ebVar = f328839c;
                if (ebVar == null) {
                    synchronized (C118476ak.class) {
                        ebVar = f328839c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f328838a);
                            f328839c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
