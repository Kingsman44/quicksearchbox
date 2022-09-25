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

/* renamed from: com.google.android.apps.g.d.aj */
/* compiled from: PG */
public final class C9147aj extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C9147aj f31573j;

    /* renamed from: k */
    private static volatile C63010eb f31574k;

    /* renamed from: a */
    public int f31575a;

    /* renamed from: b */
    public String f31576b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f31577c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f31578d;

    /* renamed from: e */
    public String f31579e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C9146ai f31580f;

    /* renamed from: g */
    public C9146ai f31581g;

    /* renamed from: h */
    public String f31582h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f31583i = BuildConfig.FLAVOR;

    static {
        C9147aj ajVar = new C9147aj();
        f31573j = ajVar;
        C62942bv.registerDefaultInstance(C9147aj.class, ajVar);
    }

    private C9147aj() {
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
                return newMessageInfo(f31573j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဈ\u0006\bဈ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C9147aj();
            case 4:
                return new C9144ag();
            case 5:
                return f31573j;
            case 6:
                C63010eb ebVar = f31574k;
                if (ebVar == null) {
                    synchronized (C9147aj.class) {
                        ebVar = f31574k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31573j);
                            f31574k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
