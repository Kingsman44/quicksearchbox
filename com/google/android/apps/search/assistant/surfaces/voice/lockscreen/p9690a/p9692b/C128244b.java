package com.google.android.apps.search.assistant.surfaces.voice.lockscreen.p9690a.p9692b;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.lockscreen.a.b.b */
/* compiled from: PG */
public final class C128244b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C128244b f352749e;

    /* renamed from: g */
    private static volatile C63010eb f352750g;

    /* renamed from: a */
    public int f352751a;

    /* renamed from: b */
    public C127289i f352752b;

    /* renamed from: c */
    public boolean f352753c;

    /* renamed from: d */
    public boolean f352754d;

    /* renamed from: f */
    private byte f352755f = 2;

    static {
        C128244b bVar = new C128244b();
        f352749e = bVar;
        C62942bv.registerDefaultInstance(C128244b.class, bVar);
    }

    private C128244b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f352755f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f352755f = b;
                return null;
            case 2:
                return newMessageInfo(f352749e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C128244b();
            case 4:
                return new C128243a();
            case 5:
                return f352749e;
            case 6:
                C63010eb ebVar = f352750g;
                if (ebVar == null) {
                    synchronized (C128244b.class) {
                        ebVar = f352750g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352749e);
                            f352750g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
