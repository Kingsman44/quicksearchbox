package com.google.protos.p4985f.p5030q;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.eb */
/* compiled from: PG */
public final class C65168eb extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C65168eb f176363h;

    /* renamed from: i */
    private static volatile C63010eb f176364i;

    /* renamed from: a */
    public String f176365a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f176366b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f176367c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f176368d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f176369e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f176370f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f176371g = BuildConfig.FLAVOR;

    static {
        C65168eb ebVar = new C65168eb();
        f176363h = ebVar;
        C62942bv.registerDefaultInstance(C65168eb.class, ebVar);
    }

    private C65168eb() {
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
                return newMessageInfo(f176363h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C30325g.f82003a, C45240c.f118157a});
            case 3:
                return new C65168eb();
            case 4:
                return new C65167ea();
            case 5:
                return f176363h;
            case 6:
                C63010eb ebVar = f176364i;
                if (ebVar == null) {
                    synchronized (C65168eb.class) {
                        ebVar = f176364i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176363h);
                            f176364i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
