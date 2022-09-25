package com.google.p4653i.p4654a.p4655a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p10983ae.p10984a.C147476u;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4653i.p4654a.C61663ad;
import com.google.p4653i.p4654a.C61688bb;
import com.google.p4653i.p4654a.C61690bd;
import com.google.p4653i.p4654a.C61692bf;
import com.google.p4653i.p4654a.C61694d;
import com.google.p4653i.p4654a.C61702l;
import com.google.p4653i.p4654a.C61710t;
import com.google.p4653i.p4654a.C61714x;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.i.a.a.f */
/* compiled from: PG */
public final class C61655f extends C62942bv implements C63001dt {

    /* renamed from: v */
    public static final C61655f f166555v;

    /* renamed from: y */
    private static volatile C63010eb f166556y;

    /* renamed from: a */
    public int f166557a;

    /* renamed from: b */
    public C61692bf f166558b;

    /* renamed from: c */
    public C61659j f166559c;

    /* renamed from: d */
    public String f166560d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f166561e;

    /* renamed from: f */
    public long f166562f;

    /* renamed from: g */
    public boolean f166563g;

    /* renamed from: h */
    public boolean f166564h;

    /* renamed from: i */
    public boolean f166565i;

    /* renamed from: j */
    public boolean f166566j;

    /* renamed from: k */
    public long f166567k;

    /* renamed from: l */
    public C61710t f166568l;

    /* renamed from: m */
    public C61710t f166569m;

    /* renamed from: n */
    public C61714x f166570n;

    /* renamed from: o */
    public C61663ad f166571o;

    /* renamed from: p */
    public long f166572p;

    /* renamed from: q */
    public C61690bd f166573q;

    /* renamed from: r */
    public C61688bb f166574r;

    /* renamed from: s */
    public C61694d f166575s;

    /* renamed from: t */
    public C61653d f166576t;

    /* renamed from: u */
    public long f166577u;

    /* renamed from: w */
    private C61702l f166578w;

    /* renamed from: x */
    private byte f166579x = 2;

    static {
        C61655f fVar = new C61655f();
        f166555v = fVar;
        C62942bv.registerDefaultInstance(C61655f.class, fVar);
    }

    private C61655f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166579x);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166579x = b;
                return null;
            case 2:
                return newMessageInfo(f166555v, "\u0001\u0015\u0000\u0001\u0001\u001a\u0015\u0000\u0000\u0007\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဈ\u0003\u0005ᐉ\f\u0006ᐉ\u000e\u0007ᐉ\r\bဇ\u0006\nဇ\u0007\u000bဂ\u0005\fᐉ\u000f\u000eဂ\u0010\u000fᐉ\u0011\u0010ᐉ\u0012\u0011ဉ\u0013\u0012ဂ\u0004\u0014ᐉ\u0014\u0015ဇ\b\u0016ဇ\t\u0017စ\u000b\u0019ဉ\u0015\u001aဂ\u0016", new Object[]{"a", "b", C45240c.f118157a, "d", "l", C48004n.f124238a, "m", C30325g.f82003a, C19618h.f54585a, C10662f.f35572a, C66412o.f180592a, "p", "q", C33259r.f88929b, C59002s.f156871a, "e", "w", "i", "j", C19621k.f54601a, C42181t.f110467a, C147476u.f398081a});
            case 3:
                return new C61655f();
            case 4:
                return new C61654e();
            case 5:
                return f166555v;
            case 6:
                C63010eb ebVar = f166556y;
                if (ebVar == null) {
                    synchronized (C61655f.class) {
                        ebVar = f166556y;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166555v);
                            f166556y = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
