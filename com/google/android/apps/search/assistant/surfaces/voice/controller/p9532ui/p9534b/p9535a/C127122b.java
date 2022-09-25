package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.a.b */
/* compiled from: PG */
public final class C127122b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C127122b f350024f;

    /* renamed from: h */
    private static volatile C63010eb f350025h;

    /* renamed from: a */
    public int f350026a;

    /* renamed from: b */
    public C51809dy f350027b;

    /* renamed from: c */
    public C129676j f350028c;

    /* renamed from: d */
    public C127289i f350029d;

    /* renamed from: e */
    public C119793ao f350030e;

    /* renamed from: g */
    private byte f350031g = 2;

    static {
        C127122b bVar = new C127122b();
        f350024f = bVar;
        C62942bv.registerDefaultInstance(C127122b.class, bVar);
    }

    private C127122b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f350031g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f350031g = b;
                return null;
            case 2:
                return newMessageInfo(f350024f, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0003\u0002ဉ\u0000\u0003ᐉ\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C127122b();
            case 4:
                return new C127121a();
            case 5:
                return f350024f;
            case 6:
                C63010eb ebVar = f350025h;
                if (ebVar == null) {
                    synchronized (C127122b.class) {
                        ebVar = f350025h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350024f);
                            f350025h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
