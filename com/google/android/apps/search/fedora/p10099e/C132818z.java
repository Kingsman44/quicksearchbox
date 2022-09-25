package com.google.android.apps.search.fedora.p10099e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.e.z */
/* compiled from: PG */
public final class C132818z extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C132818z f362393h;

    /* renamed from: i */
    private static volatile C63010eb f362394i;

    /* renamed from: a */
    public int f362395a;

    /* renamed from: b */
    public C132817y f362396b;

    /* renamed from: c */
    public C132815w f362397c;

    /* renamed from: d */
    public boolean f362398d;

    /* renamed from: e */
    public String f362399e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C132807o f362400f;

    /* renamed from: g */
    public boolean f362401g;

    static {
        C132818z zVar = new C132818z();
        f362393h = zVar;
        C62942bv.registerDefaultInstance(C132818z.class, zVar);
    }

    private C132818z() {
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
                return newMessageInfo(f362393h, "\u0001\u0006\u0000\u0001\u0002\u000e\u0006\u0000\u0000\u0000\u0002ဇ\u0002\u0006ဈ\u0003\nဉ\u0000\u000bဉ\u0001\rဉ\u0004\u000eဇ\u0005", new Object[]{"a", "d", "e", "b", C45240c.f118157a, C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C132818z();
            case 4:
                return new C132805m();
            case 5:
                return f362393h;
            case 6:
                C63010eb ebVar = f362394i;
                if (ebVar == null) {
                    synchronized (C132818z.class) {
                        ebVar = f362394i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362393h);
                            f362394i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
