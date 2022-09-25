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
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.ai.b.lv */
/* compiled from: PG */
public final class C7838lv extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C7838lv f27474p;

    /* renamed from: q */
    private static volatile C63010eb f27475q;

    /* renamed from: a */
    public int f27476a;

    /* renamed from: b */
    public int f27477b = 0;

    /* renamed from: c */
    public Object f27478c;

    /* renamed from: d */
    public int f27479d = 0;

    /* renamed from: e */
    public Object f27480e;

    /* renamed from: f */
    public int f27481f;

    /* renamed from: g */
    public int f27482g;

    /* renamed from: h */
    public int f27483h;

    /* renamed from: i */
    public int f27484i;

    /* renamed from: j */
    public int f27485j;

    /* renamed from: k */
    public int f27486k;

    /* renamed from: l */
    public int f27487l;

    /* renamed from: m */
    public boolean f27488m;

    /* renamed from: n */
    public int f27489n;

    /* renamed from: o */
    public int f27490o;

    static {
        C7838lv lvVar = new C7838lv();
        f27474p = lvVar;
        C62942bv.registerDefaultInstance(C7838lv.class, lvVar);
    }

    private C7838lv() {
    }

    /* renamed from: a */
    public final boolean mo16974a() {
        return this.f27477b == 1;
    }

    /* renamed from: b */
    public final boolean mo16975b() {
        return this.f27477b == 2;
    }

    /* renamed from: c */
    public final String mo16976c() {
        return this.f27477b == 2 ? (String) this.f27478c : BuildConfig.FLAVOR;
    }

    /* renamed from: d */
    public final boolean mo16977d() {
        return this.f27479d == 14;
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
                Object[] objArr = new Object[23];
                objArr[0] = C45240c.f118157a;
                objArr[1] = "b";
                objArr[2] = "e";
                objArr[3] = "d";
                objArr[4] = "a";
                C62959cf cfVar = C7510a.f24744a;
                objArr[20] = cfVar;
                objArr[5] = cfVar;
                objArr[6] = C30325g.f82003a;
                C62959cf cfVar2 = C7839lw.f27491a;
                objArr[13] = cfVar2;
                objArr[7] = cfVar2;
                objArr[8] = C19618h.f54585a;
                objArr[9] = "m";
                objArr[10] = C48004n.f124238a;
                objArr[11] = C7786jx.f27250a;
                objArr[12] = "i";
                objArr[14] = "j";
                objArr[15] = C8152xl.class;
                objArr[16] = C10662f.f35572a;
                objArr[17] = C7836lt.f27473a;
                objArr[18] = C19621k.f54601a;
                objArr[19] = "l";
                objArr[21] = C8152xl.class;
                objArr[22] = C66412o.f180592a;
                return newMessageInfo(f27474p, "\u0001\u0010\u0002\u0001\u0001\u0011\u0010\u0000\u0000\u0000\u0001ဿ\u0000\u0002ျ\u0000\u0003ဌ\u0007\u0004င\b\u0005ဇ\r\u0006ဌ\u000e\u0007ဌ\t\bင\n\nြ\u0000\u000bဌ\u0006\fင\u000b\rင\f\u000eဿ\u0001\u000fျ\u0001\u0010ြ\u0001\u0011င\u0010", objArr);
            case 3:
                return new C7838lv();
            case 4:
                return new C7835ls();
            case 5:
                return f27474p;
            case 6:
                C63010eb ebVar = f27475q;
                if (ebVar == null) {
                    synchronized (C7838lv.class) {
                        ebVar = f27475q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27474p);
                            f27475q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: e */
    public final boolean mo16978e() {
        return this.f27479d == 15;
    }

    /* renamed from: f */
    public final String mo16979f() {
        return this.f27479d == 15 ? (String) this.f27480e : BuildConfig.FLAVOR;
    }

    /* renamed from: g */
    public final boolean mo16980g() {
        return (this.f27476a & 65536) != 0;
    }

    /* renamed from: h */
    public final int mo16981h() {
        int a;
        if (this.f27477b != 1 || (a = C7539b.m22781a(((Integer) this.f27478c).intValue())) == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: i */
    public final int mo16982i() {
        int a;
        if (this.f27479d != 14 || (a = C7539b.m22781a(((Integer) this.f27480e).intValue())) == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: j */
    public final int mo16983j() {
        int a = C7840lx.m22875a(this.f27484i);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
