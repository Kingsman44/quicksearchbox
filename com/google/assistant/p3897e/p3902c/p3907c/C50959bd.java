package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.bd */
/* compiled from: PG */
public final class C50959bd extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50959bd f132657e;

    /* renamed from: g */
    private static volatile C63010eb f132658g;

    /* renamed from: a */
    public int f132659a;

    /* renamed from: b */
    public C62971cq f132660b = emptyProtobufList();

    /* renamed from: c */
    public String f132661c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f132662d;

    /* renamed from: f */
    private byte f132663f = 2;

    static {
        C50959bd bdVar = new C50959bd();
        f132657e = bdVar;
        C62942bv.registerDefaultInstance(C50959bd.class, bdVar);
    }

    private C50959bd() {
    }

    /* renamed from: a */
    public final void mo53494a() {
        C62971cq cqVar = this.f132660b;
        if (!cqVar.mo58948c()) {
            this.f132660b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132663f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132663f = b;
                return null;
            case 2:
                return newMessageInfo(f132657e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000\u0003ဌ\u0001", new Object[]{"a", "b", C50954az.class, C45240c.f118157a, "d", C50957bb.f132656a});
            case 3:
                return new C50959bd();
            case 4:
                return new C50956ba();
            case 5:
                return f132657e;
            case 6:
                C63010eb ebVar = f132658g;
                if (ebVar == null) {
                    synchronized (C50959bd.class) {
                        ebVar = f132658g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132657e);
                            f132658g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
