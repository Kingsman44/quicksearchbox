package com.google.android.apps.search.assistant.verticals.contextdebug.p10039b;

import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50540h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.contextdebug.b.b */
/* compiled from: PG */
public final class C132031b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C132031b f360388c;

    /* renamed from: e */
    private static volatile C63010eb f360389e;

    /* renamed from: a */
    public int f360390a;

    /* renamed from: b */
    public C50540h f360391b;

    /* renamed from: d */
    private byte f360392d = 2;

    static {
        C132031b bVar = new C132031b();
        f360388c = bVar;
        C62942bv.registerDefaultInstance(C132031b.class, bVar);
    }

    private C132031b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f360392d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f360392d = b;
                return null;
            case 2:
                return newMessageInfo(f360388c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C132031b();
            case 4:
                return new C132030a();
            case 5:
                return f360388c;
            case 6:
                C63010eb ebVar = f360389e;
                if (ebVar == null) {
                    synchronized (C132031b.class) {
                        ebVar = f360389e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f360388c);
                            f360389e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
