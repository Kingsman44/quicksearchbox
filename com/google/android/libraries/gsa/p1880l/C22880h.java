package com.google.android.libraries.gsa.p1880l;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.l.h */
/* compiled from: PG */
public final class C22880h extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C22880h f62974h;

    /* renamed from: j */
    private static volatile C63010eb f62975j;

    /* renamed from: a */
    public int f62976a;

    /* renamed from: b */
    public String f62977b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C57566aj f62978c;

    /* renamed from: d */
    public boolean f62979d;

    /* renamed from: e */
    public int f62980e;

    /* renamed from: f */
    public boolean f62981f;

    /* renamed from: g */
    public C57578av f62982g;

    /* renamed from: i */
    private byte f62983i = 2;

    static {
        C22880h hVar = new C22880h();
        f62974h = hVar;
        C62942bv.registerDefaultInstance(C22880h.class, hVar);
    }

    private C22880h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f62983i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f62983i = b;
                return null;
            case 2:
                return newMessageInfo(f62974h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ᐉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C22880h();
            case 4:
                return new C22879g();
            case 5:
                return f62974h;
            case 6:
                C63010eb ebVar = f62975j;
                if (ebVar == null) {
                    synchronized (C22880h.class) {
                        ebVar = f62975j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f62974h);
                            f62975j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
