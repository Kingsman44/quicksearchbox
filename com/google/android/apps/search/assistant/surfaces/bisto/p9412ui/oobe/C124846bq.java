package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bq */
/* compiled from: PG */
public final class C124846bq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C124846bq f344431d;

    /* renamed from: e */
    private static volatile C63010eb f344432e;

    /* renamed from: a */
    public int f344433a;

    /* renamed from: b */
    public C124848bs f344434b;

    /* renamed from: c */
    public int f344435c;

    static {
        C124846bq bqVar = new C124846bq();
        f344431d = bqVar;
        C62942bv.registerDefaultInstance(C124846bq.class, bqVar);
    }

    private C124846bq() {
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
                return newMessageInfo(f344431d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C124846bq();
            case 4:
                return new C124845bp();
            case 5:
                return f344431d;
            case 6:
                C63010eb ebVar = f344432e;
                if (ebVar == null) {
                    synchronized (C124846bq.class) {
                        ebVar = f344432e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344431d);
                            f344432e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
