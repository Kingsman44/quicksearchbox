package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1148f;

import android.text.TextUtils;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.C15593a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15658j;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15668t;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15670b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3910e.p3911a.C51190e;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52155hg;
import com.google.assistant.p3897e.p3921j.C52159hk;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Arrays;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.f.b */
/* compiled from: PG */
public final class C15628b implements C15593a {

    /* renamed from: a */
    public static final C59071e f46725a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.r.c.a.f.b");

    /* renamed from: b */
    public final C69464a f46726b;

    /* renamed from: c */
    private final Executor f46727c;

    public C15628b(Executor executor, C69464a aVar) {
        this.f46727c = executor;
        this.f46726b = aVar;
    }

    /* renamed from: b */
    public static C58833ax m32368b(String str) {
        if (TextUtils.isEmpty(str)) {
            return C58836b.f156633a;
        }
        C52155hg hgVar = (C52155hg) C52159hk.f136860e.createBuilder();
        hgVar.copyOnWrite();
        C52159hk hkVar = (C52159hk) hgVar.instance;
        hkVar.f136864c = 2;
        hkVar.f136862a |= 4;
        C58485gu n = C58485gu.m89846n(C15670b.m32466a(str, "common_media_control_args", "assistant.api.client_op.CommonMediaControlArgs", (C52159hk) hgVar.build()));
        C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
        C52081en b = C15669a.m32463b(n, Arrays.asList(new Integer[]{23164}));
        eVar.copyOnWrite();
        C51195j jVar = (C51195j) eVar.instance;
        b.getClass();
        jVar.f133275j = b;
        jVar.f133266a |= 128;
        return C58833ax.m90834k((C51195j) eVar.build());
    }

    /* renamed from: a */
    public final C15668t mo22414a(C15666r rVar) {
        C15627a aVar = new C15627a(this, rVar);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(aVar), this.f46727c);
        C15658j jVar = new C15658j();
        jVar.f46787a = m;
        return jVar.mo22491a();
    }
}
