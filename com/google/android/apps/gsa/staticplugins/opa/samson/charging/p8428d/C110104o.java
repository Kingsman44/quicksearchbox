package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.core.app.C1836w;
import androidx.core.app.C1839z;
import androidx.core.content.C1877c;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.bo;
import com.google.android.apps.gsa.opaonboarding.C83879am;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83938e;
import com.google.android.apps.gsa.opaonboarding.C83940g;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p6974ae.C89095d;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90023cb;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110403c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.search.assistant.proactive.C36334o;
import com.google.android.libraries.search.assistant.proactive.C36335p;
import com.google.android.libraries.search.assistant.proactive.C36337r;
import com.google.common.base.C58913w;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4537i.C59277b;
import com.google.common.p4537i.C59294s;
import com.google.common.p4552o.p4553a.C59566v;
import com.google.common.p4552o.p4553a.C59567w;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.d.o */
/* compiled from: PG */
public final class C110104o {

    /* renamed from: f */
    private static final C59071e f306781f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.charging.d.o");

    /* renamed from: a */
    public final Context f306782a;

    /* renamed from: b */
    public final C110403c f306783b;

    /* renamed from: c */
    public final C86054o f306784c;

    /* renamed from: d */
    public final C86124t f306785d;

    /* renamed from: e */
    public final bm f306786e;

    /* renamed from: g */
    private final NotificationManager f306787g;

    /* renamed from: h */
    private final C36337r f306788h;

    /* renamed from: i */
    private final bo f306789i;

    public C110104o(Context context, C110403c cVar, C86054o oVar, NotificationManager notificationManager, C86124t tVar, C36337r rVar, bo boVar, bm bmVar) {
        this.f306782a = context;
        this.f306783b = cVar;
        this.f306784c = oVar;
        this.f306787g = notificationManager;
        this.f306785d = tVar;
        this.f306788h = rVar;
        this.f306789i = boVar;
        this.f306786e = bmVar;
    }

    /* renamed from: a */
    public final void mo98382a() {
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        if (this.f306785d.mo79746e(C90023cb.f248126b)) {
            C59104x b = f306781f.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SetupNotifCtrl");
            ((C59052c) ((C59052c) b).mo56372aa(25696)).mo56386p("#showNotification()");
            C36334o a = this.f306788h.mo40114a(C36335p.OPA_PRODUCT_UPDATES);
            C1839z a2 = C89095d.m144923a(this.f306782a, a.f94887a);
            C28292j jVar = new C28292j(75722);
            jVar.mo33795i(5);
            C28293k e = C28293k.m52908e(jVar, new C28293k[0]);
            C89949q.m146521e(C28285c.m52875b(e, 75711), false);
            C28292j jVar2 = ((C28257a) e).f76908a;
            if (jVar2 != null) {
                bo boVar = this.f306789i;
                Bundle bundle = new Bundle();
                bundle.putBoolean("seq_args_is_ch_am", true);
                C83879am o = C83880an.m133553o();
                C83940g gVar = (C83940g) o;
                gVar.f228605a = "ch_am_seq";
                gVar.f228607c = new C83938e(0, (String) null, (String) null);
                C59566v vVar = (C59566v) C59567w.f158058g.createBuilder();
                C9439b bVar = C9439b.OPA_AMBIENT_MODE_ONBOARDING;
                vVar.copyOnWrite();
                C59567w wVar = (C59567w) vVar.instance;
                wVar.f158062c = bVar.f32835aq;
                wVar.f158060a |= 2;
                o.mo77222b((C59567w) vVar.build());
                gVar.f228606b = bundle;
                o.mo77225e((int) this.f306785d.mo79743a(C90014bt.f247637ks));
                pendingIntent = boVar.d(o.mo77221a().mo77240n(), jVar2);
                pendingIntent2 = this.f306789i.u(jVar2);
            } else {
                pendingIntent2 = null;
                pendingIntent = null;
            }
            String string = this.f306782a.getString(R.string.oobe_notification_title);
            String string2 = this.f306782a.getString(R.string.oobe_notification_content);
            a2.f5679J.icon = R.drawable.opa_logo;
            a2.f5670A = C1878d.m5128a(this.f306782a, R.color.google_blue);
            a2.f5694n = C1839z.m5037c(this.f306782a.getString(R.string.oobe_notification_subtext));
            a2.f5685e = C1839z.m5037c(string);
            a2.f5686f = C1839z.m5037c(string2);
            a2.f5690j = 0;
            a2.mo5015d(16, true);
            C1836w wVar2 = new C1836w();
            Drawable a3 = C1877c.m5125a(this.f306782a, R.drawable.ic_charging_notification_illus);
            Bitmap createBitmap = Bitmap.createBitmap(a3.getIntrinsicWidth(), a3.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            a3.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            a3.draw(canvas);
            wVar2.mo5012e(createBitmap);
            wVar2.f5580f = C1839z.m5037c(string);
            wVar2.f5581g = C1839z.m5037c(string2);
            wVar2.f5582h = true;
            a2.mo5022k(wVar2);
            a2.f5675F = a.f94887a;
            if (pendingIntent != null) {
                a2.f5687g = pendingIntent;
            }
            if (pendingIntent2 != null) {
                a2.f5679J.deleteIntent = pendingIntent2;
            }
            Notification a4 = a2.mo5013a();
            NotificationManager notificationManager = this.f306787g;
            byte[] bytes = a4.toString().getBytes(C58913w.f156754c);
            notificationManager.notify("amb", ((C59277b) C59294s.m92134d()).mo56761d(bytes, bytes.length).mo56771a(), a4);
        }
        if (this.f306785d.mo79746e(C90023cb.f248127c)) {
            C59104x b2 = f306781f.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SetupNotifCtrl");
            ((C59052c) ((C59052c) b2).mo56372aa(25697)).mo56386p("#showPopup()");
            boolean e2 = this.f306785d.mo79746e(C90023cb.f248125a);
            Context context = this.f306782a;
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("seq_args_is_ch_am", true);
            bundle2.putBoolean("use_compact_flow", e2);
            C83879am o2 = C83880an.m133553o();
            C83940g gVar2 = (C83940g) o2;
            gVar2.f228605a = "ch_am_seq2";
            gVar2.f228607c = new C83938e(0, (String) null, (String) null);
            C59566v vVar2 = (C59566v) C59567w.f158058g.createBuilder();
            C9439b bVar2 = C9439b.OPA_AMBIENT_MODE_ONBOARDING;
            vVar2.copyOnWrite();
            C59567w wVar3 = (C59567w) vVar2.instance;
            wVar3.f158062c = bVar2.f32835aq;
            wVar3.f158060a |= 2;
            o2.mo77222b((C59567w) vVar2.build());
            gVar2.f228606b = bundle2;
            o2.mo77225e((int) this.f306785d.mo79743a(C90014bt.f247637ks));
            context.startActivity(o2.mo77221a().mo77240n().addFlags(268435456));
        }
    }
}
