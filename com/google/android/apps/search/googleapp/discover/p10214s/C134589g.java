package com.google.android.apps.search.googleapp.discover.p10214s;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.rendering.xuikit.p3131d.C40306b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.g */
/* compiled from: PG */
public final class C134589g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C134589g f366528d;

    /* renamed from: e */
    public static final C62940bt f366529e;

    /* renamed from: f */
    private static volatile C63010eb f366530f;

    /* renamed from: a */
    public int f366531a;

    /* renamed from: b */
    public String f366532b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f366533c = BuildConfig.FLAVOR;

    static {
        C134589g gVar = new C134589g();
        f366528d = gVar;
        C62942bv.registerDefaultInstance(C134589g.class, gVar);
        f366529e = C62942bv.newSingularGeneratedExtension(C40306b.f105885a, gVar, gVar, (C62958ce) null, 273541756, C63066gd.MESSAGE, C134589g.class);
    }

    private C134589g() {
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
                return newMessageInfo(f366528d, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0006ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C134589g();
            case 4:
                return new C134588f();
            case 5:
                return f366528d;
            case 6:
                C63010eb ebVar = f366530f;
                if (ebVar == null) {
                    synchronized (C134589g.class) {
                        ebVar = f366530f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366528d);
                            f366530f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
