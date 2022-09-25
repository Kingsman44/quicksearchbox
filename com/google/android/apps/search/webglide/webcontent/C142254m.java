package com.google.android.apps.search.webglide.webcontent;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.google.android.apps.search.webglide.p10699b.C142184o;
import com.google.android.apps.search.webglide.p10699b.C142185p;
import com.google.android.apps.search.webglide.p10701d.C142201a;
import com.google.android.apps.search.webglide.p10702e.p10703a.C142218b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.apps.tiktok.monitoring.feedback.C47465c;
import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47475l;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.webglide.webcontent.m */
/* compiled from: PG */
final class C142254m implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C142255n f385921a;

    /* renamed from: b */
    final /* synthetic */ C28452b f385922b;

    public C142254m(C142255n nVar, C28452b bVar) {
        this.f385921a = nVar;
        this.f385922b = bVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.webglide_feedback) {
            C28443m mVar = this.f385921a.f385928f;
            C28440j h = C28442l.m53142h();
            h.mo33895b(C142218b.m230876a(this.f385921a.f385924b.mo46468a().f113329b));
            mVar.mo33853c(h.mo33894a(), this.f385922b.mo33908b(Integer.valueOf(menuItem.getItemId())));
            C142255n nVar = this.f385921a;
            C142201a aVar = nVar.f385934l;
            String str = nVar.f385924b.mo46468a().f113329b;
            C142185p pVar = this.f385921a.f385931i;
            int a = C142184o.m230802a(pVar.f385727c);
            int i = 5549;
            if (!(a == 0 || a == 1)) {
                i = 5565;
            }
            C43376u a2 = aVar.f385773b.mo46468a();
            C47474k g = C47475l.m84477g();
            C47465c cVar = (C47465c) g;
            cVar.f123249a = "com.google.android.googlequicksearchbox.USER_INITIATED_FEEDBACK_REPORT";
            g.mo51334g("Webglide");
            C46663a aVar2 = new C46663a();
            aVar2.mo50686d(C46667e.KEY_VALUE);
            aVar2.mo50684b(false);
            aVar2.f121916a = C63088z.m96143E(str);
            g.mo51333f("Card URL", aVar2.mo50683a());
            C46663a aVar3 = new C46663a();
            aVar3.mo50686d(C46667e.KEY_VALUE);
            aVar3.mo50684b(false);
            aVar3.f121916a = C63088z.m96143E(pVar.f385729e);
            g.mo51333f("Card Title", aVar3.mo50683a());
            C46663a aVar4 = new C46663a();
            aVar4.mo50686d(C46667e.KEY_VALUE);
            aVar4.mo50684b(false);
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            aVar4.f121916a = C63088z.m96143E(sb.toString());
            g.mo51333f("Card Category", aVar4.mo50683a());
            C46663a aVar5 = new C46663a();
            aVar5.mo50686d(C46667e.KEY_VALUE);
            aVar5.mo50684b(false);
            C43369n a3 = C43369n.m76519a(a2.f113330c);
            if (a3 == null) {
                a3 = C43369n.UNSPECIFIED;
            }
            aVar5.f121916a = C63088z.m96143E(Integer.toString(a3.f113312h));
            g.mo51333f("Load State", aVar5.mo50683a());
            C46663a aVar6 = new C46663a();
            aVar6.mo50686d(C46667e.KEY_VALUE);
            aVar6.mo50684b(false);
            C43363h hVar = a2.f113331d;
            if (hVar == null) {
                hVar = C43363h.f113275f;
            }
            C43362g a4 = C43362g.m76515a(hVar.f113278b);
            if (a4 == null) {
                a4 = C43362g.UNSPECIFIED;
            }
            aVar6.f121916a = C63088z.m96143E(Integer.toString(a4.f113274h));
            g.mo51333f("Load Error Type", aVar6.mo50683a());
            C46663a aVar7 = new C46663a();
            aVar7.mo50686d(C46667e.KEY_VALUE);
            aVar7.mo50684b(false);
            C43363h hVar2 = a2.f113331d;
            if (hVar2 == null) {
                hVar2 = C43363h.f113275f;
            }
            aVar7.f121916a = C63088z.m96143E(hVar2.f113279c);
            g.mo51333f("Load Error Description", aVar7.mo50683a());
            C46663a aVar8 = new C46663a();
            aVar8.mo50686d(C46667e.KEY_VALUE);
            aVar8.mo50684b(false);
            C43366k a5 = C43366k.m76517a(a2.f113332e);
            if (a5 == null) {
                a5 = C43366k.UNSPECIFIED;
            }
            aVar8.f121916a = C63088z.m96143E(Integer.toString(a5.f113292i));
            g.mo51333f("Initial Request Trigger Type", aVar8.mo50683a());
            C46663a aVar9 = new C46663a();
            aVar9.mo50686d(C46667e.KEY_VALUE);
            aVar9.mo50684b(false);
            C43367l lVar = a2.f113335h;
            if (lVar == null) {
                lVar = C43367l.f113293h;
            }
            C43366k a6 = C43366k.m76517a(lVar.f113299e);
            if (a6 == null) {
                a6 = C43366k.UNSPECIFIED;
            }
            aVar9.f121916a = C63088z.m96143E(Integer.toString(a6.f113292i));
            g.mo51333f("Pending Request Trigger Type", aVar9.mo50683a());
            cVar.f123252d = 3;
            aVar.f385772a.mo51336a(g.mo51332e());
        }
        return true;
    }
}
