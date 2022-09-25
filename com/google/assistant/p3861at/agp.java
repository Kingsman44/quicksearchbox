package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3929l.p3930a.C52711bq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.agp */
/* compiled from: PG */
public final class agp extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final agp f129237k;

    /* renamed from: l */
    private static volatile C63010eb f129238l;

    /* renamed from: a */
    public int f129239a;

    /* renamed from: b */
    public String f129240b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f129241c;

    /* renamed from: d */
    public String f129242d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f129243e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f129244f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C62971cq f129245g = C62942bv.emptyProtobufList();

    /* renamed from: h */
    public String f129246h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f129247i;

    /* renamed from: j */
    public String f129248j;

    static {
        agp agp = new agp();
        f129237k = agp;
        C62942bv.registerDefaultInstance(agp.class, agp);
    }

    private agp() {
        C62942bv.emptyProtobufList();
        this.f129248j = BuildConfig.FLAVOR;
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
                return newMessageInfo(f129237k, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0001\u0000\u0001ဌ\u0001\u0005ဈ\u0000\u0006ဈ\t\u0007\u001a\bဈ\u0002\tဈ\u0004\nဈ\u0003\u000bဈ\u0005\rဋ\u0006", new Object[]{"a", C45240c.f118157a, C52711bq.f138371a, "b", "j", C30325g.f82003a, "d", C10662f.f35572a, "e", C19618h.f54585a, "i"});
            case 3:
                return new agp();
            case 4:
                return new ago();
            case 5:
                return f129237k;
            case 6:
                C63010eb ebVar = f129238l;
                if (ebVar == null) {
                    synchronized (agp.class) {
                        ebVar = f129238l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129237k);
                            f129238l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
