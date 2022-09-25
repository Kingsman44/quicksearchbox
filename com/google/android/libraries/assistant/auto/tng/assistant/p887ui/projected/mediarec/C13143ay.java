package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import android.support.p033v7.widget.RecyclerView;
import android.transition.Transition;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.p891b.C13146a;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.ay */
/* compiled from: PG */
final class C13143ay implements Transition.TransitionListener {

    /* renamed from: a */
    final /* synthetic */ C13144az f40733a;

    /* renamed from: b */
    final /* synthetic */ int f40734b;

    public C13143ay(C13144az azVar, int i) {
        this.f40733a = azVar;
        this.f40734b = i;
    }

    public final void onTransitionCancel(Transition transition) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f40734b == 6) {
            this.f40733a.f40738d = false;
        }
    }

    public final void onTransitionEnd(Transition transition) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f40734b == 6) {
            this.f40733a.f40738d = false;
        }
        View view = this.f40733a.f40736b.getView();
        if (view == null) {
            C59104x d = C13144az.f40735a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MediaRecTransitionCtlr");
            ((C59052c) ((C59052c) d).mo56372aa(44624)).mo56386p("Fragment does not have content view.");
            return;
        }
        int i = this.f40734b - 1;
        if (i != 2) {
            if (i == 3) {
                this.f40733a.mo20927a(5);
            } else if (i != 4) {
                if (i == 5) {
                    C47393f.m84237h(C13146a.f40746a, view);
                    return;
                }
                return;
            }
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.media_rec_content_container);
        if (!recyclerView.hasFocus()) {
            recyclerView.requestFocus();
        }
    }

    public final void onTransitionPause(Transition transition) {
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onTransitionResume(Transition transition) {
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onTransitionStart(Transition transition) {
        C58976aa aaVar = C58975e.f156826a;
    }
}
