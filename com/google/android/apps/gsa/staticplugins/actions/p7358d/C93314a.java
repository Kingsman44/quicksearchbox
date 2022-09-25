package com.google.android.apps.gsa.staticplugins.actions.p7358d;

import android.content.Context;
import com.google.android.apps.gsa.contacts.bg;
import com.google.android.apps.gsa.p8889z.p8917f.C119071a;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.contact.C87514b;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.d.a */
/* compiled from: PG */
public final class C93314a {

    /* renamed from: a */
    public static final C59071e f260216a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actions.d.a");

    /* renamed from: b */
    public final Context f260217b;

    /* renamed from: c */
    public final C21370a f260218c;

    /* renamed from: d */
    public final bg f260219d;

    /* renamed from: e */
    public final C68214a f260220e;

    /* renamed from: f */
    public final C68214a f260221f;

    /* renamed from: g */
    public final C68214a f260222g;

    /* renamed from: h */
    public final C68214a f260223h;

    /* renamed from: i */
    public final C119071a f260224i;

    /* renamed from: j */
    public final C68214a f260225j;

    /* renamed from: k */
    public final C87514b f260226k;

    /* renamed from: l */
    public final C68214a f260227l;

    /* renamed from: m */
    public final C58833ax f260228m;

    public C93314a(Context context, C21370a aVar, C87514b bVar, C68214a aVar2, bg bgVar, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C119071a aVar8, C58833ax axVar) {
        this.f260217b = context;
        this.f260218c = aVar;
        this.f260219d = bgVar;
        this.f260222g = aVar2;
        this.f260220e = aVar3;
        this.f260221f = aVar4;
        this.f260223h = aVar5;
        this.f260225j = aVar6;
        this.f260226k = bVar;
        this.f260227l = aVar7;
        this.f260224i = aVar8;
        this.f260228m = axVar;
    }

    /* renamed from: a */
    public final void mo87632a(boolean z, ActionData actionData, Query query) {
        if (z && ((C87541c) this.f260223h.mo27525b()).mo81641b() != null) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 158;
            String b = C39191a.m68623b(query.f252749G);
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            b.getClass();
            ufVar2.f164093a |= 4;
            ufVar2.f164259n = b;
            int i = actionData.f235998h.f146230cP;
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            ufVar3.f164093a |= 256;
            ufVar3.f164264s = i;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
    }
}
