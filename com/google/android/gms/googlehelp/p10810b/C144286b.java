package com.google.android.gms.googlehelp.p10810b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4446cc.p4447a.p4448a.C57931a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.googlehelp.b.b */
/* compiled from: PG */
public final class C144286b extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C144286b f390797n;

    /* renamed from: o */
    private static volatile C63010eb f390798o;

    /* renamed from: a */
    public int f390799a;

    /* renamed from: b */
    public int f390800b;

    /* renamed from: c */
    public String f390801c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f390802d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f390803e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f390804f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f390805g;

    /* renamed from: h */
    public long f390806h = -1;

    /* renamed from: i */
    public int f390807i;

    /* renamed from: j */
    public String f390808j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public int f390809k;

    /* renamed from: l */
    public int f390810l;

    /* renamed from: m */
    public boolean f390811m;

    static {
        C144286b bVar = new C144286b();
        f390797n = bVar;
        C62942bv.registerDefaultInstance(C144286b.class, bVar);
    }

    private C144286b() {
        emptyProtobufList();
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
                return newMessageInfo(f390797n, "\u0001\u000b\u0000\u0002\u0002$\u000b\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဈ\u0006\u0013ဂ\u0018\u0017င\u001e\u0019ဌ\b ဈ!!ဈ\u0004\"င\"#င#$ဇ$", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, C19618h.f54585a, "i", C30325g.f82003a, C57931a.f154948a, "j", "e", C19621k.f54601a, "l", "m"});
            case 3:
                return new C144286b();
            case 4:
                return new C144285a();
            case 5:
                return f390797n;
            case 6:
                C63010eb ebVar = f390798o;
                if (ebVar == null) {
                    synchronized (C144286b.class) {
                        ebVar = f390798o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f390797n);
                            f390798o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
