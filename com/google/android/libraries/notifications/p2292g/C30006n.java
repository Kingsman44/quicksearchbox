package com.google.android.libraries.notifications.p2292g;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4160bf.p4164b.p4165a.C55661cq;
import com.google.p4160bf.p4164b.p4165a.C55666f;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.notifications.g.n */
/* compiled from: PG */
public final class C30006n extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C30006n f81219f;

    /* renamed from: g */
    private static volatile C63010eb f81220g;

    /* renamed from: a */
    public int f81221a;

    /* renamed from: b */
    public C62971cq f81222b = emptyProtobufList();

    /* renamed from: c */
    public C55564bq f81223c;

    /* renamed from: d */
    public int f81224d;

    /* renamed from: e */
    public String f81225e = BuildConfig.FLAVOR;

    static {
        C30006n nVar = new C30006n();
        f81219f = nVar;
        C62942bv.registerDefaultInstance(C30006n.class, nVar);
    }

    private C30006n() {
    }

    /* renamed from: a */
    public final void mo35309a() {
        C62971cq cqVar = this.f81222b;
        if (!cqVar.mo58948c()) {
            this.f81222b = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f81219f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဈ\u0002\u0004ဌ\u0001", new Object[]{"a", "b", C55661cq.class, C45240c.f118157a, "e", "d", C55666f.f146877a});
            case 3:
                return new C30006n();
            case 4:
                return new C30005m();
            case 5:
                return f81219f;
            case 6:
                C63010eb ebVar = f81220g;
                if (ebVar == null) {
                    synchronized (C30006n.class) {
                        ebVar = f81220g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f81219f);
                            f81220g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
