package com.google.android.apps.p489g.p494d;

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

/* renamed from: com.google.android.apps.g.d.dr */
/* compiled from: PG */
public final class C9236dr extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C9236dr f31922l;

    /* renamed from: n */
    private static volatile C63010eb f31923n;

    /* renamed from: a */
    public int f31924a;

    /* renamed from: b */
    public String f31925b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f31926c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f31927d;

    /* renamed from: e */
    public C9235dq f31928e;

    /* renamed from: f */
    public C9235dq f31929f;

    /* renamed from: g */
    public String f31930g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f31931h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f31932i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C9141ad f31933j;

    /* renamed from: k */
    public int f31934k;

    /* renamed from: m */
    private byte f31935m = 2;

    static {
        C9236dr drVar = new C9236dr();
        f31922l = drVar;
        C62942bv.registerDefaultInstance(C9236dr.class, drVar);
    }

    private C9236dr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31935m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31935m = b;
                return null;
            case 2:
                return newMessageInfo(f31922l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0005ဉ\u0003\u0006ဉ\u0004\bဈ\u0005\tဈ\u0006\nဈ\u0007\u000bᐉ\b\fင\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C9236dr();
            case 4:
                return new C9233do();
            case 5:
                return f31922l;
            case 6:
                C63010eb ebVar = f31923n;
                if (ebVar == null) {
                    synchronized (C9236dr.class) {
                        ebVar = f31923n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31922l);
                            f31923n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
