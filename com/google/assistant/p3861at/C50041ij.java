package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ij */
/* compiled from: PG */
public final class C50041ij extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50041ij f130096e;

    /* renamed from: f */
    private static volatile C63010eb f130097f;

    /* renamed from: a */
    public int f130098a;

    /* renamed from: b */
    public String f130099b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130100c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f130101d = C62942bv.emptyProtobufList();

    static {
        C50041ij ijVar = new C50041ij();
        f130096e = ijVar;
        C62942bv.registerDefaultInstance(C50041ij.class, ijVar);
    }

    private C50041ij() {
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
                return newMessageInfo(f130096e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50041ij();
            case 4:
                return new C50040ii();
            case 5:
                return f130096e;
            case 6:
                C63010eb ebVar = f130097f;
                if (ebVar == null) {
                    synchronized (C50041ij.class) {
                        ebVar = f130097f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130096e);
                            f130097f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
