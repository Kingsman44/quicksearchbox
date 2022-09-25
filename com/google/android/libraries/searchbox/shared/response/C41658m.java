package com.google.android.libraries.searchbox.shared.response;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.searchbox.shared.suggestion.C41674an;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.searchbox.shared.response.m */
/* compiled from: PG */
public final class C41658m extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C41658m f108892i;

    /* renamed from: k */
    private static volatile C63010eb f108893k;

    /* renamed from: a */
    public int f108894a;

    /* renamed from: b */
    public String f108895b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f108896c = emptyProtobufList();

    /* renamed from: d */
    public C41653h f108897d;

    /* renamed from: e */
    public int f108898e;

    /* renamed from: f */
    public String f108899f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public long f108900g;

    /* renamed from: h */
    public boolean f108901h;

    /* renamed from: j */
    private byte f108902j = 2;

    static {
        C41658m mVar = new C41658m();
        f108892i = mVar;
        C62942bv.registerDefaultInstance(C41658m.class, mVar);
    }

    private C41658m() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f108902j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f108902j = b;
                return null;
            case 2:
                return newMessageInfo(f108892i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, C41674an.class, "d", "e", C41656k.f108891a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C41658m();
            case 4:
                return new C41655j();
            case 5:
                return f108892i;
            case 6:
                C63010eb ebVar = f108893k;
                if (ebVar == null) {
                    synchronized (C41658m.class) {
                        ebVar = f108893k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f108892i);
                            f108893k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
