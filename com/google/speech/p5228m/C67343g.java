package com.google.speech.p5228m;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.m.g */
/* compiled from: PG */
public final class C67343g extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C67343g f183045g;

    /* renamed from: h */
    public static final C62940bt f183046h;

    /* renamed from: i */
    private static volatile C63010eb f183047i;

    /* renamed from: a */
    public int f183048a;

    /* renamed from: b */
    public String f183049b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f183050c;

    /* renamed from: d */
    public String f183051d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f183052e;

    /* renamed from: f */
    public boolean f183053f;

    static {
        C67343g gVar = new C67343g();
        f183045g = gVar;
        C62942bv.registerDefaultInstance(C67343g.class, gVar);
        f183046h = C62942bv.newSingularGeneratedExtension(C67357u.f183084a, gVar, gVar, (C62958ce) null, 400071143, C63066gd.MESSAGE, C67343g.class);
    }

    private C67343g() {
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
                return newMessageInfo(f183045g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C67344h.f183054a, C10662f.f35572a});
            case 3:
                return new C67343g();
            case 4:
                return new C67342f();
            case 5:
                return f183045g;
            case 6:
                C63010eb ebVar = f183047i;
                if (ebVar == null) {
                    synchronized (C67343g.class) {
                        ebVar = f183047i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183045g);
                            f183047i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
