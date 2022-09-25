package com.google.assistant.p3886c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.ax */
/* compiled from: PG */
public final class C50712ax extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C50712ax f131969a;

    /* renamed from: c */
    private static volatile C63010eb f131970c;

    /* renamed from: b */
    private byte f131971b = 2;

    static {
        C50712ax axVar = new C50712ax();
        f131969a = axVar;
        C62942bv.registerDefaultInstance(C50712ax.class, axVar);
    }

    private C50712ax() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f131971b);
            case 1:
                this.f131971b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f131969a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C50712ax();
            case 4:
                return new C50711aw();
            case 5:
                return f131969a;
            case 6:
                C63010eb ebVar = f131970c;
                if (ebVar == null) {
                    synchronized (C50712ax.class) {
                        ebVar = f131970c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131969a);
                            f131970c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
