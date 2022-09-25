package com.google.android.apps.gsa.staticplugins.nga.p8047b;

import android.content.ContentResolver;
import android.database.ContentObserver;
import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.nga.api.C74718bv;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.libraries.gsa.p1876k.C22871g;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.b.e */
/* compiled from: PG */
public final class C103009e implements C74718bv {

    /* renamed from: a */
    public final ContentResolver f287595a;

    /* renamed from: b */
    public final C68214a f287596b;

    /* renamed from: c */
    public final C68214a f287597c;

    /* renamed from: d */
    public final C9325m f287598d;

    /* renamed from: e */
    public boolean f287599e = false;

    /* renamed from: f */
    public final ContentObserver f287600f = new C103007c(this);

    /* renamed from: g */
    private final C22871g f287601g;

    public C103009e(ContentResolver contentResolver, C90821bm bmVar, C68214a aVar, C68214a aVar2, C9325m mVar) {
        this.f287595a = contentResolver;
        this.f287601g = bmVar.mo85163a(C103008d.class);
        this.f287596b = aVar;
        this.f287597c = aVar2;
        this.f287598d = mVar;
    }

    /* renamed from: a */
    public final void mo17497a(NgaState ngaState) {
        this.f287601g.mo28212l("[NGA] onNgaStateChanged", new C103006b(this));
    }

    /* renamed from: b */
    public final void mo93561b() {
        this.f287601g.mo28212l("[NGA] AssistAppChecker.onAssistAppChanged.notifyListeners", new C103005a(this));
    }
}
