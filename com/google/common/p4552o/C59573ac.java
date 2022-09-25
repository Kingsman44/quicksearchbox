package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ac */
/* compiled from: PG */
public final class C59573ac extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C59573ac f158248m;

    /* renamed from: n */
    private static volatile C63010eb f158249n;

    /* renamed from: a */
    public int f158250a;

    /* renamed from: b */
    public String f158251b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f158252c;

    /* renamed from: d */
    public String f158253d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f158254e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f158255f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f158256g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f158257h;

    /* renamed from: i */
    public C62961ch f158258i = emptyIntList();

    /* renamed from: j */
    public String f158259j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f158260k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public int f158261l;

    static {
        C59573ac acVar = new C59573ac();
        f158248m = acVar;
        C62942bv.registerDefaultInstance(C59573ac.class, acVar);
    }

    private C59573ac() {
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
                return newMessageInfo(f158248m, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\b\u001e\tဈ\u0007\nဈ\b\fဌ\n", new Object[]{"a", "b", C45240c.f118157a, C60657y.f164557a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C59572ab.f158174a, "i", C60684z.f164643a, "j", C19621k.f54601a, "l", C59571aa.f158074a});
            case 3:
                return new C59573ac();
            case 4:
                return new C60630x();
            case 5:
                return f158248m;
            case 6:
                C63010eb ebVar = f158249n;
                if (ebVar == null) {
                    synchronized (C59573ac.class) {
                        ebVar = f158249n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158248m);
                            f158249n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
