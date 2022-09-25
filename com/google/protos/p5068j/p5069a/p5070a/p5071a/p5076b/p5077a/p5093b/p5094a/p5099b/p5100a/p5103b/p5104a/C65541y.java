package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63037fb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.y */
/* compiled from: PG */
public final class C65541y extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65541y f178123e;

    /* renamed from: h */
    private static volatile C63010eb f178124h;

    /* renamed from: a */
    public String f178125a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f178126b;

    /* renamed from: c */
    public String f178127c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public double f178128d;

    /* renamed from: f */
    private C63037fb f178129f;

    /* renamed from: g */
    private C63037fb f178130g;

    static {
        C65541y yVar = new C65541y();
        f178123e = yVar;
        C62942bv.registerDefaultInstance(C65541y.class, yVar);
    }

    private C65541y() {
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
                return newMessageInfo(f178123e, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003Ȉ\u0004\u0000\u0005\t\u0006\t", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C65541y();
            case 4:
                return new C65540x();
            case 5:
                return f178123e;
            case 6:
                C63010eb ebVar = f178124h;
                if (ebVar == null) {
                    synchronized (C65541y.class) {
                        ebVar = f178124h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178123e);
                            f178124h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
