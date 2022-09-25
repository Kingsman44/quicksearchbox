package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.hg */
/* compiled from: PG */
public final class C82972hg extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C82972hg f226367d;

    /* renamed from: e */
    private static volatile C63010eb f226368e;

    /* renamed from: a */
    public int f226369a;

    /* renamed from: b */
    public int f226370b;

    /* renamed from: c */
    public String f226371c = BuildConfig.FLAVOR;

    static {
        C82972hg hgVar = new C82972hg();
        f226367d = hgVar;
        C62942bv.registerDefaultInstance(C82972hg.class, hgVar);
    }

    private C82972hg() {
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
                return newMessageInfo(f226367d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C82973hh.f226372a, C45240c.f118157a});
            case 3:
                return new C82972hg();
            case 4:
                return new C82971hf();
            case 5:
                return f226367d;
            case 6:
                C63010eb ebVar = f226368e;
                if (ebVar == null) {
                    synchronized (C82972hg.class) {
                        ebVar = f226368e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226367d);
                            f226368e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
