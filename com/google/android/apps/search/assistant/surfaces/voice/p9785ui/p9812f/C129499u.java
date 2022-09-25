package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.C129584b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9813a.C129402b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.u */
/* compiled from: PG */
public final class C129499u implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C129484h f355534a;

    public C129499u(C129484h hVar) {
        this.f355534a = hVar;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C129484h.f355493a.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(38528));
        cVar.mo56384n();
        C129584b bVar = this.f355534a.f355514v;
        if (bVar == null) {
            C69664n.m101065k("postponeLatch");
            bVar = null;
        }
        bVar.mo109119a("BLUE_BAR");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        FragmentManager childFragmentManager = this.f355534a.f355494b.getChildFragmentManager();
        C69664n.m101060f(childFragmentManager, "fragment.childFragmentManager");
        Fragment c = childFragmentManager.f634a.mo671c("BlueBarFragmentTag");
        if (booleanValue && c == null) {
            AccountId accountId = this.f355534a.f355495c;
            C129402b bVar = new C129402b();
            C68324h.m98669f(bVar);
            C47247a.m84047b(bVar, accountId);
            C47243l.m84040b(bVar, "BlueBarFragmentTag");
            C0154a aVar = new C0154a(childFragmentManager);
            aVar.mo511h(R.id.assistant_bluebar_container, bVar, "BlueBarFragmentTag", 1);
            aVar.mo509f();
        } else if (!booleanValue && c != null) {
            C0154a aVar2 = new C0154a(childFragmentManager);
            aVar2.mo516m(c);
            aVar2.mo509f();
        }
        C129584b bVar2 = this.f355534a.f355514v;
        if (bVar2 == null) {
            C69664n.m101065k("postponeLatch");
            bVar2 = null;
        }
        bVar2.mo109119a("BLUE_BAR");
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
