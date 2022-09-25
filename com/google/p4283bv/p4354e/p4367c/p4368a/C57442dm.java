package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.dm */
/* compiled from: PG */
public final class C57442dm extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57442dm f153433e;

    /* renamed from: g */
    private static volatile C63010eb f153434g;

    /* renamed from: a */
    public int f153435a;

    /* renamed from: b */
    public String f153436b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f153437c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f153438d = emptyProtobufList();

    /* renamed from: f */
    private byte f153439f = 2;

    static {
        C57442dm dmVar = new C57442dm();
        f153433e = dmVar;
        C62942bv.registerDefaultInstance(C57442dm.class, dmVar);
    }

    private C57442dm() {
    }

    /* renamed from: a */
    public final void mo54486a() {
        C62971cq cqVar = this.f153437c;
        if (!cqVar.mo58948c()) {
            this.f153437c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153439f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153439f = b;
                return null;
            case 2:
                return newMessageInfo(f153433e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001ဈ\u0000\u0002Л\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C57472ep.class, "d", C57430da.class});
            case 3:
                return new C57442dm();
            case 4:
                return new C57441dl();
            case 5:
                return f153433e;
            case 6:
                C63010eb ebVar = f153434g;
                if (ebVar == null) {
                    synchronized (C57442dm.class) {
                        ebVar = f153434g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153433e);
                            f153434g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
