package com.google.p4283bv.p4287b.p4288a.p4289a.p4310o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.o.i */
/* compiled from: PG */
public final class C56765i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56765i f151490a;

    /* renamed from: b */
    private static volatile C63010eb f151491b;

    static {
        C56765i iVar = new C56765i();
        f151490a = iVar;
        C62942bv.registerDefaultInstance(C56765i.class, iVar);
    }

    private C56765i() {
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
                return newMessageInfo(f151490a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56765i();
            case 4:
                return new C56764h();
            case 5:
                return f151490a;
            case 6:
                C63010eb ebVar = f151491b;
                if (ebVar == null) {
                    synchronized (C56765i.class) {
                        ebVar = f151491b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151490a);
                            f151491b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
