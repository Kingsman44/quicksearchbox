package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.no */
/* compiled from: PG */
public final class C50181no extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C50181no f130444i;

    /* renamed from: k */
    private static volatile C63010eb f130445k;

    /* renamed from: a */
    public String f130446a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f130447b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130448c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f130449d;

    /* renamed from: e */
    public C62971cq f130450e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public String f130451f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f130452g;

    /* renamed from: h */
    public int f130453h;

    /* renamed from: j */
    private int f130454j;

    static {
        C50181no noVar = new C50181no();
        f130444i = noVar;
        C62942bv.registerDefaultInstance(C50181no.class, noVar);
    }

    private C50181no() {
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
                return newMessageInfo(f130444i, "\u0001\b\u0000\u0001\u0001\u0011\b\u0000\u0001\u0000\u0001ဈ\u0001\u0002ဈ\u0002\u0004ဌ\u0004\u0007ဈ\u0000\r\u001a\u000eဈ\f\u000fဇ\r\u0011ဋ\u000f", new Object[]{"j", "b", C45240c.f118157a, "d", C50178nl.f130443a, "a", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C50181no();
            case 4:
                return new C50180nn();
            case 5:
                return f130444i;
            case 6:
                C63010eb ebVar = f130445k;
                if (ebVar == null) {
                    synchronized (C50181no.class) {
                        ebVar = f130445k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130444i);
                            f130445k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
