package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news;

import android.app.AlertDialog;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115463g;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115464h;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115639o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.af */
/* compiled from: PG */
public final /* synthetic */ class C115559af implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115572as f320541a;

    public /* synthetic */ C115559af(C115572as asVar) {
        this.f320541a = asVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        AlertDialog alertDialog;
        C115572as asVar = this.f320541a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C115464h hVar = (C115464h) axVar.mo56107c();
            if ((hVar.f320302a & 1) != 0) {
                C115463g a = C115463g.m191514a(hVar.f320303b);
                if (a == null) {
                    a = C115463g.UNKNOWN_ERROR;
                }
                if (a == C115463g.NETWORK_ERROR) {
                    String string = asVar.f320563b.getResources().getString(R.string.omp_offline_error_title);
                    String string2 = asVar.f320563b.getResources().getString(R.string.omp_connection_error_message);
                    String string3 = asVar.f320563b.getResources().getString(R.string.omp_playback_error_retry);
                    String string4 = asVar.f320563b.getResources().getString(R.string.omp_playback_error_cancel);
                    ((C59052c) ((C59052c) C115572as.f320554a.mo56224b()).mo56372aa(29941)).mo56386p("createOfflineErrorDialog - offline error");
                    C115639o oVar = (C115639o) asVar.f320566e.mo27525b();
                    oVar.mo102163e(string);
                    oVar.mo102160b(string2);
                    oVar.mo102162d(string3, new C115597q(asVar));
                    oVar.mo102161c(string4, C115604x.f320696a);
                    alertDialog = oVar.mo102159a();
                } else {
                    String string5 = asVar.f320563b.getResources().getString(R.string.omp_generic_error_message);
                    String string6 = asVar.f320563b.getResources().getString(a == C115463g.END_OF_QUEUE_ERROR ? R.string.omp_playback_end_of_queue_error_message : R.string.omp_playback_error_message);
                    String string7 = asVar.f320563b.getResources().getString(R.string.omp_playback_error_ok);
                    String string8 = asVar.f320563b.getResources().getString(R.string.omp_playback_error_cancel);
                    ((C59052c) ((C59052c) C115572as.f320554a.mo56224b()).mo56372aa(29942)).mo56389s("createPlaybackErrorDialog - error while trying to play news. ErrorType: %s", a);
                    C115639o oVar2 = (C115639o) asVar.f320566e.mo27525b();
                    oVar2.mo102163e(string5);
                    oVar2.mo102160b(string6);
                    oVar2.mo102162d(string7, C115598r.f320688a);
                    oVar2.mo102161c(string8, C115599s.f320689a);
                    alertDialog = oVar2.mo102159a();
                }
                C115601u uVar = new C115601u(asVar);
                C115562ai aiVar = new C115562ai(alertDialog);
                asVar.f63126Q.mo28312m(aiVar);
                alertDialog.setOnDismissListener(new C115602v(asVar, aiVar, uVar));
                alertDialog.show();
            }
        }
    }
}
