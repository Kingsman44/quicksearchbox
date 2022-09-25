package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.mf */
/* compiled from: PG */
public final class C52289mf extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C52289mf f137258j;

    /* renamed from: k */
    private static volatile C63010eb f137259k;

    /* renamed from: a */
    public int f137260a = 0;

    /* renamed from: b */
    public Object f137261b;

    /* renamed from: c */
    public String f137262c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f137263d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f137264e;

    /* renamed from: f */
    public boolean f137265f;

    /* renamed from: g */
    public C52288me f137266g;

    /* renamed from: h */
    public C62971cq f137267h = emptyProtobufList();

    /* renamed from: i */
    public boolean f137268i;

    static {
        C52289mf mfVar = new C52289mf();
        f137258j = mfVar;
        C62942bv.registerDefaultInstance(C52289mf.class, mfVar);
    }

    private C52289mf() {
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
                return newMessageInfo(f137258j, "\u0000\t\u0001\u0000\u0001\u000b\t\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0005\u0007\u0006<\u0000\u0007\u0007\b\t\t\u001b\n:\u0000\u000b\u0007", new Object[]{"b", "a", C45240c.f118157a, "d", "e", C51098gh.class, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C52374pj.class, "i"});
            case 3:
                return new C52289mf();
            case 4:
                return new C52286mc();
            case 5:
                return f137258j;
            case 6:
                C63010eb ebVar = f137259k;
                if (ebVar == null) {
                    synchronized (C52289mf.class) {
                        ebVar = f137259k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137258j);
                            f137259k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
