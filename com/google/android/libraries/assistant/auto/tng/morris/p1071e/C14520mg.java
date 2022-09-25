package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.mg */
/* compiled from: PG */
public final class C14520mg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14520mg f43893c;

    /* renamed from: d */
    private static volatile C63010eb f43894d;

    /* renamed from: a */
    public int f43895a;

    /* renamed from: b */
    public boolean f43896b;

    static {
        C14520mg mgVar = new C14520mg();
        f43893c = mgVar;
        C62942bv.registerDefaultInstance(C14520mg.class, mgVar);
    }

    private C14520mg() {
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
                return newMessageInfo(f43893c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C14520mg();
            case 4:
                return new C14519mf();
            case 5:
                return f43893c;
            case 6:
                C63010eb ebVar = f43894d;
                if (ebVar == null) {
                    synchronized (C14520mg.class) {
                        ebVar = f43894d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43893c);
                            f43894d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
