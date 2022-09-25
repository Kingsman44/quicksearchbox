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

/* renamed from: com.google.assistant.at.xy */
/* compiled from: PG */
public final class C50461xy extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C50461xy f131315l;

    /* renamed from: m */
    private static volatile C63010eb f131316m;

    /* renamed from: a */
    public int f131317a;

    /* renamed from: b */
    public String f131318b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f131319c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f131320d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f131321e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f131322f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f131323g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f131324h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f131325i;

    /* renamed from: j */
    public boolean f131326j;

    /* renamed from: k */
    public C62971cq f131327k = C62942bv.emptyProtobufList();

    static {
        C50461xy xyVar = new C50461xy();
        f131315l = xyVar;
        C62942bv.registerDefaultInstance(C50461xy.class, xyVar);
    }

    private C50461xy() {
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
                return newMessageInfo(f131315l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဌ\u0007\bဇ\t\tဈ\u0001\nဈ\u0006\u000b\u001a", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C30325g.f82003a, "i", C50458xv.f131314a, "j", C45240c.f118157a, C19618h.f54585a, C19621k.f54601a});
            case 3:
                return new C50461xy();
            case 4:
                return new C50460xx();
            case 5:
                return f131315l;
            case 6:
                C63010eb ebVar = f131316m;
                if (ebVar == null) {
                    synchronized (C50461xy.class) {
                        ebVar = f131316m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131315l);
                            f131316m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
