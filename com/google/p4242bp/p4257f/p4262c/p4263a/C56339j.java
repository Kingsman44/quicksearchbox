package com.google.p4242bp.p4257f.p4262c.p4263a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.c.a.j */
/* compiled from: PG */
public final class C56339j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56339j f150165b;

    /* renamed from: c */
    private static volatile C63010eb f150166c;

    /* renamed from: a */
    public C62971cq f150167a = emptyProtobufList();

    static {
        C56339j jVar = new C56339j();
        f150165b = jVar;
        C62942bv.registerDefaultInstance(C56339j.class, jVar);
    }

    private C56339j() {
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
                return newMessageInfo(f150165b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C56337h.class});
            case 3:
                return new C56339j();
            case 4:
                return new C56338i();
            case 5:
                return f150165b;
            case 6:
                C63010eb ebVar = f150166c;
                if (ebVar == null) {
                    synchronized (C56339j.class) {
                        ebVar = f150166c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150165b);
                            f150166c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
