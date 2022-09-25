package com.google.android.apps.gsa.staticplugins.videoplayer.p8782b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7818lb;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.b.j */
/* compiled from: PG */
public final class C117556j extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C117556j f326308j;

    /* renamed from: l */
    private static volatile C63010eb f326309l;

    /* renamed from: a */
    public int f326310a;

    /* renamed from: b */
    public String f326311b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f326312c;

    /* renamed from: d */
    public long f326313d;

    /* renamed from: e */
    public C62971cq f326314e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f326315f = emptyProtobufList();

    /* renamed from: g */
    public String f326316g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C7718hj f326317h;

    /* renamed from: i */
    public int f326318i;

    /* renamed from: k */
    private byte f326319k = 2;

    static {
        C117556j jVar = new C117556j();
        f326308j = jVar;
        C62942bv.registerDefaultInstance(C117556j.class, jVar);
    }

    private C117556j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f326319k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f326319k = b;
                return null;
            case 2:
                return newMessageInfo(f326308j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0002\u0001\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004\u001b\u0005\u001b\u0007ဈ\u0003\bᐉ\u0004\tဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C7818lb.class, C10662f.f35572a, C7818lb.class, C30325g.f82003a, C19618h.f54585a, "i", C8142xb.m22955b()});
            case 3:
                return new C117556j();
            case 4:
                return new C117555i();
            case 5:
                return f326308j;
            case 6:
                C63010eb ebVar = f326309l;
                if (ebVar == null) {
                    synchronized (C117556j.class) {
                        ebVar = f326309l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f326308j);
                            f326309l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
