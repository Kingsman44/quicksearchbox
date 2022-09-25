package com.google.common.p4552o;

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

/* renamed from: com.google.common.o.aak */
/* compiled from: PG */
public final class aak extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final aak f158096n;

    /* renamed from: o */
    private static volatile C63010eb f158097o;

    /* renamed from: a */
    public int f158098a;

    /* renamed from: b */
    public String f158099b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f158100c = emptyProtobufList();

    /* renamed from: d */
    public acv f158101d;

    /* renamed from: e */
    public acv f158102e;

    /* renamed from: f */
    public acv f158103f;

    /* renamed from: g */
    public C62971cq f158104g = emptyProtobufList();

    /* renamed from: h */
    public act f158105h;

    /* renamed from: i */
    public boolean f158106i;

    /* renamed from: j */
    public int f158107j;

    /* renamed from: k */
    public int f158108k;

    /* renamed from: l */
    public int f158109l;

    /* renamed from: m */
    public int f158110m;

    static {
        aak aak = new aak();
        f158096n = aak;
        C62942bv.registerDefaultInstance(aak.class, aak);
    }

    private aak() {
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
                return newMessageInfo(f158096n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u001b\u0006ဉ\u0004\u0007ဇ\u0005\bဌ\u0006\tဌ\u0007\nဌ\b\u000bဉ\u0003\fဌ\t", new Object[]{"a", "b", C45240c.f118157a, acv.class, "d", "e", C30325g.f82003a, act.class, C19618h.f54585a, "i", "j", aag.f158092a, C19621k.f54601a, aai.f158094a, "l", aah.f158093a, C10662f.f35572a, "m", aaj.f158095a});
            case 3:
                return new aak();
            case 4:
                return new aaf();
            case 5:
                return f158096n;
            case 6:
                C63010eb ebVar = f158097o;
                if (ebVar == null) {
                    synchronized (aak.class) {
                        ebVar = f158097o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158096n);
                            f158097o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
