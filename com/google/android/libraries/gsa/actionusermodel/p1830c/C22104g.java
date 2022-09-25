package com.google.android.libraries.gsa.actionusermodel.p1830c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3745ab.C48299d;
import com.google.assistant.p3745ab.C48312dk;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p4986a.C64676bc;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.c.g */
/* compiled from: PG */
public final class C22104g extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C22104g f60920i;

    /* renamed from: j */
    private static volatile C63010eb f60921j;

    /* renamed from: a */
    public int f60922a;

    /* renamed from: b */
    public int f60923b;

    /* renamed from: c */
    public int f60924c;

    /* renamed from: d */
    public int f60925d;

    /* renamed from: e */
    public String f60926e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f60927f = emptyProtobufList();

    /* renamed from: g */
    public int f60928g;

    /* renamed from: h */
    public C48299d f60929h;

    static {
        C22104g gVar = new C22104g();
        f60920i = gVar;
        C62942bv.registerDefaultInstance(C22104g.class, gVar);
    }

    private C22104g() {
    }

    /* renamed from: a */
    public final void mo27358a() {
        C62971cq cqVar = this.f60927f;
        if (!cqVar.mo58948c()) {
            this.f60927f = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f60920i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005\u001b\u0006ဌ\u0004\u0007ဉ\u0005", new Object[]{"a", "b", C64676bc.m96429b(), C45240c.f118157a, C48312dk.f124951a, "d", "e", C10662f.f35572a, C22101d.class, C30325g.f82003a, C22103f.f60919a, C19618h.f54585a});
            case 3:
                return new C22104g();
            case 4:
                return new C22102e();
            case 5:
                return f60920i;
            case 6:
                C63010eb ebVar = f60921j;
                if (ebVar == null) {
                    synchronized (C22104g.class) {
                        ebVar = f60921j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f60920i);
                            f60921j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
