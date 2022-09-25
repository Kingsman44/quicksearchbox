package com.google.p395al.p422e.p423a.p424a.p425a.p426a;

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
import com.google.protos.youtube.elements.C66180cy;

/* renamed from: com.google.al.e.a.a.a.a.b */
/* compiled from: PG */
public final class C8602b extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C8602b f29817k;

    /* renamed from: m */
    private static volatile C63010eb f29818m;

    /* renamed from: a */
    public int f29819a;

    /* renamed from: b */
    public int f29820b = 0;

    /* renamed from: c */
    public Object f29821c;

    /* renamed from: d */
    public int f29822d = 0;

    /* renamed from: e */
    public Object f29823e;

    /* renamed from: f */
    public String f29824f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f29825g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f29826h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f29827i;

    /* renamed from: j */
    public String f29828j = BuildConfig.FLAVOR;

    /* renamed from: l */
    private byte f29829l = 2;

    static {
        C8602b bVar = new C8602b();
        f29817k = bVar;
        C62942bv.registerDefaultInstance(C8602b.class, bVar);
    }

    private C8602b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29829l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29829l = b;
                return null;
            case 2:
                return newMessageInfo(f29817k, "\u0001\t\u0002\u0001\u0001\u0010\t\u0000\u0000\u0002\u0001ဈ\u0000\u0004ျ\u0000\u0005ဈ\u0005\u0007ဈ\b\bင\t\tျ\u0001\nဈ\f\u000eᐼ\u0001\u0010ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "e", "d", "a", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C66180cy.class, C66180cy.class});
            case 3:
                return new C8602b();
            case 4:
                return new C8601a();
            case 5:
                return f29817k;
            case 6:
                C63010eb ebVar = f29818m;
                if (ebVar == null) {
                    synchronized (C8602b.class) {
                        ebVar = f29818m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29817k);
                            f29818m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
