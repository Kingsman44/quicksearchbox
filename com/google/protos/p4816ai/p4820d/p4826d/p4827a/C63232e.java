package com.google.protos.p4816ai.p4820d.p4826d.p4827a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.d.a.e */
/* compiled from: PG */
public final class C63232e extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C63232e f170833g;

    /* renamed from: h */
    private static volatile C63010eb f170834h;

    /* renamed from: a */
    public int f170835a;

    /* renamed from: b */
    public int f170836b;

    /* renamed from: c */
    public boolean f170837c;

    /* renamed from: d */
    public String f170838d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f170839e;

    /* renamed from: f */
    public String f170840f = BuildConfig.FLAVOR;

    static {
        C63232e eVar = new C63232e();
        f170833g = eVar;
        C62942bv.registerDefaultInstance(C63232e.class, eVar);
    }

    private C63232e() {
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
                return newMessageInfo(f170833g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C63242o.m96213b(), C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C63232e();
            case 4:
                return new C63231d();
            case 5:
                return f170833g;
            case 6:
                C63010eb ebVar = f170834h;
                if (ebVar == null) {
                    synchronized (C63232e.class) {
                        ebVar = f170834h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170833g);
                            f170834h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
