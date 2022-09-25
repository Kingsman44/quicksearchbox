package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.abp */
/* compiled from: PG */
public final class abp extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final abp f134738j;

    /* renamed from: l */
    private static volatile C63010eb f134739l;

    /* renamed from: a */
    public C62971cq f134740a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public int f134741b;

    /* renamed from: c */
    public long f134742c;

    /* renamed from: d */
    public String f134743d;

    /* renamed from: e */
    public String f134744e;

    /* renamed from: f */
    public long f134745f;

    /* renamed from: g */
    public int f134746g;

    /* renamed from: h */
    public long f134747h;

    /* renamed from: i */
    public int f134748i;

    /* renamed from: k */
    private int f134749k;

    static {
        abp abp = new abp();
        f134738j = abp;
        C62942bv.registerDefaultInstance(abp.class, abp);
    }

    private abp() {
        C62942bv.emptyProtobufList();
        this.f134743d = BuildConfig.FLAVOR;
        this.f134744e = BuildConfig.FLAVOR;
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
                Object[] objArr = new Object[13];
                objArr[0] = C19621k.f54601a;
                objArr[1] = "a";
                objArr[2] = "b";
                objArr[3] = abn.f134737a;
                objArr[4] = C45240c.f118157a;
                objArr[5] = "d";
                objArr[6] = "e";
                objArr[7] = C10662f.f35572a;
                objArr[8] = C19618h.f54585a;
                objArr[9] = C30325g.f82003a;
                C62959cf cfVar = abl.f134736a;
                objArr[12] = cfVar;
                objArr[10] = cfVar;
                objArr[11] = "i";
                return newMessageInfo(f134738j, "\u0001\t\u0000\u0001\u0004\r\t\u0000\u0001\u0000\u0004\u001a\u0006ဌ\u0003\u0007ဂ\u0004\bဈ\u0005\tဈ\u0006\nဂ\u0007\u000bဂ\t\fဌ\b\rဌ\n", objArr);
            case 3:
                return new abp();
            case 4:
                return new abk();
            case 5:
                return f134738j;
            case 6:
                C63010eb ebVar = f134739l;
                if (ebVar == null) {
                    synchronized (abp.class) {
                        ebVar = f134739l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134738j);
                            f134739l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
