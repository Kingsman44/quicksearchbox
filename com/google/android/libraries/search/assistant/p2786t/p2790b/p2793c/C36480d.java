package com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.b.c.d */
/* compiled from: PG */
public final class C36480d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C36480d f95218d;

    /* renamed from: e */
    private static volatile C63010eb f95219e;

    /* renamed from: a */
    public int f95220a;

    /* renamed from: b */
    public C62971cq f95221b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public boolean f95222c;

    static {
        C36480d dVar = new C36480d();
        f95218d = dVar;
        C62942bv.registerDefaultInstance(C36480d.class, dVar);
    }

    private C36480d() {
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
                return newMessageInfo(f95218d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002ဇ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C36480d();
            case 4:
                return new C36479c();
            case 5:
                return f95218d;
            case 6:
                C63010eb ebVar = f95219e;
                if (ebVar == null) {
                    synchronized (C36480d.class) {
                        ebVar = f95219e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95218d);
                            f95219e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
