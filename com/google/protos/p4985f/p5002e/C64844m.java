package com.google.protos.p4985f.p5002e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52395qd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.e.m */
/* compiled from: PG */
public final class C64844m extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C64844m f175725h;

    /* renamed from: i */
    private static volatile C63010eb f175726i;

    /* renamed from: a */
    public int f175727a;

    /* renamed from: b */
    public String f175728b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f175729c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f175730d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C52395qd f175731e;

    /* renamed from: f */
    public C64843l f175732f;

    /* renamed from: g */
    public C64838g f175733g;

    static {
        C64844m mVar = new C64844m();
        f175725h = mVar;
        C62942bv.registerDefaultInstance(C64844m.class, mVar);
    }

    private C64844m() {
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
                return newMessageInfo(f175725h, "\u0001\u0006\u0000\u0001\u0007\u0010\u0006\u0000\u0000\u0000\u0007ဈ\t\nဉ\f\fဉ\u000e\u000eဉ\u000f\u000fဈ\u0001\u0010ဈ\u0002", new Object[]{"a", "d", "e", C10662f.f35572a, C30325g.f82003a, "b", C45240c.f118157a});
            case 3:
                return new C64844m();
            case 4:
                return new C64832a();
            case 5:
                return f175725h;
            case 6:
                C63010eb ebVar = f175726i;
                if (ebVar == null) {
                    synchronized (C64844m.class) {
                        ebVar = f175726i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175725h);
                            f175726i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
