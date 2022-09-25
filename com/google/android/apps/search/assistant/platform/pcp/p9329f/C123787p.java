package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.p */
/* compiled from: PG */
public final class C123787p extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C123787p f341948n;

    /* renamed from: o */
    private static volatile C63010eb f341949o;

    /* renamed from: a */
    public int f341950a;

    /* renamed from: b */
    public long f341951b;

    /* renamed from: c */
    public long f341952c;

    /* renamed from: d */
    public String f341953d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f341954e;

    /* renamed from: f */
    public long f341955f;

    /* renamed from: g */
    public String f341956g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f341957h;

    /* renamed from: i */
    public int f341958i;

    /* renamed from: j */
    public long f341959j;

    /* renamed from: k */
    public String f341960k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public boolean f341961l;

    /* renamed from: m */
    public boolean f341962m;

    static {
        C123787p pVar = new C123787p();
        f341948n = pVar;
        C62942bv.registerDefaultInstance(C123787p.class, pVar);
    }

    private C123787p() {
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
                return newMessageInfo(f341948n, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဌ\u0007\nဌ\t\u000bဂ\n\fဈ\u000b\u000eဇ\r\u000fဇ\u000e", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C123782k.f341946a, "i", C123784m.f341947a, "j", C19621k.f54601a, "l", "m"});
            case 3:
                return new C123787p();
            case 4:
                return new C123786o();
            case 5:
                return f341948n;
            case 6:
                C63010eb ebVar = f341949o;
                if (ebVar == null) {
                    synchronized (C123787p.class) {
                        ebVar = f341949o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341948n);
                            f341949o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
