package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.p */
/* compiled from: PG */
public final class C65558p extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C65558p f178153h;

    /* renamed from: i */
    private static volatile C63010eb f178154i;

    /* renamed from: a */
    public int f178155a;

    /* renamed from: b */
    public int f178156b;

    /* renamed from: c */
    public String f178157c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C65555m f178158d;

    /* renamed from: e */
    public boolean f178159e;

    /* renamed from: f */
    public C65551i f178160f;

    /* renamed from: g */
    public int f178161g;

    static {
        C65558p pVar = new C65558p();
        f178153h = pVar;
        C62942bv.registerDefaultInstance(C65558p.class, pVar);
    }

    private C65558p() {
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
                return newMessageInfo(f178153h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဉ\u0002\u0003ဌ\u0000\u0004ဉ\u0004\u0005င\u0005\u0006ဇ\u0003", new Object[]{"a", C45240c.f118157a, "d", "b", C65557o.m96725b(), C10662f.f35572a, C30325g.f82003a, "e"});
            case 3:
                return new C65558p();
            case 4:
                return new C65553k();
            case 5:
                return f178153h;
            case 6:
                C63010eb ebVar = f178154i;
                if (ebVar == null) {
                    synchronized (C65558p.class) {
                        ebVar = f178154i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178153h);
                            f178154i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
