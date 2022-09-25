package com.google.android.libraries.home.p1958f.p1959a;

import android.support.p033v7.widget.SearchView;
import android.view.View;
import android.widget.ProgressBar;
import androidx.lifecycle.C2333ah;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.p1536a.p1537a.C18511b;
import com.google.android.libraries.assistant.p1535p.p1536a.p1537a.C18512c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2877e.C37185a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.assistant.p3861at.C50179nm;
import com.google.assistant.p3861at.C50181no;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p5462h.C69685i;
import p5462h.C69692j;
import p5462h.C69702k;
import p5462h.p5463a.C69496am;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.f.a.aa */
/* compiled from: PG */
final /* synthetic */ class C23775aa implements C2333ah {

    /* renamed from: a */
    final /* synthetic */ C23782ah f65154a;

    public C23775aa(C23782ah ahVar) {
        this.f65154a = ahVar;
    }

    /* renamed from: hX */
    public final /* synthetic */ void mo774hX(Object obj) {
        CharSequence charSequence;
        Object obj2;
        Object obj3;
        C69702k kVar = (C69702k) obj;
        C23782ah ahVar = this.f65154a;
        ahVar.mo8412gi().mo8376ac();
        View findViewById = ahVar.requireView().findViewById(R.id.empty_provider_list);
        C69664n.m101060f(findViewById, "requireView().findViewBy…R.id.empty_provider_list)");
        View findViewById2 = ahVar.requireView().findViewById(R.id.loading_progress_indicator);
        C69664n.m101060f(findViewById2, "requireView().findViewBy…ading_progress_indicator)");
        ProgressBar progressBar = (ProgressBar) findViewById2;
        if (kVar == null) {
            findViewById.setVisibility(8);
            progressBar.setVisibility(0);
            return;
        }
        Object obj4 = kVar.f186073a;
        Object obj5 = C69496am.f185918a;
        if (true == (obj4 instanceof C69692j)) {
            obj4 = obj5;
        }
        List list = (List) obj4;
        C18512c cVar = ahVar.f65164g;
        if (cVar == null) {
            C69664n.m101065k("accountLinkingFlow");
            cVar = null;
        }
        int a = C18511b.m35979a(cVar.f52466a);
        int i = a - 1;
        if (a != 0) {
            CharSequence charSequence2 = BuildConfig.FLAVOR;
            if (i == 2) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    String str = ((C50181no) obj2).f130446a;
                    C18512c cVar2 = ahVar.f65164g;
                    if (cVar2 == null) {
                        C69664n.m101065k("accountLinkingFlow");
                        cVar2 = null;
                    }
                    if (C69664n.m101066l(str, cVar2.f52466a == 3 ? (String) cVar2.f52467b : charSequence2)) {
                        break;
                    }
                }
                C50181no noVar = (C50181no) obj2;
                if (noVar != null) {
                    C37215b n = ahVar.mo29128n();
                    C37252a g = C37185a.f98330a.mo40813g();
                    C23774a.m44277a(g, noVar);
                    n.mo19974a(g);
                    ahVar.mo29135u(noVar);
                    return;
                }
                C59052c cVar3 = (C59052c) C23782ah.f65161e.mo56225c();
                C18512c cVar4 = ahVar.f65164g;
                if (cVar4 == null) {
                    C69664n.m101065k("accountLinkingFlow");
                    cVar4 = null;
                }
                CharSequence charSequence3 = cVar4.f52466a == 3 ? (String) cVar4.f52467b : charSequence2;
                cVar3.mo56379ah(new C59094n(48690));
                cVar3.mo56389s("No provider with ID \"%s\"; falling back to user selection", charSequence3);
            } else if (i == 3) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    String str2 = ((C50181no) obj3).f130446a;
                    C18512c cVar5 = ahVar.f65164g;
                    if (cVar5 == null) {
                        C69664n.m101065k("accountLinkingFlow");
                        cVar5 = null;
                    }
                    if (C69664n.m101066l(str2, cVar5.f52466a == 4 ? (String) cVar5.f52467b : charSequence2)) {
                        break;
                    }
                }
                C50181no noVar2 = (C50181no) obj3;
                if (noVar2 != null) {
                    ahVar.mo29131q(noVar2);
                    return;
                }
            }
            progressBar.setVisibility(8);
            if (kVar.f186073a instanceof C69692j) {
                findViewById.setVisibility(0);
                return;
            }
            findViewById.setVisibility(8);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object next : list) {
                int a2 = C50179nm.m85783a(((C50181no) next).f130449d);
                if (a2 != 0) {
                    if (a2 == 2) {
                        arrayList.add(next);
                    }
                }
                arrayList2.add(next);
            }
            C69685i iVar = new C69685i(arrayList, arrayList2);
            ahVar.mo29130p(R.string.linked_providers_category_title, (List) iVar.f186052a);
            ahVar.mo29130p(R.string.unlinked_providers_category_title, (List) iVar.f186053b);
            SearchView searchView = ahVar.f65166i;
            if (searchView != null) {
                charSequence = searchView.getQuery();
            } else {
                charSequence = null;
            }
            if (charSequence != null) {
                charSequence2 = charSequence;
            }
            ahVar.mo29133s(charSequence2);
            return;
        }
        throw null;
    }
}
