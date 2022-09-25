package com.google.android.p10713e;

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
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.e.d */
/* compiled from: PG */
public final class C142538d extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C142538d f386774q;

    /* renamed from: r */
    private static volatile C63010eb f386775r;

    /* renamed from: a */
    public int f386776a = 0;

    /* renamed from: b */
    public Object f386777b;

    /* renamed from: c */
    public int f386778c;

    /* renamed from: d */
    public long f386779d;

    /* renamed from: e */
    public long f386780e;

    /* renamed from: f */
    public C62961ch f386781f = emptyIntList();

    /* renamed from: g */
    public C63088z f386782g = C63088z.f170246b;

    /* renamed from: h */
    public String f386783h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f386784i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f386785j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f386786k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public String f386787l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public String f386788m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public String f386789n = BuildConfig.FLAVOR;

    /* renamed from: o */
    public C62964ck f386790o = emptyLongList();

    /* renamed from: p */
    public String f386791p = BuildConfig.FLAVOR;

    static {
        C142538d dVar = new C142538d();
        f386774q = dVar;
        C62942bv.registerDefaultInstance(C142538d.class, dVar);
    }

    private C142538d() {
    }

    /* renamed from: a */
    public final void mo117141a() {
        C62961ch chVar = this.f386781f;
        if (!chVar.mo58948c()) {
            this.f386781f = C62942bv.mutableCopy(chVar);
        }
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
                return newMessageInfo(f386774q, "\u0000\u0013\u0001\u0000\u0001\u0017\u0013\u0000\u0002\u0000\u0001\u0004\u0002\u0002\u0003\u0002\u0004'\u0005\n\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000b5\u0000\f5\u0000\rȻ\u0000\u000e<\u0000\u000f=\u0000\u0011Ȉ\u0012Ȉ\u0016Ȉ\u0017%", new Object[]{"b", "a", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", C142536b.class, "m", C48004n.f124238a, "p", C66412o.f180592a});
            case 3:
                return new C142538d();
            case 4:
                return new C142537c();
            case 5:
                return f386774q;
            case 6:
                C63010eb ebVar = f386775r;
                if (ebVar == null) {
                    synchronized (C142538d.class) {
                        ebVar = f386775r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386774q);
                            f386775r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
