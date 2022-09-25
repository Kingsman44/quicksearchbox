package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g;

import com.google.android.libraries.appactions.serviceengine.p11038b.C147887f;
import com.google.android.libraries.appactions.serviceengine.p11038b.C147888g;
import com.google.android.libraries.appactions.serviceengine.p11038b.C147889h;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3944g.p3948b.p3949a.C52930aa;
import com.google.assistant.p3944g.p3948b.p3949a.C52931ab;
import com.google.assistant.p3944g.p3948b.p3949a.C52932ac;
import com.google.assistant.p3944g.p3948b.p3949a.C52961z;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.aq */
/* compiled from: PG */
public final /* synthetic */ class C135819aq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C135820ar f369934a;

    /* renamed from: b */
    public final /* synthetic */ String f369935b;

    public /* synthetic */ C135819aq(C135820ar arVar, String str) {
        this.f369934a = arVar;
        this.f369935b = str;
    }

    public final C60870cx apply(Object obj) {
        C135820ar arVar = this.f369934a;
        String str = this.f369935b;
        C46407v vVar = arVar.f369939d.f398938b;
        C52961z zVar = (C52961z) C52930aa.f138777c.createBuilder();
        zVar.copyOnWrite();
        C52930aa aaVar = (C52930aa) zVar.instance;
        str.getClass();
        aaVar.f138779a |= 1;
        aaVar.f138780b = str;
        C52931ab abVar = (C52931ab) C52932ac.f138781d.createBuilder();
        abVar.copyOnWrite();
        C52932ac acVar = (C52932ac) abVar.instance;
        acVar.f138785c = 1;
        acVar.f138783a |= 2;
        Optional map = Collection.EL.stream((C58485gu) obj).findFirst().map(C147887f.f398934a).map(C147888g.f398935a);
        Objects.requireNonNull(abVar);
        map.ifPresent(new C147889h(abVar));
        return C60922j.m93044g(vVar.mo50346f((C52930aa) zVar.build(), C60856cj.m92900i((C52932ac) abVar.build())), C47810es.m84963c(C135813ak.f369928a), arVar.f369937b);
    }
}
