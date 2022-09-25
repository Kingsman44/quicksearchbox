package com.google.protos.p4816ai.p4817a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.a.g */
/* compiled from: PG */
public final class C63193g extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C63193g f170718h;

    /* renamed from: j */
    private static volatile C63010eb f170719j;

    /* renamed from: a */
    public int f170720a;

    /* renamed from: b */
    public int f170721b;

    /* renamed from: c */
    public String f170722c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C60218r f170723d;

    /* renamed from: e */
    public String f170724e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f170725f = emptyProtobufList();

    /* renamed from: g */
    public int f170726g;

    /* renamed from: i */
    private byte f170727i = 2;

    static {
        C63193g gVar = new C63193g();
        f170718h = gVar;
        C62942bv.registerDefaultInstance(C63193g.class, gVar);
    }

    private C63193g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f170727i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f170727i = b;
                return null;
            case 2:
                return newMessageInfo(f170718h, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0001\u0002\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0004Л\u0005င\u0004\u0011ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, C63192f.class, C30325g.f82003a, "d"});
            case 3:
                return new C63193g();
            case 4:
                return new C63187a();
            case 5:
                return f170718h;
            case 6:
                C63010eb ebVar = f170719j;
                if (ebVar == null) {
                    synchronized (C63193g.class) {
                        ebVar = f170719j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170718h);
                            f170719j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
