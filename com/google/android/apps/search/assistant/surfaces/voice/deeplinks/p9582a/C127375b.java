package com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a;

import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b.C127418e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.b */
/* compiled from: PG */
public final class C127375b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127375b f350745c;

    /* renamed from: e */
    private static volatile C63010eb f350746e;

    /* renamed from: a */
    public int f350747a = 0;

    /* renamed from: b */
    public Object f350748b;

    /* renamed from: d */
    private byte f350749d = 2;

    static {
        C127375b bVar = new C127375b();
        f350745c = bVar;
        C62942bv.registerDefaultInstance(C127375b.class, bVar);
    }

    private C127375b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f350749d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f350749d = b;
                return null;
            case 2:
                return newMessageInfo(f350745c, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001м\u0000", new Object[]{"b", "a", C127418e.class});
            case 3:
                return new C127375b();
            case 4:
                return new C127372a();
            case 5:
                return f350745c;
            case 6:
                C63010eb ebVar = f350746e;
                if (ebVar == null) {
                    synchronized (C127375b.class) {
                        ebVar = f350746e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350745c);
                            f350746e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
