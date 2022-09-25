package com.google.android.libraries.search.p2998g.p2999a.p3001b;

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

/* renamed from: com.google.android.libraries.search.g.a.b.f */
/* compiled from: PG */
public final class C38355f extends C62942bv implements C63001dt {

    /* renamed from: s */
    public static final C38355f f101543s;

    /* renamed from: t */
    private static volatile C63010eb f101544t;

    /* renamed from: a */
    public int f101545a;

    /* renamed from: b */
    public int f101546b = 1;

    /* renamed from: c */
    public String f101547c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f101548d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f101549e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f101550f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f101551g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f101552h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public boolean f101553i;

    /* renamed from: j */
    public int f101554j;

    /* renamed from: k */
    public int f101555k;

    /* renamed from: l */
    public int f101556l;

    /* renamed from: m */
    public boolean f101557m;

    /* renamed from: n */
    public boolean f101558n;

    /* renamed from: o */
    public boolean f101559o;

    /* renamed from: p */
    public String f101560p = BuildConfig.FLAVOR;

    /* renamed from: q */
    public boolean f101561q;

    /* renamed from: r */
    public int f101562r;

    static {
        C38355f fVar = new C38355f();
        f101543s = fVar;
        C62942bv.registerDefaultInstance(C38355f.class, fVar);
    }

    private C38355f() {
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
                return newMessageInfo(f101543s, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\u0006\u0007ဇ\u0007\bင\b\tဌ\t\nဌ\n\u000bဈ\u0003\fဇ\u000b\rဇ\f\u000eဇ\r\u000fဈ\u000e\u0010ဇ\u000f\u0011င\u0010", new Object[]{"a", "b", C38345a.f101531a, C45240c.f118157a, "d", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, C38356g.f101563a, "l", C38352c.f101542a, "e", "m", C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b});
            case 3:
                return new C38355f();
            case 4:
                return new C38354e();
            case 5:
                return f101543s;
            case 6:
                C63010eb ebVar = f101544t;
                if (ebVar == null) {
                    synchronized (C38355f.class) {
                        ebVar = f101544t;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101543s);
                            f101544t = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
