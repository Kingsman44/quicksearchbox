package com.google.android.libraries.web.contrib.contextmenu.p3363b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.b.f */
/* compiled from: PG */
public final class C43446f extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C43446f f113498i;

    /* renamed from: j */
    private static volatile C63010eb f113499j;

    /* renamed from: a */
    public int f113500a;

    /* renamed from: b */
    public int f113501b;

    /* renamed from: c */
    public String f113502c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f113503d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f113504e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f113505f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f113506g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f113507h = BuildConfig.FLAVOR;

    static {
        C43446f fVar = new C43446f();
        f113498i = fVar;
        C62942bv.registerDefaultInstance(C43446f.class, fVar);
    }

    private C43446f() {
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
                return newMessageInfo(f113498i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", C43445e.m76674b(), C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C43446f();
            case 4:
                return new C43443c();
            case 5:
                return f113498i;
            case 6:
                C63010eb ebVar = f113499j;
                if (ebVar == null) {
                    synchronized (C43446f.class) {
                        ebVar = f113499j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f113498i);
                            f113499j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
