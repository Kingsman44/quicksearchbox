package com.google.android.gms.p10747b.p10748a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.b.a.f */
/* compiled from: PG */
public final class C142958f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C142958f f387881f;

    /* renamed from: h */
    private static volatile C63010eb f387882h;

    /* renamed from: a */
    public int f387883a;

    /* renamed from: b */
    public String f387884b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f387885c;

    /* renamed from: d */
    public C62971cq f387886d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public boolean f387887e;

    /* renamed from: g */
    private int f387888g;

    static {
        C142958f fVar = new C142958f();
        f387881f = fVar;
        C62942bv.registerDefaultInstance(C142958f.class, fVar);
    }

    private C142958f() {
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
                return newMessageInfo(f387881f, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003င\u0000\u0004Ț\u0005\u0007", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C142958f();
            case 4:
                return new C142957e();
            case 5:
                return f387881f;
            case 6:
                C63010eb ebVar = f387882h;
                if (ebVar == null) {
                    synchronized (C142958f.class) {
                        ebVar = f387882h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f387881f);
                            f387882h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
