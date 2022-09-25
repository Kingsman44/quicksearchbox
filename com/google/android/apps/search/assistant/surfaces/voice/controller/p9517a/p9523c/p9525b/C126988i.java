package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.b.i */
/* compiled from: PG */
public final class C126988i extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C126988i f349669h;

    /* renamed from: j */
    private static volatile C63010eb f349670j;

    /* renamed from: a */
    public int f349671a;

    /* renamed from: b */
    public int f349672b = 0;

    /* renamed from: c */
    public Object f349673c;

    /* renamed from: d */
    public int f349674d = 0;

    /* renamed from: e */
    public Object f349675e;

    /* renamed from: f */
    public int f349676f;

    /* renamed from: g */
    public C119834cb f349677g;

    /* renamed from: i */
    private byte f349678i = 2;

    static {
        C126988i iVar = new C126988i();
        f349669h = iVar;
        C62942bv.registerDefaultInstance(C126988i.class, iVar);
    }

    private C126988i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f349678i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f349678i = b;
                return null;
            case 2:
                return newMessageInfo(f349669h, "\u0001\n\u0002\u0001\u0001\n\n\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐼ\u0000\u0003ဿ\u0000\u0004ဉ\u0004\u0005ဿ\u0000\u0006ြ\u0001\u0007ြ\u0001\bြ\u0001\tြ\u0001\nြ\u0001", new Object[]{C45240c.f118157a, "b", "e", "d", "a", C10662f.f35572a, C126985f.m207728b(), C34822b.class, C126998s.m207733b(), C30325g.f82003a, C126994o.m207731b(), C126983d.class, C126992m.class, C126996q.class, C126990k.class, C127000u.class});
            case 3:
                return new C126988i();
            case 4:
                return new C126986g();
            case 5:
                return f349669h;
            case 6:
                C63010eb ebVar = f349670j;
                if (ebVar == null) {
                    synchronized (C126988i.class) {
                        ebVar = f349670j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f349669h);
                            f349670j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
