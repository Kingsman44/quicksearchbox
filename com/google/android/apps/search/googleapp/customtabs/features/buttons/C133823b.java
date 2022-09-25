package com.google.android.apps.search.googleapp.customtabs.features.buttons;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import androidx.core.p094f.C1888a;
import com.google.android.apps.gsa.h.g.e;
import com.google.android.apps.gsa.p5855h.p5858m.C74537b;
import com.google.android.apps.search.googleapp.customtabs.features.buttons.copylink.CopyLinkReceiver_Receiver;
import com.google.android.apps.search.googleapp.customtabs.features.buttons.help.HelpActivity;
import com.google.android.apps.search.googleapp.customtabs.features.buttons.personalinforemoval.C133845g;
import com.google.android.apps.search.googleapp.customtabs.features.buttons.personalinforemoval.PersonalInfoRemovalActivity;
import com.google.android.apps.search.googleapp.customtabs.p10155e.C133759b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.android.libraries.p1703d.C20650f;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.common.base.C58817ah;
import com.google.common.base.C58893dc;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.buttons.b */
/* compiled from: PG */
public final /* synthetic */ class C133823b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C133827d f364503a;

    /* renamed from: b */
    public final /* synthetic */ C133759b f364504b;

    public /* synthetic */ C133823b(C133827d dVar, C133759b bVar) {
        this.f364503a = dVar;
        this.f364504b = bVar;
    }

    public final Object apply(Object obj) {
        C133827d dVar = this.f364503a;
        C133759b bVar = this.f364504b;
        Boolean bool = (Boolean) obj;
        Resources resources = dVar.f364510a.getResources();
        C58480gp e = C58485gu.m89837e();
        C20650f fVar = new C20650f();
        fVar.mo25621b(resources.getString(R.string.googleapp_custom_tabs_copy_link_menu_item_title));
        Context context = dVar.f364510a;
        Intent intent = new Intent();
        intent.setClass(context, CopyLinkReceiver_Receiver.class);
        intent.addFlags(268435456);
        int i = true != C1888a.m5149c() ? 134217728 : 167772160;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, C147798a.m240896b(intent, i, 5), i);
        C58893dc.m90996a(broadcast);
        fVar.f57899a = broadcast;
        e.mo55395g(fVar.mo25620a());
        C20650f fVar2 = new C20650f();
        fVar2.mo25621b(resources.getString(R.string.googleapp_custom_tabs_collections_menu_item_title));
        Context context2 = dVar.f364510a;
        Intent c = e.c(5, Optional.m71637of("and.gsa.save"));
        c.addFlags(268435456);
        PendingIntent activity = PendingIntent.getActivity(context2, 362396499, C147798a.m240896b(c, 201326592, 0), 201326592);
        C58893dc.m90996a(activity);
        fVar2.f57899a = activity;
        e.mo55395g(fVar2.mo25620a());
        C20650f fVar3 = new C20650f();
        fVar3.mo25621b(resources.getString(R.string.googleapp_custom_tabs_recently_menu_item_title));
        fVar3.f57899a = C74537b.m120511a(dVar.f364510a);
        e.mo55395g(fVar3.mo25620a());
        if (bVar.f364318e) {
            C20650f fVar4 = new C20650f();
            fVar4.mo25621b(resources.getString(R.string.googleapp_custom_tabs_help_menu_item_title));
            Context context3 = dVar.f364510a;
            AccountId accountId = dVar.f364511b;
            Intent intent2 = new Intent();
            intent2.setClass(context3, HelpActivity.class);
            intent2.addFlags(268435456);
            C45963aa.m82131a(intent2, accountId);
            int i2 = true != C1888a.m5149c() ? 134217728 : 167772160;
            PendingIntent activity2 = PendingIntent.getActivity(context3, 0, C147798a.m240896b(intent2, i2, 5), i2);
            C58893dc.m90996a(activity2);
            fVar4.f57899a = activity2;
            e.mo55395g(fVar4.mo25620a());
        }
        if (bool.booleanValue()) {
            C20650f fVar5 = new C20650f();
            fVar5.mo25621b(resources.getString(R.string.googleapp_custom_tabs_piros_menu_item_title));
            C133845g gVar = dVar.f364513d;
            Intent intent3 = new Intent();
            intent3.setClass(gVar.f364558a, PersonalInfoRemovalActivity.class);
            intent3.addFlags(268435456);
            C45963aa.m82131a(intent3, gVar.f364559b);
            int i3 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
            PendingIntent activity3 = PendingIntent.getActivity(gVar.f364558a, 0, C147798a.m240896b(intent3, i3, 5), i3);
            C58893dc.m90996a(activity3);
            fVar5.f57899a = activity3;
            e.mo55395g(fVar5.mo25620a());
        }
        return e.mo55394f();
    }
}
