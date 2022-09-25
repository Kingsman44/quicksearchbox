package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89636g;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95853d;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96460ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142344bw;
import com.google.android.p10712d.C142355cg;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60105ky;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.u */
/* compiled from: PG */
public final class C96618u implements AutoCloseable {

    /* renamed from: a */
    public static final C59071e f270295a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.w.u");

    /* renamed from: b */
    public final C68214a f270296b;

    /* renamed from: c */
    public final C124548d f270297c;

    /* renamed from: d */
    public final NotificationManager f270298d;

    /* renamed from: e */
    public C58833ax f270299e = C58836b.f156633a;

    /* renamed from: f */
    public int f270300f;

    /* renamed from: g */
    private final Context f270301g;

    /* renamed from: h */
    private final C22871g f270302h;

    /* renamed from: i */
    private final C22871g f270303i;

    /* renamed from: j */
    private final C95853d f270304j;

    /* renamed from: k */
    private final C96615r f270305k;

    /* renamed from: l */
    private final String f270306l;

    public C96618u(Context context, C22871g gVar, C22871g gVar2, C68214a aVar, C95853d dVar, C96615r rVar, C95355bf bfVar, C95850a aVar2) {
        this.f270301g = context;
        this.f270302h = gVar;
        this.f270303i = gVar2;
        this.f270296b = aVar;
        String k = bfVar.mo89270k();
        this.f270306l = k;
        this.f270304j = dVar;
        this.f270305k = rVar;
        this.f270298d = (NotificationManager) context.getSystemService("notification");
        C124548d b = ((C89492cd) aVar.mo27525b()).mo83401b(k);
        if (b != null) {
            this.f270297c = b;
            this.f270300f = b.mo106507f();
            C58976aa aaVar = C58975e.f156826a;
            aVar2.f268408a.add(this);
            return;
        }
        throw new IllegalArgumentException("No device info found for device id: ".concat(String.valueOf(k)));
    }

    /* renamed from: h */
    private final synchronized PendingIntent m160101h() {
        Intent a;
        a = this.f270304j.f268411a.mo88553a();
        a.setAction("bisto_apply_ota").setIdentifier(this.f270297c.mo106475P()).putExtra("key_device_id", this.f270297c.mo106475P());
        return PendingIntent.getService(this.f270301g, 1003, a, 201326592);
    }

    /* renamed from: i */
    private final synchronized void m160102i(C1839z zVar) {
        if (!this.f270299e.mo56113h()) {
            this.f270299e = C58833ax.m90834k(Integer.valueOf(this.f270305k.f270292a.getAndIncrement()));
        }
        this.f270298d.notify(((Integer) this.f270299e.mo56107c()).intValue(), zVar.mo5013a());
    }

    /* renamed from: j */
    private final boolean m160103j() {
        return C124719q.CAR_ACCESSORY.equals(this.f270297c.mo106513k());
    }

    /* renamed from: a */
    public final synchronized void mo90276a() {
        C58976aa aaVar = C58975e.f156826a;
        Context context = this.f270301g;
        m160102i(C96460ar.m159822b(context, context.getString(R.string.ota_model_upload_notif_title, new Object[]{this.f270297c.mo106476Q()}), this.f270301g.getString(R.string.ota_model_upload_notif_text), C96460ar.f269855b, C58833ax.m90834k(this.f270297c.mo106513k())));
    }

    /* renamed from: b */
    public final synchronized void mo90277b() {
        C58976aa aaVar = C58975e.f156826a;
        int i = true != m160103j() ? R.string.ota_applying_notif_text : R.string.ota_applying_notif_text_device;
        Context context = this.f270301g;
        C1839z b = C96460ar.m159822b(context, context.getString(R.string.ota_applying_notif_title, new Object[]{this.f270297c.mo106476Q()}), this.f270301g.getString(i), C96460ar.f269855b, C58833ax.m90834k(this.f270297c.mo106513k()));
        b.mo5020i(0, 0, true);
        m160102i(b);
    }

    /* renamed from: c */
    public final void mo90278c() {
        this.f270302h.mo28209i(((C89492cd) this.f270296b.mo27525b()).mo83405k(this.f270306l), "publishDoneNotification", new C96616s(this));
    }

    public final synchronized void close() {
        mo90283g();
    }

