package com.google.assistant.p3745ab;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3838ao.p3839a.p3845e.C49521ae;
import com.google.common.p4552o.aqs;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ab.di */
/* compiled from: PG */
public final class C48310di extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C48310di f124939i;

    /* renamed from: j */
    public static final C62940bt f124940j;

    /* renamed from: l */
    private static volatile C63010eb f124941l;

    /* renamed from: a */
    public int f124942a;

    /* renamed from: b */
    public String f124943b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f124944c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f124945d;

    /* renamed from: e */
    public int f124946e;

    /* renamed from: f */
    public long f124947f;

    /* renamed from: g */
    public boolean f124948g;

    /* renamed from: h */
    public C48308dg f124949h;

    /* renamed from: k */
    private byte f124950k = 2;

    static {
        C48310di diVar = new C48310di();
        f124939i = diVar;
        C62942bv.registerDefaultInstance(C48310di.class, diVar);
        f124940j = C62942bv.newSingularGeneratedExtension(aqs.f159780k, diVar, diVar, (C62958ce) null, 342, C63066gd.MESSAGE, C48310di.class);
    }

    private C48310di() {
        emptyIntList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f124950k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f124950k = b;
                return null;
            case 2:
                return newMessageInfo(f124939i, "\u0001\u0007\u0000\u0001\u0001\u001b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0005ဈ\b\tဇ\u0012\rဉ\u0013\u0019ဌ\t\u001aဌ\n\u001bဃ\u000b", new Object[]{"a", "b", C45240c.f118157a, C30325g.f82003a, C19618h.f54585a, "d", C49521ae.f127761a, "e", C48309dh.f124938a, C10662f.f35572a});
            case 3:
                return new C48310di();
            case 4:
                return new C48306de();
            case 5:
                return f124939i;
            case 6:
                C63010eb ebVar = f124941l;
                if (ebVar == null) {
                    synchronized (C48310di.class) {
                        ebVar = f124941l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124939i);
                            f124941l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
