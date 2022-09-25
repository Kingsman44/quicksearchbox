package com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8493b;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import android.view.View;
import android.widget.Toast;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111250m;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.c.b.b */
/* compiled from: PG */
public final /* synthetic */ class C111257b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C111262g f309598a;

    public /* synthetic */ C111257b(C111262g gVar) {
        this.f309598a = gVar;
    }

    public final void onClick(View view) {
        C111262g gVar = this.f309598a;
        ClipboardManager clipboardManager = (ClipboardManager) gVar.f309608a.getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(gVar.f309608a.getString(R.string.debug_panel_tapas_log), ((C111250m) gVar.f309609b.get(((ViewPager) Objects.requireNonNull(gVar.f309614g)).mo9122a())).mo99080b()));
            if (Build.VERSION.SDK_INT < 33 || !gVar.f309610c.mo78050x()) {
                Toast.makeText(gVar.f309608a, R.string.debug_panel_log_copied, 0).show();
            }
        }
    }
}
