package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ai.b.an */
/* compiled from: PG */
public final class C7526an extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C7526an f26049l;

    /* renamed from: m */
    private static volatile C63010eb f26050m;

    /* renamed from: a */
    public int f26051a;

    /* renamed from: b */
    public String f26052b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f26053c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f26054d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f26055e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f26056f = emptyProtobufList();

    /* renamed from: g */
    public int f26057g = 1;

    /* renamed from: h */
    public String f26058h;

    /* renamed from: i */
    public String f26059i;

    /* renamed from: j */
    public int f26060j;

    /* renamed from: k */
    public String f26061k;

    static {
        C7526an anVar = new C7526an();
        f26049l = anVar;
        C62942bv.registerDefaultInstance(C7526an.class, anVar);
    }

    private C7526an() {
        C63088z zVar = C63088z.f170246b;
        this.f26058h = BuildConfig.FLAVOR;
        this.f26059i = BuildConfig.FLAVOR;
        this.f26061k = BuildConfig.FLAVOR;
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
                return newMessageInfo(f26049l, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0005ဈ\u0002\u0007ဌ\u0005\tဈ\u0003\nဈ\u0007\u000bဈ\b\fဌ\t\u000eဈ\u000b", new Object[]{"a", "b", C45240c.f118157a, C10662f.f35572a, C7523ak.class, "d", C30325g.f82003a, C7524al.f26048a, "e", C19618h.f54585a, "i", "j", C7681g.m22803b(), C19621k.f54601a});
            case 3:
                return new C7526an();
            case 4:
                return new C7521ai();
            case 5:
                return f26049l;
            case 6:
                C63010eb ebVar = f26050m;
                if (ebVar == null) {
                    synchronized (C7526an.class) {
                        ebVar = f26050m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26049l);
                            f26050m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
