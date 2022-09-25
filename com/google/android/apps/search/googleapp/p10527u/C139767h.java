package com.google.android.apps.search.googleapp.p10527u;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.u.h */
/* compiled from: PG */
public final class C139767h extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C139767h f379869k;

    /* renamed from: m */
    private static volatile C63010eb f379870m;

    /* renamed from: a */
    public int f379871a;

    /* renamed from: b */
    public int f379872b;

    /* renamed from: c */
    public boolean f379873c;

    /* renamed from: d */
    public boolean f379874d;

    /* renamed from: e */
    public C62995dn f379875e = C62995dn.f170057a;

    /* renamed from: f */
    public String f379876f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C139770k f379877g;

    /* renamed from: h */
    public boolean f379878h;

    /* renamed from: i */
    public boolean f379879i;

    /* renamed from: j */
    public String f379880j = BuildConfig.FLAVOR;

    /* renamed from: l */
    private byte f379881l = 2;

    static {
        C139767h hVar = new C139767h();
        f379869k = hVar;
        C62942bv.registerDefaultInstance(C139767h.class, hVar);
    }

    private C139767h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f379881l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f379881l = b;
                return null;
            case 2:
                return newMessageInfo(f379869k, "\u0001\t\u0000\u0001\u0001\t\t\u0001\u0000\u0001\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u00042\u0005ဈ\u0003\u0006ᐉ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007", new Object[]{"a", "b", C139779t.m227246b(), C45240c.f118157a, "d", "e", C139766g.f379868a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C139767h();
            case 4:
                return new C139765f();
            case 5:
                return f379869k;
            case 6:
                C63010eb ebVar = f379870m;
                if (ebVar == null) {
                    synchronized (C139767h.class) {
                        ebVar = f379870m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f379869k);
                            f379870m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
