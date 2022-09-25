package com.google.android.libraries.assistant.auto.tng.p1035m.p1039c;

import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16868c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.m.c.b */
/* compiled from: PG */
public final class C13903b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13903b f42341c;

    /* renamed from: d */
    private static volatile C63010eb f42342d;

    /* renamed from: a */
    public int f42343a;

    /* renamed from: b */
    public C16868c f42344b;

    static {
        C13903b bVar = new C13903b();
        f42341c = bVar;
        C62942bv.registerDefaultInstance(C13903b.class, bVar);
    }

    private C13903b() {
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
                return newMessageInfo(f42341c, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C13903b();
            case 4:
                return new C13902a();
            case 5:
                return f42341c;
            case 6:
                C63010eb ebVar = f42342d;
                if (ebVar == null) {
                    synchronized (C13903b.class) {
                        ebVar = f42342d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f42341c);
                            f42342d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
