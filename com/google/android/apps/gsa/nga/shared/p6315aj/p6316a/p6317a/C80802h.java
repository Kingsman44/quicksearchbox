package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128543h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.h */
/* compiled from: PG */
public final class C80802h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80802h f221723c;

    /* renamed from: d */
    private static volatile C63010eb f221724d;

    /* renamed from: a */
    public int f221725a = 0;

    /* renamed from: b */
    public Object f221726b;

    static {
        C80802h hVar = new C80802h();
        f221723c = hVar;
        C62942bv.registerDefaultInstance(C80802h.class, hVar);
    }

    private C80802h() {
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
                return newMessageInfo(f221723c, "\u0000\b\u0001\u0000\u0001\u000b\b\u0000\u0000\u0000\u0001<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000", new Object[]{"b", "a", C80772et.class, C128543h.class, C80796fq.class, C80754eb.class, C80750dy.class, C80760eh.class, C80712cn.class, C80725d.class});
            case 3:
                return new C80802h();
            case 4:
                return new C80801g();
            case 5:
                return f221723c;
            case 6:
                C63010eb ebVar = f221724d;
                if (ebVar == null) {
                    synchronized (C80802h.class) {
                        ebVar = f221724d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221723c);
                            f221724d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
