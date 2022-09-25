package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.c.a.z */
/* compiled from: PG */
public final class C20180z extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C20180z f56618i;

    /* renamed from: j */
    public static final C62940bt f56619j;

    /* renamed from: k */
    private static volatile C63010eb f56620k;

    /* renamed from: a */
    public int f56621a;

    /* renamed from: b */
    public C19983f f56622b;

    /* renamed from: c */
    public boolean f56623c;

    /* renamed from: d */
    public int f56624d;

    /* renamed from: e */
    public int f56625e;

    /* renamed from: f */
    public int f56626f;

    /* renamed from: g */
    public String f56627g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f56628h = BuildConfig.FLAVOR;

    static {
        C20180z zVar = new C20180z();
        f56618i = zVar;
        C62942bv.registerDefaultInstance(C20180z.class, zVar);
        f56619j = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, zVar, zVar, (C62958ce) null, 123250106, C63066gd.MESSAGE, C20180z.class);
    }

    private C20180z() {
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
                return newMessageInfo(f56618i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003င\u0002\u0005င\u0003\u0006င\u0004\u0007ဈ\u0005\bဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C20180z();
            case 4:
                return new C20179y();
            case 5:
                return f56618i;
            case 6:
                C63010eb ebVar = f56620k;
                if (ebVar == null) {
                    synchronized (C20180z.class) {
                        ebVar = f56620k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56618i);
                            f56620k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
