package com.google.common.p4552o.p4553a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.a.bq */
/* compiled from: PG */
public final class C59493bq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59493bq f157853d;

    /* renamed from: e */
    public static final C62940bt f157854e;

    /* renamed from: f */
    private static volatile C63010eb f157855f;

    /* renamed from: a */
    public int f157856a;

    /* renamed from: b */
    public String f157857b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f157858c = BuildConfig.FLAVOR;

    static {
        C59493bq bqVar = new C59493bq();
        f157853d = bqVar;
        C62942bv.registerDefaultInstance(C59493bq.class, bqVar);
        f157854e = C62942bv.newSingularGeneratedExtension(C59527cx.f157947n, bqVar, bqVar, (C62958ce) null, 322898062, C63066gd.MESSAGE, C59493bq.class);
    }

    private C59493bq() {
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
                return newMessageInfo(f157853d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59493bq();
            case 4:
                return new C59492bp();
            case 5:
                return f157853d;
            case 6:
                C63010eb ebVar = f157855f;
                if (ebVar == null) {
                    synchronized (C59493bq.class) {
                        ebVar = f157855f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157853d);
                            f157855f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
