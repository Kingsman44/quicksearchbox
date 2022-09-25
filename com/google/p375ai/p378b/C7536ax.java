package com.google.p375ai.p378b;

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
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ax */
/* compiled from: PG */
public final class C7536ax extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C7536ax f26084o;

    /* renamed from: r */
    private static volatile C63010eb f26085r;

    /* renamed from: a */
    public int f26086a;

    /* renamed from: b */
    public int f26087b;

    /* renamed from: c */
    public int f26088c = 0;

    /* renamed from: d */
    public Object f26089d;

    /* renamed from: e */
    public int f26090e = 3;

    /* renamed from: f */
    public int f26091f;

    /* renamed from: g */
    public String f26092g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f26093h;

    /* renamed from: i */
    public C7838lv f26094i;

    /* renamed from: j */
    public C8150xj f26095j;

    /* renamed from: k */
    public C8178yk f26096k;

    /* renamed from: l */
    public int f26097l;

    /* renamed from: m */
    public C7562bp f26098m;

    /* renamed from: n */
    public String f26099n = BuildConfig.FLAVOR;

    /* renamed from: p */
    private C7818lb f26100p;

    /* renamed from: q */
    private byte f26101q = 2;

    static {
        C7536ax axVar = new C7536ax();
        f26084o = axVar;
        C62942bv.registerDefaultInstance(C7536ax.class, axVar);
    }

    private C7536ax() {
    }

    /* renamed from: a */
    public final C7818lb mo16925a() {
        C7818lb lbVar = this.f26100p;
        return lbVar == null ? C7818lb.f27416n : lbVar;
    }

    /* renamed from: b */
    public final C7566bt mo16926b() {
        if (this.f26088c == 36) {
            return (C7566bt) this.f26089d;
        }
        return C7566bt.f26167a;
    }

    /* renamed from: c */
    public final C7611dk mo16927c() {
        if (this.f26088c == 14) {
            return (C7611dk) this.f26089d;
        }
        return C7611dk.f26301f;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26101q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26101q = b;
                return null;
            case 2:
                return newMessageInfo(f26084o, "\u0001$\u0001\u0002\u0001+$\u0000\u0000\u000b\u0001ဌ\u0000\u0002ဌ\u0001\u0003ြ\u0000\u0004ဈ\u0002\u0005ᐼ\u0000\u0006ဉ\u001f\u0007ᐼ\u0000\bျ\u0000\tဉ\u0004\nြ\u0000\u000bြ\u0000\u000eြ\u0000\u000fြ\u0000\u0010ြ\u0000\u0011ᐼ\u0000\u0012ြ\u0000\u0015ᐼ\u0000\u0016ᐼ\u0000\u0017ဌ\u0003\u0018ြ\u0000\u0019ဉ\u0005\u001aြ\u0000\u001bᐉ!\u001cြ\u0000 င\"!ဉ#\"ᐼ\u0000#ᐼ\u0000$ြ\u0000%ြ\u0000&ᐼ\u0000'ြ\u0000(ᐼ\u0000)ဈ$*ြ\u0000+ᐼ\u0000", new Object[]{"d", C45240c.f118157a, "a", "b", "e", C7681g.m22803b(), C10662f.f35572a, C7510a.f24744a, C7577cd.class, C30325g.f82003a, C7607dg.class, "j", C7605de.class, "i", C7570bx.class, C7617dq.class, C7611dk.class, C7615do.class, C7532at.class, C7564br.class, C7538az.class, C7621du.class, C7941pq.class, C19618h.f54585a, C7534av.f26083a, C7589cp.class, "p", C7597cx.class, C19621k.f54601a, C7572bz.class, "l", "m", C7530ar.class, C7593ct.class, C7566bt.class, C7560bn.class, C7548bb.class, C7613dm.class, C7552bf.class, C48004n.f124238a, C7550bd.class, C7568bv.class});
            case 3:
                return new C7536ax();
            case 4:
                return new C7533au();
            case 5:
                return f26084o;
            case 6:
                C63010eb ebVar = f26085r;
                if (ebVar == null) {
                    synchronized (C7536ax.class) {
                        ebVar = f26085r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26084o);
                            f26085r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
