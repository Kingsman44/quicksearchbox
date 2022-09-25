package com.google.nlp.p4730a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.az */
/* compiled from: PG */
public final class C62762az extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62762az f169495a;

    /* renamed from: c */
    private static volatile C63010eb f169496c;

    /* renamed from: b */
    private byte f169497b = 2;

    static {
        C62762az azVar = new C62762az();
        f169495a = azVar;
        C62942bv.registerDefaultInstance(C62762az.class, azVar);
    }

    private C62762az() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169497b);
            case 1:
                this.f169497b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f169495a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62762az();
            case 4:
                return new C62761ay();
            case 5:
                return f169495a;
            case 6:
                C63010eb ebVar = f169496c;
                if (ebVar == null) {
                    synchronized (C62762az.class) {
                        ebVar = f169496c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169495a);
                            f169496c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
