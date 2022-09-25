package com.google.android.libraries.assistant.p1363c.p1371b.p1375c;

import com.google.android.libraries.mdi.C29690f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.b.c.am */
/* compiled from: PG */
public final class C17046am extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17046am f49655c;

    /* renamed from: d */
    private static volatile C63010eb f49656d;

    /* renamed from: a */
    public int f49657a;

    /* renamed from: b */
    public C29690f f49658b;

    static {
        C17046am amVar = new C17046am();
        f49655c = amVar;
        C62942bv.registerDefaultInstance(C17046am.class, amVar);
    }

    private C17046am() {
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
                return newMessageInfo(f49655c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C17046am();
            case 4:
                return new C17045al();
            case 5:
                return f49655c;
            case 6:
                C63010eb ebVar = f49656d;
                if (ebVar == null) {
                    synchronized (C17046am.class) {
                        ebVar = f49656d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49655c);
                            f49656d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
