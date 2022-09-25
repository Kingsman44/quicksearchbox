package com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57499g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.f.c.d */
/* compiled from: PG */
public final class C96999d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C96999d f271076e;

    /* renamed from: f */
    public static final C62940bt f271077f;

    /* renamed from: g */
    private static volatile C63010eb f271078g;

    /* renamed from: a */
    public int f271079a;

    /* renamed from: b */
    public int f271080b = 0;

    /* renamed from: c */
    public Object f271081c;

    /* renamed from: d */
    public String f271082d = BuildConfig.FLAVOR;

    static {
        C96999d dVar = new C96999d();
        f271076e = dVar;
        C62942bv.registerDefaultInstance(C96999d.class, dVar);
        f271077f = C62942bv.newSingularGeneratedExtension(C57499g.f153590a, dVar, dVar, (C62958ce) null, 215110878, C63066gd.MESSAGE, C96999d.class);
    }

    private C96999d() {
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
                return newMessageInfo(f271076e, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ဈ\u0001", new Object[]{C45240c.f118157a, "b", "a", C96997b.class, "d"});
            case 3:
                return new C96999d();
            case 4:
                return new C96998c();
            case 5:
                return f271076e;
            case 6:
                C63010eb ebVar = f271078g;
                if (ebVar == null) {
                    synchronized (C96999d.class) {
                        ebVar = f271078g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f271076e);
                            f271078g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
