package com.google.android.apps.gsa.assistant.settings.features.appactions.p566b;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.b.c */
/* compiled from: PG */
public final class C10224c {

    /* renamed from: a */
    public final C28443m f34700a;

    /* renamed from: b */
    private final C47770dh f34701b;

    public C10224c(C47770dh dhVar, C28443m mVar) {
        this.f34701b = dhVar;
        this.f34700a = mVar;
    }

    /* renamed from: a */
    public final void mo18354a(View view) {
        this.f34700a.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
    }

    /* renamed from: b */
    public final void mo18355b(View view, C47388b bVar, String str) {
        view.setOnClickListener(new C47591co(this.f34701b, str, new C10223b(this, bVar)));
    }
}
