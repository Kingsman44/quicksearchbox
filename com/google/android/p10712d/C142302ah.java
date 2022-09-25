package com.google.android.p10712d;

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
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.d.ah */
/* compiled from: PG */
public final class C142302ah extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C142302ah f386044q;

    /* renamed from: t */
    private static volatile C63010eb f386045t;

    /* renamed from: a */
    public int f386046a;

    /* renamed from: b */
    public int f386047b;

    /* renamed from: c */
    public int f386048c;

    /* renamed from: d */
    public String f386049d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f386050e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f386051f;

    /* renamed from: g */
    public String f386052g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f386053h;

    /* renamed from: i */
    public int f386054i;

    /* renamed from: j */
    public int f386055j;

    /* renamed from: k */
    public int f386056k = 1;

    /* renamed from: l */
    public boolean f386057l;

    /* renamed from: m */
    public boolean f386058m;

    /* renamed from: n */
    public boolean f386059n = true;

    /* renamed from: o */
    public String f386060o = BuildConfig.FLAVOR;

    /* renamed from: p */
    public int f386061p = 1;

    /* renamed from: r */
    private C142534z f386062r;

    /* renamed from: s */
    private byte f386063s = 2;

    static {
        C142302ah ahVar = new C142302ah();
        f386044q = ahVar;
        C62942bv.registerDefaultInstance(C142302ah.class, ahVar);
    }

    private C142302ah() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f386063s);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f386063s = b;
                return null;
            case 2:
                return newMessageInfo(f386044q, "\u0001\u0010\u0000\u0001\u0001\u0013\u0010\u0000\u0000\u0004\u0001ᔌ\u0000\u0002ᔄ\u0001\u0004ဈ\u0002\u0005ᔈ\u0003\u0006င\u0004\bᐉ\u0006\tဈ\u0007\nဇ\b\u000bင\t\fဋ\n\u000eင\u000b\u000fဇ\f\u0010ဇ\r\u0011ဇ\u000e\u0012ဈ\u000f\u0013ဌ\u0010", new Object[]{"a", "b", C142300af.f386043a, C45240c.f118157a, "d", "e", C10662f.f35572a, C33259r.f88929b, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", C142298ad.f386042a});
            case 3:
                return new C142302ah();
            case 4:
                return new C142297ac();
            case 5:
                return f386044q;
            case 6:
                C63010eb ebVar = f386045t;
                if (ebVar == null) {
                    synchronized (C142302ah.class) {
                        ebVar = f386045t;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386044q);
                            f386045t = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
