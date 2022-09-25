package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.eq */
/* compiled from: PG */
public final class C7644eq extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C7644eq f26534e;

    /* renamed from: g */
    private static volatile C63010eb f26535g;

    /* renamed from: a */
    public int f26536a;

    /* renamed from: b */
    public String f26537b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f26538c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f26539d = emptyProtobufList();

    /* renamed from: f */
    private byte f26540f = 2;

    static {
        C7644eq eqVar = new C7644eq();
        f26534e = eqVar;
        C62942bv.registerDefaultInstance(C7644eq.class, eqVar);
    }

    private C7644eq() {
    }

    /* renamed from: a */
    public final void mo16933a() {
        C62971cq cqVar = this.f26539d;
        if (!cqVar.mo58948c()) {
            this.f26539d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26540f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26540f = b;
                return null;
            case 2:
                return newMessageInfo(f26534e, "\u0001\u0003\u0000\u0001\u0002\u000b\u0003\u0000\u0002\u0001\u0002ဈ\u0000\u0003\u001b\u000bЛ", new Object[]{"a", "b", C45240c.f118157a, C7832lp.class, "d", C7704gw.class});
            case 3:
                return new C7644eq();
            case 4:
                return new C7643ep();
            case 5:
                return f26534e;
            case 6:
                C63010eb ebVar = f26535g;
                if (ebVar == null) {
                    synchronized (C7644eq.class) {
                        ebVar = f26535g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26534e);
                            f26535g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
