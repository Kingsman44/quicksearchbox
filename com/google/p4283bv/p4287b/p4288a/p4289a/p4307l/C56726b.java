package com.google.p4283bv.p4287b.p4288a.p4289a.p4307l;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.l.b */
/* compiled from: PG */
public final class C56726b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C56726b f151397h;

    /* renamed from: i */
    private static volatile C63010eb f151398i;

    /* renamed from: a */
    public int f151399a;

    /* renamed from: b */
    public long f151400b;

    /* renamed from: c */
    public double f151401c;

    /* renamed from: d */
    public double f151402d;

    /* renamed from: e */
    public float f151403e;

    /* renamed from: f */
    public double f151404f;

    /* renamed from: g */
    public double f151405g;

    static {
        C56726b bVar = new C56726b();
        f151397h = bVar;
        C62942bv.registerDefaultInstance(C56726b.class, bVar);
    }

    private C56726b() {
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
                return newMessageInfo(f151397h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002က\u0001\u0003က\u0002\u0004ခ\u0003\u0005က\u0004\bက\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C56726b();
            case 4:
                return new C56725a();
            case 5:
                return f151397h;
            case 6:
                C63010eb ebVar = f151398i;
                if (ebVar == null) {
                    synchronized (C56726b.class) {
                        ebVar = f151398i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151397h);
                            f151398i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
