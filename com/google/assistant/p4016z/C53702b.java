package com.google.assistant.p4016z;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3860as.C49792f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.b */
/* compiled from: PG */
public final class C53702b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53702b f140971f;

    /* renamed from: g */
    private static volatile C63010eb f140972g;

    /* renamed from: a */
    public int f140973a;

    /* renamed from: b */
    public C62964ck f140974b = emptyLongList();

    /* renamed from: c */
    public C49792f f140975c;

    /* renamed from: d */
    public C62971cq f140976d = emptyProtobufList();

    /* renamed from: e */
    public C62961ch f140977e = emptyIntList();

    static {
        C53702b bVar = new C53702b();
        f140971f = bVar;
        C62942bv.registerDefaultInstance(C53702b.class, bVar);
    }

    private C53702b() {
    }

    /* renamed from: a */
    public final void mo54007a() {
        C62971cq cqVar = this.f140976d;
        if (!cqVar.mo58948c()) {
            this.f140976d = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f140971f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0003\u0000\u0002\u0015\u0003\u001b\u0004ဉ\u0000\u0005\u001d", new Object[]{"a", "b", "d", C53719d.class, C45240c.f118157a, "e"});
            case 3:
                return new C53702b();
            case 4:
                return new C53675a();
            case 5:
                return f140971f;
            case 6:
                C63010eb ebVar = f140972g;
                if (ebVar == null) {
                    synchronized (C53702b.class) {
                        ebVar = f140972g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140971f);
                            f140972g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
