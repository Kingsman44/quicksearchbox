package com.google.lens.p4694a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.bl */
/* compiled from: PG */
public final class C62060bl extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62060bl f167653d;

    /* renamed from: e */
    private static volatile C63010eb f167654e;

    /* renamed from: a */
    public int f167655a;

    /* renamed from: b */
    public C62971cq f167656b = emptyProtobufList();

    /* renamed from: c */
    public String f167657c = BuildConfig.FLAVOR;

    static {
        C62060bl blVar = new C62060bl();
        f167653d = blVar;
        C62942bv.registerDefaultInstance(C62060bl.class, blVar);
    }

    private C62060bl() {
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
                return newMessageInfo(f167653d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0000\u0003\u001b\u0004ဈ\u0002", new Object[]{"a", "b", C62059bk.class, C45240c.f118157a});
            case 3:
                return new C62060bl();
            case 4:
                return new C62057bi();
            case 5:
                return f167653d;
            case 6:
                C63010eb ebVar = f167654e;
                if (ebVar == null) {
                    synchronized (C62060bl.class) {
                        ebVar = f167654e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167653d);
                            f167654e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
