package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.gw */
/* compiled from: PG */
public final class C82961gw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C82961gw f226336e;

    /* renamed from: f */
    private static volatile C63010eb f226337f;

    /* renamed from: a */
    public int f226338a;

    /* renamed from: b */
    public C62961ch f226339b = emptyIntList();

    /* renamed from: c */
    public int f226340c;

    /* renamed from: d */
    public boolean f226341d;

    static {
        C82961gw gwVar = new C82961gw();
        f226336e = gwVar;
        C62942bv.registerDefaultInstance(C82961gw.class, gwVar);
    }

    private C82961gw() {
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
                return newMessageInfo(f226336e, "\u0001\u0003\u0000\u0001\u0003\u0006\u0003\u0000\u0001\u0000\u0003\u001e\u0005ဌ\u0002\u0006ဇ\u0003", new Object[]{"a", "b", C82960gv.m132439b(), C45240c.f118157a, C82960gv.m132439b(), "d"});
            case 3:
                return new C82961gw();
            case 4:
                return new C82958gt();
            case 5:
                return f226336e;
            case 6:
                C63010eb ebVar = f226337f;
                if (ebVar == null) {
                    synchronized (C82961gw.class) {
                        ebVar = f226337f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226336e);
                            f226337f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
