package com.google.android.apps.gsa.staticplugins.videoplayer.p8782b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.p489g.p494d.C9212cu;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.b.f */
/* compiled from: PG */
public final class C117552f extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C117552f f326294l;

    /* renamed from: n */
    private static volatile C63010eb f326295n;

    /* renamed from: a */
    public int f326296a;

    /* renamed from: b */
    public long f326297b;

    /* renamed from: c */
    public long f326298c;

    /* renamed from: d */
    public C9212cu f326299d;

    /* renamed from: e */
    public float f326300e;

    /* renamed from: f */
    public C62971cq f326301f = emptyProtobufList();

    /* renamed from: g */
    public C62971cq f326302g = emptyProtobufList();

    /* renamed from: h */
    public C62971cq f326303h = emptyProtobufList();

    /* renamed from: i */
    public String f326304i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C7718hj f326305j;

    /* renamed from: k */
    public int f326306k;

    /* renamed from: m */
    private byte f326307m = 2;

    static {
        C117552f fVar = new C117552f();
        f326294l = fVar;
        C62942bv.registerDefaultInstance(C117552f.class, fVar);
    }

    private C117552f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f326307m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f326307m = b;
                return null;
            case 2:
                return newMessageInfo(f326294l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0003\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ခ\u0003\u0005\u001b\u0006\u001b\u0007\u001b\nဈ\u0005\u000bᐉ\u0006\fဌ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C7818lb.class, C30325g.f82003a, C7818lb.class, C19618h.f54585a, C7818lb.class, "i", "j", C19621k.f54601a, C8142xb.m22955b()});
            case 3:
                return new C117552f();
            case 4:
                return new C117551e();
            case 5:
                return f326294l;
            case 6:
                C63010eb ebVar = f326295n;
                if (ebVar == null) {
                    synchronized (C117552f.class) {
                        ebVar = f326295n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f326294l);
                            f326295n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
