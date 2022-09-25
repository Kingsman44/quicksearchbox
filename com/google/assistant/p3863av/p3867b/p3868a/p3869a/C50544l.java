package com.google.assistant.p3863av.p3867b.p3868a.p3869a;

import com.google.android.libraries.search.assistant.p2566g.C33423r;
import com.google.android.libraries.search.assistant.p2566g.C33425t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.b.a.a.l */
/* compiled from: PG */
public final class C50544l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f131545b = new C50542j();

    /* renamed from: d */
    public static final C50544l f131546d;

    /* renamed from: g */
    private static volatile C63010eb f131547g;

    /* renamed from: a */
    public C62961ch f131548a = emptyIntList();

    /* renamed from: c */
    public C33423r f131549c;

    /* renamed from: e */
    private int f131550e;

    /* renamed from: f */
    private byte f131551f = 2;

    static {
        C50544l lVar = new C50544l();
        f131546d = lVar;
        C62942bv.registerDefaultInstance(C50544l.class, lVar);
    }

    private C50544l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f131551f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f131551f = b;
                return null;
            case 2:
                return newMessageInfo(f131546d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001,\u0002ᐉ\u0000", new Object[]{"e", "a", C33425t.m62010b(), C45240c.f118157a});
            case 3:
                return new C50544l();
            case 4:
                return new C50543k();
            case 5:
                return f131546d;
            case 6:
                C63010eb ebVar = f131547g;
                if (ebVar == null) {
                    synchronized (C50544l.class) {
                        ebVar = f131547g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131546d);
                            f131547g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
