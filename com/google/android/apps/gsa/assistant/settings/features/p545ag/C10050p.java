package com.google.android.apps.gsa.assistant.settings.features.p545ag;

import android.view.View;
import android.widget.Switch;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10026c;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.p */
/* compiled from: PG */
class C10050p implements C46792di {

    /* renamed from: a */
    final /* synthetic */ View f34275a;

    /* renamed from: b */
    final /* synthetic */ C10054t f34276b;

    public C10050p(C10054t tVar, View view) {
        this.f34276b = tVar;
        this.f34275a = view;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C10054t.f34279a.mo56225c()).mo56382g(th)).mo56372aa(968)).mo56386p("#MWW Failed to read settings.");
        C58800sl lA = C10054t.f34283e.values().iterator();
        while (lA.hasNext()) {
            View view = this.f34275a;
            int a = ((C10053s) lA.next()).mo18168a();
            int i = ItemView.a;
            view.findViewById(a).setEnabled(false);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        ItemView itemView;
        C10026c cVar = (C10026c) obj;
        C58528ij b = this.f34276b.mo18210b();
        C58800sl lA = C10054t.f34283e.values().iterator();
        while (true) {
            int i = 8;
            boolean z = false;
            if (!lA.hasNext()) {
                break;
            }
            C10053s sVar = (C10053s) lA.next();
            boolean f = sVar.mo18209f(b);
            boolean e = sVar.mo18208e(cVar);
            View view = this.f34275a;
            int a = sVar.mo18168a();
            int i2 = ItemView.a;
            ItemView findViewById = view.findViewById(a);
            if (true == f) {
                i = 0;
            }
            findViewById.setVisibility(i);
            findViewById.setEnabled(f);
            Switch t = findViewById.t();
            if (f && e) {
                z = true;
            }
            t.setChecked(z);
            C10054t tVar = this.f34276b;
            if (sVar.mo18208e(cVar) && !Collection.EL.stream(sVar.mo18171d()).allMatch(new C10051q(cVar))) {
                sVar.mo18171d();
                tVar.f34289k.mo18175a(sVar.mo18171d(), true);
            }
        }
        if (b.containsAll(C10054t.f34280b)) {
            boolean e2 = C10054t.f34281c.mo18208e(cVar);
            boolean e3 = C10054t.f34282d.mo18208e(cVar);
            if (!e2 || e3) {
                C10053s sVar2 = C10054t.f34281c;
                View view2 = this.f34275a;
                int i3 = ((C9984a) sVar2).f34166a;
                int i4 = ItemView.a;
                itemView = (ItemView) view2.findViewById(i3);
            } else {
                C10053s sVar3 = C10054t.f34282d;
                View view3 = this.f34275a;
                int i5 = ((C9984a) sVar3).f34166a;
                int i6 = ItemView.a;
                itemView = (ItemView) view3.findViewById(i5);
            }
            itemView.setVisibility(8);
            itemView.setEnabled(false);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
