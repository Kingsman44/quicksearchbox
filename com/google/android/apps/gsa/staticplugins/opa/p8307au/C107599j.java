package com.google.android.apps.gsa.staticplugins.opa.p8307au;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.nga.shared.p6407v.C83278h;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7065j.C89937h;
import com.google.android.apps.gsa.shared.p7066m.C90024cc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3745ab.p3771w.C48420g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.au.j */
/* compiled from: PG */
public final /* synthetic */ class C107599j implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C107606q f299335a;

    public /* synthetic */ C107599j(C107606q qVar) {
        this.f299335a = qVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        ViewGroup viewGroup;
        C107606q qVar = this.f299335a;
        List list = (List) obj;
        boolean e = qVar.f299352c.mo79746e(C90024cc.f248133d);
        if (e) {
            viewGroup = (ViewGroup) LayoutInflater.from(qVar.f299351b).inflate(R.layout.opa_rich_input_carousel, (ViewGroup) null);
        } else {
            viewGroup = (ViewGroup) LayoutInflater.from(qVar.f299351b).inflate(R.layout.opa_rich_input, (ViewGroup) null);
        }
        if (qVar.f299352c.mo79746e(C90024cc.f248132c)) {
            viewGroup.setBackgroundColor(qVar.f299351b.getResources().getColor(17170445));
        }
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.rich_input_content);
        C28295m.m52919e(linearLayout, qVar.f299354e);
        qVar.f299364o.clear();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            for (C107608s sVar : (List) list.get(i2)) {
                if (i3 < 4 || (e && i3 < 8)) {
                    FrameLayout frameLayout = (FrameLayout) linearLayout.getChildAt(i3);
                    C28292j b = sVar.mo96049b();
                    C28295m.m52919e(frameLayout, b);
                    qVar.f299364o.add(C28293k.m52908e(b, new C28293k[i]));
                    View a = sVar.mo96048a();
                    Context context = qVar.f299351b;
                    TypedValue typedValue = new TypedValue();
                    frameLayout.setBackgroundResource(context.getTheme().resolveAttribute(16843534, typedValue, true) ? typedValue.resourceId : 0);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(a);
                    C58833ax d = sVar.mo96051d();
                    C58833ax c = sVar.mo96050c();
                    C58833ax e2 = sVar.mo96052e();
                    if (c.mo56113h()) {
                        frameLayout.setOnClickListener(new C89943l(new C107600k(qVar, c)));
                    } else if (e2.mo56113h()) {
                        frameLayout.setOnClickListener(new C89943l(new C107601l(qVar, e2)));
                    } else if (d.mo56113h()) {
                        frameLayout.setOnClickListener(new C89937h(new C107602m(qVar, d, b)));
                    }
                    i3++;
                    i = 0;
                }
            }
            i2++;
            i = 0;
        }
        if (C107606q.m178486e(qVar.f299352c)) {
            ((SharedPreferences) qVar.f299357h.mo27525b()).edit().putInt("opa_citadel_suggestions_impression_count", ((SharedPreferences) qVar.f299357h.mo27525b()).getInt("opa_citadel_suggestions_impression_count", 0) + 1).apply();
        }
        C60321oe b2 = C28285c.m52875b(C28293k.m52907d(qVar.f299354e, qVar.f299364o), 79940);
        C58976aa aaVar = C58975e.f156826a;
        if (b2 != null) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 472;
            if (qVar.f299359j.mo56113h()) {
                C48420g b3 = ((C83278h) qVar.f299359j.mo56107c()).mo75573b();
                tzVar.copyOnWrite();
                C60555uf ufVar2 = (C60555uf) tzVar.instance;
                b3.getClass();
                ufVar2.f164237co = b3;
                ufVar2.f164255j |= 32;
            }
            C89949q.m146525j((C60555uf) tzVar.build(), b2, (C63196b) null, (String) null);
        } else {
            C59104x d2 = C107606q.f299350a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "richInputCtl");
            ((C59052c) ((C59052c) d2).mo56372aa(25514)).mo56386p("Client proto does not exist, failed to log ve impression");
        }
        return viewGroup;
    }
}
