package com.google.p4283bv.p4287b.p4288a.p4289a.p4290a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4242bp.p4253e.p4254a.C56192l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.a.b */
/* compiled from: PG */
public final class C56610b extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C56610b f151140k;

    /* renamed from: l */
    private static volatile C63010eb f151141l;

    /* renamed from: a */
    public int f151142a;

    /* renamed from: b */
    public String f151143b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151144c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f151145d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f151146e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public long f151147f;

    /* renamed from: g */
    public boolean f151148g;

    /* renamed from: h */
    public C56192l f151149h;

    /* renamed from: i */
    public C56622n f151150i;

    /* renamed from: j */
    public boolean f151151j;

    static {
        C56610b bVar = new C56610b();
        f151140k = bVar;
        C62942bv.registerDefaultInstance(C56610b.class, bVar);
    }

    private C56610b() {
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
                return newMessageInfo(f151140k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0004ဂ\u0004\bဇ\u0007\tဈ\u0002\nဉ\b\u000bဉ\t\fဇ\n", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, "d", C19618h.f54585a, "i", "j"});
            case 3:
                return new C56610b();
            case 4:
                return new C56609a();
            case 5:
                return f151140k;
            case 6:
                C63010eb ebVar = f151141l;
                if (ebVar == null) {
                    synchronized (C56610b.class) {
                        ebVar = f151141l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151140k);
                            f151141l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
