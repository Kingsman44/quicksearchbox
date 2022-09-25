package com.google.android.apps.gsa.startup;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.proactive.C84175k;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.C85767f;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90952r;
import com.google.android.apps.gsa.shared.util.p7180q.C91083b;
import com.google.android.apps.gsa.shared.util.p7180q.C91084c;
import com.google.android.apps.gsa.sidekick.main.trigger.C91630g;
import com.google.android.apps.gsa.sidekick.main.trigger.service.C91635c;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;
import java.util.Set;

/* compiled from: PG */
public class StartUpReceiver extends C92659a {

    /* renamed from: a */
    public C90929bz f258643a;

    /* renamed from: b */
    public SharedPreferences f258644b;

    /* renamed from: c */
    public C68214a f258645c;

    /* renamed from: d */
    public C68214a f258646d;

    /* renamed from: e */
    public C68214a f258647e;

    /* renamed from: f */
    public C68214a f258648f;

    /* renamed from: g */
    public C68214a f258649g;

    /* renamed from: h */
    public C68214a f258650h;

    /* renamed from: i */
    public C88483e f258651i;

    /* renamed from: j */
    public C68214a f258652j;

    /* renamed from: k */
    public boolean f258653k;

    public StartUpReceiver() {
        C91083b.m148803a(C91084c.SEARCH);
    }

    /* renamed from: c */
    private final void m152615c() {
        this.f258643a.mo85139d(new C92661c(this));
    }

    /* renamed from: b */
    public final void mo87427b(Context context, Intent intent) {
        String action = intent.getAction();
        boolean equals = "android.intent.action.MY_PACKAGE_REPLACED".equals(action);
        boolean equals2 = "android.intent.action.BOOT_COMPLETED".equals(action);
        boolean equals3 = "android.intent.action.USER_INITIALIZE".equals(action);
        C58976aa aaVar = C58975e.f156826a;
        if (equals2 || equals) {
            mo87429a(context);
            this.f258644b.edit().putBoolean("service_created", false).apply();
            for (C86091a c : (Set) this.f258646d.mo27525b()) {
                c.mo17494c(equals, equals2);
            }
            for (C86091a c2 : (Set) this.f258647e.mo27525b()) {
                c2.mo17494c(equals, equals2);
            }
            m152615c();
            C85767f.m137817a(context);
            if (equals2) {
                Intent intent2 = new Intent("com.google.android.googlequicksearchbox.interactor.BOOT_COMPLETED");
                intent2.setPackage("com.google.android.googlequicksearchbox");
                context.sendBroadcast(intent2);
            }
            if (((C85651bb) this.f258648f.mo27525b()).mo79141N()) {
                context.getApplicationContext();
                ((C84175k) this.f258645c.mo27525b()).mo77640c(true);
                C91635c.m149897b((C118561t) this.f258649g.mo27525b(), C118522by.TRIGGER_CONDITION_RESET, (C91630g) null);
                ((C118561t) this.f258649g.mo27525b()).mo103754e(C118522by.UPDATE_NOTIFICATIONS, C118472ag.f328819i);
            }
            C87739bu buVar = !equals2 ? C87739bu.APP_INSTALL : C87739bu.DEVICE_BOOT;
            C88483e eVar = this.f258651i;
            C88486g gVar = new C88486g();
            gVar.f239201c = amo.STARTUP_RECEIVER;
            gVar.f239204f = "device_boot_or_install";
            ClientConfig clientConfig = new ClientConfig(gVar);
            C88489j jVar = new C88489j(buVar);
            jVar.mo82015c(intent);
            this.f258643a.mo85142g(eVar.mo82004b(clientConfig, jVar.mo82013a(), 50000), new C90952r("Velvet.StartUpReceiver", "notify session controller", "failure"));
        } else if (equals3) {
            mo87429a(context);
            m152615c();
        }
    }

    public final void onReceive(Context context, Intent intent) {
        C74507e.m120467c(30);
        if (this.f258653k) {
            ((C60888db) this.f258652j.mo27525b()).mo19398a(new C92660b(this, context, intent, goAsync()));
            return;
        }
        mo87427b(context, intent);
    }
}
