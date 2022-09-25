package com.google.android.libraries.mdi.download;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.eh */
/* compiled from: PG */
public final class C29384eh extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C29384eh f79653h;

    /* renamed from: i */
    private static volatile C63010eb f79654i;

    /* renamed from: a */
    public int f79655a;

    /* renamed from: b */
    public C29392ep f79656b;

    /* renamed from: c */
    public long f79657c;

    /* renamed from: d */
    public String f79658d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f79659e;

    /* renamed from: f */
    public long f79660f;

    /* renamed from: g */
    public long f79661g;

    static {
        C29384eh ehVar = new C29384eh();
        f79653h = ehVar;
        C62942bv.registerDefaultInstance(C29384eh.class, ehVar);
    }

    private C29384eh() {
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
                return newMessageInfo(f79653h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003င\u0003\u0004ဂ\u0004\u0005ဂ\u0005\u0006ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, "d"});
            case 3:
                return new C29384eh();
            case 4:
                return new C29383eg();
            case 5:
                return f79653h;
            case 6:
                C63010eb ebVar = f79654i;
                if (ebVar == null) {
                    synchronized (C29384eh.class) {
                        ebVar = f79654i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f79653h);
                            f79654i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
