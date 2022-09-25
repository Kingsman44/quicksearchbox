package com.google.p4281bu.p4282a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.cc */
/* compiled from: PG */
public final class C56546cc extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C56546cc f150991j;

    /* renamed from: k */
    private static volatile C63010eb f150992k;

    /* renamed from: a */
    public int f150993a = 0;

    /* renamed from: b */
    public Object f150994b;

    /* renamed from: c */
    public int f150995c;

    /* renamed from: d */
    public String f150996d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f150997e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f150998f = emptyProtobufList();

    /* renamed from: g */
    public int f150999g;

    /* renamed from: h */
    public boolean f151000h;

    /* renamed from: i */
    public C56544ca f151001i;

    static {
        C56546cc ccVar = new C56546cc();
        f150991j = ccVar;
        C62942bv.registerDefaultInstance(C56546cc.class, ccVar);
    }

    private C56546cc() {
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
                return newMessageInfo(f150991j, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u000b\u0002Ȉ\u0003\f\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0007\tȈ\n\u001b\u000b\t", new Object[]{"b", "a", C45240c.f118157a, "d", C30325g.f82003a, C56568cy.class, C56528bl.class, C56551ch.class, C56530bn.class, C19618h.f54585a, "e", C10662f.f35572a, C56573dc.class, "i"});
            case 3:
                return new C56546cc();
            case 4:
                return new C56541by();
            case 5:
                return f150991j;
            case 6:
                C63010eb ebVar = f150992k;
                if (ebVar == null) {
                    synchronized (C56546cc.class) {
                        ebVar = f150992k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150991j);
                            f150992k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
