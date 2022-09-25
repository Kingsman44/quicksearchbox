package com.google.android.libraries.assistant.auto.tng.media.p1053d.p1059d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.d.d.b */
/* compiled from: PG */
public final class C14002b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14002b f42599c;

    /* renamed from: d */
    private static volatile C63010eb f42600d;

    /* renamed from: a */
    public int f42601a;

    /* renamed from: b */
    public String f42602b = BuildConfig.FLAVOR;

    static {
        C14002b bVar = new C14002b();
        f42599c = bVar;
        C62942bv.registerDefaultInstance(C14002b.class, bVar);
    }

    private C14002b() {
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
                return newMessageInfo(f42599c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C14002b();
            case 4:
                return new C14001a();
            case 5:
                return f42599c;
            case 6:
                C63010eb ebVar = f42600d;
                if (ebVar == null) {
                    synchronized (C14002b.class) {
                        ebVar = f42600d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f42599c);
                            f42600d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
