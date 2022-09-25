package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.bi */
/* compiled from: PG */
public final class C79961bi extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C79961bi f219295f;

    /* renamed from: g */
    private static volatile C63010eb f219296g;

    /* renamed from: a */
    public int f219297a;

    /* renamed from: b */
    public C79953ba f219298b;

    /* renamed from: c */
    public C79953ba f219299c;

    /* renamed from: d */
    public C79953ba f219300d;

    /* renamed from: e */
    public C79953ba f219301e;

    static {
        C79961bi biVar = new C79961bi();
        f219295f = biVar;
        C62942bv.registerDefaultInstance(C79961bi.class, biVar);
    }

    private C79961bi() {
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
                return newMessageInfo(f219295f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C79961bi();
            case 4:
                return new C79960bh();
            case 5:
                return f219295f;
            case 6:
                C63010eb ebVar = f219296g;
                if (ebVar == null) {
                    synchronized (C79961bi.class) {
                        ebVar = f219296g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219295f);
                            f219296g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
