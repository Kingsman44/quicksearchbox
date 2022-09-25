package com.google.android.libraries.phenotype.client.p2420a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.phenotype.client.a.b */
/* compiled from: PG */
public final class C31634b extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C31634b f85107i;

    /* renamed from: j */
    private static volatile C63010eb f85108j;

    /* renamed from: a */
    public int f85109a;

    /* renamed from: b */
    public String f85110b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f85111c = C63088z.f170246b;

    /* renamed from: d */
    public String f85112d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f85113e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f85114f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public boolean f85115g;

    /* renamed from: h */
    public long f85116h;

    static {
        C31634b bVar = new C31634b();
        f85107i = bVar;
        C62942bv.registerDefaultInstance(C31634b.class, bVar);
    }

    private C31634b() {
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
                return newMessageInfo(f85107i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"a", "d", "b", C45240c.f118157a, "e", C31638f.class, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C31634b();
            case 4:
                return new C31633a();
            case 5:
                return f85107i;
            case 6:
                C63010eb ebVar = f85108j;
                if (ebVar == null) {
                    synchronized (C31634b.class) {
                        ebVar = f85108j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f85107i);
                            f85108j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
