package com.google.assistant.p3803ag.p3804a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.j */
/* compiled from: PG */
public final class C48867j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48867j f126463c;

    /* renamed from: d */
    private static volatile C63010eb f126464d;

    /* renamed from: a */
    public C62961ch f126465a = emptyIntList();

    /* renamed from: b */
    public C62961ch f126466b = emptyIntList();

    static {
        C48867j jVar = new C48867j();
        f126463c = jVar;
        C62942bv.registerDefaultInstance(C48867j.class, jVar);
    }

    private C48867j() {
        emptyIntList();
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
                return newMessageInfo(f126463c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001e\u0002\u001e", new Object[]{"a", C48864g.m85286b(), "b", C48875r.f126482a});
            case 3:
                return new C48867j();
            case 4:
                return new C48866i();
            case 5:
                return f126463c;
            case 6:
                C63010eb ebVar = f126464d;
                if (ebVar == null) {
                    synchronized (C48867j.class) {
                        ebVar = f126464d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126463c);
                            f126464d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
