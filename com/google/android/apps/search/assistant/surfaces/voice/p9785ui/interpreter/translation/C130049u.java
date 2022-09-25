package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.translation;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.snackbar.Snackbar;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.translation.u */
/* compiled from: PG */
final class C130049u implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C130047s f356625a;

    public C130049u(C130047s sVar) {
        this.f356625a = sVar;
    }

    public final void onClick(View view) {
        C130047s sVar = this.f356625a;
        C69664n.m101061g(view, "view");
        Instant a = sVar.f356618h.mo57444a();
        C69664n.m101060f(a, "timeSource.now()");
        if (sVar.f356619i.plus(C130047s.f356611a).compareTo(a) <= 0) {
            sVar.f356619i = a;
            ClipData newPlainText = ClipData.newPlainText(sVar.mo109459e().getText(), sVar.mo109459e().getText());
            Object systemService = sVar.f356614d.requireContext().getSystemService("clipboard");
            C69664n.m101059e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(newPlainText);
            if (Build.VERSION.SDK_INT < 33 || !sVar.f356617g) {
                View requireView = sVar.f356614d.requireView();
                if (requireView != null) {
                    Snackbar p = Snackbar.m79660p(requireView, R.string.assistant_interpreter_translation_copied, -1);
                    p.f117089j.setBackgroundTintList(ColorStateList.valueOf(-1));
                    p.mo48351r().f117107a.setTextColor(-16777216);
                    p.mo48343h();
                    return;
                }
                throw new IllegalStateException("Fragment view not found");
            }
        }
    }
}
