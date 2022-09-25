package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127045c;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127455c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34065ca;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.actions.b */
/* compiled from: PG */
public final class C127110b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C127110b f350000f;

    /* renamed from: h */
    private static volatile C63010eb f350001h;

    /* renamed from: a */
    public int f350002a;

    /* renamed from: b */
    public C119851cs f350003b;

    /* renamed from: c */
    public C127045c f350004c;

    /* renamed from: d */
    public C127455c f350005d;

    /* renamed from: e */
    public C34065ca f350006e;

    /* renamed from: g */
    private byte f350007g = 2;

    static {
        C127110b bVar = new C127110b();
        f350000f = bVar;
        C62942bv.registerDefaultInstance(C127110b.class, bVar);
    }

    private C127110b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f350007g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f350007g = b;
                return null;
            case 2:
                return newMessageInfo(f350000f, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C127110b();
            case 4:
                return new C127109a();
            case 5:
                return f350000f;
            case 6:
                C63010eb ebVar = f350001h;
                if (ebVar == null) {
                    synchronized (C127110b.class) {
                        ebVar = f350001h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350000f);
                            f350001h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
