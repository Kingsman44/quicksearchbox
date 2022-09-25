package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.bb.a.bc */
/* compiled from: PG */
public final class C54972bc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62962ci f144606e = new C54963au();

    /* renamed from: i */
    public static final C62962ci f144607i = new C54964av();

    /* renamed from: s */
    public static final C62962ci f144608s = new C54965aw();

    /* renamed from: t */
    public static final C54972bc f144609t;

    /* renamed from: u */
    private static volatile C63010eb f144610u;

    /* renamed from: a */
    public int f144611a;

    /* renamed from: b */
    public int f144612b;

    /* renamed from: c */
    public int f144613c;

    /* renamed from: d */
    public C62961ch f144614d = emptyIntList();

    /* renamed from: f */
    public C62971cq f144615f = emptyProtobufList();

    /* renamed from: g */
    public String f144616g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C62961ch f144617h = emptyIntList();

    /* renamed from: j */
    public C54986bq f144618j;

    /* renamed from: k */
    public String f144619k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public C55401r f144620l;

    /* renamed from: m */
    public int f144621m;

    /* renamed from: n */
    public int f144622n;

    /* renamed from: o */
    public int f144623o;

    /* renamed from: p */
    public String f144624p = BuildConfig.FLAVOR;

    /* renamed from: q */
    public int f144625q;

    /* renamed from: r */
    public C62961ch f144626r = emptyIntList();

    static {
        C54972bc bcVar = new C54972bc();
        f144609t = bcVar;
        C62942bv.registerDefaultInstance(C54972bc.class, bcVar);
    }

    private C54972bc() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f144609t, "\u0001\u000f\u0000\u0001\u0001\u0012\u000f\u0000\u0004\u0000\u0001င\u0000\u0002င\u0001\u0004\u001e\u0006\u001e\u0007ဈ\u0005\bဉ\u0006\tင\u0007\nင\b\f\u001b\rဈ\u0002\u000eဉ\u0004\u000fဌ\t\u0010ဈ\n\u0011င\u000b\u0012\u001e", new Object[]{"a", "b", C45240c.f118157a, "d", C54968az.m87549b(), C19618h.f54585a, C54971bb.m87551b(), C19621k.f54601a, "l", "m", C48004n.f124238a, C10662f.f35572a, C54978bi.class, C30325g.f82003a, "j", C66412o.f180592a, C55421x.m87687b(), "p", "q", C33259r.f88929b, C54990bu.m87555b()});
            case 3:
                return new C54972bc();
            case 4:
                return new C54966ax();
            case 5:
                return f144609t;
            case 6:
                C63010eb ebVar = f144610u;
                if (ebVar == null) {
                    synchronized (C54972bc.class) {
                        ebVar = f144610u;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144609t);
                            f144610u = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
