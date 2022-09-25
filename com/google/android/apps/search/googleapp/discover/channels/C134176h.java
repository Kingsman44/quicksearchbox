package com.google.android.apps.search.googleapp.discover.channels;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4027c.p4028a.p4029a.C53842b;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57252bg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.h */
/* compiled from: PG */
public final class C134176h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C134176h f365490e;

    /* renamed from: g */
    private static volatile C63010eb f365491g;

    /* renamed from: a */
    public int f365492a;

    /* renamed from: b */
    public C53842b f365493b;

    /* renamed from: c */
    public C57252bg f365494c;

    /* renamed from: d */
    public String f365495d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f365496f = 2;

    static {
        C134176h hVar = new C134176h();
        f365490e = hVar;
        C62942bv.registerDefaultInstance(C134176h.class, hVar);
    }

    private C134176h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f365496f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f365496f = b;
                return null;
            case 2:
                return newMessageInfo(f365490e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0001\u0002ᐉ\u0000\u0003ဉ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C134176h();
            case 4:
                return new C134175g();
            case 5:
                return f365490e;
            case 6:
                C63010eb ebVar = f365491g;
                if (ebVar == null) {
                    synchronized (C134176h.class) {
                        ebVar = f365491g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f365490e);
                            f365491g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
