package com.google.android.apps.gsa.assist;

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
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.d */
/* compiled from: PG */
public final class C9405d extends C62937bq implements C62938br {

    /* renamed from: k */
    public static final C9405d f32673k;

    /* renamed from: m */
    private static volatile C63010eb f32674m;

    /* renamed from: a */
    public int f32675a;

    /* renamed from: b */
    public String f32676b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f32677c = emptyProtobufList();

    /* renamed from: d */
    public String f32678d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f32679e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C9424n f32680f;

    /* renamed from: g */
    public boolean f32681g;

    /* renamed from: h */
    public boolean f32682h;

    /* renamed from: i */
    public boolean f32683i;

    /* renamed from: j */
    public String f32684j = BuildConfig.FLAVOR;

    /* renamed from: l */
    private byte f32685l = 2;

    static {
        C9405d dVar = new C9405d();
        f32673k = dVar;
        C62942bv.registerDefaultInstance(C9405d.class, dVar);
    }

    private C9405d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f32685l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f32685l = b;
                return null;
            case 2:
                return newMessageInfo(f32673k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0001\u0001\u0001ဈ\u0000\u0003Л\u0005ဈ\u0002\u0006ဈ\u0003\u0007ဉ\u0004\bဇ\u0005\tဈ\b\u000bဇ\u0006\fဇ\u0007", new Object[]{"a", "b", C45240c.f118157a, C9347ar.class, "d", "e", C10662f.f35572a, C30325g.f82003a, "j", C19618h.f54585a, "i"});
            case 3:
                return new C9405d();
            case 4:
                return new C9386c();
            case 5:
                return f32673k;
            case 6:
                C63010eb ebVar = f32674m;
                if (ebVar == null) {
                    synchronized (C9405d.class) {
                        ebVar = f32674m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32673k);
                            f32674m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
