package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.wk */
/* compiled from: PG */
public final class C8124wk extends C62937bq implements C62938br {

    /* renamed from: l */
    public static final C8124wk f28548l;

    /* renamed from: n */
    private static volatile C63010eb f28549n;

    /* renamed from: a */
    public int f28550a;

    /* renamed from: b */
    public String f28551b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f28552c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f28553d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f28554e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f28555f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f28556g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C8112vz f28557h;

    /* renamed from: i */
    public boolean f28558i;

    /* renamed from: j */
    public C8130wq f28559j;

    /* renamed from: k */
    public int f28560k;

    /* renamed from: m */
    private byte f28561m = 2;

    static {
        C8124wk wkVar = new C8124wk();
        f28548l = wkVar;
        C62942bv.registerDefaultInstance(C8124wk.class, wkVar);
    }

    private C8124wk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28561m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28561m = b;
                return null;
            case 2:
                return newMessageInfo(f28548l, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0000\u0000\u0001ဈ\u0000\u0005ဈ\u0005\u0006ဉ\u0006\u0007ဇ\u0007\bဈ\u0004\nဉ\t\u000bဈ\u0001\fဈ\u0002\rဈ\u0003\u000eဆ\n", new Object[]{"a", "b", C30325g.f82003a, C19618h.f54585a, "i", C10662f.f35572a, "j", C45240c.f118157a, "d", "e", C19621k.f54601a});
            case 3:
                return new C8124wk();
            case 4:
                return new C8123wj();
            case 5:
                return f28548l;
            case 6:
                C63010eb ebVar = f28549n;
                if (ebVar == null) {
                    synchronized (C8124wk.class) {
                        ebVar = f28549n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28548l);
                            f28549n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
