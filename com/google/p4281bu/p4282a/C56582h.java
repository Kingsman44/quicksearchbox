package com.google.p4281bu.p4282a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.h */
/* compiled from: PG */
public final class C56582h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56582h f151069f;

    /* renamed from: g */
    private static volatile C63010eb f151070g;

    /* renamed from: a */
    public C56565cv f151071a;

    /* renamed from: b */
    public C56532bp f151072b;

    /* renamed from: c */
    public String f151073c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f151074d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public String f151075e = BuildConfig.FLAVOR;

    static {
        C56582h hVar = new C56582h();
        f151069f = hVar;
        C62942bv.registerDefaultInstance(C56582h.class, hVar);
    }

    private C56582h() {
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
                return newMessageInfo(f151069f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0002\t\u0003Ȉ\u0004Ț\u0005Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C56582h();
            case 4:
                return new C56581g();
            case 5:
                return f151069f;
            case 6:
                C63010eb ebVar = f151070g;
                if (ebVar == null) {
                    synchronized (C56582h.class) {
                        ebVar = f151070g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151069f);
                            f151070g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
