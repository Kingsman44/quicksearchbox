package com.google.android.apps.gsa.shared.monet.p7070b.p7082ah;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54781a;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54785e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.ah.f */
/* compiled from: PG */
public final class C90215f extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C90215f f252021i;

    /* renamed from: j */
    private static volatile C63010eb f252022j;

    /* renamed from: a */
    public int f252023a;

    /* renamed from: b */
    public int f252024b;

    /* renamed from: c */
    public String f252025c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public float f252026d = 1.777f;

    /* renamed from: e */
    public int f252027e;

    /* renamed from: f */
    public int f252028f;

    /* renamed from: g */
    public C54785e f252029g;

    /* renamed from: h */
    public int f252030h;

    static {
        C90215f fVar = new C90215f();
        f252021i = fVar;
        C62942bv.registerDefaultInstance(C90215f.class, fVar);
    }

    private C90215f() {
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
                return newMessageInfo(f252021i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0005င\u0003\u0006င\u0004\u0007ဉ\u0005\bဌ\u0006", new Object[]{"a", "b", C90214e.f252020a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C54781a.f143722a});
            case 3:
                return new C90215f();
            case 4:
                return new C90213d();
            case 5:
                return f252021i;
            case 6:
                C63010eb ebVar = f252022j;
                if (ebVar == null) {
                    synchronized (C90215f.class) {
                        ebVar = f252022j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f252021i);
                            f252022j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
