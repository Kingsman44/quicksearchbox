package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news;

import android.animation.Animator;
import android.view.MenuItem;
import androidx.core.p098j.C2043bi;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.aa */
/* compiled from: PG */
public final /* synthetic */ class C115554aa implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115572as f320535a;

    public /* synthetic */ C115554aa(C115572as asVar) {
        this.f320535a = asVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C115572as asVar = this.f320535a;
        C115572as.m191689l(asVar.f320569h);
        C115572as.m191689l(asVar.f320579r);
        C115572as.m191689l(asVar.f320571j);
        asVar.f320579r.mo102126a(((Float) ((C23249a) asVar.f320564c.mo101873d()).mo28725a()).floatValue());
        asVar.f320580s.mo47519v(3);
        C2043bi.m5551ae(asVar.f320572k, 4);
        C2043bi.m5551ae(asVar.f320578q, 4);
        asVar.f320570i.setAlpha(0.0f);
        asVar.f320570i.setVisibility(0);
        asVar.f320570i.animate().alpha(0.54f).setDuration(400).setListener((Animator.AnimatorListener) null);
        return true;
    }
}
