package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4699e.C62231l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.br */
/* compiled from: PG */
public final class C56264br extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56264br f149957d;

    /* renamed from: e */
    private static volatile C63010eb f149958e;

    /* renamed from: a */
    public int f149959a;

    /* renamed from: b */
    public C62971cq f149960b = emptyProtobufList();

    /* renamed from: c */
    public int f149961c;

    static {
        C56264br brVar = new C56264br();
        f149957d = brVar;
        C62942bv.registerDefaultInstance(C56264br.class, brVar);
    }

    private C56264br() {
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
                return newMessageInfo(f149957d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003ဌ\u0000", new Object[]{"a", "b", C62231l.class, C45240c.f118157a, C56262bp.m87954b()});
            case 3:
                return new C56264br();
            case 4:
                return new C56263bq();
            case 5:
                return f149957d;
            case 6:
                C63010eb ebVar = f149958e;
                if (ebVar == null) {
                    synchronized (C56264br.class) {
                        ebVar = f149958e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149957d);
                            f149958e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
