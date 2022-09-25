package com.google.common.p4552o;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79572d;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ca */
/* compiled from: PG */
public final class C59686ca extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59686ca f160028e;

    /* renamed from: f */
    private static volatile C63010eb f160029f;

    /* renamed from: a */
    public int f160030a;

    /* renamed from: b */
    public int f160031b;

    /* renamed from: c */
    public C62961ch f160032c = emptyIntList();

    /* renamed from: d */
    public boolean f160033d;

    static {
        C59686ca caVar = new C59686ca();
        f160028e = caVar;
        C62942bv.registerDefaultInstance(C59686ca.class, caVar);
    }

    private C59686ca() {
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
                return newMessageInfo(f160028e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001e\u0003ဇ\u0001", new Object[]{"a", "b", C79570b.m127649b(), C45240c.f118157a, C79572d.m127651b(), "d"});
            case 3:
                return new C59686ca();
            case 4:
                return new C59672bz();
            case 5:
                return f160028e;
            case 6:
                C63010eb ebVar = f160029f;
                if (ebVar == null) {
                    synchronized (C59686ca.class) {
                        ebVar = f160029f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160028e);
                            f160029f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
