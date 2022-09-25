package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ai.b.rp */
/* compiled from: PG */
public final class C7994rp extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C7994rp f28070n;

    /* renamed from: p */
    private static volatile C63010eb f28071p;

    /* renamed from: a */
    public int f28072a;

    /* renamed from: b */
    public int f28073b = 0;

    /* renamed from: c */
    public Object f28074c;

    /* renamed from: d */
    public int f28075d;

    /* renamed from: e */
    public boolean f28076e;

    /* renamed from: f */
    public C7536ax f28077f;

    /* renamed from: g */
    public C7536ax f28078g;

    /* renamed from: h */
    public String f28079h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f28080i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C62971cq f28081j = emptyProtobufList();

    /* renamed from: k */
    public C8075up f28082k;

    /* renamed from: l */
    public int f28083l;

    /* renamed from: m */
    public boolean f28084m;

    /* renamed from: o */
    private byte f28085o = 2;

    static {
        C7994rp rpVar = new C7994rp();
        f28070n = rpVar;
        C62942bv.registerDefaultInstance(C7994rp.class, rpVar);
    }

    private C7994rp() {
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28085o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28085o = b;
                return null;
            case 2:
                return newMessageInfo(f28070n, "\u0001\u0017\u0001\u0001\u0001(\u0017\u0000\u0001\f\u0001ြ\u0000\u0002ᐼ\u0000\u0005ြ\u0000\bြ\u0000\tင\u000e\nᐉ\u0011\u000bᐉ\u0012\rᐼ\u0000\u000eᐼ\u0000\u000fဌ\u0016\u0010ဉ\u0015\u0011ြ\u0000\u0014ᐼ\u0000\u0015ဈ\u0013\u0016ᐼ\u0000\u0018ᐼ\u0000\u0019ဇ\u0010\u001dဇ\u0018\u001eᐼ\u0000#ᐼ\u0000$ဈ\u0014%Л(ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", C8027sv.class, C8046tn.class, C8065uf.class, C7986rh.class, "d", C10662f.f35572a, C30325g.f82003a, C8040th.class, C8052tt.class, "l", C7992rn.f28069a, C19621k.f54601a, C7988rj.class, C8031sz.class, C19618h.f54585a, C8071ul.class, C8004rz.class, "e", "m", C8023sr.class, C8036td.class, "i", "j", C8054tv.class, C8044tl.class});
            case 3:
                return new C7994rp();
            case 4:
                return new C7991rm();
            case 5:
                return f28070n;
            case 6:
                C63010eb ebVar = f28071p;
                if (ebVar == null) {
                    synchronized (C7994rp.class) {
                        ebVar = f28071p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28070n);
                            f28071p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
