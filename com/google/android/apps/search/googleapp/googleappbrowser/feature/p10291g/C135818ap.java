package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g;

import com.google.android.libraries.appactions.serviceengine.p11038b.C147883b;
import com.google.android.libraries.appactions.serviceengine.p11038b.C147890i;
import com.google.android.libraries.web.p3353c.C43378w;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3944g.p3948b.p3949a.C52930aa;
import com.google.assistant.p3944g.p3948b.p3949a.C52961z;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.ap */
/* compiled from: PG */
public final /* synthetic */ class C135818ap implements C43378w {

    /* renamed from: a */
    public final /* synthetic */ C135820ar f369933a;

    public /* synthetic */ C135818ap(C135820ar arVar) {
        this.f369933a = arVar;
    }

    /* renamed from: a */
    public final C60870cx mo46481a(Object obj) {
        C135820ar arVar = this.f369933a;
        String str = (String) obj;
        if (C58837ba.m90859h(str)) {
            return C60856cj.m92900i(C46688af.m83205b(C58485gu.m89845m(), arVar.f369938c.mo26871c()));
        }
        C147890i iVar = arVar.f369939d;
        C46407v vVar = iVar.f398938b;
        C52961z zVar = (C52961z) C52930aa.f138777c.createBuilder();
        zVar.copyOnWrite();
        C52930aa aaVar = (C52930aa) zVar.instance;
        obj.getClass();
        aaVar.f138779a |= 1;
        aaVar.f138780b = str;
        return C60922j.m93044g(C60922j.m93044g(vVar.mo50345e((C52930aa) zVar.build()), C47810es.m84963c(new C147883b(iVar)), C60826bg.f164896a), C47810es.m84963c(new C135814al(arVar)), arVar.f369937b);
    }
}
