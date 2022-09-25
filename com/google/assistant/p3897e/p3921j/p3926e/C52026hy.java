package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.hy */
/* compiled from: PG */
public final class C52026hy extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52026hy f136544e;

    /* renamed from: f */
    private static volatile C63010eb f136545f;

    /* renamed from: a */
    public int f136546a;

    /* renamed from: b */
    public String f136547b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C52019hr f136548c;

    /* renamed from: d */
    public C62971cq f136549d;

    static {
        C52026hy hyVar = new C52026hy();
        f136544e = hyVar;
        C62942bv.registerDefaultInstance(C52026hy.class, hyVar);
    }

    private C52026hy() {
        emptyProtobufList();
        this.f136549d = emptyProtobufList();
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
                return newMessageInfo(f136544e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0004\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C52023hv.class});
            case 3:
                return new C52026hy();
            case 4:
                return new C52025hx();
            case 5:
                return f136544e;
            case 6:
                C63010eb ebVar = f136545f;
                if (ebVar == null) {
                    synchronized (C52026hy.class) {
                        ebVar = f136545f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136544e);
                            f136545f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
