package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aoi */
/* compiled from: PG */
public final class aoi extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aoi f135497d;

    /* renamed from: e */
    private static volatile C63010eb f135498e;

    /* renamed from: a */
    public int f135499a;

    /* renamed from: b */
    public aom f135500b;

    /* renamed from: c */
    public String f135501c = BuildConfig.FLAVOR;

    static {
        aoi aoi = new aoi();
        f135497d = aoi;
        C62942bv.registerDefaultInstance(aoi.class, aoi);
    }

    private aoi() {
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
                return newMessageInfo(f135497d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new aoi();
            case 4:
                return new aoh();
            case 5:
                return f135497d;
            case 6:
                C63010eb ebVar = f135498e;
                if (ebVar == null) {
                    synchronized (aoi.class) {
                        ebVar = f135498e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135497d);
                            f135498e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
