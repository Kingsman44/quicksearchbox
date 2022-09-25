package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.ie */
/* compiled from: PG */
public final class C82997ie extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C82997ie f226485g;

    /* renamed from: h */
    private static volatile C63010eb f226486h;

    /* renamed from: a */
    public int f226487a;

    /* renamed from: b */
    public String f226488b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f226489c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f226490d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public String f226491e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62995dn f226492f = C62995dn.f170057a;

    static {
        C82997ie ieVar = new C82997ie();
        f226485g = ieVar;
        C62942bv.registerDefaultInstance(C82997ie.class, ieVar);
    }

    private C82997ie() {
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
                return newMessageInfo(f226485g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဈ\u0002\u00052", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C82996id.f226484a});
            case 3:
                return new C82997ie();
            case 4:
                return new C82995ic();
            case 5:
                return f226485g;
            case 6:
                C63010eb ebVar = f226486h;
                if (ebVar == null) {
                    synchronized (C82997ie.class) {
                        ebVar = f226486h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226485g);
                            f226486h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
