package com.google.protos.p4883as.p4884a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.as.a.d */
/* compiled from: PG */
public final class C63775d extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C63775d f172518h;

    /* renamed from: i */
    private static volatile C63010eb f172519i;

    /* renamed from: a */
    public int f172520a;

    /* renamed from: b */
    public String f172521b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f172522c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f172523d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public float f172524e;

    /* renamed from: f */
    public C62971cq f172525f = emptyProtobufList();

    /* renamed from: g */
    public String f172526g;

    static {
        C63775d dVar = new C63775d();
        f172518h = dVar;
        C62942bv.registerDefaultInstance(C63775d.class, dVar);
    }

    private C63775d() {
        C62942bv.emptyProtobufList();
        this.f172526g = BuildConfig.FLAVOR;
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
                return newMessageInfo(f172518h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ခ\u0003\u0005\u001b\u0006ဈ\u0001\tဈ\u0006", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C63774c.class, C45240c.f118157a, C30325g.f82003a});
            case 3:
                return new C63775d();
            case 4:
                return new C63772a();
            case 5:
                return f172518h;
            case 6:
                C63010eb ebVar = f172519i;
                if (ebVar == null) {
                    synchronized (C63775d.class) {
                        ebVar = f172519i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172518h);
                            f172519i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
