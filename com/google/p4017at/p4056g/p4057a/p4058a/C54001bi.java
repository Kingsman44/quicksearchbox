package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56320r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.bi */
/* compiled from: PG */
public final class C54001bi extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54001bi f141671d;

    /* renamed from: f */
    private static volatile C63010eb f141672f;

    /* renamed from: a */
    public C56220aa f141673a;

    /* renamed from: b */
    public C62971cq f141674b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f141675c;

    /* renamed from: e */
    private byte f141676e = 2;

    static {
        C54001bi biVar = new C54001bi();
        f141671d = biVar;
        C62942bv.registerDefaultInstance(C54001bi.class, biVar);
    }

    private C54001bi() {
        emptyProtobufList();
        this.f141675c = emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141676e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141676e = b;
                return null;
            case 2:
                return newMessageInfo(f141671d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0002\u0001Љ\u0002\u001b\u0003Л", new Object[]{"a", "b", C54036cq.class, C45240c.f118157a, C56320r.class});
            case 3:
                return new C54001bi();
            case 4:
                return new C54000bh();
            case 5:
                return f141671d;
            case 6:
                C63010eb ebVar = f141672f;
                if (ebVar == null) {
                    synchronized (C54001bi.class) {
                        ebVar = f141672f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141671d);
                            f141672f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
