package com.google.assistant.p3897e.p3921j.p3926e;

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

/* renamed from: com.google.assistant.e.j.e.ff */
/* compiled from: PG */
public final class C51953ff extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C51953ff f136315l;

    /* renamed from: n */
    private static volatile C63010eb f136316n;

    /* renamed from: a */
    public int f136317a;

    /* renamed from: b */
    public String f136318b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f136319c = emptyProtobufList();

    /* renamed from: d */
    public String f136320d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f136321e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f136322f;

    /* renamed from: g */
    public int f136323g;

    /* renamed from: h */
    public int f136324h;

    /* renamed from: i */
    public C51933em f136325i;

    /* renamed from: j */
    public int f136326j;

    /* renamed from: k */
    public boolean f136327k;

    /* renamed from: m */
    private byte f136328m = 2;

    static {
        C51953ff ffVar = new C51953ff();
        f136315l = ffVar;
        C62942bv.registerDefaultInstance(C51953ff.class, ffVar);
    }

    private C51953ff() {
    }

    /* renamed from: a */
    public final void mo53768a() {
        C62971cq cqVar = this.f136319c;
        if (!cqVar.mo58948c()) {
            this.f136319c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136328m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136328m = b;
                return null;
            case 2:
                return newMessageInfo(f136315l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л\u0003ဈ\u0001\u0005ဈ\u0003\u0006ဇ\u0004\u0007ဌ\u0005\bဌ\u0006\tဉ\u0007\nဌ\b\u000bဇ\t", new Object[]{"a", "b", C45240c.f118157a, C51948fa.class, "d", "e", C10662f.f35572a, C30325g.f82003a, C51936ep.m86436b(), C19618h.f54585a, C51950fc.m86448b(), "i", "j", C51952fe.m86450b(), C19621k.f54601a});
            case 3:
                return new C51953ff();
            case 4:
                return new C51934en();
            case 5:
                return f136315l;
            case 6:
                C63010eb ebVar = f136316n;
                if (ebVar == null) {
                    synchronized (C51953ff.class) {
                        ebVar = f136316n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136315l);
                            f136316n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
