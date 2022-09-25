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

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.eb */
/* compiled from: PG */
public final /* synthetic */ class C115761eb implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115791fe f321029a;

    public /* synthetic */ C115761eb(C115791fe feVar) {
        this.f321029a = feVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        AlertDialog alertDialog;
        C115791fe feVar = this.f321029a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C115464h hVar = (C115464h) axVar.mo56107c();
            if ((hVar.f320302a & 1) != 0) {
                C115463g a = C115463g.m191514a(hVar.f320303b);
                if (a == null) {
                    a = C115463g.UNKNOWN_ERROR;
                }
                if (a == C115463g.NETWORK_ERROR) {
                    String string = feVar.f321208b.getResources().getString(R.string.omp_offline_error_title);
                    String string2 = feVar.f321208b.getResources().getString(R.string.omp_connection_error_message);
                    String string3 = feVar.f321208b.getResources().getString(R.string.omp_playback_error_retry);
                    String string4 = feVar.f321208b.getResources().getString(R.string.omp_playback_error_cancel);
                    C115639o oVar = (C115639o) feVar.f321097h.mo27525b();
                    oVar.mo102163e(string);
                    oVar.mo102160b(string2);
                    C115446p pVar = feVar.f321096g;
                    Objects.requireNonNull(pVar);
                    oVar.mo102162d(string3, new C115774eo(pVar));
                    oVar.mo102161c(string4, C115775ep.f321047a);
                    alertDialog = oVar.mo102159a();
                } else {
                    String string5 = feVar.f321208b.getResources().getString(R.string.omp_generic_error_message);
                    String string6 = feVar.f321208b.getResources().getString(a == C115463g.END_OF_QUEUE_ERROR ? R.string.omp_playback_end_of_queue_error_message : R.string.omp_playback_error_message);
                    String string7 = feVar.f321208b.getResources().getString(R.string.omp_playback_error_ok);
                    String string8 = feVar.f321208b.getResources().getString(R.string.omp_playback_error_cancel);
                    C115639o oVar2 = (C115639o) feVar.f321097h.mo27525b();
                    oVar2.mo102163e(string5);
                    oVar2.mo102160b(string6);
                    oVar2.mo102162d(string7, C115770ek.f321042a);
                    oVar2.mo102161c(string8, C115771el.f321043a);
                    alertDialog = oVar2.mo102159a();
                }
                C115768ei eiVar = new C115768ei(feVar);
                C115788fb fbVar = new C115788fb(alertDialog);
                feVar.f63126Q.mo28312m(fbVar);
                alertDialog.setOnDismissListener(new C115750dr(feVar, fbVar, eiVar));
                alertDialog.show();
            }
        }
    }
}
