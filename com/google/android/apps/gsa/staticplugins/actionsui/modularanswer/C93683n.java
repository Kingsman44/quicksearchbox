package com.google.android.apps.gsa.staticplugins.actionsui.modularanswer;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.p091b.C1874w;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.ModularCard;
import com.google.android.apps.gsa.sidekick.shared.util.C91985d;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.ModularAnswerImpl;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ListResult;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.Result;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.n */
/* compiled from: PG */
public final class C93683n implements C93684o {

    /* renamed from: a */
    public final C93671b f261483a;

    /* renamed from: b */
    private final ListResult f261484b;

    /* renamed from: c */
    private final LayoutInflater f261485c;

    /* renamed from: d */
    private final Context f261486d;

    public C93683n(ListResult listResult, C93671b bVar, LayoutInflater layoutInflater, Context context) {
        this.f261484b = listResult;
        this.f261483a = bVar;
        this.f261485c = layoutInflater;
        this.f261486d = context;
    }

    /* renamed from: a */
    public final View mo88141a(ViewGroup viewGroup) {
        ModularCard modularCard = (ModularCard) this.f261485c.inflate(R.layout.qp_now_card, viewGroup, false);
        this.f261485c.inflate(R.layout.qp_modular_answer_list_card, modularCard, true);
        C88507a aVar = this.f261483a.f239232a;
        aVar.getClass();
        if (((ModularAnswerImpl) ((C93674e) aVar).f239226b).f260516g.size() == 1) {
            C88507a aVar2 = this.f261483a.f239232a;
            aVar2.getClass();
            ((ModularAnswerImpl) ((C93674e) aVar2).f239226b).f260520k = this.f261484b;
        }
        C88507a aVar3 = this.f261483a.f239232a;
        aVar3.getClass();
        Result result = ((ModularAnswerImpl) ((C93674e) aVar3).f239226b).f260520k;
        if (result == null) {
            ListResult listResult = this.f261484b;
            C91985d.m150954a(modularCard, R.id.list_title, listResult.mo87678e().f145739a);
            modularCard.setOnClickListener(new C93680k(this, listResult));
        } else {
            int i = result.f260545e;
            ListResult listResult2 = this.f261484b;
            if (i == listResult2.f260545e) {
                modularCard.findViewById(R.id.list_title_items_divider).setVisibility(0);
                C91985d.m150954a(modularCard, R.id.list_title, listResult2.mo87678e().f145739a);
                CompactMultiTextLinearLayout compactMultiTextLinearLayout = (CompactMultiTextLinearLayout) modularCard.findViewById(R.id.list_items_container);
                compactMultiTextLinearLayout.setVisibility(0);
                compactMultiTextLinearLayout.f261460a = new C93682m(modularCard);
                if (listResult2.mo87677d().isEmpty()) {
                    TextView textView = (TextView) this.f261485c.inflate(R.layout.qp_modular_answer_body_text, compactMultiTextLinearLayout, false);
                    textView.setText(this.f261486d.getResources().getString(R.string.action_no_messages_found));
                    compactMultiTextLinearLayout.addView(textView);
                } else {
                    compactMultiTextLinearLayout.mo88132a(9);
                    compactMultiTextLinearLayout.mo88133b();
                    ArrayList arrayList = new ArrayList();
                    int color = this.f261483a.getResources().getColor(R.color.qp_text_b1);
                    C58485gu d = listResult2.mo87677d();
                    int size = d.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add(C93672c.m154572a((String) d.get(i2), listResult2.mo87677d(), color));
                    }
                    int i3 = 0;
                    while (i3 < arrayList.size() && i3 < 6) {
                        TextView textView2 = (TextView) this.f261485c.inflate(R.layout.qp_modular_answer_body_text, compactMultiTextLinearLayout, false);
                        textView2.setText((CharSequence) arrayList.get(i3));
                        compactMultiTextLinearLayout.addView(textView2);
                        i3++;
                    }
                    if (arrayList.size() > 6) {
                        modularCard.findViewById(R.id.list_items_overflow).setVisibility(0);
                    }
                }
                modularCard.setOnClickListener(new C93681l(this, listResult2));
            } else {
                modularCard.setVisibility(8);
            }
        }
        return modularCard;
    }

    /* renamed from: b */
    public final void mo88142b(ViewGroup viewGroup) {
        ((LinearLayout) viewGroup).setDividerDrawable(C1874w.m5109f(this.f261486d.getResources(), R.drawable.qp_reminder_answer_divider, (Resources.Theme) null));
    }

    /* renamed from: c */
    public final View mo88143c() {
        View a;
        C93671b bVar = this.f261483a;
        C88507a aVar = bVar.f239232a;
        aVar.getClass();
        Result result = ((ModularAnswerImpl) ((C93674e) aVar).f239226b).f260520k;
        if (result == null || (a = bVar.mo88138a(result.mo87671a())) == null) {
            C93671b bVar2 = this.f261483a;
            C88507a aVar2 = bVar2.f239232a;
            aVar2.getClass();
            View a2 = bVar2.mo88138a(((ModularAnswerImpl) ((C93674e) aVar2).f239226b).mo87665P());
            if (a2 != null) {
                a2.setOnClickListener(new C93679j(this));
            }
            return a2;
        }
        a.setOnClickListener(new C93678i(this, result));
        return a;
    }
}
