package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.view.View;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ca */
/* compiled from: PG */
public final /* synthetic */ class C105527ca implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C105530cd f294409a;

    public /* synthetic */ C105527ca(C105530cd cdVar) {
        this.f294409a = cdVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C105530cd cdVar = this.f294409a;
        if (((Boolean) obj).booleanValue()) {
            cdVar.f294413b.setOnClickListener(new C105524by(cdVar));
            cdVar.f294413b.setVisibility(0);
            return;
        }
        cdVar.f294413b.setOnClickListener((View.OnClickListener) null);
        cdVar.f294413b.setVisibility(8);
    }
}
