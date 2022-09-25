package com.google.p4160bf.p4161a.p4163b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4160bf.p4161a.p4162a.C55433b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.bt */
/* compiled from: PG */
public final class C55483bt extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55483bt f146371f;

    /* renamed from: g */
    private static volatile C63010eb f146372g;

    /* renamed from: a */
    public int f146373a;

    /* renamed from: b */
    public int f146374b = 0;

    /* renamed from: c */
    public Object f146375c;

    /* renamed from: d */
    public String f146376d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f146377e = C62942bv.emptyProtobufList();

    static {
        C55483bt btVar = new C55483bt();
        f146371f = btVar;
        C62942bv.registerDefaultInstance(C55483bt.class, btVar);
    }

    private C55483bt() {
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
                return newMessageInfo(f146371f, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ဿ\u0000\u0004ဈ\u0002", new Object[]{C45240c.f118157a, "b", "a", C55481br.class, C55433b.f146255a, "d"});
            case 3:
                return new C55483bt();
            case 4:
                return new C55482bs();
            case 5:
                return f146371f;
            case 6:
                C63010eb ebVar = f146372g;
                if (ebVar == null) {
                    synchronized (C55483bt.class) {
                        ebVar = f146372g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146371f);
                            f146372g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
