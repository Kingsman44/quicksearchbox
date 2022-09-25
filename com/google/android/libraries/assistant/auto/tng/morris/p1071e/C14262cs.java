package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.cs */
/* compiled from: PG */
public final class C14262cs extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C14262cs f43141g;

    /* renamed from: h */
    private static volatile C63010eb f43142h;

    /* renamed from: a */
    public C14260cq f43143a;

    /* renamed from: b */
    public C14260cq f43144b;

    /* renamed from: c */
    public C14260cq f43145c;

    /* renamed from: d */
    public String f43146d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f43147e;

    /* renamed from: f */
    public boolean f43148f;

    static {
        C14262cs csVar = new C14262cs();
        f43141g = csVar;
        C62942bv.registerDefaultInstance(C14262cs.class, csVar);
    }

    private C14262cs() {
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
                return newMessageInfo(f43141g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001\t\u0002\t\u0004\t\u0005Ȉ\u0006\u0007\u0007\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C14262cs();
            case 4:
                return new C14261cr();
            case 5:
                return f43141g;
            case 6:
                C63010eb ebVar = f43142h;
                if (ebVar == null) {
                    synchronized (C14262cs.class) {
                        ebVar = f43142h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43141g);
                            f43142h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
