package com.google.lens.p4705i.p4706a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.i.a.j */
/* compiled from: PG */
public final class C62379j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62379j f168397a;

    /* renamed from: b */
    private static volatile C63010eb f168398b;

    static {
        C62379j jVar = new C62379j();
        f168397a = jVar;
        C62942bv.registerDefaultInstance(C62379j.class, jVar);
    }

    private C62379j() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f168397a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62379j();
            case 4:
                return new C62378i();
            case 5:
                return f168397a;
            case 6:
                C63010eb ebVar = f168398b;
                if (ebVar == null) {
                    synchronized (C62379j.class) {
                        ebVar = f168398b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168397a);
                            f168398b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
