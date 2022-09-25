package com.google.assistant.p3882b.p3883a.p3884a.p3885a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.b.a.a.a.v */
/* compiled from: PG */
public final class C50659v extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C50659v f131774h;

    /* renamed from: i */
    private static volatile C63010eb f131775i;

    /* renamed from: a */
    public int f131776a;

    /* renamed from: b */
    public int f131777b = 0;

    /* renamed from: c */
    public Object f131778c;

    /* renamed from: d */
    public String f131779d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f131780e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C63088z f131781f = C63088z.f170246b;

    /* renamed from: g */
    public String f131782g = BuildConfig.FLAVOR;

    static {
        C50659v vVar = new C50659v();
        f131774h = vVar;
        C62942bv.registerDefaultInstance(C50659v.class, vVar);
    }

    private C50659v() {
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
                return newMessageInfo(f131774h, "\u0001\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ျ\u0000\u0002့\u0000\u0003့\u0000\u0004ဈ\u0007\u0005်\u0000\u0006ဈ\b\u0007ည\t\b်\u0000\tဈ\n\n့\u0000\u000bျ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C50659v();
            case 4:
                return new C50658u();
            case 5:
                return f131774h;
            case 6:
                C63010eb ebVar = f131775i;
                if (ebVar == null) {
                    synchronized (C50659v.class) {
                        ebVar = f131775i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131774h);
                            f131775i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
