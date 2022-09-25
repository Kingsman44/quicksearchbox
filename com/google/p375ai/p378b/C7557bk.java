package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.bk */
/* compiled from: PG */
public final class C7557bk extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C7557bk f26133i;

    /* renamed from: j */
    private static volatile C63010eb f26134j;

    /* renamed from: a */
    public int f26135a;

    /* renamed from: b */
    public String f26136b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C7555bi f26137c;

    /* renamed from: d */
    public C7555bi f26138d;

    /* renamed from: e */
    public String f26139e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f26140f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f26141g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f26142h = BuildConfig.FLAVOR;

    static {
        C7557bk bkVar = new C7557bk();
        f26133i = bkVar;
        C62942bv.registerDefaultInstance(C7557bk.class, bkVar);
    }

    private C7557bk() {
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
                return newMessageInfo(f26133i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C7557bk();
            case 4:
                return new C7556bj();
            case 5:
                return f26133i;
            case 6:
                C63010eb ebVar = f26134j;
                if (ebVar == null) {
                    synchronized (C7557bk.class) {
                        ebVar = f26134j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26133i);
                            f26134j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
