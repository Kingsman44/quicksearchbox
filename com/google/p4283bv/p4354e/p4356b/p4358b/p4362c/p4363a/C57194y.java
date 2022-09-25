package com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4357a.C57055c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.c.a.y */
/* compiled from: PG */
public final class C57194y extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C57194y f152692i;

    /* renamed from: j */
    private static volatile C63010eb f152693j;

    /* renamed from: a */
    public int f152694a;

    /* renamed from: b */
    public int f152695b = 0;

    /* renamed from: c */
    public Object f152696c;

    /* renamed from: d */
    public float f152697d;

    /* renamed from: e */
    public long f152698e;

    /* renamed from: f */
    public String f152699f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f152700g;

    /* renamed from: h */
    public String f152701h = BuildConfig.FLAVOR;

    static {
        C57194y yVar = new C57194y();
        f152692i = yVar;
        C62942bv.registerDefaultInstance(C57194y.class, yVar);
    }

    private C57194y() {
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
                return newMessageInfo(f152692i, "\u0001\t\u0001\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0005ခ\u0004\u0007ဈ\u0006\bဌ\u0007\tဈ\b\nဂ\u0005\u000bြ\u0000", new Object[]{C45240c.f118157a, "b", "a", C57193x.class, C57190u.class, C57184o.class, "d", C10662f.f35572a, C30325g.f82003a, C57055c.f152310a, C19618h.f54585a, "e", C57186q.class});
            case 3:
                return new C57194y();
            case 4:
                return new C57182m();
            case 5:
                return f152692i;
            case 6:
                C63010eb ebVar = f152693j;
                if (ebVar == null) {
                    synchronized (C57194y.class) {
                        ebVar = f152693j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152692i);
                            f152693j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
