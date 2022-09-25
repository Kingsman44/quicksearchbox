package com.google.knowledge.p4661a.p4662a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.C61765b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.a.a.n */
/* compiled from: PG */
public final class C61752n extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C61752n f166808f;

    /* renamed from: h */
    private static volatile C63010eb f166809h;

    /* renamed from: a */
    public int f166810a;

    /* renamed from: b */
    public String f166811b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f166812c = emptyProtobufList();

    /* renamed from: d */
    public C61754p f166813d;

    /* renamed from: e */
    public C61765b f166814e;

    /* renamed from: g */
    private byte f166815g = 2;

    static {
        C61752n nVar = new C61752n();
        f166808f = nVar;
        C62942bv.registerDefaultInstance(C61752n.class, nVar);
    }

    private C61752n() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo58189a() {
        C62971cq cqVar = this.f166812c;
        if (!cqVar.mo58948c()) {
            this.f166812c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166815g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166815g = b;
                return null;
            case 2:
                return newMessageInfo(f166808f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0002\u0001ဈ\u0002\u0002Л\u0004ᐉ\u0003\u0007ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, C61746h.class, "d", "e"});
            case 3:
                return new C61752n();
            case 4:
                return new C61751m();
            case 5:
                return f166808f;
            case 6:
                C63010eb ebVar = f166809h;
                if (ebVar == null) {
                    synchronized (C61752n.class) {
                        ebVar = f166809h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166808f);
                            f166809h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
