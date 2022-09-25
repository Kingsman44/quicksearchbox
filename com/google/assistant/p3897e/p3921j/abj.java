package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.abj */
/* compiled from: PG */
public final class abj extends C62937bq implements C62938br {

    /* renamed from: i */
    public static final abj f134724i;

    /* renamed from: l */
    private static volatile C63010eb f134725l;

    /* renamed from: a */
    public double f134726a;

    /* renamed from: b */
    public double f134727b;

    /* renamed from: c */
    public long f134728c;

    /* renamed from: d */
    public boolean f134729d;

    /* renamed from: e */
    public String f134730e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f134731f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f134732g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C62971cq f134733h = C62942bv.emptyProtobufList();

    /* renamed from: j */
    private int f134734j;

    /* renamed from: k */
    private byte f134735k = 2;

    static {
        abj abj = new abj();
        f134724i = abj;
        C62942bv.registerDefaultInstance(abj.class, abj);
    }

    private abj() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134735k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134735k = b;
                return null;
            case 2:
                return newMessageInfo(f134724i, "\u0001\b\u0000\u0001\u0003\n\b\u0000\u0001\u0000\u0003က\u0002\u0004က\u0003\u0005ဂ\u0004\u0006ဇ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\n\u001a", new Object[]{"j", "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new abj();
            case 4:
                return new abi();
            case 5:
                return f134724i;
            case 6:
                C63010eb ebVar = f134725l;
                if (ebVar == null) {
                    synchronized (abj.class) {
                        ebVar = f134725l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134724i);
                            f134725l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
