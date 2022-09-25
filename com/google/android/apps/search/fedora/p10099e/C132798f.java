package com.google.android.apps.search.fedora.p10099e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.fedora.e.f */
/* compiled from: PG */
public final class C132798f extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C132798f f362315o;

    /* renamed from: p */
    private static volatile C63010eb f362316p;

    /* renamed from: a */
    public int f362317a;

    /* renamed from: b */
    public boolean f362318b;

    /* renamed from: c */
    public long f362319c;

    /* renamed from: d */
    public boolean f362320d;

    /* renamed from: e */
    public String f362321e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f362322f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public boolean f362323g;

    /* renamed from: h */
    public boolean f362324h;

    /* renamed from: i */
    public C132797e f362325i;

    /* renamed from: j */
    public boolean f362326j;

    /* renamed from: k */
    public boolean f362327k;

    /* renamed from: l */
    public C132795c f362328l;

    /* renamed from: m */
    public C63042fg f362329m;

    /* renamed from: n */
    public boolean f362330n;

    static {
        C132798f fVar = new C132798f();
        f362315o = fVar;
        C62942bv.registerDefaultInstance(C132798f.class, fVar);
    }

    private C132798f() {
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
                return newMessageInfo(f362315o, "\u0001\r\u0000\u0001\u0001\u0011\r\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0002\u0003ဈ\u0003\u0004ဂ\u0001\u0005\u001a\u0006ဇ\u0004\tဉ\u0006\u000bဇ\b\rဉ\n\u000eဇ\u0005\u000fဇ\t\u0010ဉ\u000b\u0011ဇ\f", new Object[]{"a", "b", "d", "e", C45240c.f118157a, C10662f.f35572a, C30325g.f82003a, "i", "j", "l", C19618h.f54585a, C19621k.f54601a, "m", C48004n.f124238a});
            case 3:
                return new C132798f();
            case 4:
                return new C132769a();
            case 5:
                return f362315o;
            case 6:
                C63010eb ebVar = f362316p;
                if (ebVar == null) {
                    synchronized (C132798f.class) {
                        ebVar = f362316p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362315o);
                            f362316p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
