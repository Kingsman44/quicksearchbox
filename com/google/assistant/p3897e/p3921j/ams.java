package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ams */
/* compiled from: PG */
public final class ams extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final ams f135389d;

    /* renamed from: e */
    private static volatile C63010eb f135390e;

    /* renamed from: a */
    public int f135391a;

    /* renamed from: b */
    public String f135392b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f135393c = C62942bv.emptyProtobufList();

    static {
        ams ams = new ams();
        f135389d = ams;
        C62942bv.registerDefaultInstance(ams.class, ams);
    }

    private ams() {
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
                return newMessageInfo(f135389d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new ams();
            case 4:
                return new amr();
            case 5:
                return f135389d;
            case 6:
                C63010eb ebVar = f135390e;
                if (ebVar == null) {
                    synchronized (ams.class) {
                        ebVar = f135390e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135389d);
                            f135390e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
