package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.c.z */
/* compiled from: PG */
public final class C127166z extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C127166z f350092g;

    /* renamed from: i */
    private static volatile C63010eb f350093i;

    /* renamed from: a */
    public int f350094a;

    /* renamed from: b */
    public C51809dy f350095b;

    /* renamed from: c */
    public C62910ar f350096c;

    /* renamed from: d */
    public C129676j f350097d;

    /* renamed from: e */
    public C127289i f350098e;

    /* renamed from: f */
    public C119793ao f350099f;

    /* renamed from: h */
    private byte f350100h = 2;

    static {
        C127166z zVar = new C127166z();
        f350092g = zVar;
        C62942bv.registerDefaultInstance(C127166z.class, zVar);
    }

    private C127166z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f350100h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f350100h = b;
                return null;
            case 2:
                return newMessageInfo(f350092g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C127166z();
            case 4:
                return new C127165y();
            case 5:
                return f350092g;
            case 6:
                C63010eb ebVar = f350093i;
                if (ebVar == null) {
                    synchronized (C127166z.class) {
                        ebVar = f350093i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350092g);
                            f350093i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