    /* renamed from: d */
    public final synchronized void mo90280d(C142324bc bcVar) {
        String str;
        C58833ax axVar;
        C58976aa aaVar = C58975e.f156826a;
        int i = true != m160103j() ? R.string.ota_up_to_date_notif_text : R.string.ota_up_to_date_notif_text_device;
        C142344bw bwVar = bcVar.f386121g;
        if (bwVar == null) {
            bwVar = C142344bw.f386209i;
        }
        if ((bwVar.f386211a & 4) != 0) {
            C142344bw bwVar2 = bcVar.f386121g;
            if (bwVar2 == null) {
                bwVar2 = C142344bw.f386209i;
            }
            C142355cg cgVar = bwVar2.f386214d;
            if (cgVar == null) {
                cgVar = C142355cg.f386263b;
            }
            str = C124525f.m203989e(cgVar);
        } else {
            str = null;
        }
        Context context = this.f270301g;
        String string = context.getString(R.string.ota_up_to_date_notif_title, new Object[]{this.f270297c.mo106476Q()});
        if (str == null) {
            str = this.f270301g.getString(i);
        }
        C1839z b = C96460ar.m159822b(context, string, str, C96460ar.f269855b, C58833ax.m90834k(this.f270297c.mo106513k()));
        C142344bw bwVar3 = bcVar.f386121g;
        if (((bwVar3 == null ? C142344bw.f386209i : bwVar3).f386211a & 8) != 0) {
            if (bwVar3 == null) {
                bwVar3 = C142344bw.f386209i;
            }
            axVar = C58833ax.m90834k(bwVar3.f386215e);
        } else {
            axVar = C58836b.f156633a;
        }
        if (axVar.mo56113h()) {
            axVar.mo56107c();
            PendingIntent activity = PendingIntent.getActivity(this.f270301g, this.f270297c.mo106475P().hashCode(), new Intent("android.intent.action.VIEW", Uri.parse((String) axVar.mo56107c())), 201326592);
            b.mo5015d(16, true);
            b.f5687g = activity;
        } else {
            PendingIntent activity2 = PendingIntent.getActivity(this.f270301g, this.f270297c.mo106475P().hashCode(), C89636g.m145895a(this.f270301g, this.f270297c.mo106475P(), this.f270297c.mo106481V(), 1, C60105ky.ANDROID_OOBE_NOTIFICATION_OTA_DONE), 201326592);
            b.mo5015d(16, true);
            b.f5687g = activity2;
        }
        m160102i(b);
    }

    /* renamed from: e */
    public final synchronized void mo90281e() {
        String str;
        C96459aq aqVar;
        if (this.f270300f >= 3) {
            C59104x b = f270295a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OtaNotificationManager");
            ((C59052c) ((C59052c) b).mo56372aa(16576)).mo56386p("Not posting WAITING_TO_APPLY since reached limit for this session.");
            return;
        }
        C59104x b2 = f270295a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "OtaNotificationManager");
        ((C59052c) ((C59052c) b2).mo56372aa(16575)).mo56386p("Publishing OTA notification");
        PendingIntent h = m160101h();
        Context context = this.f270301g;
        String string = context.getString(R.string.ota_ready_notif_title, new Object[]{this.f270297c.mo106476Q()});
        if (m160103j()) {
            str = this.f270301g.getString(R.string.ota_ready_notif_text_car);
        } else {
            str = this.f270301g.getString(R.string.ota_ready_notif_text);
        }
        if (this.f270300f == 0) {
            aqVar = C96460ar.f269856c;
        } else {
            aqVar = C96460ar.f269855b;
        }
        C1839z b3 = C96460ar.m159822b(context, string, str, aqVar, C58833ax.m90834k(this.f270297c.mo106513k()));
        b3.f5687g = h;
        b3.mo5016e(0, this.f270301g.getString(R.string.ota_apply_action), h);
        m160102i(b3);
        this.f270303i.mo28213m("inc-ota-count", 1500, new C96617t(this));
    }

    /* renamed from: f */
    public final synchronized void mo90282f(int i, int i2) {
        Context context = this.f270301g;
        C1839z b = C96460ar.m159822b(context, context.getString(R.string.ota_uploading_notif_title, new Object[]{this.f270297c.mo106476Q()}), this.f270301g.getString(R.string.ota_uploading_notif_text), C96460ar.f269855b, C58833ax.m90834k(this.f270297c.mo106513k()));
        b.mo5020i(i2, i, false);
        m160102i(b);
    }

    /* renamed from: g */
    public final synchronized void mo90283g() {
        if (this.f270299e.mo56113h()) {
            C59104x b = f270295a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OtaNotificationManager");
            ((C59052c) ((C59052c) b).mo56372aa(16577)).mo56386p("Removed OTA notification");
            this.f270298d.cancel(((Integer) this.f270299e.mo56107c()).intValue());
            this.f270299e = C58836b.f156633a;
        }
    }
}
