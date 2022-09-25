package com.google.android.apps.search.assistant.verticals.newsplayer.p10067d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.d.b */
/* compiled from: PG */
public final class C132415b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C132415b f361420c;

    /* renamed from: d */
    private static volatile C63010eb f361421d;

    /* renamed from: a */
    public int f361422a;

    /* renamed from: b */
    public float f361423b;

    static {
        C132415b bVar = new C132415b();
        f361420c = bVar;
        C62942bv.registerDefaultInstance(C132415b.class, bVar);
    }

    private C132415b() {
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
                return newMessageInfo(f361420c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C132415b();
            case 4:
                return new C132414a();
            case 5:
                return f361420c;
            case 6:
                C63010eb ebVar = f361421d;
                if (ebVar == null) {
                    synchronized (C132415b.class) {
                        ebVar = f361421d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f361420c);
                            f361421d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
