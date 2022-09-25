package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ade */
/* compiled from: PG */
public final class ade extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final ade f134877h;

    /* renamed from: i */
    private static volatile C63010eb f134878i;

    /* renamed from: a */
    public int f134879a;

    /* renamed from: b */
    public String f134880b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f134881c;

    /* renamed from: d */
    public String f134882d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f134883e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f134884f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public C62971cq f134885g;

    static {
        ade ade = new ade();
        f134877h = ade;
        C62942bv.registerDefaultInstance(ade.class, ade);
    }

    private ade() {
        emptyIntList();
        this.f134885g = emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo53674a() {
        C62971cq cqVar = this.f134885g;
        if (!cqVar.mo58948c()) {
            this.f134885g = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f134877h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0006ဈ\u0003\u0007\u001a\b\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, adm.class});
            case 3:
                return new ade();
            case 4:
                return new add();
            case 5:
                return f134877h;
            case 6:
                C63010eb ebVar = f134878i;
                if (ebVar == null) {
                    synchronized (ade.class) {
                        ebVar = f134878i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134877h);
                            f134878i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
