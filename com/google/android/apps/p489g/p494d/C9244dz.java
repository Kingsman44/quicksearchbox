package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7818lb;
import com.google.p375ai.p378b.C8057ty;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.dz */
/* compiled from: PG */
public final class C9244dz extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C9244dz f31962i;

    /* renamed from: j */
    private static volatile C63010eb f31963j;

    /* renamed from: a */
    public int f31964a;

    /* renamed from: b */
    public String f31965b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f31966c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f31967d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f31968e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f31969f = emptyProtobufList();

    /* renamed from: g */
    public int f31970g;

    /* renamed from: h */
    public int f31971h;

    static {
        C9244dz dzVar = new C9244dz();
        f31962i = dzVar;
        C62942bv.registerDefaultInstance(C9244dz.class, dzVar);
    }

    private C9244dz() {
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
                return newMessageInfo(f31962i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004\u001b\u0006\u001b\u0007င\u0002\bင\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C9243dy.class, "e", C7818lb.class, C10662f.f35572a, C8057ty.class, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C9244dz();
            case 4:
                return new C9239du();
            case 5:
                return f31962i;
            case 6:
                C63010eb ebVar = f31963j;
                if (ebVar == null) {
                    synchronized (C9244dz.class) {
                        ebVar = f31963j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31962i);
                            f31963j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
