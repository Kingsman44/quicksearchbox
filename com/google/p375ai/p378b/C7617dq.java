package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.dq */
/* compiled from: PG */
public final class C7617dq extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C7617dq f26317h;

    /* renamed from: i */
    private static volatile C63010eb f26318i;

    /* renamed from: a */
    public int f26319a;

    /* renamed from: b */
    public String f26320b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f26321c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f26322d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f26323e;

    /* renamed from: f */
    public boolean f26324f;

    /* renamed from: g */
    public C62971cq f26325g = C62942bv.emptyProtobufList();

    static {
        C7617dq dqVar = new C7617dq();
        f26317h = dqVar;
        C62942bv.registerDefaultInstance(C7617dq.class, dqVar);
    }

    private C7617dq() {
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
                return newMessageInfo(f26317h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006\u001a", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C7617dq();
            case 4:
                return new C7616dp();
            case 5:
                return f26317h;
            case 6:
                C63010eb ebVar = f26318i;
                if (ebVar == null) {
                    synchronized (C7617dq.class) {
                        ebVar = f26318i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26317h);
                            f26318i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
