package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.assistant.s.a.es */
/* compiled from: PG */
public final class C53190es extends C62942bv implements C63001dt {

    /* renamed from: s */
    public static final C53190es f139393s;

    /* renamed from: t */
    public static final C62940bt f139394t;

    /* renamed from: u */
    private static volatile C63010eb f139395u;

    /* renamed from: a */
    public int f139396a;

    /* renamed from: b */
    public int f139397b = 0;

    /* renamed from: c */
    public Object f139398c;

    /* renamed from: d */
    public int f139399d = 0;

    /* renamed from: e */
    public Object f139400e;

    /* renamed from: f */
    public C53187ep f139401f;

    /* renamed from: g */
    public C53187ep f139402g;

    /* renamed from: h */
    public C53183el f139403h;

    /* renamed from: i */
    public C53183el f139404i;

    /* renamed from: j */
    public C53179eh f139405j;

    /* renamed from: k */
    public int f139406k;

    /* renamed from: l */
    public C62971cq f139407l = emptyProtobufList();

    /* renamed from: m */
    public int f139408m;

    /* renamed from: n */
    public String f139409n = BuildConfig.FLAVOR;

    /* renamed from: o */
    public String f139410o = BuildConfig.FLAVOR;

    /* renamed from: p */
    public String f139411p = BuildConfig.FLAVOR;

    /* renamed from: q */
    public String f139412q = BuildConfig.FLAVOR;

    /* renamed from: r */
    public int f139413r;

    static {
        C53190es esVar = new C53190es();
        f139393s = esVar;
        C62942bv.registerDefaultInstance(C53190es.class, esVar);
        f139394t = C62942bv.newSingularGeneratedExtension(C53153di.f139315c, esVar, esVar, (C62958ce) null, 103, C63066gd.MESSAGE, C53190es.class);
    }

    private C53190es() {
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
                return newMessageInfo(f139393s, "\u0001\u0011\u0002\u0001\u0001\u0015\u0011\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\b\u0004င\t\b\u001b\tဉ\u0002\nြ\u0000\u000bြ\u0000\fဉ\u0005\rြ\u0001\u000eြ\u0001\u000fဌ\u000b\u0010ဈ\u000f\u0011ဈ\u0010\u0013ဈ\u0011\u0014ဈ\u0012\u0015ဌ\u0013", new Object[]{C45240c.f118157a, "b", "e", "d", "a", C10662f.f35572a, C30325g.f82003a, "j", C19621k.f54601a, "l", C53185en.class, C19618h.f54585a, C53183el.class, C53183el.class, "i", C53183el.class, C53183el.class, "m", C53188eq.f139392a, C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b, C53181ej.f139372a});
            case 3:
                return new C53190es();
            case 4:
                return new C53180ei();
            case 5:
                return f139393s;
            case 6:
                C63010eb ebVar = f139395u;
                if (ebVar == null) {
                    synchronized (C53190es.class) {
                        ebVar = f139395u;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139393s);
                            f139395u = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
