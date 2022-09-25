package com.google.android.libraries.assistant.pcp.p1578m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.pcp.m.ag */
/* compiled from: PG */
public final class C18966ag extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C18966ag f53290b;

    /* renamed from: c */
    private static volatile C63010eb f53291c;

    /* renamed from: a */
    public C62961ch f53292a = emptyIntList();

    static {
        C18966ag agVar = new C18966ag();
        f53290b = agVar;
        C62942bv.registerDefaultInstance(C18966ag.class, agVar);
    }

    private C18966ag() {
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
                return newMessageInfo(f53290b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"a"});
            case 3:
                return new C18966ag();
            case 4:
                return new C18965af();
            case 5:
                return f53290b;
            case 6:
                C63010eb ebVar = f53291c;
                if (ebVar == null) {
                    synchronized (C18966ag.class) {
                        ebVar = f53291c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53290b);
                            f53291c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
