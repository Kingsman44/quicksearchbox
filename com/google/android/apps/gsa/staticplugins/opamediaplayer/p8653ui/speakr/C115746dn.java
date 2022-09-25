package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.view.MenuItem;
import com.google.android.apps.gsa.shared.p7004aw.p7005a.C89315s;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115423aa;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.dn */
/* compiled from: PG */
public final /* synthetic */ class C115746dn implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115791fe f321012a;

    public /* synthetic */ C115746dn(C115791fe feVar) {
        this.f321012a = feVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C115791fe feVar = this.f321012a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C115423aa aaVar = (C115423aa) axVar.mo56107c();
            MenuItem findItem = feVar.f321207a.mo2393g().findItem(R.id.speakr_menu_item_text_highlighting_toggle);
            if (aaVar == C115423aa.FEATURE_DISABLED) {
                findItem.setVisible(false);
                return;
            }
            findItem.setVisible(true);
            findItem.setTitle(aaVar == C115423aa.HIGHLIGHTING_ON ? R.string.omp_speakr_text_highlighting_on : R.string.omp_speakr_text_highlighting_off);
            if (aaVar == C115423aa.HIGHLIGHTING_ON) {
                return;
            }
            if (!feVar.f321080L.mo56113h()) {
                C59104x d = C115791fe.f321068e.mo56226d();
                d.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
                ((C59052c) ((C59052c) d).mo56372aa(30052)).mo56386p("Highlighter not initialized yet.");
                return;
            }
            ((C89315s) feVar.f321080L.mo56107c()).mo83243b();
        }
    }
}
