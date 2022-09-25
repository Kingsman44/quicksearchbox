package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.d.a.p;
import com.google.android.apps.gsa.nga.d.a.r;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.fs */
/* compiled from: PG */
public final class C82930fs extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C82930fs f226246e;

    /* renamed from: g */
    private static volatile C63010eb f226247g;

    /* renamed from: a */
    public int f226248a;

    /* renamed from: b */
    public p f226249b;

    /* renamed from: c */
    public r f226250c;

    /* renamed from: d */
    public String f226251d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f226252f = 2;

    static {
        C82930fs fsVar = new C82930fs();
        f226246e = fsVar;
        C62942bv.registerDefaultInstance(C82930fs.class, fsVar);
    }

    private C82930fs() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f226252f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f226252f = b;
                return null;
            case 2:
                return newMessageInfo(f226246e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C82930fs();
            case 4:
                return new C82929fr();
            case 5:
                return f226246e;
            case 6:
                C63010eb ebVar = f226247g;
                if (ebVar == null) {
                    synchronized (C82930fs.class) {
                        ebVar = f226247g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226246e);
                            f226247g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
