package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.sidekick.shared.training.InterestLauncherHelper;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.by */
/* compiled from: PG */
public final /* synthetic */ class C105524by implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C105530cd f294406a;

    public /* synthetic */ C105524by(C105530cd cdVar) {
        this.f294406a = cdVar;
    }

    public final void onClick(View view) {
        Context context = this.f294406a.f294412a;
        InterestLauncherHelper.Options options = new InterestLauncherHelper.Options();
        C90476a aVar = C91018d.f254254a;
        context.startActivity(InterestLauncherHelper.m150800a(options));
    }
}
