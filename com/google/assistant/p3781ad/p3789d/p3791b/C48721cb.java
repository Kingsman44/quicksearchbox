package com.google.assistant.p3781ad.p3789d.p3791b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.cb */
/* compiled from: PG */
public final class C48721cb extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C48721cb f126055m;

    /* renamed from: n */
    private static volatile C63010eb f126056n;

    /* renamed from: a */
    public int f126057a;

    /* renamed from: b */
    public int f126058b;

    /* renamed from: c */
    public int f126059c;

    /* renamed from: d */
    public int f126060d;

    /* renamed from: e */
    public int f126061e;

    /* renamed from: f */
    public String f126062f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f126063g;

    /* renamed from: h */
    public boolean f126064h;

    /* renamed from: i */
    public int f126065i;

    /* renamed from: j */
    public String f126066j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f126067k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public String f126068l = BuildConfig.FLAVOR;

    static {
        C48721cb cbVar = new C48721cb();
        f126055m = cbVar;
        C62942bv.registerDefaultInstance(C48721cb.class, cbVar);
    }

    private C48721cb() {
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
                return newMessageInfo(f126055m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0004\u0005င\u0005\u0006ဇ\u0006\u0007င\u0007\bဈ\b\tဌ\u0003\nဈ\t\u000bဈ\n", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", "e", C48580an.m85242c(), C19621k.f54601a, "l"});
            case 3:
                return new C48721cb();
            case 4:
                return new C48720ca();
            case 5:
                return f126055m;
            case 6:
                C63010eb ebVar = f126056n;
                if (ebVar == null) {
                    synchronized (C48721cb.class) {
                        ebVar = f126056n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126055m);
                            f126056n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
