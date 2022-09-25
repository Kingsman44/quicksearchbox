package com.google.android.libraries.searchbox.shared.suggestion;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.searchbox.shared.suggestion.ac */
/* compiled from: PG */
public final class C41663ac extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C41663ac f108934g;

    /* renamed from: h */
    private static volatile C63010eb f108935h;

    /* renamed from: a */
    public int f108936a;

    /* renamed from: b */
    public int f108937b = 0;

    /* renamed from: c */
    public Object f108938c;

    /* renamed from: d */
    public String f108939d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f108940e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f108941f = BuildConfig.FLAVOR;

    static {
        C41663ac acVar = new C41663ac();
        f108934g = acVar;
        C62942bv.registerDefaultInstance(C41663ac.class, acVar);
    }

    private C41663ac() {
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
                return newMessageInfo(f108934g, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ျ\u0000\u0004့\u0000\u0005ဈ\u0004", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a});
            case 3:
                return new C41663ac();
            case 4:
                return new C41662ab();
            case 5:
                return f108934g;
            case 6:
                C63010eb ebVar = f108935h;
                if (ebVar == null) {
                    synchronized (C41663ac.class) {
                        ebVar = f108935h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f108934g);
                            f108935h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
