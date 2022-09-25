package com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.o */
/* compiled from: PG */
public final class C92391o extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C92391o f257641i;

    /* renamed from: j */
    private static volatile C63010eb f257642j;

    /* renamed from: a */
    public int f257643a;

    /* renamed from: b */
    public int f257644b;

    /* renamed from: c */
    public String f257645c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f257646d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f257647e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f257648f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f257649g;

    /* renamed from: h */
    public C62971cq f257650h = emptyProtobufList();

    static {
        C92391o oVar = new C92391o();
        f257641i = oVar;
        C62942bv.registerDefaultInstance(C92391o.class, oVar);
    }

    private C92391o() {
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
                return newMessageInfo(f257641i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဌ\u0005\u0007\u001b", new Object[]{"a", "b", C92387k.f257639a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C92389m.f257640a, C19618h.f54585a, C92385i.class});
            case 3:
                return new C92391o();
            case 4:
                return new C92386j();
            case 5:
                return f257641i;
            case 6:
                C63010eb ebVar = f257642j;
                if (ebVar == null) {
                    synchronized (C92391o.class) {
                        ebVar = f257642j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f257641i);
                            f257642j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
