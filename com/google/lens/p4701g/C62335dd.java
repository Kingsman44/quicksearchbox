package com.google.lens.p4701g;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.dd */
/* compiled from: PG */
public final class C62335dd extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C62335dd f168280h;

    /* renamed from: i */
    private static volatile C63010eb f168281i;

    /* renamed from: a */
    public int f168282a;

    /* renamed from: b */
    public String f168283b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f168284c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f168285d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f168286e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f168287f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f168288g = BuildConfig.FLAVOR;

    static {
        C62335dd ddVar = new C62335dd();
        f168280h = ddVar;
        C62942bv.registerDefaultInstance(C62335dd.class, ddVar);
    }

    private C62335dd() {
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
                return newMessageInfo(f168280h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C62335dd();
            case 4:
                return new C62334dc();
            case 5:
                return f168280h;
            case 6:
                C63010eb ebVar = f168281i;
                if (ebVar == null) {
                    synchronized (C62335dd.class) {
                        ebVar = f168281i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168280h);
                            f168281i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
