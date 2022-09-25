package com.google.p5277z.p5282c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.p4866f.C63608m;

/* renamed from: com.google.z.c.d */
/* compiled from: PG */
public final class C68014d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C68014d f184276f;

    /* renamed from: i */
    private static volatile C63010eb f184277i;

    /* renamed from: a */
    public int f184278a;

    /* renamed from: b */
    public String f184279b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C61752n f184280c;

    /* renamed from: d */
    public C68022l f184281d;

    /* renamed from: e */
    public C63608m f184282e;

    /* renamed from: g */
    private C68014d f184283g;

    /* renamed from: h */
    private byte f184284h = 2;

    static {
        C68014d dVar = new C68014d();
        f184276f = dVar;
        C62942bv.registerDefaultInstance(C68014d.class, dVar);
    }

    private C68014d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f184284h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f184284h = b;
                return null;
            case 2:
                return newMessageInfo(f184276f, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0006ᐉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a});
            case 3:
                return new C68014d();
            case 4:
                return new C68013c();
            case 5:
                return f184276f;
            case 6:
                C63010eb ebVar = f184277i;
                if (ebVar == null) {
                    synchronized (C68014d.class) {
                        ebVar = f184277i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184276f);
                            f184277i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
