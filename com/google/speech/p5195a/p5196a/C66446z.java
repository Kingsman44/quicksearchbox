package com.google.speech.p5195a.p5196a;

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

/* renamed from: com.google.speech.a.a.z */
/* compiled from: PG */
public final class C66446z extends C62937bq implements C62938br {

    /* renamed from: j */
    public static final C66446z f180663j;

    /* renamed from: l */
    private static volatile C63010eb f180664l;

    /* renamed from: a */
    public int f180665a;

    /* renamed from: b */
    public int f180666b;

    /* renamed from: c */
    public String f180667c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f180668d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C66441u f180669e;

    /* renamed from: f */
    public C66445y f180670f;

    /* renamed from: g */
    public C66437q f180671g;

    /* renamed from: h */
    public C66431k f180672h;

    /* renamed from: i */
    public C66427g f180673i;

    /* renamed from: k */
    private byte f180674k = 2;

    static {
        C66446z zVar = new C66446z();
        f180663j = zVar;
        C62942bv.registerDefaultInstance(C66446z.class, zVar);
    }

    private C66446z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180674k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180674k = b;
                return null;
            case 2:
                return newMessageInfo(f180663j, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0004ဉ\u0004\u0006ဉ\u0006\u0007ဉ\u0007\bဉ\b\tဈ\u0003\u000bဉ\n", new Object[]{"a", "b", C66424d.f180619a, C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "d", "i"});
            case 3:
                return new C66446z();
            case 4:
                return new C66423c();
            case 5:
                return f180663j;
            case 6:
                C63010eb ebVar = f180664l;
                if (ebVar == null) {
                    synchronized (C66446z.class) {
                        ebVar = f180664l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180663j);
                            f180664l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
