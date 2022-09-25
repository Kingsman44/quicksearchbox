package com.google.assistant.p4008y.p4013d.p4014a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.d.a.r */
/* compiled from: PG */
public final class C53649r extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53649r f140806e;

    /* renamed from: f */
    private static volatile C63010eb f140807f;

    /* renamed from: a */
    public int f140808a;

    /* renamed from: b */
    public String f140809b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f140810c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f140811d;

    static {
        C53649r rVar = new C53649r();
        f140806e = rVar;
        C62942bv.registerDefaultInstance(C53649r.class, rVar);
    }

    private C53649r() {
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
                return newMessageInfo(f140806e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C53649r();
            case 4:
                return new C53648q();
            case 5:
                return f140806e;
            case 6:
                C63010eb ebVar = f140807f;
                if (ebVar == null) {
                    synchronized (C53649r.class) {
                        ebVar = f140807f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140806e);
                            f140807f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
