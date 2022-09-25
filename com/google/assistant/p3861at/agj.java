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

/* renamed from: com.google.assistant.at.agj */
/* compiled from: PG */
public final class agj extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final agj f129218j;

    /* renamed from: l */
    private static volatile C63010eb f129219l;

    /* renamed from: a */
    public String f129220a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f129221b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f129222c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f129223d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f129224e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f129225f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f129226g;

    /* renamed from: h */
    public C62971cq f129227h = emptyProtobufList();

    /* renamed from: i */
    public C50133lu f129228i;

    /* renamed from: k */
    private int f129229k;

    static {
        agj agj = new agj();
        f129218j = agj;
        C62942bv.registerDefaultInstance(agj.class, agj);
    }

    private agj() {
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
                return newMessageInfo(f129218j, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဌ\u0006\u0007\u001b\bဈ\u0005\tဉ\u0007", new Object[]{C19621k.f54601a, "a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a, age.f129211a, C19618h.f54585a, agi.class, C10662f.f35572a, "i"});
            case 3:
                return new agj();
            case 4:
                return new agg();
            case 5:
                return f129218j;
            case 6:
                C63010eb ebVar = f129219l;
                if (ebVar == null) {
                    synchronized (agj.class) {
                        ebVar = f129219l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129218j);
                            f129219l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
