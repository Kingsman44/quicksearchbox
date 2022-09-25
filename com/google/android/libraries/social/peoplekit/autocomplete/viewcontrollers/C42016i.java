package com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers;

import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* renamed from: com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.i */
/* compiled from: PG */
final class C42016i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C42017j f109712a;

    public C42016i(C42017j jVar) {
        this.f109712a = jVar;
    }

    public final void run() {
        if (this.f109712a.f109714b.mo44499q()) {
            C42075e eVar = this.f109712a.f109713a;
            PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144441D));
            peopleKitVisualElementPath.mo44564a(this.f109712a.f109714b.f109736m.f109973a);
            eVar.mo44577c(16, peopleKitVisualElementPath);
        }
    }
}
