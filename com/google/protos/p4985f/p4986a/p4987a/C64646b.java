package com.google.protos.p4985f.p4986a.p4987a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p4986a.C64653ag;
import com.google.protos.p4985f.p4986a.C64683bj;
import com.google.protos.p4985f.p5001d.C64820b;

/* renamed from: com.google.protos.f.a.a.b */
/* compiled from: PG */
public final class C64646b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C64646b f175230g;

    /* renamed from: h */
    private static volatile C63010eb f175231h;

    /* renamed from: a */
    public int f175232a;

    /* renamed from: b */
    public String f175233b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f175234c;

    /* renamed from: d */
    public C64683bj f175235d;

    /* renamed from: e */
    public int f175236e;

    /* renamed from: f */
    public C62971cq f175237f = emptyProtobufList();

    static {
        C64646b bVar = new C64646b();
        f175230g = bVar;
        C62942bv.registerDefaultInstance(C64646b.class, bVar);
    }

    private C64646b() {
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
                return newMessageInfo(f175230g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C64820b.m96467b(), C10662f.f35572a, C64653ag.class});
            case 3:
                return new C64646b();
            case 4:
                return new C64645a();
            case 5:
                return f175230g;
            case 6:
                C63010eb ebVar = f175231h;
                if (ebVar == null) {
                    synchronized (C64646b.class) {
                        ebVar = f175231h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175230g);
                            f175231h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
