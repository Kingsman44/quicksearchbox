package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14586os;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.br */
/* compiled from: PG */
public final class C15208br {

    /* renamed from: a */
    public final C14986h f45654a;

    /* renamed from: b */
    public ViewGroup f45655b = null;

    /* renamed from: c */
    public C14586os f45656c = null;

    /* renamed from: d */
    private final C14132bf f45657d;

    public C15208br(C14986h hVar, C14132bf bfVar) {
        this.f45654a = hVar;
        this.f45657d = bfVar;
    }

    /* renamed from: a */
    public final void mo22084a(C14586os osVar, ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper) {
        if (!osVar.equals(this.f45656c)) {
            this.f45656c = osVar;
            if (this.f45655b == null) {
                LayoutInflater.from(contextThemeWrapper).inflate(true != osVar.f44100a ? R.layout.message_sent : R.layout.message_sent_large, viewGroup, true);
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.message_task_message_sent_view);
                this.f45655b = viewGroup2;
                this.f45657d.mo21444a(viewGroup2, 114350);
            }
            new C15207bq(this).start();
        }
    }
}
