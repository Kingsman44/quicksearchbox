package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.assistant.settings.features.p562ao.C10180d;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.settings.shared.o;
import com.google.android.apps.gsa.assistant.settings.shared.p5795f.C73748d;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemLayout;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.home.p1958f.p1960b.p1961a.C23813b;
import com.google.assistant.p3861at.C50264qq;
import com.google.assistant.p3861at.C50266qs;
import com.google.assistant.p3861at.C50281rg;
import com.google.assistant.p3861at.C50286rl;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58557jl;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.cn */
/* compiled from: PG */
public final class C9958cn {

    /* renamed from: a */
    public LinearLayout f34101a;

    /* renamed from: b */
    public final C9943bz f34102b;

    /* renamed from: c */
    public final C23813b f34103c;

    /* renamed from: d */
    public final o f34104d;

    /* renamed from: e */
    public final h f34105e;

    /* renamed from: f */
    public final C86124t f34106f;

    /* renamed from: g */
    public final C9972p f34107g;

    /* renamed from: h */
    public final C10180d f34108h;

    /* renamed from: i */
    public int f34109i;

    /* renamed from: j */
    public int f34110j;

    /* renamed from: k */
    private final C91189au f34111k;

    /* renamed from: l */
    private final Set f34112l;

    /* renamed from: m */
    private final C69464a f34113m;

    public C9958cn(C9943bz bzVar, C91189au auVar, C23813b bVar, o oVar, h hVar, Set set, C86124t tVar, C9972p pVar, C10180d dVar, C69464a aVar) {
        this.f34102b = bzVar;
        this.f34111k = auVar;
        this.f34103c = bVar;
        this.f34104d = oVar;
        this.f34105e = hVar;
        this.f34112l = set;
        this.f34106f = tVar;
        this.f34107g = pVar;
        this.f34108h = dVar;
        this.f34113m = aVar;
    }

    /* renamed from: a */
    public final Intent mo18153a(String str) {
        C18509a aVar = (C18509a) this.f34113m.mo17428b();
        aVar.mo24024f(str);
        aVar.mo24023e("settings_main_page");
        return aVar.mo24020b().mo24031a();
    }

    /* renamed from: b */
    public final View.OnClickListener mo18154b(C50266qs qsVar) {
        if (qsVar.f130718a == 1) {
            C50286rl a = C50286rl.m85798a(((Integer) qsVar.f130719b).intValue());
            if (a == null) {
                a = C50286rl.PAGE_ID_UNSPECIFIED;
            }
            C58833ax c = C58557jl.m90122c(this.f34112l, new C9953ci(a));
            if (c.mo56113h()) {
                Intent a2 = ((C73748d) c.mo56107c()).mo65219a();
                a2.putExtra("extra_assistant_settings_entry_source", "settings_main_page");
                return new C9954cj(this, a2);
            }
        }
        int i = qsVar.f130718a;
        if (i == 6) {
            Intent dataAndNormalize = new Intent().setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.assistant.settings.AssistantSettingsActivity").setDataAndNormalize(Uri.parse(((C50281rg) qsVar.f130719b).f130760a));
            dataAndNormalize.putExtra("extra_assistant_settings_entry_source", "settings_main_page");
            return new C9955ck(this, dataAndNormalize);
        } else if (i == 3) {
            return new C9956cl(this, qsVar);
        } else {
            if (i != 2) {
                return i == 5 ? new C9946cb(this, qsVar) : C9947cc.f34084a;
            }
            return new C9957cm(this, qsVar);
        }
    }

    /* renamed from: c */
    public final ItemLayout mo18155c(LayoutInflater layoutInflater, C50264qq qqVar) {
        ItemLayout inflate = layoutInflater.inflate(R.layout.settings_item_layout, this.f34101a, false);
        inflate.p(qqVar.f130712b);
        if ((qqVar.f130711a & 2) != 0) {
            inflate.o(qqVar.f130713c);
        }
        if ((qqVar.f130711a & 4) != 0) {
            this.f34111k.mo85421i(qqVar.f130714d, inflate.b());
        }
        return inflate;
    }
}
