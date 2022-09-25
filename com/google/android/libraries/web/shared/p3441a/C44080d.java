package com.google.android.libraries.web.shared.p3441a;

import com.google.android.libraries.web.shared.lifecycle.C44107h;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.android.libraries.web.shared.lifecycle.internal.HiltWebModelHolderViewModel;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.shared.a.d */
/* compiled from: PG */
public final class C44080d {

    /* renamed from: a */
    private final C44079c f114751a;

    public C44080d(String str, Object obj, WebModelProvider webModelProvider) {
        C44107h a = ((HiltWebModelHolderViewModel) webModelProvider.f114787a.mo5768a()).mo47077a(C44079c.class, str);
        C69664n.m101058d(a);
        C44079c cVar = (C44079c) a;
        this.f114751a = cVar;
        if (!cVar.f114750b) {
            cVar.f114749a.set(obj);
            cVar.f114750b = true;
        }
    }

    /* renamed from: a */
    public final Object mo47045a() {
        return this.f114751a.f114749a.get();
    }

    /* renamed from: b */
    public final void mo47046b(Object obj) {
        this.f114751a.f114749a.set(obj);
    }
}
