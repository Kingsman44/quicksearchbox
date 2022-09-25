package com.google.android.apps.gsa.assistant.settings.features.appactions;

import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10187b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p579ar.sceneviewer.common.C10678R;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.ax */
/* compiled from: PG */
final class C10218ax implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C10216av f34689a;

    public C10218ax(C10216av avVar) {
        this.f34689a = avVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C10216av avVar = this.f34689a;
        C44581b bVar2 = new C44581b(avVar.f34668d.getActivity(), C10678R.style.ThemeOverlay_GoogleMaterial_MaterialAlertDialog);
        bVar2.mo47605x(avVar.f34668d.getContext().getString(R.string.remove_shortcut_dialog_title));
        bVar2.f1347a.f1326g = avVar.f34668d.getContext().getString(R.string.remove_intent_shortcut_from_your_shortcuts_dialog_message);
        bVar2.mo47602u(avVar.f34668d.getContext().getString(R.string.remove_shortcut_dialog_remove_button), new C10202ah(avVar, (C10187b) bVar));
        bVar2.mo47599r(avVar.f34668d.getContext().getString(R.string.remove_shortcut_dialog_cancel_button), C10203ai.f34651a);
        bVar2.create().show();
        return C47392e.f123115a;
    }
}
