package com.google.android.apps.gsa.staticplugins.microdetection.p8041c;

import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.speech.hotword.C92354c;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.mdi.download.C28696ab;
import com.google.android.libraries.mdi.download.C28739bq;
import com.google.android.libraries.mdi.download.C28740br;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29436g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.c.i */
/* compiled from: PG */
public final /* synthetic */ class C102813i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C102821q f287085a;

    /* renamed from: b */
    public final /* synthetic */ String f287086b;

    /* renamed from: c */
    public final /* synthetic */ C90584f f287087c;

    public /* synthetic */ C102813i(C102821q qVar, String str, C90584f fVar) {
        this.f287085a = qVar;
        this.f287086b = str;
        this.f287087c = fVar;
    }

    public final C60870cx apply(Object obj) {
        C102821q qVar = this.f287085a;
        String str = this.f287086b;
        Void voidR = (Void) obj;
        String c = C92354c.m151657c(str, this.f287087c);
        C59104x b = C102821q.f287099a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ModelDownloadController");
        ((C59052c) ((C59052c) b).mo56372aa(21186)).mo56354G("Fetching and maybe downloading FileGroup with name: %s, locale: %s", c, str);
        C28739bq m = C28740br.m53599m();
        m.mo34338d(c);
        m.mo34337c(C28696ab.f77968a);
        C29436g gVar = (C29436g) m;
        gVar.f79804d = C58833ax.m90834k(qVar.f287105g.getString(R.string.hotword_model_download_notification_title, new Object[]{((C92486a) qVar.f287106h.mo27525b()).mo87230d()}));
        gVar.f79805e = C58833ax.m90834k(qVar.f287105g.getString(R.string.hotword_model_download_notification_content, new Object[]{((C92486a) qVar.f287106h.mo27525b()).mo87230d()}));
        return ((C29409fd) qVar.f287102d.mo27525b()).mo34715d(m.mo34335a());
    }
}
