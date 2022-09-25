package com.google.assistant.p3781ad.p3789d.p3790a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.a.s */
/* compiled from: PG */
public final class C48566s extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C48566s f125467i;

    /* renamed from: j */
    private static volatile C63010eb f125468j;

    /* renamed from: a */
    public int f125469a;

    /* renamed from: b */
    public int f125470b;

    /* renamed from: c */
    public int f125471c;

    /* renamed from: d */
    public C48553f f125472d;

    /* renamed from: e */
    public double f125473e;

    /* renamed from: f */
    public int f125474f;

    /* renamed from: g */
    public String f125475g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C48558k f125476h;

    static {
        C48566s sVar = new C48566s();
        f125467i = sVar;
        C62942bv.registerDefaultInstance(C48566s.class, sVar);
    }

    private C48566s() {
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
                return newMessageInfo(f125467i, "\u0001\u0007\u0000\u0001\u0002\n\u0007\u0000\u0000\u0000\u0002ဌ\u0000\u0003င\u0001\u0005ဉ\u0002\u0007က\u0003\bဌ\u0004\tဈ\u0005\nဉ\u0006", new Object[]{"a", "b", C48580an.m85242c(), C45240c.f118157a, "d", "e", C10662f.f35572a, C48672ag.m85260c(), C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C48566s();
            case 4:
                return new C48565r();
            case 5:
                return f125467i;
            case 6:
                C63010eb ebVar = f125468j;
                if (ebVar == null) {
                    synchronized (C48566s.class) {
                        ebVar = f125468j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125467i);
                            f125468j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
