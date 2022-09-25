package com.google.knowledge.p4661a.p4666c.p4667a.p4668a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.knowledge.a.c.a.a.b */
/* compiled from: PG */
public final class C61776b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C61776b f166867a;

    /* renamed from: e */
    private static volatile C63010eb f166868e;

    /* renamed from: b */
    private int f166869b;

    /* renamed from: c */
    private C63771b f166870c;

    /* renamed from: d */
    private byte f166871d = 2;

    static {
        C61776b bVar = new C61776b();
        f166867a = bVar;
        C62942bv.registerDefaultInstance(C61776b.class, bVar);
    }

    private C61776b() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166871d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166871d = b;
                return null;
            case 2:
                return newMessageInfo(f166867a, "\u0001\u0001\u0000\u0001\n\n\u0001\u0000\u0000\u0001\nᐉ\u0006", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C61776b();
            case 4:
                return new C61775a();
            case 5:
                return f166867a;
            case 6:
                C63010eb ebVar = f166868e;
                if (ebVar == null) {
                    synchronized (C61776b.class) {
                        ebVar = f166868e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166867a);
                            f166868e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
