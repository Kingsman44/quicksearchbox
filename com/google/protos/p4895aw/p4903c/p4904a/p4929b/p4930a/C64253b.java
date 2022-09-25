package com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4930a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57695ab;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.youtube.elements.C66260r;

/* renamed from: com.google.protos.aw.c.a.b.a.b */
/* compiled from: PG */
public final class C64253b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C64253b f173731g;

    /* renamed from: h */
    private static volatile C63010eb f173732h;

    /* renamed from: a */
    public int f173733a;

    /* renamed from: b */
    public int f173734b;

    /* renamed from: c */
    public int f173735c;

    /* renamed from: d */
    public int f173736d;

    /* renamed from: e */
    public String f173737e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f173738f;

    static {
        C64253b bVar = new C64253b();
        f173731g = bVar;
        C62942bv.registerDefaultInstance(C64253b.class, bVar);
    }

    private C64253b() {
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
                return newMessageInfo(f173731g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004", new Object[]{"a", "b", C66260r.m96845b(), C45240c.f118157a, C57695ab.m88521b(), "d", "e", C10662f.f35572a});
            case 3:
                return new C64253b();
            case 4:
                return new C64252a();
            case 5:
                return f173731g;
            case 6:
                C63010eb ebVar = f173732h;
                if (ebVar == null) {
                    synchronized (C64253b.class) {
                        ebVar = f173732h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173731g);
                            f173732h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
