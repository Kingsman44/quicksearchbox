package com.google.research.p5181a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.research.a.ac */
/* compiled from: PG */
public final class C66298ac extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C66298ac f180295h;

    /* renamed from: i */
    private static volatile C63010eb f180296i;

    /* renamed from: a */
    public int f180297a;

    /* renamed from: b */
    public long f180298b;

    /* renamed from: c */
    public long f180299c;

    /* renamed from: d */
    public long f180300d;

    /* renamed from: e */
    public String f180301e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public long f180302f;

    /* renamed from: g */
    public float f180303g;

    static {
        C66298ac acVar = new C66298ac();
        f180295h = acVar;
        C62942bv.registerDefaultInstance(C66298ac.class, acVar);
    }

    private C66298ac() {
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
                return newMessageInfo(f180295h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ခ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C66298ac();
            case 4:
                return new C66297ab();
            case 5:
                return f180295h;
            case 6:
                C63010eb ebVar = f180296i;
                if (ebVar == null) {
                    synchronized (C66298ac.class) {
                        ebVar = f180296i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180295h);
                            f180296i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
