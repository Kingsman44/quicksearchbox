package com.google.protos.p5146w.p5147a.p5148a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.w.a.a.b */
/* compiled from: PG */
public final class C65924b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65924b f179283d;

    /* renamed from: e */
    public static final C62940bt f179284e;

    /* renamed from: f */
    private static volatile C63010eb f179285f;

    /* renamed from: a */
    public int f179286a;

    /* renamed from: b */
    public String f179287b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f179288c = BuildConfig.FLAVOR;

    static {
        C65924b bVar = new C65924b();
        f179283d = bVar;
        C62942bv.registerDefaultInstance(C65924b.class, bVar);
        f179284e = C62942bv.newSingularGeneratedExtension(C65930h.f179300i, bVar, bVar, (C62958ce) null, SimpleSnackbar.LENGTH_SHORT, C63066gd.MESSAGE, C65924b.class);
    }

    private C65924b() {
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
                return newMessageInfo(f179283d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65924b();
            case 4:
                return new C65923a();
            case 5:
                return f179283d;
            case 6:
                C63010eb ebVar = f179285f;
                if (ebVar == null) {
                    synchronized (C65924b.class) {
                        ebVar = f179285f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179283d);
                            f179285f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
