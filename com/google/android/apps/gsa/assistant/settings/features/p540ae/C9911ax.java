package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.settings.shared.p5795f.C73748d;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemLayout;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.assistant.p3861at.C50264qq;
import com.google.assistant.p3861at.C50266qs;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58557jl;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.ax */
/* compiled from: PG */
final class C9911ax extends C46756m {

    /* renamed from: a */
    public final String f34000a;

    /* renamed from: b */
    public final C91097g f34001b;

    /* renamed from: c */
    private final C91189au f34002c;

    /* renamed from: d */
    private final Set f34003d;

    public C9911ax(C91189au auVar, Set set, C91097g gVar, String str) {
        this.f34002c = auVar;
        this.f34003d = set;
        this.f34001b = gVar;
        this.f34000a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ View mo18113a(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.settings_item_layout, viewGroup, false);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18114b(View view, Object obj) {
        ItemLayout itemLayout = (ItemLayout) view;
        C50264qq qqVar = (C50264qq) obj;
        itemLayout.p(qqVar.f130712b);
        if ((qqVar.f130711a & 2) != 0) {
            itemLayout.o(qqVar.f130713c);
        }
        if ((qqVar.f130711a & 4) != 0) {
            this.f34002c.mo85421i(qqVar.f130714d, itemLayout.b());
        }
        C50266qs qsVar = qqVar.f130715e;
        if (qsVar == null) {
            qsVar = C50266qs.f130716c;
        }
        if (qsVar.f130718a == 1) {
            C58833ax c = C58557jl.m90122c(this.f34003d, new C9908au(qqVar));
            if (c.mo56113h()) {
                Intent a = ((C73748d) c.mo56107c()).mo65219a();
                a.putExtra("extra_assistant_settings_entry_source", this.f34000a);
                itemLayout.setOnClickListener(new C9909av(this, a));
                return;
            }
            return;
        }
        C50266qs qsVar2 = qqVar.f130715e;
        if (qsVar2 == null) {
            qsVar2 = C50266qs.f130716c;
        }
        if (qsVar2.f130718a == 7) {
            itemLayout.setOnClickListener(new C9910aw(this, qqVar));
        }
    }
}
