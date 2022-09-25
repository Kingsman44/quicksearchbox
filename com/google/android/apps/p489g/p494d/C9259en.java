package com.google.android.apps.p489g.p494d;

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

/* renamed from: com.google.android.apps.g.d.en */
/* compiled from: PG */
public final class C9259en extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C9259en f32016i;

    /* renamed from: j */
    private static volatile C63010eb f32017j;

    /* renamed from: a */
    public int f32018a;

    /* renamed from: b */
    public String f32019b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f32020c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f32021d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f32022e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f32023f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f32024g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f32025h;

    static {
        C9259en enVar = new C9259en();
        f32016i = enVar;
        C62942bv.registerDefaultInstance(C9259en.class, enVar);
    }

    private C9259en() {
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
                return newMessageInfo(f32016i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C9259en();
            case 4:
                return new C9258em();
            case 5:
                return f32016i;
            case 6:
                C63010eb ebVar = f32017j;
                if (ebVar == null) {
                    synchronized (C9259en.class) {
                        ebVar = f32017j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32016i);
                            f32017j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
