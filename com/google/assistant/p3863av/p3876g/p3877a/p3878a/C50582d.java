package com.google.assistant.p3863av.p3876g.p3877a.p3878a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.g.a.a.d */
/* compiled from: PG */
public final class C50582d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50582d f131626e;

    /* renamed from: f */
    private static volatile C63010eb f131627f;

    /* renamed from: a */
    public C62971cq f131628a = emptyProtobufList();

    /* renamed from: b */
    public String f131629b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f131630c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public String f131631d = BuildConfig.FLAVOR;

    static {
        C50582d dVar = new C50582d();
        f131626e = dVar;
        C62942bv.registerDefaultInstance(C50582d.class, dVar);
    }

    private C50582d() {
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
                return newMessageInfo(f131626e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002Ȉ\u0003Ț\u0004Ȉ", new Object[]{"a", C50580b.class, "b", C45240c.f118157a, "d"});
            case 3:
                return new C50582d();
            case 4:
                return new C50581c();
            case 5:
                return f131626e;
            case 6:
                C63010eb ebVar = f131627f;
                if (ebVar == null) {
                    synchronized (C50582d.class) {
                        ebVar = f131627f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131626e);
                            f131627f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
