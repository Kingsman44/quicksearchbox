package com.google.assistant.p3825an.p3830c.p3831a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3890d.p3893b.p3894a.p3895a.p3896a.C50862b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.cf */
/* compiled from: PG */
public final class C49314cf extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49314cf f127455d;

    /* renamed from: e */
    private static volatile C63010eb f127456e;

    /* renamed from: a */
    public String f127457a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f127458b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f127459c = emptyProtobufList();

    static {
        C49314cf cfVar = new C49314cf();
        f127455d = cfVar;
        C62942bv.registerDefaultInstance(C49314cf.class, cfVar);
    }

    private C49314cf() {
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
                return newMessageInfo(f127455d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0002\u0000\u0001Ȉ\u0003\u001b\u0004\u001b", new Object[]{"a", C45240c.f118157a, C49318cj.class, "b", C50862b.class});
            case 3:
                return new C49314cf();
            case 4:
                return new C49313ce();
            case 5:
                return f127455d;
            case 6:
                C63010eb ebVar = f127456e;
                if (ebVar == null) {
                    synchronized (C49314cf.class) {
                        ebVar = f127456e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127455d);
                            f127456e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
