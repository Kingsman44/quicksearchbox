package com.google.apps.tiktok.experiments;

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

/* renamed from: com.google.apps.tiktok.experiments.c */
/* compiled from: PG */
public final class C46891c extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C46891c f122341i;

    /* renamed from: j */
    private static volatile C63010eb f122342j;

    /* renamed from: a */
    public int f122343a;

    /* renamed from: b */
    public String f122344b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f122345c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63088z f122346d = C63088z.f170246b;

    /* renamed from: e */
    public C62971cq f122347e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f122348f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public int f122349g;

    /* renamed from: h */
    public long f122350h;

    static {
        C46891c cVar = new C46891c();
        f122341i = cVar;
        C62942bv.registerDefaultInstance(C46891c.class, cVar);
    }

    private C46891c() {
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
                return newMessageInfo(f122341i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004\u001b\u0005\u001a\u0006ဆ\u0003\u0007စ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C46896h.class, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C46891c();
            case 4:
                return new C46890b();
            case 5:
                return f122341i;
            case 6:
                C63010eb ebVar = f122342j;
                if (ebVar == null) {
                    synchronized (C46891c.class) {
                        ebVar = f122342j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f122341i);
                            f122342j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
