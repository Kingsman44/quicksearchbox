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

/* renamed from: com.google.assistant.at.ahd */
/* compiled from: PG */
public final class ahd extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final ahd f129283l;

    /* renamed from: n */
    private static volatile C63010eb f129284n;

    /* renamed from: a */
    public int f129285a;

    /* renamed from: b */
    public String f129286b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f129287c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f129288d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C62971cq f129289e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public String f129290f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C62971cq f129291g = C62942bv.emptyProtobufList();

    /* renamed from: h */
    public C62971cq f129292h = C62942bv.emptyProtobufList();

    /* renamed from: i */
    public aha f129293i;

    /* renamed from: j */
    public C62971cq f129294j = emptyProtobufList();

    /* renamed from: k */
    public ahz f129295k;

    /* renamed from: m */
    private byte f129296m = 2;

    static {
        ahd ahd = new ahd();
        f129283l = ahd;
        C62942bv.registerDefaultInstance(ahd.class, ahd);
    }

    private ahd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f129296m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f129296m = b;
                return null;
            case 2:
                return newMessageInfo(f129283l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0005\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004\u001a\u0005ဈ\u0002\u0006\u001a\u0007\u001a\bᐉ\u0004\tဉ\u0003\n\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C19621k.f54601a, "i", "j", ahc.class});
            case 3:
                return new ahd();
            case 4:
                return new agy();
            case 5:
                return f129283l;
            case 6:
                C63010eb ebVar = f129284n;
                if (ebVar == null) {
                    synchronized (ahd.class) {
                        ebVar = f129284n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129283l);
                            f129284n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
