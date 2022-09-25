package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.ah */
/* compiled from: PG */
public final class C50936ah extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C50936ah f132593m;

    /* renamed from: o */
    private static volatile C63010eb f132594o;

    /* renamed from: a */
    public int f132595a;

    /* renamed from: b */
    public int f132596b = 0;

    /* renamed from: c */
    public Object f132597c;

    /* renamed from: d */
    public int f132598d = 0;

    /* renamed from: e */
    public Object f132599e;

    /* renamed from: f */
    public boolean f132600f;

    /* renamed from: g */
    public C51012dc f132601g;

    /* renamed from: h */
    public int f132602h;

    /* renamed from: i */
    public C62910ar f132603i;

    /* renamed from: j */
    public int f132604j;

    /* renamed from: k */
    public int f132605k;

    /* renamed from: l */
    public String f132606l = BuildConfig.FLAVOR;

    /* renamed from: n */
    private byte f132607n = 2;

    static {
        C50936ah ahVar = new C50936ah();
        f132593m = ahVar;
        C62942bv.registerDefaultInstance(C50936ah.class, ahVar);
    }

    private C50936ah() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132607n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132607n = b;
                return null;
            case 2:
                return newMessageInfo(f132593m, "\u0001\u000b\u0002\u0001\u0001\u000b\u000b\u0000\u0000\u0002\u0001ျ\u0000\u0002ဇ\u0002\u0003ᐼ\u0001\u0004ြ\u0001\u0005ᐉ\u0005\u0006ဌ\u0006\u0007ဉ\u0007\bဌ\b\tဌ\t\nဈ\n\u000bျ\u0000", new Object[]{C45240c.f118157a, "b", "e", "d", "a", C10662f.f35572a, C51016dg.class, C51098gh.class, C30325g.f82003a, C19618h.f54585a, C50931ac.m85982b(), "i", "j", C50934af.f132592a, C19621k.f54601a, C50932ad.f132591a, "l"});
            case 3:
                return new C50936ah();
            case 4:
                return new C50929aa();
            case 5:
                return f132593m;
            case 6:
                C63010eb ebVar = f132594o;
                if (ebVar == null) {
                    synchronized (C50936ah.class) {
                        ebVar = f132594o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132593m);
                            f132594o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
