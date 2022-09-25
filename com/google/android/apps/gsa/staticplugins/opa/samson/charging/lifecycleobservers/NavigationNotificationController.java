package com.google.android.apps.gsa.staticplugins.opa.samson.charging.lifecycleobservers;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.C1800aq;
import androidx.core.app.C1839z;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.assistant.shared.bo;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6931i.C87573b;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8446q.C110397a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.proactive.C36335p;
import com.google.android.libraries.search.assistant.proactive.C36337r;
import com.google.android.libraries.search.assistant.proactive.C36371y;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
public final class NavigationNotificationController implements C110114a {

    /* renamed from: a */
    private final Context f306833a;

    /* renamed from: b */
    private final C110397a f306834b;

    /* renamed from: c */
    private final C68214a f306835c;

    /* renamed from: d */
    private final Set f306836d = new HashSet();

    /* renamed from: e */
    private final C36337r f306837e;

    /* renamed from: f */
    private final C1800aq f306838f;

    /* renamed from: g */
    private final C86124t f306839g;

    /* renamed from: h */
    private final bo f306840h;

    /* renamed from: i */
    private final C21370a f306841i;

    /* renamed from: j */
    private boolean f306842j = false;

    public NavigationNotificationController(Context context, C110397a aVar, C36337r rVar, C68214a aVar2, C86124t tVar, bo boVar, C21370a aVar3) {
        this.f306839g = tVar;
        this.f306840h = boVar;
        this.f306841i = aVar3;
        C58976aa aaVar = C58975e.f156826a;
        this.f306833a = context;
        this.f306838f = new C1800aq(context);
        this.f306834b = aVar;
        this.f306837e = rVar;
        this.f306835c = aVar2;
    }

    /* renamed from: g */
    public final void mo98390g() {
        this.f306838f.f5622a.cancel("amb", C89885b.OKHTTP_CONTENT_LENGTH_LIMIT_VALUE);
    }

    /* renamed from: gV */
    public final /* synthetic */ void mo3520gV(C2391v vVar) {
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final void mo3524gZ(C2391v vVar) {
        String canonicalName = vVar.getClass().getCanonicalName();
        C58976aa aaVar = C58975e.f156826a;
        if (canonicalName != null) {
            this.f306836d.add(canonicalName);
        }
        mo98390g();
    }

    /* renamed from: h */
    public final void mo98391h(boolean z) {
        this.f306842j = z;
    }

    /* renamed from: ha */
    public final void mo3525ha(C2391v vVar) {
        PendingIntent v;
        String canonicalName = vVar.getClass().getCanonicalName();
        if (canonicalName != null) {
            this.f306836d.remove(canonicalName);
        }
        C58976aa aaVar = C58975e.f156826a;
        if (this.f306836d.isEmpty() && this.f306834b.mo98624b(true) && !this.f306842j) {
            C28292j jVar = new C28292j(85547);
            jVar.mo33795i(5);
            C28293k e = C28293k.m52908e(jVar, new C28293k[0]);
            C89949q.m146521e(C28285c.m52875b(e, 75711), false);
            C28292j jVar2 = ((C28257a) e).f76908a;
            C1839z zVar = new C1839z(this.f306833a, ((C36371y) this.f306837e).mo40145l(C36335p.OPA_PROACTIVE).f94887a);
            zVar.f5679J.icon = R.drawable.opa_logo;
            zVar.f5685e = C1839z.m5037c(this.f306833a.getString(R.string.navigation_notification_title));
            zVar.f5686f = C1839z.m5037c(this.f306833a.getString(R.string.navigation_notification_content));
            zVar.f5690j = 0;
            zVar.mo5015d(16, true);
            long a = this.f306839g.mo79743a(C90014bt.f247071aI);
            if (a != 0) {
                zVar.f5677H = a;
            } else {
                a = 0;
            }
            if (!(jVar2 == null || (v = this.f306840h.v(jVar2, this.f306841i.mo26870b() + a)) == null)) {
                zVar.f5679J.deleteIntent = v;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("launch_ambient_mode_from_assist", true);
            Intent b = ((C87573b) this.f306835c.mo27525b()).mo81704b(bundle);
            if (b != null) {
                PendingIntent service = PendingIntent.getService(this.f306833a, C89885b.OKHTTP_CONTENT_LENGTH_LIMIT_VALUE, b, 201326592);
                if (jVar2 != null) {
                    service = this.f306840h.c(service, jVar2);
                }
                String string = this.f306833a.getString(R.string.navigation_notification_action);
                service.getClass();
                zVar.mo5016e(0, string, service);
                zVar.f5687g = service;
                this.f306838f.mo5003b("amb", C89885b.OKHTTP_CONTENT_LENGTH_LIMIT_VALUE, zVar.mo5013a());
            }
        }
    }
}
