package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.view.View;
import androidx.core.graphics.C1926c;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2082cp;
import androidx.core.p098j.C2097l;
import androidx.core.p098j.C2098m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.a */
/* compiled from: PG */
public final /* synthetic */ class C106399a implements C2010ad {

    /* renamed from: a */
    public final /* synthetic */ AmbientAssistantDetailsActivity f296796a;

    public /* synthetic */ C106399a(AmbientAssistantDetailsActivity ambientAssistantDetailsActivity) {
        this.f296796a = ambientAssistantDetailsActivity;
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        AmbientAssistantDetailsActivity ambientAssistantDetailsActivity = this.f296796a;
        C2098m q = cpVar.f5994b.mo5234q();
        C1926c a = cpVar.f5994b.mo5216a(7);
        int i = a.f5821b;
        int i2 = a.f5822c;
        int i3 = a.f5823d;
        int i4 = a.f5824e;
        if (q != null) {
            i += C2097l.m5778b(q.f6013a);
            i2 += C2097l.m5780d(q.f6013a);
            i3 += C2097l.m5779c(q.f6013a);
            i4 += C2097l.m5777a(q.f6013a);
        }
        ambientAssistantDetailsActivity.f296767p.setPadding(i, i2, i3, i4);
        return C2082cp.f5993a;
    }
}
