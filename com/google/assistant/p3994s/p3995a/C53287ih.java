package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ih */
/* compiled from: PG */
public final class C53287ih extends C62937bq implements C62938br {

    /* renamed from: l */
    public static final C53287ih f139693l;

    /* renamed from: n */
    private static volatile C63010eb f139694n;

    /* renamed from: a */
    public int f139695a;

    /* renamed from: b */
    public int f139696b = 0;

    /* renamed from: c */
    public Object f139697c;

    /* renamed from: d */
    public int f139698d;

    /* renamed from: e */
    public C53280ia f139699e;

    /* renamed from: f */
    public boolean f139700f;

    /* renamed from: g */
    public String f139701g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f139702h;

    /* renamed from: i */
    public int f139703i;

    /* renamed from: j */
    public C60218r f139704j;

    /* renamed from: k */
    public String f139705k = BuildConfig.FLAVOR;

    /* renamed from: m */
    private byte f139706m = 2;

    static {
        C53287ih ihVar = new C53287ih();
        f139693l = ihVar;
        C62942bv.registerDefaultInstance(C53287ih.class, ihVar);
    }

    private C53287ih() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139706m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139706m = b;
                return null;
            case 2:
                return newMessageInfo(f139693l, "\u0001\n\u0001\u0001\u0001\f\n\u0000\u0000\u0001\u0001ဈ\u0003\u0002ဇ\u0002\u0003ျ\u0000\u0004ျ\u0000\u0005ဌ\u0006\u0007ဌ\u0007\bဌ\u0000\nᐉ\t\u000bဉ\u0001\fဈ\n", new Object[]{C45240c.f118157a, "b", "a", C30325g.f82003a, C10662f.f35572a, C19618h.f54585a, C53281ib.f139690a, "i", C53285if.f139692a, "d", C53283id.f139691a, "j", "e", C19621k.f54601a});
            case 3:
                return new C53287ih();
            case 4:
                return new C53275hw();
            case 5:
                return f139693l;
            case 6:
                C63010eb ebVar = f139694n;
                if (ebVar == null) {
                    synchronized (C53287ih.class) {
                        ebVar = f139694n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139693l);
                            f139694n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
