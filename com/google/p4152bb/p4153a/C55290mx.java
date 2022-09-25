package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.mx */
/* compiled from: PG */
public final class C55290mx extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C55290mx f145635e;

    /* renamed from: f */
    public static final C62940bt f145636f;

    /* renamed from: h */
    private static volatile C63010eb f145637h;

    /* renamed from: a */
    public int f145638a;

    /* renamed from: b */
    public String f145639b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f145640c;

    /* renamed from: d */
    public C62971cq f145641d = emptyProtobufList();

    /* renamed from: g */
    private byte f145642g = 2;

    static {
        C55290mx mxVar = new C55290mx();
        f145635e = mxVar;
        C62942bv.registerDefaultInstance(C55290mx.class, mxVar);
        f145636f = C62942bv.newSingularGeneratedExtension(C55213ka.f145356g, mxVar, mxVar, (C62958ce) null, 1000, C63066gd.MESSAGE, C55290mx.class);
    }

    private C55290mx() {
    }

    /* renamed from: a */
    public final void mo54232a() {
        C62971cq cqVar = this.f145641d;
        if (!cqVar.mo58948c()) {
            this.f145641d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145642g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145642g = b;
                return null;
            case 2:
                return newMessageInfo(f145635e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0001\u0002ဈ\u0000\u0003ဌ\u0001\u0004Л", new Object[]{"a", "b", C45240c.f118157a, C55288mv.f145634a, "d", C55136he.class});
            case 3:
                return new C55290mx();
            case 4:
                return new C55287mu();
            case 5:
                return f145635e;
            case 6:
                C63010eb ebVar = f145637h;
                if (ebVar == null) {
                    synchronized (C55290mx.class) {
                        ebVar = f145637h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145635e);
                            f145637h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
