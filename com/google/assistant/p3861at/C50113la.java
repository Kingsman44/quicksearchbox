package com.google.assistant.p3861at;

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

/* renamed from: com.google.assistant.at.la */
/* compiled from: PG */
public final class C50113la extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C50113la f130274k;

    /* renamed from: l */
    private static volatile C63010eb f130275l;

    /* renamed from: a */
    public int f130276a;

    /* renamed from: b */
    public String f130277b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130278c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f130279d;

    /* renamed from: e */
    public String f130280e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f130281f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public boolean f130282g;

    /* renamed from: h */
    public boolean f130283h;

    /* renamed from: i */
    public C50111kz f130284i;

    /* renamed from: j */
    public C50111kz f130285j;

    static {
        C50113la laVar = new C50113la();
        f130274k = laVar;
        C62942bv.registerDefaultInstance(C50113la.class, laVar);
    }

    private C50113la() {
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
                return newMessageInfo(f130274k, "\u0001\t\u0000\u0001\u0002\n\t\u0000\u0001\u0000\u0002ဈ\u0004\u0003\u001a\u0004ဈ\u0002\u0005ဋ\u0003\u0006ဉ\u0007\u0007ဉ\b\bဈ\u0001\tဇ\u0005\nဇ\u0006", new Object[]{"a", "e", C10662f.f35572a, C45240c.f118157a, "d", "i", "j", "b", C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C50113la();
            case 4:
                return new C50107kv();
            case 5:
                return f130274k;
            case 6:
                C63010eb ebVar = f130275l;
                if (ebVar == null) {
                    synchronized (C50113la.class) {
                        ebVar = f130275l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130274k);
                            f130275l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
