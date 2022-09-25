package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3994s.p3995a.C53424nj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.cl */
/* compiled from: PG */
public final class C123772cl extends C62937bq implements C62938br {

    /* renamed from: h */
    public static final C123772cl f341902h;

    /* renamed from: j */
    private static volatile C63010eb f341903j;

    /* renamed from: a */
    public int f341904a;

    /* renamed from: b */
    public int f341905b;

    /* renamed from: c */
    public C63204j f341906c;

    /* renamed from: d */
    public C53424nj f341907d;

    /* renamed from: e */
    public boolean f341908e;

    /* renamed from: f */
    public String f341909f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C63088z f341910g = C63088z.f170246b;

    /* renamed from: i */
    private byte f341911i = 2;

    static {
        C123772cl clVar = new C123772cl();
        f341902h = clVar;
        C62942bv.registerDefaultInstance(C123772cl.class, clVar);
    }

    private C123772cl() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f341911i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f341911i = b;
                return null;
            case 2:
                return newMessageInfo(f341902h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0002\u0001င\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\tည\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C123772cl();
            case 4:
                return new C123771ck();
            case 5:
                return f341902h;
            case 6:
                C63010eb ebVar = f341903j;
                if (ebVar == null) {
                    synchronized (C123772cl.class) {
                        ebVar = f341903j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341902h);
                            f341903j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
