package com.google.android.apps.gsa.shared.speech.p7141c;

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
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.gsa.shared.speech.c.b */
/* compiled from: PG */
public final class C90534b extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C90534b f253087r;

    /* renamed from: s */
    private static volatile C63010eb f253088s;

    /* renamed from: a */
    public int f253089a;

    /* renamed from: b */
    public float f253090b;

    /* renamed from: c */
    public float f253091c;

    /* renamed from: d */
    public float f253092d;

    /* renamed from: e */
    public float f253093e;

    /* renamed from: f */
    public boolean f253094f;

    /* renamed from: g */
    public boolean f253095g;

    /* renamed from: h */
    public long f253096h;

    /* renamed from: i */
    public int f253097i;

    /* renamed from: j */
    public String f253098j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f253099k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public int f253100l;

    /* renamed from: m */
    public boolean f253101m;

    /* renamed from: n */
    public boolean f253102n;

    /* renamed from: o */
    public boolean f253103o;

    /* renamed from: p */
    public boolean f253104p;

    /* renamed from: q */
    public long f253105q;

    static {
        C90534b bVar = new C90534b();
        f253087r = bVar;
        C62942bv.registerDefaultInstance(C90534b.class, bVar);
    }

    private C90534b() {
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
                return newMessageInfo(f253087r, "\u0001\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဂ\u0006\bင\u0007\tဈ\b\nဈ\t\u000bင\n\fဇ\u000b\rဇ\f\u000eဇ\r\u0011ဇ\u0010\u0012ဂ\u0011", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q"});
            case 3:
                return new C90534b();
            case 4:
                return new C90533a();
            case 5:
                return f253087r;
            case 6:
                C63010eb ebVar = f253088s;
                if (ebVar == null) {
                    synchronized (C90534b.class) {
                        ebVar = f253088s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f253087r);
                            f253088s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
