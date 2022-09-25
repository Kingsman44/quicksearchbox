package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

@Deprecated
/* renamed from: com.google.assistant.e.c.c.dc */
/* compiled from: PG */
public final class C51012dc extends C62937bq implements C62938br {

    /* renamed from: k */
    public static final C51012dc f132813k;

    /* renamed from: m */
    private static volatile C63010eb f132814m;

    /* renamed from: a */
    public int f132815a;

    /* renamed from: b */
    public int f132816b;

    /* renamed from: c */
    public String f132817c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f132818d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C63088z f132819e = C63088z.f170246b;

    /* renamed from: f */
    public String f132820f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f132821g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f132822h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public C51012dc f132823i;

    /* renamed from: j */
    public String f132824j = BuildConfig.FLAVOR;

    /* renamed from: l */
    private byte f132825l = 2;

    static {
        C51012dc dcVar = new C51012dc();
        f132813k = dcVar;
        C62942bv.registerDefaultInstance(C51012dc.class, dcVar);
    }

    private C51012dc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132825l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132825l = b;
                return null;
            case 2:
                return newMessageInfo(f132813k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0001\u0001ဈ\u0001\u0002ဈ\u0006\u0005ည\u0003\u0006ဈ\u0005\u0007ဌ\u0000\bဈ\u0004\nᐉ\n\u000bဈ\u000b\fဈ\u0002", new Object[]{"a", C45240c.f118157a, C19618h.f54585a, "e", C30325g.f82003a, "b", C51013dd.f132826a, C10662f.f35572a, "i", "j", "d"});
            case 3:
                return new C51012dc();
            case 4:
                return new C51011db();
            case 5:
                return f132813k;
            case 6:
                C63010eb ebVar = f132814m;
                if (ebVar == null) {
                    synchronized (C51012dc.class) {
                        ebVar = f132814m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132813k);
                            f132814m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
