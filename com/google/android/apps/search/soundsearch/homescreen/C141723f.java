package com.google.android.apps.search.soundsearch.homescreen;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.widget.TextView;
import com.google.android.apps.search.soundsearch.p10660g.p10661a.C141683m;
import com.google.android.apps.search.soundsearch.p10660g.p10661a.C141684n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C59052c;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.speech.p5224k.p5225a.C67184ab;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.soundsearch.homescreen.f */
/* compiled from: PG */
class C141723f implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C141724g f384674a;

    public C141723f(C141724g gVar) {
        this.f384674a = gVar;
    }

    /* renamed from: d */
    private final void m229954d() {
        this.f384674a.mo116683e(Optional.empty());
        this.f384674a.f384685k.mo116640a(C62722b.INTERNAL);
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        m229954d();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        C141684n nVar = (C141684n) obj;
        C19559g.m37304c();
        int b = C141683m.m229903b(nVar.f384549b);
        if (b == 0 || b != 2) {
            C59052c cVar = (C59052c) ((C59052c) C141724g.f384675a.mo56224b()).mo56372aa(41778);
            int b2 = C141683m.m229903b(nVar.f384549b);
            if (b2 == 0) {
                b2 = 1;
            }
            cVar.mo56389s("#onNewData RecognitionState with status %s", C141683m.m229902a(b2));
        }
        int b3 = C141683m.m229903b(nVar.f384549b);
        if (b3 == 0) {
            b3 = 1;
        }
        int i = b3 - 1;
        if (i == 1) {
            C141724g gVar = this.f384674a;
            gVar.f384681g.f384693a = nVar.f384550c;
            int i2 = nVar.f384551d;
            if (gVar.f384682h) {
                ((TextView) gVar.mo116680a().findViewById(R.id.soundsearch_progress_text)).setText(gVar.f384683i[(int) Math.min(((long) i2) / C141724g.f384676b.toMillis(), (long) (gVar.f384683i.length - 1))]);
            }
            gVar.mo116680a().findViewById(R.id.soundsearch_listening_container).setVisibility(0);
            FragmentManager childFragmentManager = gVar.f384677c.getChildFragmentManager();
            Fragment c = childFragmentManager.f634a.mo671c("RESULT_TAG");
            if (c != null) {
                C0154a aVar = new C0154a(childFragmentManager);
                aVar.mo516m(c);
                aVar.mo509f();
            }
        } else if (i == 2) {
            C141724g gVar2 = this.f384674a;
            C67184ab abVar = nVar.f384552e;
            if (abVar == null) {
                abVar = C67184ab.f182603d;
            }
            gVar2.mo116683e(Optional.m71637of(abVar));
            this.f384674a.f384685k.mo116640a(C62722b.OK);
        } else if (i == 3) {
            m229954d();
        } else if (i == 4) {
            this.f384674a.mo116683e(Optional.empty());
            this.f384674a.f384685k.mo116640a(C62722b.NOT_FOUND);
        }
        this.f384674a.f384684j = nVar;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
