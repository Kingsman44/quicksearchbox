package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.iv */
/* compiled from: PG */
public final class C52050iv extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52050iv f136607e;

    /* renamed from: f */
    private static volatile C63010eb f136608f;

    /* renamed from: a */
    public int f136609a;

    /* renamed from: b */
    public int f136610b;

    /* renamed from: c */
    public String f136611c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f136612d = emptyProtobufList();

    static {
        C52050iv ivVar = new C52050iv();
        f136607e = ivVar;
        C62942bv.registerDefaultInstance(C52050iv.class, ivVar);
    }

    private C52050iv() {
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
                return newMessageInfo(f136607e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"a", "b", C52048it.f136606a, C45240c.f118157a, "d", C52046ir.class});
            case 3:
                return new C52050iv();
            case 4:
                return new C52047is();
            case 5:
                return f136607e;
            case 6:
                C63010eb ebVar = f136608f;
                if (ebVar == null) {
                    synchronized (C52050iv.class) {
                        ebVar = f136608f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136607e);
                            f136608f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
