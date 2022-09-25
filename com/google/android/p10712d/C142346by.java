package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.by */
/* compiled from: PG */
public final class C142346by extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C142346by f386219m;

    /* renamed from: n */
    private static volatile C63010eb f386220n;

    /* renamed from: a */
    public int f386221a;

    /* renamed from: b */
    public C142328bg f386222b;

    /* renamed from: c */
    public String f386223c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f386224d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f386225e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C142320az f386226f;

    /* renamed from: g */
    public String f386227g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C62971cq f386228h = emptyProtobufList();

    /* renamed from: i */
    public String f386229i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f386230j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public C142355cg f386231k;

    /* renamed from: l */
    public boolean f386232l;

    static {
        C142346by byVar = new C142346by();
        f386219m = byVar;
        C62942bv.registerDefaultInstance(C142346by.class, byVar);
    }

    private C142346by() {
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
                return newMessageInfo(f386219m, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဈ\u0005\b\u001b\tဈ\u0006\nဈ\u0007\u000bဉ\b\fဇ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C142342bu.class, "i", "j", C19621k.f54601a, "l"});
            case 3:
                return new C142346by();
            case 4:
                return new C142345bx();
            case 5:
                return f386219m;
            case 6:
                C63010eb ebVar = f386220n;
                if (ebVar == null) {
                    synchronized (C142346by.class) {
                        ebVar = f386220n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386219m);
                            f386220n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
