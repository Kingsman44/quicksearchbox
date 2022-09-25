package com.google.android.libraries.assistant.p1533o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.o.bt */
/* compiled from: PG */
public final class C18484bt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C18484bt f52419c;

    /* renamed from: e */
    private static volatile C63010eb f52420e;

    /* renamed from: a */
    public int f52421a = 0;

    /* renamed from: b */
    public Object f52422b;

    /* renamed from: d */
    private byte f52423d = 2;

    static {
        C18484bt btVar = new C18484bt();
        f52419c = btVar;
        C62942bv.registerDefaultInstance(C18484bt.class, btVar);
    }

    private C18484bt() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f52423d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f52423d = b;
                return null;
            case 2:
                return newMessageInfo(f52419c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001м\u0000\u0002Ȼ\u0000", new Object[]{"b", "a", C18503u.class});
            case 3:
                return new C18484bt();
            case 4:
                return new C18483bs();
            case 5:
                return f52419c;
            case 6:
                C63010eb ebVar = f52420e;
                if (ebVar == null) {
                    synchronized (C18484bt.class) {
                        ebVar = f52420e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52419c);
                            f52420e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
