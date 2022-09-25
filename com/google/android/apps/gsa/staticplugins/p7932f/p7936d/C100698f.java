package com.google.android.apps.gsa.staticplugins.p7932f.p7936d;

import android.content.Context;
import com.bumptech.glide.C5543d;
import com.google.android.libraries.assistant.ampactions.C11039l;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.f.d.f */
/* compiled from: PG */
public final /* synthetic */ class C100698f implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C100700h f281557a;

    public /* synthetic */ C100698f(C100700h hVar) {
        this.f281557a = hVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        String str = (String) obj;
        C11039l lVar = this.f281557a.f281559a;
        if (!str.isEmpty()) {
            lVar.f36264k.setVisibility(8);
            lVar.f36262i.setVisibility(0);
            Context context = lVar.getContext();
            C5543d.m14323c(context).mo12423b(context).mo11873k(str).mo12454r(lVar.f36262i);
            return;
        }
        lVar.f36262i.setVisibility(8);
        lVar.f36264k.setVisibility(0);
    }
}
