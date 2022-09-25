package com.google.android.libraries.assistant.auto.tng.assistant.p720b.p723c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p5277z.p5281b.C67987h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.b.c.f */
/* compiled from: PG */
public final class C11980f extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C11980f f38476l;

    /* renamed from: n */
    private static volatile C63010eb f38477n;

    /* renamed from: a */
    public int f38478a;

    /* renamed from: b */
    public String f38479b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C61752n f38480c;

    /* renamed from: d */
    public String f38481d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62961ch f38482e = emptyIntList();

    /* renamed from: f */
    public String f38483f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f38484g;

    /* renamed from: h */
    public String f38485h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f38486i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public int f38487j;

    /* renamed from: k */
    public C19088t f38488k;

    /* renamed from: m */
    private byte f38489m = 2;

    static {
        C11980f fVar = new C11980f();
        f38476l = fVar;
        C62942bv.registerDefaultInstance(C11980f.class, fVar);
    }

    private C11980f() {
    }

    /* renamed from: a */
    public final void mo20349a() {
        C62961ch chVar = this.f38482e;
        if (!chVar.mo58948c()) {
            this.f38482e = C62942bv.mutableCopy(chVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f38489m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f38489m = b;
                return null;
            case 2:
                return newMessageInfo(f38476l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0001\u0002\u0001ဈ\u0000\u0003ဈ\u0002\u0004\u0016\u0005ဈ\u0003\u0006ဇ\u0004\u0007ဈ\u0005\bဈ\u0006\tဌ\u0007\nᐉ\b\fᐉ\u0001", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C67987h.f184224a, C19621k.f54601a, C45240c.f118157a});
            case 3:
                return new C11980f();
            case 4:
                return new C11979e();
            case 5:
                return f38476l;
            case 6:
                C63010eb ebVar = f38477n;
                if (ebVar == null) {
                    synchronized (C11980f.class) {
                        ebVar = f38477n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f38476l);
                            f38477n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
