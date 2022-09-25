package com.google.android.libraries.lens.ondevice.p2037n;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.n.aw */
/* compiled from: PG */
public final class C24790aw extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C24790aw f67732g;

    /* renamed from: h */
    private static volatile C63010eb f67733h;

    /* renamed from: a */
    public int f67734a;

    /* renamed from: b */
    public String f67735b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f67736c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62995dn f67737d = C62995dn.f170057a;

    /* renamed from: e */
    public boolean f67738e;

    /* renamed from: f */
    public boolean f67739f;

    static {
        C24790aw awVar = new C24790aw();
        f67732g = awVar;
        C62942bv.registerDefaultInstance(C24790aw.class, awVar);
    }

    private C24790aw() {
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
                return newMessageInfo(f67732g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u00032\u0004ဇ\u0002\u0005ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C24789av.f67731a, "e", C10662f.f35572a});
            case 3:
                return new C24790aw();
            case 4:
                return new C24788au();
            case 5:
                return f67732g;
            case 6:
                C63010eb ebVar = f67733h;
                if (ebVar == null) {
                    synchronized (C24790aw.class) {
                        ebVar = f67733h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67732g);
                            f67733h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
