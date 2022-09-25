package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.appwidget;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.agj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.d */
/* compiled from: PG */
public final class C129096d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C129096d f354643e;

    /* renamed from: g */
    private static volatile C63010eb f354644g;

    /* renamed from: a */
    public int f354645a;

    /* renamed from: b */
    public agj f354646b;

    /* renamed from: c */
    public int f354647c;

    /* renamed from: d */
    public int f354648d;

    /* renamed from: f */
    private byte f354649f = 2;

    static {
        C129096d dVar = new C129096d();
        f354643e = dVar;
        C62942bv.registerDefaultInstance(C129096d.class, dVar);
    }

    private C129096d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f354649f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f354649f = b;
                return null;
            case 2:
                return newMessageInfo(f354643e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C129096d();
            case 4:
                return new C129095c();
            case 5:
                return f354643e;
            case 6:
                C63010eb ebVar = f354644g;
                if (ebVar == null) {
                    synchronized (C129096d.class) {
                        ebVar = f354644g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f354643e);
                            f354644g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
