package com.google.android.p10712d;

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

/* renamed from: com.google.android.d.ft */
/* compiled from: PG */
public final class C142449ft extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C142449ft f386535j;

    /* renamed from: k */
    private static volatile C63010eb f386536k;

    /* renamed from: a */
    public int f386537a;

    /* renamed from: b */
    public String f386538b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f386539c;

    /* renamed from: d */
    public int f386540d;

    /* renamed from: e */
    public int f386541e;

    /* renamed from: f */
    public boolean f386542f;

    /* renamed from: g */
    public int f386543g;

    /* renamed from: h */
    public boolean f386544h;

    /* renamed from: i */
    public String f386545i = BuildConfig.FLAVOR;

    static {
        C142449ft ftVar = new C142449ft();
        f386535j = ftVar;
        C62942bv.registerDefaultInstance(C142449ft.class, ftVar);
    }

    private C142449ft() {
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
                return newMessageInfo(f386535j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဆ\u0003\u0005ဇ\u0004\u0006င\u0005\u0007ဇ\u0006\bဈ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C142449ft();
            case 4:
                return new C142448fs();
            case 5:
                return f386535j;
            case 6:
                C63010eb ebVar = f386536k;
                if (ebVar == null) {
                    synchronized (C142449ft.class) {
                        ebVar = f386536k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386535j);
                            f386536k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
