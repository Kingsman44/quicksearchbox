package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.py */
/* compiled from: PG */
public final class C14619py extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14619py f44188c;

    /* renamed from: d */
    private static volatile C63010eb f44189d;

    /* renamed from: a */
    public C14634x f44190a;

    /* renamed from: b */
    public int f44191b;

    static {
        C14619py pyVar = new C14619py();
        f44188c = pyVar;
        C62942bv.registerDefaultInstance(C14619py.class, pyVar);
    }

    private C14619py() {
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
                return newMessageInfo(f44188c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C14619py();
            case 4:
                return new C14618px();
            case 5:
                return f44188c;
            case 6:
                C63010eb ebVar = f44189d;
                if (ebVar == null) {
                    synchronized (C14619py.class) {
                        ebVar = f44189d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44188c);
                            f44189d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
