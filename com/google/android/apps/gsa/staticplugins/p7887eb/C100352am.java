package com.google.android.apps.gsa.staticplugins.p7887eb;

import androidx.p104d.p105a.C2164c;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146036p;

/* renamed from: com.google.android.apps.gsa.staticplugins.eb.am */
/* compiled from: PG */
final class C100352am implements C146036p {

    /* renamed from: a */
    final /* synthetic */ C2164c f280613a;

    public C100352am(C2164c cVar) {
        this.f280613a = cVar;
    }

    /* renamed from: a */
    public final void mo22590a(C146006ab abVar) {
        if (abVar.mo122491j()) {
            this.f280613a.mo5437b(abVar.mo122488g());
        } else if (abVar.mo122487f() != null) {
            this.f280613a.mo5439d(new Exception(abVar.mo122487f()));
        } else {
            this.f280613a.mo5439d(new Exception("Task failed with unknown result"));
        }
    }
}
