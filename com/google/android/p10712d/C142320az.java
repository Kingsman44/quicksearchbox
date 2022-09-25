package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.az */
/* compiled from: PG */
public final class C142320az extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C142320az f386099j;

    /* renamed from: k */
    private static volatile C63010eb f386100k;

    /* renamed from: a */
    public int f386101a;

    /* renamed from: b */
    public String f386102b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f386103c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C142355cg f386104d;

    /* renamed from: e */
    public C142355cg f386105e;

    /* renamed from: f */
    public String f386106f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f386107g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f386108h;

    /* renamed from: i */
    public String f386109i = BuildConfig.FLAVOR;

    static {
        C142320az azVar = new C142320az();
        f386099j = azVar;
        C62942bv.registerDefaultInstance(C142320az.class, azVar);
    }

    private C142320az() {
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
                return newMessageInfo(f386099j, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0006ဉ\u0005\u0007ဉ\u0006\bဈ\u0007\tဈ\b\nဇ\t\u000bဈ\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C142320az();
            case 4:
                return new C142319ay();
            case 5:
                return f386099j;
            case 6:
                C63010eb ebVar = f386100k;
                if (ebVar == null) {
                    synchronized (C142320az.class) {
                        ebVar = f386100k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386099j);
                            f386100k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
