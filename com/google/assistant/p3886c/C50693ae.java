package com.google.assistant.p3886c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106595g;
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

/* renamed from: com.google.assistant.c.ae */
/* compiled from: PG */
public final class C50693ae extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C50693ae f131888g;

    /* renamed from: h */
    public static final C62940bt f131889h;

    /* renamed from: i */
    private static volatile C63010eb f131890i;

    /* renamed from: a */
    public int f131891a;

    /* renamed from: b */
    public C50697ai f131892b;

    /* renamed from: c */
    public long f131893c;

    /* renamed from: d */
    public int f131894d;

    /* renamed from: e */
    public long f131895e;

    /* renamed from: f */
    public String f131896f = BuildConfig.FLAVOR;

    static {
        C50693ae aeVar = new C50693ae();
        f131888g = aeVar;
        C62942bv.registerDefaultInstance(C50693ae.class, aeVar);
        f131889h = C62942bv.newSingularGeneratedExtension(C50706ar.f131960a, aeVar, aeVar, (C62958ce) null, 368451372, C63066gd.MESSAGE, C50693ae.class);
    }

    private C50693ae() {
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
                return newMessageInfo(f131888g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C106595g.m177370b(), "e", C10662f.f35572a});
            case 3:
                return new C50693ae();
            case 4:
                return new C50692ad();
            case 5:
                return f131888g;
            case 6:
                C63010eb ebVar = f131890i;
                if (ebVar == null) {
                    synchronized (C50693ae.class) {
                        ebVar = f131890i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131888g);
                            f131890i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
