package com.google.android.apps.gsa.staticplugins.p7388al;

import android.content.Context;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.al.g */
/* compiled from: PG */
public final /* synthetic */ class C93933g implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C93943q f262307a;

    /* renamed from: b */
    public final /* synthetic */ Context f262308b;

    public /* synthetic */ C93933g(C93943q qVar, Context context) {
        this.f262307a = qVar;
        this.f262308b = context;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C93943q qVar = this.f262307a;
        Context context = this.f262308b;
        String str = (String) obj;
        qVar.f262328A = str;
        if (str == null || context == null) {
            qVar.mo88222h();
            return;
        }
        HeaderLayout headerLayout = (HeaderLayout) qVar.f262349u.f228728c.findViewById(R.id.opa_header);
        C84018m.m133908c(headerLayout.f228719b, context.getString(R.string.devices_scan_explanation, new Object[]{str}), TextView.BufferType.NORMAL, headerLayout);
    }
}
