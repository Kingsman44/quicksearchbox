package com.google.android.apps.search.transcription.voiceime.p10680a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.transcription.voiceime.a.b */
/* compiled from: PG */
public final class C141959b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C141959b f385212c;

    /* renamed from: d */
    private static volatile C63010eb f385213d;

    /* renamed from: a */
    public int f385214a;

    /* renamed from: b */
    public long f385215b;

    static {
        C141959b bVar = new C141959b();
        f385212c = bVar;
        C62942bv.registerDefaultInstance(C141959b.class, bVar);
    }

    private C141959b() {
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
                return newMessageInfo(f385212c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C141959b();
            case 4:
                return new C141958a();
            case 5:
                return f385212c;
            case 6:
                C63010eb ebVar = f385213d;
                if (ebVar == null) {
                    synchronized (C141959b.class) {
                        ebVar = f385213d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f385212c);
                            f385213d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
