package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.pn */
/* compiled from: PG */
public final class C55361pn extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final C55361pn f145866g;

    /* renamed from: i */
    private static volatile C63010eb f145867i;

    /* renamed from: a */
    public int f145868a;

    /* renamed from: b */
    public String f145869b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f145870c;

    /* renamed from: d */
    public String f145871d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f145872e;

    /* renamed from: f */
    public int f145873f;

    /* renamed from: h */
    private byte f145874h = 2;

    static {
        C55361pn pnVar = new C55361pn();
        f145866g = pnVar;
        C62942bv.registerDefaultInstance(C55361pn.class, pnVar);
    }

    private C55361pn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145874h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145874h = b;
                return null;
            case 2:
                return newMessageInfo(f145866g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C55418u.f146030a, C10662f.f35572a, C55122gr.m87597b()});
            case 3:
                return new C55361pn();
            case 4:
                return new C55360pm();
            case 5:
                return f145866g;
            case 6:
                C63010eb ebVar = f145867i;
                if (ebVar == null) {
                    synchronized (C55361pn.class) {
                        ebVar = f145867i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145866g);
                            f145867i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
