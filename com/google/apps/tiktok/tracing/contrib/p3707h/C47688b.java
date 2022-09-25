package com.google.apps.tiktok.tracing.contrib.p3707h;

import androidx.p104d.p105a.C2164c;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146036p;

/* renamed from: com.google.apps.tiktok.tracing.contrib.h.b */
/* compiled from: PG */
final class C47688b implements C146036p {

    /* renamed from: a */
    final /* synthetic */ C2164c f123640a;

    public C47688b(C2164c cVar) {
        this.f123640a = cVar;
    }

    /* renamed from: a */
    public final void mo22590a(C146006ab abVar) {
        if (abVar.mo122491j()) {
            this.f123640a.mo5437b(abVar.mo122488g());
        } else if (abVar.mo122487f() != null) {
            this.f123640a.mo5439d(abVar.mo122487f());
        } else {
            this.f123640a.mo5439d(new Exception("Task failed with unknown result"));
        }
    }
}
