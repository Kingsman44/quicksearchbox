package com.google.apps.tiktok.account.data;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.tiktok.account.data.j */
/* compiled from: PG */
public final class C46215j extends C62937bq implements C62938br {

    /* renamed from: k */
    public static final C46215j f121154k;

    /* renamed from: m */
    private static volatile C63010eb f121155m;

    /* renamed from: a */
    public int f121156a;

    /* renamed from: b */
    public String f121157b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f121158c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f121159d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f121160e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f121161f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f121162g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f121163h;

    /* renamed from: i */
    public String f121164i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f121165j = BuildConfig.FLAVOR;

    /* renamed from: l */
    private byte f121166l = 2;

    static {
        C46215j jVar = new C46215j();
        f121154k = jVar;
        C62942bv.registerDefaultInstance(C46215j.class, jVar);
    }

    private C46215j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f121166l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f121166l = b;
                return null;
            case 2:
                return newMessageInfo(f121154k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0004\u0004ဈ\u0005\u0005ဇ\u0006\u0006ဈ\u0007\u0007ဈ\b\bဈ\u0002\tဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", "d", "e"});
            case 3:
                return new C46215j();
            case 4:
                return new C46214i();
            case 5:
                return f121154k;
            case 6:
                C63010eb ebVar = f121155m;
                if (ebVar == null) {
                    synchronized (C46215j.class) {
                        ebVar = f121155m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f121154k);
                            f121155m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
