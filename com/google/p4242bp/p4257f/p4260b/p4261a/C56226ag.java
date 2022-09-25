package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.ag */
/* compiled from: PG */
public final class C56226ag extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56226ag f149762e;

    /* renamed from: f */
    private static volatile C63010eb f149763f;

    /* renamed from: a */
    public int f149764a;

    /* renamed from: b */
    public C62971cq f149765b = emptyProtobufList();

    /* renamed from: c */
    public String f149766c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f149767d = BuildConfig.FLAVOR;

    static {
        C56226ag agVar = new C56226ag();
        f149762e = agVar;
        C62942bv.registerDefaultInstance(C56226ag.class, agVar);
    }

    private C56226ag() {
        C62942bv.emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo54336a() {
        C62971cq cqVar = this.f149765b;
        if (!cqVar.mo58948c()) {
            this.f149765b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f149762e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", C56224ae.class, C45240c.f118157a, "d"});
            case 3:
                return new C56226ag();
            case 4:
                return new C56225af();
            case 5:
                return f149762e;
            case 6:
                C63010eb ebVar = f149763f;
                if (ebVar == null) {
                    synchronized (C56226ag.class) {
                        ebVar = f149763f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149762e);
                            f149763f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
