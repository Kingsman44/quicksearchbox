package com.google.protos.p5146w.p5149b.p5157c;

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

/* renamed from: com.google.protos.w.b.c.h */
/* compiled from: PG */
public final class C65958h extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C65958h f179399j;

    /* renamed from: k */
    private static volatile C63010eb f179400k;

    /* renamed from: a */
    public int f179401a;

    /* renamed from: b */
    public double f179402b;

    /* renamed from: c */
    public String f179403c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f179404d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f179405e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public String f179406f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f179407g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f179408h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f179409i;

    static {
        C65958h hVar = new C65958h();
        f179399j = hVar;
        C62942bv.registerDefaultInstance(C65958h.class, hVar);
    }

    private C65958h() {
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
                return newMessageInfo(f179399j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001က\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bင\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C65958h();
            case 4:
                return new C65957g();
            case 5:
                return f179399j;
            case 6:
                C63010eb ebVar = f179400k;
                if (ebVar == null) {
                    synchronized (C65958h.class) {
                        ebVar = f179400k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179399j);
                            f179400k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
