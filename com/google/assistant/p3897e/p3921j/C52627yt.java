package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.yt */
/* compiled from: PG */
public final class C52627yt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52627yt f138176c;

    /* renamed from: d */
    private static volatile C63010eb f138177d;

    /* renamed from: a */
    public C62964ck f138178a = emptyLongList();

    /* renamed from: b */
    public C62971cq f138179b = emptyProtobufList();

    static {
        C52627yt ytVar = new C52627yt();
        f138176c = ytVar;
        C62942bv.registerDefaultInstance(C52627yt.class, ytVar);
    }

    private C52627yt() {
    }

    /* renamed from: a */
    public final void mo53903a() {
        C62964ck ckVar = this.f138178a;
        if (!ckVar.mo58948c()) {
            this.f138178a = C62942bv.mutableCopy(ckVar);
        }
    }

    /* renamed from: b */
    public final void mo53904b() {
        C62971cq cqVar = this.f138179b;
        if (!cqVar.mo58948c()) {
            this.f138179b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f138176c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u0014\u0002\u001b", new Object[]{"a", "b", C52617yj.class});
            case 3:
                return new C52627yt();
            case 4:
                return new C52626ys();
            case 5:
                return f138176c;
            case 6:
                C63010eb ebVar = f138177d;
                if (ebVar == null) {
                    synchronized (C52627yt.class) {
                        ebVar = f138177d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138176c);
                            f138177d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
