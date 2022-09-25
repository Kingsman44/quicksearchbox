package com.google.android.apps.search.googleapp.customtabs.p10155e;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.core.p094f.C1888a;
import com.google.android.apps.gsa.p8867w.p8879i.C118815p;
import com.google.android.apps.gsa.shared.p7066m.C90007bm;
import com.google.android.apps.search.googleapp.customtabs.features.buttons.C133815a;
import com.google.android.apps.search.googleapp.customtabs.features.buttons.C133823b;
import com.google.android.apps.search.googleapp.customtabs.features.buttons.C133824c;
import com.google.android.apps.search.googleapp.customtabs.features.buttons.C133827d;
import com.google.android.apps.search.googleapp.customtabs.features.buttons.share.C133852b;
import com.google.android.apps.search.googleapp.customtabs.p10151c.C133702x;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133731q;
import com.google.android.apps.search.googleapp.saves.savefeature.C137299g;
import com.google.android.apps.search.googleapp.saves.savefeature.C137300h;
import com.google.android.apps.search.googleapp.saves.savefeature.p10397b.C137282a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.android.libraries.p1703d.C20648d;
import com.google.android.libraries.p1703d.C20658n;
import com.google.android.libraries.p1703d.C20659o;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58893dc;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57665z;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.e.k */
/* compiled from: PG */
public final /* synthetic */ class C133768k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133769l f364343a;

    /* renamed from: b */
    public final /* synthetic */ Uri f364344b;

    /* renamed from: c */
    public final /* synthetic */ C133759b f364345c;

    public /* synthetic */ C133768k(C133769l lVar, Uri uri, C133759b bVar) {
        this.f364343a = lVar;
        this.f364344b = uri;
        this.f364345c = bVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C133769l lVar = this.f364343a;
        Uri uri = this.f364344b;
        C133759b bVar = this.f364345c;
        C133731q qVar = (C133731q) obj;
        C60870cx a = lVar.f364366u.mo103972a();
        C60870cx b = lVar.f364354i.mo50215b(lVar.f364353h);
        C60870cx g = C60922j.m93044g(C60856cj.m92900i(lVar.f364367v.f331359a.mo79749o(C90007bm.f246882a)), C47810es.m84963c(new C133761d(lVar)), lVar.f364356k);
        C60870cx a2 = lVar.f364357l.mo50251a();
        C133827d dVar = lVar.f364348c;
        Resources resources = dVar.f364510a.getResources();
        C58480gp e = C58485gu.m89837e();
        C20658n f = C20659o.m38802f();
        f.mo25610c(100);
        f.mo25639e(BitmapFactory.decodeResource(resources, R.drawable.quantum_gm_ic_bookmark_border_gm_grey_48));
        f.mo25609b(resources.getString(R.string.ga_custom_tabs_save_description));
        AccountId accountId = dVar.f364511b;
        C137299g gVar = (C137299g) C137300h.f373505h.createBuilder();
        C57665z zVar = C57665z.WEB_PAGE;
        gVar.copyOnWrite();
        ((C137300h) gVar.instance).f373508b = zVar.getNumber();
        gVar.copyOnWrite();
        ((C137300h) gVar.instance).f373511e = 1;
        Intent a3 = C137282a.m223047a((C137300h) gVar.build(), accountId);
        a3.addFlags(268435456);
        int i = true != C1888a.m5149c() ? 134217728 : 167772160;
        PendingIntent activity = PendingIntent.getActivity(dVar.f364510a, 100, C147798a.m240896b(a3, i, 5), i);
        C58893dc.m90996a(activity);
        ((C20648d) f).f57888a = activity;
        e.mo55395g(f.mo25608a());
        C20658n f2 = C20659o.m38802f();
        f2.mo25610c(101);
        f2.mo25639e(BitmapFactory.decodeResource(resources, R.drawable.quantum_gm_ic_share_gm_grey_48));
        f2.mo25609b(resources.getString(R.string.ga_custom_tabs_share_description));
        AccountId accountId2 = dVar.f364511b;
        Intent a4 = C133852b.m217126a();
        C45963aa.m82131a(a4, accountId2);
        a4.addFlags(268435456);
        int i2 = true != C1888a.m5149c() ? 134217728 : 167772160;
        PendingIntent activity2 = PendingIntent.getActivity(dVar.f364510a, 0, C147798a.m240896b(a4, i2, 5), i2);
        C58893dc.m90996a(activity2);
        ((C20648d) f2).f57888a = activity2;
        e.mo55395g(f2.mo25608a());
        C60870cx i3 = C60856cj.m92900i(e.mo55394f());
        if (!dVar.f364516g) {
            cxVar = C60856cj.m92900i(false);
        } else {
            C60870cx i4 = C60856cj.m92900i(((C118815p) dVar.f364515f).mo103991k());
            C60870cx c = dVar.f364514e.mo50246c(dVar.f364511b);
            cxVar = C47636i.m84746e(i4, c).mo51518a(new C133815a(c, i4), dVar.f364512c);
        }
        C47633f h = C47633f.m84733g(cxVar).mo51515h(new C133823b(dVar, bVar), dVar.f364512c);
        C47633f a5 = C47636i.m84746e(i3, h).mo51518a(new C133824c(i3, h), dVar.f364512c);
        C60870cx h2 = C60922j.m93045h(lVar.f364350e.f364126e.mo50395b(), C47810es.m84966f(C133702x.f364178a), C60826bg.f164896a);
        return C47638k.m84753d(a, b, g, a2, a5, h2).mo51520a(new C133762e(lVar, uri, h2, bVar, qVar, b, g, a, a2, a5), lVar.f364356k);
    }
}
