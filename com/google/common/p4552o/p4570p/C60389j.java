package com.google.common.p4552o.p4570p;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.p.j */
/* compiled from: PG */
public final class C60389j extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60389j f163423f;

    /* renamed from: g */
    private static volatile C63010eb f163424g;

    /* renamed from: a */
    public int f163425a;

    /* renamed from: b */
    public int f163426b;

    /* renamed from: c */
    public int f163427c;

    /* renamed from: d */
    public C62961ch f163428d = emptyIntList();

    /* renamed from: e */
    public String f163429e = BuildConfig.FLAVOR;

    static {
        C60389j jVar = new C60389j();
        f163423f = jVar;
        C62942bv.registerDefaultInstance(C60389j.class, jVar);
    }

    private C60389j() {
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
                return newMessageInfo(f163423f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0003င\u0002\u0004\u0016\u0005ဈ\u0003", new Object[]{"a", "b", C60388i.f163422a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C60389j();
            case 4:
                return new C60387h();
            case 5:
                return f163423f;
            case 6:
                C63010eb ebVar = f163424g;
                if (ebVar == null) {
                    synchronized (C60389j.class) {
                        ebVar = f163424g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163423f);
                            f163424g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
