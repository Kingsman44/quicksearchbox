package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4129b.p4134b.p4135a.C54742b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ta */
/* compiled from: PG */
public final class C50329ta extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C50329ta f130981l;

    /* renamed from: m */
    private static volatile C63010eb f130982m;

    /* renamed from: a */
    public int f130983a;

    /* renamed from: b */
    public long f130984b;

    /* renamed from: c */
    public int f130985c;

    /* renamed from: d */
    public String f130986d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f130987e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f130988f;

    /* renamed from: g */
    public String f130989g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C54742b f130990h;

    /* renamed from: i */
    public String f130991i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C62971cq f130992j = C62942bv.emptyProtobufList();

    /* renamed from: k */
    public C62971cq f130993k = C62942bv.emptyProtobufList();

    static {
        C50329ta taVar = new C50329ta();
        f130981l = taVar;
        C62942bv.registerDefaultInstance(C50329ta.class, taVar);
    }

    private C50329ta() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f130981l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဉ\u0006\bဈ\u0007\t\u001a\n\u001a", new Object[]{"a", "b", C45240c.f118157a, C50326sy.f130980a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C50329ta();
            case 4:
                return new C50325sx();
            case 5:
                return f130981l;
            case 6:
                C63010eb ebVar = f130982m;
                if (ebVar == null) {
                    synchronized (C50329ta.class) {
                        ebVar = f130982m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130981l);
                            f130982m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
