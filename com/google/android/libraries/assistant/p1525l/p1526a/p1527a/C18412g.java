package com.google.android.libraries.assistant.p1525l.p1526a.p1527a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.l.a.a.g */
/* compiled from: PG */
public final class C18412g extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C18412g f52253a;

    /* renamed from: b */
    private static volatile C63010eb f52254b;

    static {
        C18412g gVar = new C18412g();
        f52253a = gVar;
        C62942bv.registerDefaultInstance(C18412g.class, gVar);
    }

    private C18412g() {
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
                return newMessageInfo(f52253a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C18412g();
            case 4:
                return new C18411f();
            case 5:
                return f52253a;
            case 6:
                C63010eb ebVar = f52254b;
                if (ebVar == null) {
                    synchronized (C18412g.class) {
                        ebVar = f52254b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52253a);
                            f52254b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
