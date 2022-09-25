package com.google.android.apps.gsa.searchnow;

import android.content.Intent;
import com.google.android.apps.gsa.search.shared.overlay.p6933a.C87621a;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90286b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90288d;
import com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g;
import com.google.android.apps.gsa.shared.monet.p7116h.C90333b;
import com.google.android.apps.gsa.shared.monet.p7116h.C90334c;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.InitializationData;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.searchnow.i */
/* compiled from: PG */
public final class C88872i {
    /* renamed from: a */
    public static C87621a m144315a(SearchNowActivity searchNowActivity, C68214a aVar) {
        C90291g gVar = (C90291g) aVar.mo27525b();
        Intent intent = searchNowActivity.getIntent();
        C87621a aVar2 = new C87621a();
        aVar2.f236748m = false;
        aVar2.f236713K = true;
        aVar2.f236742g = true;
        aVar2.f236745j = false;
        aVar2.f236737b = R.id.search_scrim;
        aVar2.f236710H = true;
        aVar2.f236747l = true;
        aVar2.f236744i = true;
        aVar2.f236751p = true;
        aVar2.f236715M = true;
        aVar2.f236729a = R.id.search_suggestions_scrollview;
        aVar2.f236709G = true;
        aVar2.f236707E = true;
        aVar2.f236708F = true;
        aVar2.f236746k = new int[]{4, 5, 0, 6};
        aVar2.f236711I = true;
        if (gVar == null) {
            return aVar2;
        }
        if (gVar.f252205u) {
            C58976aa aaVar = C58975e.f156826a;
            aVar2.f236704B = true;
        }
        if (gVar.f252183S) {
            C58976aa aaVar2 = C58975e.f156826a;
            aVar2.f236705C = true;
        }
        int i = gVar.f252207w;
        int a = C90288d.m146823a(i);
        if (a != 0) {
            int i2 = 2;
            if (a != 2) {
                int a2 = C90288d.m146823a(i);
                if (a2 != 0) {
                    i2 = a2;
                }
                aVar2.f236736ag = i2;
                aVar2.f236757v = gVar.f252208x;
                if (gVar.f252210z) {
                    aVar2.f236758w = true;
                }
            }
        }
        aVar2.f236759x = gVar.f252165A;
        aVar2.f236760y = gVar.f252166B;
        aVar2.f236761z = gVar.f252167C;
        aVar2.f236703A = gVar.f252168D;
        if (intent != null && C89429a.m145467y(intent)) {
            aVar2.f236754s = true;
        }
        C90208n a3 = C90208n.m146767a(gVar.f252187c);
        if (a3 == null) {
            a3 = C90208n.UNKNOWN_TAB;
        }
        if (a3 == C90208n.SEARCH_TAB) {
            aVar2.f236706D = true;
        }
        if ((gVar.f252185a & 65536) != 0 && !gVar.f252202r.isEmpty()) {
            aVar2.f236717O = gVar.f252202r;
        }
        if ((gVar.f252185a & C89885b.S3REQUEST_VALUE) != 0 && !gVar.f252203s.isEmpty()) {
            aVar2.f236716N = gVar.f252203s;
        }
        int i3 = gVar.f252186b;
        if ((i3 & 256) != 0) {
            aVar2.f236730aa = gVar.f252180P;
        }
        int i4 = gVar.f252185a;
        if ((262144 & i4) != 0) {
            aVar2.f236718P = gVar.f252204t;
        }
        if ((1073741824 & i4) != 0) {
            aVar2.f236719Q = gVar.f252170F;
        }
        if ((i3 & 2) != 0) {
            aVar2.f236720R = gVar.f252173I;
        }
        if ((i3 & 4) != 0) {
            aVar2.f236721S = gVar.f252174J;
        }
        if ((i3 & 8) != 0) {
            aVar2.f236722T = gVar.f252175K;
        }
        if ((i3 & 64) != 0) {
            aVar2.f236723U = gVar.f252178N;
        }
        if ((i3 & 128) != 0) {
            aVar2.f236724V = gVar.f252179O;
        }
        if ((i3 & 32) != 0) {
            aVar2.f236732ac = gVar.f252177M;
        }
        if ((Integer.MIN_VALUE & i4) != 0) {
            aVar2.f236731ab = gVar.f252171G;
        }
        if ((8388608 & i4) != 0) {
            aVar2.f236725W = gVar.f252209y;
        }
        if ((i3 & 16) != 0) {
            aVar2.f236726X = gVar.f252176L;
        }
        if ((i4 & 536870912) != 0) {
            aVar2.f236727Y = gVar.f252169E;
        }
        if ((i3 & 1) != 0) {
            aVar2.f236728Z = gVar.f252172H;
        }
        if ((i3 & 512) != 0) {
            aVar2.f236733ad = true;
        }
        return aVar2;
    }

    /* renamed from: b */
    public static InitializationData m144316b(SearchNowActivity searchNowActivity) {
        Intent intent = searchNowActivity.getIntent();
        if (intent != null) {
            try {
                return C90334c.m146887b(intent);
            } catch (C90333b unused) {
            }
        }
        C90286b bVar = (C90286b) C90291g.f252163T.createBuilder();
        C90208n nVar = C90208n.INTERESTS_TAB;
        bVar.copyOnWrite();
        C90291g gVar = (C90291g) bVar.instance;
        gVar.f252187c = nVar.f251999l;
        gVar.f252185a |= 1;
        if (intent != null) {
            if (intent.hasExtra("lobby_initial_tab")) {
                C90208n a = C90208n.m146767a(intent.getIntExtra("lobby_initial_tab", 1));
                bVar.copyOnWrite();
                C90291g gVar2 = (C90291g) bVar.instance;
                gVar2.f252187c = a.f251999l;
                gVar2.f252185a |= 1;
            }
            if (intent.hasExtra("extra_kansas_version_info")) {
                String stringExtra = intent.getStringExtra("extra_kansas_version_info");
                bVar.copyOnWrite();
                C90291g gVar3 = (C90291g) bVar.instance;
                stringExtra.getClass();
                gVar3.f252185a |= 128;
                gVar3.f252194j = stringExtra;
            }
            if (C89429a.m145466x(intent) || C89429a.m145460r(intent)) {
                bVar.copyOnWrite();
                C90291g gVar4 = (C90291g) bVar.instance;
                gVar4.f252188d = 1;
                gVar4.f252185a |= 2;
            } else if (C89429a.m145467y(intent)) {
                bVar.copyOnWrite();
                C90291g gVar5 = (C90291g) bVar.instance;
                gVar5.f252188d = 2;
                gVar5.f252185a |= 2;
            } else {
                bVar.copyOnWrite();
                C90291g gVar6 = (C90291g) bVar.instance;
                gVar6.f252188d = 3;
                gVar6.f252185a |= 2;
            }
        }
        return new InitializationData(new C23129y("searchnow", "TYPE_SEARCHNOW"), C23245b.m43556a((C90291g) bVar.build()), (Intent) null);
    }
}
