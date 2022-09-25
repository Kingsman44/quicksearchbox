package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e.C135767j;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e.C135769l;
import com.google.android.apps.search.googleapp.googleappbrowser.p10306h.C136012b;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p10309b.C136074d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59052c;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.aj */
/* compiled from: PG */
final class C136052aj implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C136053ak f370512a;

    public C136052aj(C136053ak akVar) {
        this.f370512a = akVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C136053ak.f370513a.mo56225c()).mo56382g(th)).mo56372aa(40660)).mo56384n();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C136074d dVar = (C136074d) obj;
        if ((dVar.f370598a & 1) != 0) {
            C136053ak akVar = this.f370512a;
            String str = dVar.f370599b;
            Fragment c = akVar.f370514b.getChildFragmentManager().f634a.mo671c("EmbeddedFragment");
            if (c != null) {
                ((C59052c) ((C59052c) C136053ak.f370513a.mo56226d()).mo56372aa(40666)).mo56386p("EmbeddedFragment was already set, overwriting previous.");
            }
            if (!akVar.f370524l.containsKey(str)) {
                ((C59052c) ((C59052c) C136053ak.f370513a.mo56225c()).mo56372aa(40665)).mo56389s("Attempting to show EmbeddedFragment that is not bound %s.", str);
            } else {
                C135767j jVar = (C135767j) akVar.f370524l.get(str);
                jVar.getClass();
                AccountId accountId = jVar.f369807a;
                C69664n.m101061g(accountId, "accountId");
                C135769l lVar = new C135769l();
                C68324h.m98669f(lVar);
                C47247a.m84047b(lVar, accountId);
                jVar.f369811e = lVar;
                C135769l lVar2 = jVar.f369811e;
                if (c == null || !c.getClass().equals(lVar2.getClass())) {
                    akVar.f370522j.f370623a = false;
                    C0154a aVar = new C0154a(akVar.f370514b.getChildFragmentManager());
                    aVar.mo689v(R.id.googleapp_browser_embedded_fragment, lVar2, "EmbeddedFragment");
                    aVar.mo509f();
                    if (lVar2 instanceof C47231d) {
                        akVar.f370521i.mo112713c(lVar2.mo17754z());
                    }
                } else {
                    ((C59052c) ((C59052c) C136053ak.f370513a.mo56224b()).mo56372aa(40664)).mo56389s("EmbeddedFragment %s is already being shown.", lVar2.getClass());
                }
            }
        }
        if ((dVar.f370598a & 2) != 0) {
            C136053ak akVar2 = this.f370512a;
            String str2 = dVar.f370600c;
            C19559g.m37304c();
            if (str2.equals("WHY_NOT_SHOW_THE_ACTION_BUTTONS")) {
                akVar2.mo112719f();
            } else if (!akVar2.f370525m.containsKey(str2)) {
                ((C59052c) ((C59052c) C136053ak.f370513a.mo56225c()).mo56372aa(40663)).mo56389s("Could not find replacementFragment with key %s", str2);
                return;
            }
            C136012b bVar = (C136012b) akVar2.f370525m.get(str2);
            if (bVar != null) {
                Fragment a = bVar.mo112367a();
                Fragment a2 = akVar2.mo112714a();
                if (a2 == null || !a2.getClass().equals(a.getClass())) {
                    akVar2.mo112717d(true);
                    akVar2.f370522j.mo47519v(4);
                    akVar2.mo112718e(a, "ReplacementBottomBar", false);
                    return;
                }
                a.getClass();
            }
        }
    }
}
