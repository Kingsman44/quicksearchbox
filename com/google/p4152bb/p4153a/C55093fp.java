package com.google.p4152bb.p4153a;

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

/* renamed from: com.google.bb.a.fp */
/* compiled from: PG */
public final class C55093fp extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C55093fp f144965l;

    /* renamed from: n */
    private static volatile C63010eb f144966n;

    /* renamed from: a */
    public int f144967a;

    /* renamed from: b */
    public String f144968b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f144969c = emptyProtobufList();

    /* renamed from: d */
    public C55089fl f144970d;

    /* renamed from: e */
    public C55060ej f144971e;

    /* renamed from: f */
    public boolean f144972f;

    /* renamed from: g */
    public boolean f144973g;

    /* renamed from: h */
    public int f144974h;

    /* renamed from: i */
    public String f144975i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f144976j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public C55114gj f144977k;

    /* renamed from: m */
    private byte f144978m = 2;

    static {
        C55093fp fpVar = new C55093fp();
        f144965l = fpVar;
        C62942bv.registerDefaultInstance(C55093fp.class, fpVar);
    }

    private C55093fp() {
        emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo54193a() {
        C62971cq cqVar = this.f144969c;
        if (!cqVar.mo58948c()) {
            this.f144969c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f144978m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f144978m = b;
                return null;
            case 2:
                return newMessageInfo(f144965l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л\u0003ဉ\u0001\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဈ\u0006\u0007ဈ\u0007\bဉ\t\tဌ\u0005\nဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, C55082fe.class, "d", C10662f.f35572a, C30325g.f82003a, "i", "j", C19621k.f54601a, C19618h.f54585a, C55091fn.f144964a, "e"});
            case 3:
                return new C55093fp();
            case 4:
                return new C55090fm();
            case 5:
                return f144965l;
            case 6:
                C63010eb ebVar = f144966n;
                if (ebVar == null) {
                    synchronized (C55093fp.class) {
                        ebVar = f144966n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144965l);
                            f144966n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
