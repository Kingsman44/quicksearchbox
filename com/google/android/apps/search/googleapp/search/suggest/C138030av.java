package com.google.android.apps.search.googleapp.search.suggest;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4948ba.p4949a.C64369b;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.av */
/* compiled from: PG */
public final class C138030av extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62962ci f375535f = new C138026ar();

    /* renamed from: m */
    public static final C138030av f375536m;

    /* renamed from: o */
    private static volatile C63010eb f375537o;

    /* renamed from: a */
    public int f375538a;

    /* renamed from: b */
    public String f375539b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f375540c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f375541d;

    /* renamed from: e */
    public C62961ch f375542e = emptyIntList();

    /* renamed from: g */
    public C54228aq f375543g;

    /* renamed from: h */
    public String f375544h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f375545i;

    /* renamed from: j */
    public int f375546j;

    /* renamed from: k */
    public int f375547k;

    /* renamed from: l */
    public C138025aq f375548l;

    /* renamed from: n */
    private byte f375549n = 2;

    static {
        C138030av avVar = new C138030av();
        f375536m = avVar;
        C62942bv.registerDefaultInstance(C138030av.class, avVar);
    }

    private C138030av() {
    }

    /* renamed from: a */
    public final void mo114081a() {
        C62961ch chVar = this.f375542e;
        if (!chVar.mo58948c()) {
            this.f375542e = C62942bv.mutableCopy(chVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f375549n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f375549n = b;
                return null;
            case 2:
                return newMessageInfo(f375536m, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဌ\u0002\u0003\u001e\u0004ᐉ\u0003\u0005ဈ\u0004\u0006ဌ\u0005\u0007ဈ\u0001\tင\u0006\nဌ\u0007\u000bᐉ\b", new Object[]{"a", "b", "d", C138029au.m224332b(), "e", C64369b.m96391b(), C30325g.f82003a, C19618h.f54585a, "i", C138034az.m224337b(), C45240c.f118157a, "j", C19621k.f54601a, C138032ax.m224335b(), "l"});
            case 3:
                return new C138030av();
            case 4:
                return new C138027as();
            case 5:
                return f375536m;
            case 6:
                C63010eb ebVar = f375537o;
                if (ebVar == null) {
                    synchronized (C138030av.class) {
                        ebVar = f375537o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375536m);
                            f375537o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
