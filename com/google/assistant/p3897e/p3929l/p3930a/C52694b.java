package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.b */
/* compiled from: PG */
public final class C52694b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52694b f138336c;

    /* renamed from: e */
    private static volatile C63010eb f138337e;

    /* renamed from: a */
    public boolean f138338a = true;

    /* renamed from: b */
    public boolean f138339b = true;

    /* renamed from: d */
    private int f138340d;

    static {
        C52694b bVar = new C52694b();
        f138336c = bVar;
        C62942bv.registerDefaultInstance(C52694b.class, bVar);
    }

    private C52694b() {
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
                return newMessageInfo(f138336c, "\u0001\u0002\u0000\u0001\n\u000b\u0002\u0000\u0000\u0000\nဇ\t\u000bဇ\n", new Object[]{"d", "a", "b"});
            case 3:
                return new C52694b();
            case 4:
                return new C52667a();
            case 5:
                return f138336c;
            case 6:
                C63010eb ebVar = f138337e;
                if (ebVar == null) {
                    synchronized (C52694b.class) {
                        ebVar = f138337e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138336c);
                            f138337e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
