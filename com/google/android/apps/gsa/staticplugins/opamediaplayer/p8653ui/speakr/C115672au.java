package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.app.AlertDialog;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115463g;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115464h;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115446p;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115639o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.au */
/* compiled from: PG */
public final /* synthetic */ class C115672au implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115711cf f320864a;

    public /* synthetic */ C115672au(C115711cf cfVar) {
        this.f320864a = cfVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        AlertDialog alertDialog;
        C115711cf cfVar = this.f320864a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C115464h hVar = (C115464h) axVar.mo56107c();
            if ((hVar.f320302a & 1) != 0) {
                C115463g a = C115463g.m191514a(hVar.f320303b);
                if (a == null) {
                    a = C115463g.UNKNOWN_ERROR;
                }
                if (a == C115463g.NETWORK_ERROR) {
                    String string = cfVar.f321208b.getResources().getString(R.string.omp_offline_error_title);
                    String string2 = cfVar.f321208b.getResources().getString(R.string.omp_connection_error_message);
                    String string3 = cfVar.f321208b.getResources().getString(R.string.omp_playback_error_retry);
                    String string4 = cfVar.f321208b.getResources().getString(R.string.omp_playback_error_cancel);
                    C115639o oVar = (C115639o) cfVar.f320937h.mo27525b();
                    oVar.mo102163e(string);
                    oVar.mo102160b(string2);
                    C115446p pVar = cfVar.f320936g;
                    Objects.requireNonNull(pVar);
                    oVar.mo102162d(string3, new C115673av(pVar));
                    oVar.mo102161c(string4, C115674aw.f320866a);
                    alertDialog = oVar.mo102159a();
                } else {
                    String string5 = cfVar.f321208b.getResources().getString(R.string.omp_generic_error_message);
                    String string6 = cfVar.f321208b.getResources().getString(a == C115463g.END_OF_QUEUE_ERROR ? R.string.omp_playback_end_of_queue_error_message : R.string.omp_playback_error_message);
                    String string7 = cfVar.f321208b.getResources().getString(R.string.omp_playback_error_ok);
                    String string8 = cfVar.f321208b.getResources().getString(R.string.omp_playback_error_cancel);
                    C115639o oVar2 = (C115639o) cfVar.f320937h.mo27525b();
                    oVar2.mo102163e(string5);
                    oVar2.mo102160b(string6);
                    oVar2.mo102162d(string7, C115683be.f320879a);
                    oVar2.mo102161c(string8, C115684bf.f320880a);
                    alertDialog = oVar2.mo102159a();
                }
                C115682bd bdVar = new C115682bd(cfVar);
                C115708cc ccVar = new C115708cc(alertDialog);
                cfVar.f63126Q.mo28312m(ccVar);
                alertDialog.setOnDismissListener(new C115679ba(cfVar, ccVar, bdVar));
                alertDialog.show();
            }
        }
    }
}
