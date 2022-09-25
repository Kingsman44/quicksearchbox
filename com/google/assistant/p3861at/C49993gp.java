package com.google.assistant.p3861at;

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

/* renamed from: com.google.assistant.at.gp */
/* compiled from: PG */
public final class C49993gp extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C49993gp f129949h;

    /* renamed from: j */
    private static volatile C63010eb f129950j;

    /* renamed from: a */
    public String f129951a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f129952b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f129953c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f129954d = true;

    /* renamed from: e */
    public C62971cq f129955e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public String f129956f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f129957g = BuildConfig.FLAVOR;

    /* renamed from: i */
    private int f129958i;

    static {
        C49993gp gpVar = new C49993gp();
        f129949h = gpVar;
        C62942bv.registerDefaultInstance(C49993gp.class, gpVar);
    }

    private C49993gp() {
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
                return newMessageInfo(f129949h, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0006\u0005ဇ\u0003\u0007ဈ\u0007\n\u001a", new Object[]{"i", "a", "b", C45240c.f118157a, C10662f.f35572a, "d", C30325g.f82003a, "e"});
            case 3:
                return new C49993gp();
            case 4:
                return new C49992go();
            case 5:
                return f129949h;
            case 6:
                C63010eb ebVar = f129950j;
                if (ebVar == null) {
                    synchronized (C49993gp.class) {
                        ebVar = f129950j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129949h);
                            f129950j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
