package com.google.android.apps.gsa.search.core;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.search.core.p6513aj.C84559s;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7180q.C91083b;
import com.google.android.apps.gsa.shared.util.p7180q.C91084c;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public class LocaleChangedReceiver extends C85631ap {

    /* renamed from: a */
    public SharedPreferences f229543a;

    /* renamed from: b */
    public bm f229544b;

    /* renamed from: c */
    public C84559s f229545c;

    /* renamed from: d */
    public C86124t f229546d;

    /* renamed from: e */
    public C118561t f229547e;

    /* renamed from: f */
    public C22871g f229548f;

    public LocaleChangedReceiver() {
        C91083b.m148803a(C91084c.SEARCH);
    }

    public final void onReceive(Context context, Intent intent) {
        C74507e.m120467c(19);
        if (this.f229543a == null) {
            try {
                mo79111a(context);
            } catch (ClassCastException unused) {
                return;
            }
        }
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            this.f229548f.mo28212l("Executing Intent.ACTION_LOCALE_CHANGED.", new C85632aq(this, context));
            C118561t tVar = this.f229547e;
            C118522by byVar = C118522by.CHIME_REGISTRATION;
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            long millis = TimeUnit.HOURS.toMillis(1);
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328821a |= 2;
            agVar.f328823c = millis;
            tVar.mo103754e(byVar, (C118472ag) afVar.build());
        }
    }
}
