package com.google.p4160bf.p4164b.p4165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55543aw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.be */
/* compiled from: PG */
public final class C55622be extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55622be f146759f;

    /* renamed from: g */
    private static volatile C63010eb f146760g;

    /* renamed from: a */
    public int f146761a;

    /* renamed from: b */
    public String f146762b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f146763c = emptyProtobufList();

    /* renamed from: d */
    public C55657cm f146764d;

    /* renamed from: e */
    public C55543aw f146765e;

    static {
        C55622be beVar = new C55622be();
        f146759f = beVar;
        C62942bv.registerDefaultInstance(C55622be.class, beVar);
    }

    private C55622be() {
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
                return newMessageInfo(f146759f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, C55636bs.class, "d", "e"});
            case 3:
                return new C55622be();
            case 4:
                return new C55621bd();
            case 5:
                return f146759f;
            case 6:
                C63010eb ebVar = f146760g;
                if (ebVar == null) {
                    synchronized (C55622be.class) {
                        ebVar = f146760g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146759f);
                            f146760g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
