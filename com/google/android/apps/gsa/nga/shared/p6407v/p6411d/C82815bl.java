package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.bl */
/* compiled from: PG */
public final class C82815bl extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C82815bl f225662e;

    /* renamed from: f */
    private static volatile C63010eb f225663f;

    /* renamed from: a */
    public String f225664a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f225665b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f225666c = emptyProtobufList();

    /* renamed from: d */
    public String f225667d = BuildConfig.FLAVOR;

    static {
        C82815bl blVar = new C82815bl();
        f225662e = blVar;
        C62942bv.registerDefaultInstance(C82815bl.class, blVar);
    }

    private C82815bl() {
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
                return newMessageInfo(f225662e, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0001\u0000\u0001Ȉ\u0003\u001b\u0005Ȉ\u0006Ȉ", new Object[]{"b", C45240c.f118157a, C82817bn.class, "d", "a"});
            case 3:
                return new C82815bl();
            case 4:
                return new C82814bk();
            case 5:
                return f225662e;
            case 6:
                C63010eb ebVar = f225663f;
                if (ebVar == null) {
                    synchronized (C82815bl.class) {
                        ebVar = f225663f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225662e);
                            f225663f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
