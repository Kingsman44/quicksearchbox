package com.google.android.apps.gsa.staticplugins.mediabrowser;

import android.os.Parcel;
import android.support.p031v4.media.MediaBrowserCompat;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87980ks;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87981kt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87982ku;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87983kv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.staticplugins.mediabrowser.MediaBrowserSessionController;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.mediabrowser.g */
/* compiled from: PG */
final class C102699g implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C87980ks f286662a;

    /* renamed from: b */
    final /* synthetic */ String f286663b;

    /* renamed from: c */
    final /* synthetic */ MediaBrowserSessionController f286664c;

    public C102699g(MediaBrowserSessionController mediaBrowserSessionController, C87980ks ksVar, String str) {
        this.f286664c = mediaBrowserSessionController;
        this.f286662a = ksVar;
        this.f286663b = str;
    }

    /* renamed from: c */
    public final void mo17702gm(List list) {
        if (this.f286664c.f286638d == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C87684al alVar = new C87684al(C88244um.MEDIA_BROWSER_LOADED_CHILDEN);
        C62940bt btVar = C87981kt.f237941a;
        C87982ku kuVar = (C87982ku) C87983kv.f237942c.createBuilder();
        String str = this.f286662a.f237937b;
        kuVar.copyOnWrite();
        C87983kv kvVar = (C87983kv) kuVar.instance;
        str.getClass();
        kvVar.f237944a |= 1;
        kvVar.f237945b = str;
        alVar.mo81965b(btVar, (C87983kv) kuVar.build());
        if (list != null) {
            MediaBrowserCompat.MediaItem[] mediaItemArr = new MediaBrowserCompat.MediaItem[list.size()];
            for (int i = 0; i < list.size(); i++) {
                mediaItemArr[i] = (MediaBrowserCompat.MediaItem) ((Parcel) list.get(i)).readParcelable(this.f286664c.f286637c.getClassLoader());
            }
            alVar.mo81966c(new MediaBrowserSessionController.ArrayParcelable(mediaItemArr));
        }
        C86697a aVar = this.f286664c.f286638d;
        aVar.getClass();
        ((C86775r) aVar).f234383e.mo80379b(alVar.mo81964a());
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x d = MediaBrowserSessionController.f286636a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MBSessionController");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(20946)).mo56389s("Failed to load child media item for package %s", this.f286663b);
        mo17702gm((List) null);
    }
}
