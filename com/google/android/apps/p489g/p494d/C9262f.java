package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p375ai.p378b.C7786jx;
import com.google.p375ai.p378b.C7818lb;
import com.google.p375ai.p378b.C8069uj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.g.d.f */
/* compiled from: PG */
public final class C9262f extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C9262f f32035q;

    /* renamed from: s */
    private static volatile C63010eb f32036s;

    /* renamed from: a */
    public int f32037a;

    /* renamed from: b */
    public String f32038b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f32039c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f32040d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f32041e;

    /* renamed from: f */
    public C9201cj f32042f;

    /* renamed from: g */
    public String f32043g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f32044h;

    /* renamed from: i */
    public boolean f32045i;

    /* renamed from: j */
    public boolean f32046j;

    /* renamed from: k */
    public C62971cq f32047k = emptyProtobufList();

    /* renamed from: l */
    public boolean f32048l;

    /* renamed from: m */
    public C9201cj f32049m;

    /* renamed from: n */
    public int f32050n;

    /* renamed from: o */
    public C8069uj f32051o;

    /* renamed from: p */
    public C8069uj f32052p;

    /* renamed from: r */
    private byte f32053r = 2;

    static {
        C9262f fVar = new C9262f();
        f32035q = fVar;
        C62942bv.registerDefaultInstance(C9262f.class, fVar);
    }

    private C9262f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f32053r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f32053r = b;
                return null;
            case 2:
                return newMessageInfo(f32035q, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ᐉ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\b\t\u001b\nᐉ\n\u000bဌ\u000b\rဇ\t\u000eဉ\f\u000fဉ\r\u0010ဇ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "j", C19621k.f54601a, C7818lb.class, "m", C48004n.f124238a, C7786jx.f27250a, "l", C66412o.f180592a, "p", "i"});
            case 3:
                return new C9262f();
            case 4:
                return new C9245e();
            case 5:
                return f32035q;
            case 6:
                C63010eb ebVar = f32036s;
                if (ebVar == null) {
                    synchronized (C9262f.class) {
                        ebVar = f32036s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32035q);
                            f32036s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
