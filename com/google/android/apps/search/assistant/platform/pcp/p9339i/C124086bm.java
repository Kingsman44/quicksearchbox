package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62963cj;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69241g;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69243i;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.bm */
/* compiled from: PG */
public final class C124086bm {

    /* renamed from: a */
    public static final C59071e f342723a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.i.bm");

    /* renamed from: b */
    public final Map f342724b;

    /* renamed from: c */
    public final long f342725c;

    /* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.bm$a */
    /* compiled from: PG */
    public interface C124087a {
        /* renamed from: ad */
        C124086bm mo106280ad();
    }

    public C124086bm(C69243i iVar, long j) {
        this.f342724b = (Map) Collection.EL.stream(iVar.f185351a).collect(Collectors.toMap(C124083bj.f342720a, Function.CC.identity(), C124084bk.f342721a, C124085bl.f342722a));
        this.f342725c = j;
    }

    /* renamed from: a */
    public static C124086bm m203508a(Context context, AccountId accountId) {
        return ((C124087a) C47245e.m84045a(context, C124087a.class, accountId)).mo106280ad();
    }

    /* renamed from: b */
    public final C58485gu mo106279b(int i) {
        Map map = this.f342724b;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            C59104x d = f342723a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PCP.DataTypeConfig");
            ((C59052c) ((C59052c) d).mo56372aa(35397)).mo56387q("Config not found for data type %s", i);
            return C58485gu.m89845m();
        }
        C69241g gVar = (C69241g) this.f342724b.get(valueOf);
        gVar.getClass();
        return C58485gu.m89842j(new C62963cj(gVar.f185348d, C69241g.f185342e));
    }
}
