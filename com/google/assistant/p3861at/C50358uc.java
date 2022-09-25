package com.google.assistant.p3861at;

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
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.at.uc */
/* compiled from: PG */
public final class C50358uc extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C50358uc f131066m;

    /* renamed from: n */
    private static volatile C63010eb f131067n;

    /* renamed from: a */
    public int f131068a;

    /* renamed from: b */
    public int f131069b;

    /* renamed from: c */
    public C63088z f131070c = C63088z.f170246b;

    /* renamed from: d */
    public C63088z f131071d = C63088z.f170246b;

    /* renamed from: e */
    public String f131072e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f131073f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public String f131074g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C50354tz f131075h;

    /* renamed from: i */
    public C50349tu f131076i;

    /* renamed from: j */
    public C50357ub f131077j;

    /* renamed from: k */
    public C62971cq f131078k = emptyProtobufList();

    /* renamed from: l */
    public C62971cq f131079l = C62942bv.emptyProtobufList();

    static {
        C50358uc ucVar = new C50358uc();
        f131066m = ucVar;
        C62942bv.registerDefaultInstance(C50358uc.class, ucVar);
    }

    private C50358uc() {
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
                return newMessageInfo(f131066m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0003\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002\u0004ဈ\u0003\u0005\u001a\u0006ဈ\u0004\u0007\u001b\t\u001a\u000bဉ\u0005\fဉ\u0006\rဉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19621k.f54601a, ado.class, "l", C19618h.f54585a, "i", "j"});
            case 3:
                return new C50358uc();
            case 4:
                return new C50350tv();
            case 5:
                return f131066m;
            case 6:
                C63010eb ebVar = f131067n;
                if (ebVar == null) {
                    synchronized (C50358uc.class) {
                        ebVar = f131067n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131066m);
                            f131067n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
