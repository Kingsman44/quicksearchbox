package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33230h;
import com.google.assistant.p3897e.p3902c.p3907c.C51045ei;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.cd */
/* compiled from: PG */
public final /* synthetic */ class C33325cd implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C33338cq f89322a;

    /* renamed from: b */
    public final /* synthetic */ C51045ei f89323b;

    public /* synthetic */ C33325cd(C33338cq cqVar, C51045ei eiVar) {
        this.f89322a = cqVar;
        this.f89323b = eiVar;
    }

    public final void onClick(View view) {
        C33338cq cqVar = this.f89322a;
        C51045ei eiVar = this.f89323b;
        Context context = cqVar.f89365a;
        Fragment fragment = cqVar.f89366b;
        C51098gh ghVar = eiVar.f132919f;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        C33230h.m61622d(context, fragment, ghVar);
    }
}
