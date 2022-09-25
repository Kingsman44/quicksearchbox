package com.google.android.libraries.assistant.p1533o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.o.aq */
/* compiled from: PG */
public final class C18454aq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C18454aq f52369c;

    /* renamed from: e */
    private static volatile C63010eb f52370e;

    /* renamed from: a */
    public int f52371a = 0;

    /* renamed from: b */
    public Object f52372b;

    /* renamed from: d */
    private byte f52373d = 2;

    static {
        C18454aq aqVar = new C18454aq();
        f52369c = aqVar;
        C62942bv.registerDefaultInstance(C18454aq.class, aqVar);
    }

    private C18454aq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f52373d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f52373d = b;
                return null;
            case 2:
                return newMessageInfo(f52369c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001м\u0000\u0002<\u0000", new Object[]{"b", "a", C18503u.class, C18500r.class});
            case 3:
                return new C18454aq();
            case 4:
                return new C18452ao();
            case 5:
                return f52369c;
            case 6:
                C63010eb ebVar = f52370e;
                if (ebVar == null) {
                    synchronized (C18454aq.class) {
                        ebVar = f52370e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52369c);
                            f52370e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
