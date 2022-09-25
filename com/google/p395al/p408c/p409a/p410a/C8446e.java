package com.google.p395al.p408c.p409a.p410a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4242bp.p4267h.C56415v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4958bd.C64438d;

/* renamed from: com.google.al.c.a.a.e */
/* compiled from: PG */
public final class C8446e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f29344b = new C8444c();

    /* renamed from: d */
    public static final C8446e f29345d;

    /* renamed from: g */
    private static volatile C63010eb f29346g;

    /* renamed from: a */
    public C62961ch f29347a;

    /* renamed from: c */
    public C56415v f29348c;

    /* renamed from: e */
    private int f29349e;

    /* renamed from: f */
    private byte f29350f = 2;

    static {
        C8446e eVar = new C8446e();
        f29345d = eVar;
        C62942bv.registerDefaultInstance(C8446e.class, eVar);
    }

    private C8446e() {
        C62942bv.emptyProtobufList();
        this.f29347a = emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29350f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29350f = b;
                return null;
            case 2:
                return newMessageInfo(f29345d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u001e\u0002ᐉ\u0000", new Object[]{"e", "a", C64438d.m96406b(), C45240c.f118157a});
            case 3:
                return new C8446e();
            case 4:
                return new C8445d();
            case 5:
                return f29345d;
            case 6:
                C63010eb ebVar = f29346g;
                if (ebVar == null) {
                    synchronized (C8446e.class) {
                        ebVar = f29346g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29345d);
                            f29346g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
