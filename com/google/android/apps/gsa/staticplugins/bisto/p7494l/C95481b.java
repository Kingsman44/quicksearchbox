package com.google.android.apps.gsa.staticplugins.bisto.p7494l;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96460ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.l.b */
/* compiled from: PG */
public final class C95481b implements AutoCloseable, C89495cg {

    /* renamed from: a */
    public static final C59071e f267181a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.l.b");

    /* renamed from: b */
    public final Context f267182b;

    /* renamed from: c */
    public final C89492cd f267183c;

    /* renamed from: d */
    public C124548d f267184d;

    /* renamed from: e */
    private final C95480a f267185e;

    /* renamed from: f */
    private final NotificationManager f267186f;

    /* renamed from: g */
    private final C95355bf f267187g;

    /* renamed from: h */
    private C58833ax f267188h = C58836b.f156633a;

    public C95481b(Context context, C89492cd cdVar, C95480a aVar, C95346ax axVar) {
        this.f267182b = context;
        this.f267183c = cdVar;
        this.f267185e = aVar;
        this.f267187g = axVar;
        this.f267184d = cdVar.mo83401b(axVar.mo89270k());
        this.f267186f = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: d */
    private final synchronized void m157928d(String str, String str2) {
        C124548d dVar = this.f267184d;
        if (dVar == null) {
            C59104x c = f267181a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoNotifManager");
            ((C59052c) ((C59052c) c).mo56372aa(15085)).mo56386p("null deviceInfo");
            return;
        }
        C1839z b = C96460ar.m159822b(this.f267182b, str, str2, C96460ar.f269856c, C58833ax.m90834k(dVar.mo106513k()));
        PendingIntent service = PendingIntent.getService(this.f267182b, dVar.mo106475P().hashCode() + 50, new Intent("proxy_hotword_notification").setClassName(this.f267182b, "com.google.android.apps.gsa.staticplugins.bisto.BistoRealService").putExtra("proxied_message_id", 1).putExtra("key_device_id", dVar.mo106475P()), 201326592);
        PendingIntent service2 = PendingIntent.getService(this.f267182b, dVar.mo106475P().hashCode() + 60, new Intent("proxy_hotword_notification").setClassName(this.f267182b, "com.google.android.apps.gsa.staticplugins.bisto.BistoRealService").putExtra("proxied_message_id", 0).putExtra("key_device_id", dVar.mo106475P()), 201326592);
        b.mo5016e(0, this.f267182b.getString(R.string.setting_button_text), service);
        b.mo5016e(0, this.f267182b.getString(R.string.dismiss_button_text), service2);
        b.mo5015d(16, true);
        b.f5687g = service;
        m157929e(b);
    }

    /* renamed from: e */
    private final synchronized void m157929e(C1839z zVar) {
        C59104x b = f267181a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoNotifManager");
        ((C59052c) ((C59052c) b).mo56372aa(15086)).mo56386p("publishing hotword notification");
        if (!this.f267188h.mo56113h()) {
            this.f267188h = C58833ax.m90834k(Integer.valueOf(this.f267185e.f267180a.getAndIncrement()));
        }
        this.f267186f.notify(((Integer) this.f267188h.mo56107c()).intValue(), zVar.mo5013a());
    }

    /* renamed from: a */
    public final synchronized void mo89382a() {
        C59071e eVar = f267181a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoNotifManager");
        ((C59052c) ((C59052c) b).mo56372aa(15081)).mo56386p("publishConsentHotwordNotification");
        C124548d dVar = this.f267184d;
        if (dVar == null) {
            C59104x c = eVar.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoNotifManager");
            ((C59052c) ((C59052c) c).mo56372aa(15082)).mo56386p("null deviceInfo");
            return;
        }
        m157928d(this.f267182b.getString(R.string.hotword_consent_title, new Object[]{dVar.mo106476Q()}), this.f267182b.getString(R.string.hotword_consent_text, new Object[]{dVar.mo106476Q()}));
    }

    /* renamed from: b */
    public final synchronized void mo89383b() {
        C59071e eVar = f267181a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoNotifManager");
        ((C59052c) ((C59052c) b).mo56372aa(15083)).mo56386p("publishDisabledHotwordNotification");
        C124548d dVar = this.f267184d;
        if (dVar == null) {
            C59104x c = eVar.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoNotifManager");
            ((C59052c) ((C59052c) c).mo56372aa(15084)).mo56386p("null deviceInfo");
            return;
        }
        m157928d(this.f267182b.getString(R.string.hotword_disabled_title, new Object[]{dVar.mo106476Q()}), this.f267182b.getString(R.string.hotword_disabled_text, new Object[]{dVar.mo106476Q()}));
    }

    /* renamed from: c */
    public final synchronized void mo89384c() {
        if (this.f267188h.mo56113h()) {
            C59104x b = f267181a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoNotifManager");
            ((C59052c) ((C59052c) b).mo56372aa(15087)).mo56386p("Removed Bisto notification");
            this.f267186f.cancel(((Integer) this.f267188h.mo56107c()).intValue());
            this.f267188h = C58836b.f156633a;
        }
    }

    public final synchronized void close() {
        this.f267183c.mo83379U(this);
        mo89384c();
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        if (this.f267187g.mo89270k().equals(str)) {
            synchronized (this) {
                this.f267184d = dVar;
            }
        }
    }
}
