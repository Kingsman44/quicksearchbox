package com.google.protos.p4985f.p5030q.p5032b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.h */
/* compiled from: PG */
public final class C65061h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C65061h f176185f;

    /* renamed from: g */
    private static volatile C63010eb f176186g;

    /* renamed from: a */
    public int f176187a;

    /* renamed from: b */
    public String f176188b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f176189c;

    /* renamed from: d */
    public int f176190d;

    /* renamed from: e */
    public int f176191e;

    static {
        C65061h hVar = new C65061h();
        f176185f = hVar;
        C62942bv.registerDefaultInstance(C65061h.class, hVar);
    }

    private C65061h() {
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
                return newMessageInfo(f176185f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C65061h();
            case 4:
                return new C65060g();
            case 5:
                return f176185f;
            case 6:
                C63010eb ebVar = f176186g;
                if (ebVar == null) {
                    synchronized (C65061h.class) {
                        ebVar = f176186g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176185f);
                            f176186g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
