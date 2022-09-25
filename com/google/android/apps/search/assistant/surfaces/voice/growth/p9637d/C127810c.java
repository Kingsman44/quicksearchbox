package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d;

import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127743d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129460g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.c */
/* compiled from: PG */
public final class C127810c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127810c f351779c;

    /* renamed from: d */
    public static final C62940bt f351780d;

    /* renamed from: e */
    private static volatile C63010eb f351781e;

    /* renamed from: a */
    public int f351782a;

    /* renamed from: b */
    public C127743d f351783b;

    static {
        C127810c cVar = new C127810c();
        f351779c = cVar;
        C62942bv.registerDefaultInstance(C127810c.class, cVar);
        f351780d = C62942bv.newSingularGeneratedExtension(C129460g.f355452c, cVar, cVar, (C62958ce) null, 468637869, C63066gd.MESSAGE, C127810c.class);
    }

    private C127810c() {
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
                return newMessageInfo(f351779c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C127810c();
            case 4:
                return new C127738b();
            case 5:
                return f351779c;
            case 6:
                C63010eb ebVar = f351781e;
                if (ebVar == null) {
                    synchronized (C127810c.class) {
                        ebVar = f351781e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351779c);
                            f351781e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
