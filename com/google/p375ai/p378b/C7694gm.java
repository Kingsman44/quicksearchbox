package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.gm */
/* compiled from: PG */
public final class C7694gm extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C7694gm f26861e;

    /* renamed from: f */
    private static volatile C63010eb f26862f;

    /* renamed from: a */
    public int f26863a;

    /* renamed from: b */
    public int f26864b;

    /* renamed from: c */
    public int f26865c;

    /* renamed from: d */
    public int f26866d;

    static {
        C7694gm gmVar = new C7694gm();
        f26861e = gmVar;
        C62942bv.registerDefaultInstance(C7694gm.class, gmVar);
    }

    private C7694gm() {
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
                return newMessageInfo(f26861e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဌ\u0000\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"a", "b", C7692gk.f26860a, C45240c.f118157a, C7687gf.f26858a, "d", C7690gi.f26859a});
            case 3:
                return new C7694gm();
            case 4:
                return new C7689gh();
            case 5:
                return f26861e;
            case 6:
                C63010eb ebVar = f26862f;
                if (ebVar == null) {
                    synchronized (C7694gm.class) {
                        ebVar = f26862f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26861e);
                            f26862f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
