package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import android.app.AlertDialog;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115463g;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115464h;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115639o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.ac */
/* compiled from: PG */
public final /* synthetic */ class C115509ac implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115520an f320375a;

    public /* synthetic */ C115509ac(C115520an anVar) {
        this.f320375a = anVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        AlertDialog alertDialog;
        C115520an anVar = this.f320375a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C115464h hVar = (C115464h) axVar.mo56107c();
            if ((hVar.f320302a & 1) != 0) {
                C115463g a = C115463g.m191514a(hVar.f320303b);
                if (a == null) {
                    a = C115463g.UNKNOWN_ERROR;
                }
                if (a == C115463g.NETWORK_ERROR) {
                    String string = anVar.f320401a.getResources().getString(R.string.omp_offline_error_title);
                    String string2 = anVar.f320401a.getResources().getString(R.string.omp_connection_error_message);
                    String string3 = anVar.f320401a.getResources().getString(R.string.omp_playback_error_retry);
                    String string4 = anVar.f320401a.getResources().getString(R.string.omp_playback_error_cancel);
                    C115639o oVar = (C115639o) anVar.f320407g.mo27525b();
                    oVar.mo102163e(string);
                    oVar.mo102160b(string2);
                    oVar.mo102162d(string3, new C115835x(anVar));
                    oVar.mo102161c(string4, C115836y.f321234a);
                    alertDialog = oVar.mo102159a();
                } else {
                    String string5 = anVar.f320401a.getResources().getString(R.string.omp_generic_error_message);
                    String string6 = anVar.f320401a.getResources().getString(a == C115463g.END_OF_QUEUE_ERROR ? R.string.omp_playback_end_of_queue_error_message : R.string.omp_playback_error_message);
                    String string7 = anVar.f320401a.getResources().getString(R.string.omp_playback_error_ok);
                    String string8 = anVar.f320401a.getResources().getString(R.string.omp_playback_error_cancel);
                    C115639o oVar2 = (C115639o) anVar.f320407g.mo27525b();
                    oVar2.mo102163e(string5);
                    oVar2.mo102160b(string6);
                    oVar2.mo102162d(string7, C115609q.f320704a);
                    oVar2.mo102161c(string8, C115610r.f320705a);
                    alertDialog = oVar2.mo102159a();
                }
                C115837z zVar = new C115837z(anVar);
                C115517ak akVar = new C115517ak(alertDialog);
                anVar.f63126Q.mo28312m(akVar);
                alertDialog.setOnDismissListener(new C115608p(anVar, akVar, zVar));
                alertDialog.show();
            }
        }
    }
}
