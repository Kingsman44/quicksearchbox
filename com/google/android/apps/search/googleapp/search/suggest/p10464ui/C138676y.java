package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.p033v7.app.C0392m;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.p096h.C1951d;
import com.google.android.apps.search.googleapp.p10122ab.C133148g;
import com.google.android.apps.search.googleapp.search.suggest.C138019ak;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.feedback.C138096am;
import com.google.android.apps.search.googleapp.search.suggest.feedback.C138098ao;
import com.google.android.apps.search.googleapp.search.suggest.feedback.SuggestionFeedbackActivity;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28457b;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28458c;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28460e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.y */
/* compiled from: PG */
public final class C138676y {

    /* renamed from: a */
    public final C138019ak f377182a;

    /* renamed from: b */
    public final Context f377183b;

    /* renamed from: c */
    public final C47400m f377184c;

    /* renamed from: d */
    public final C47770dh f377185d;

    /* renamed from: e */
    public final C28460e f377186e;

    /* renamed from: f */
    public final C138613o f377187f;

    /* renamed from: g */
    public final C28443m f377188g;

    /* renamed from: h */
    public final C133148g f377189h;

    /* renamed from: i */
    public final boolean f377190i;

    /* renamed from: j */
    public C28457b f377191j;

    /* renamed from: k */
    private final Resources f377192k;

    /* renamed from: l */
    private final AccountId f377193l;

    /* renamed from: m */
    private final C28306ab f377194m;

    public C138676y(C47400m mVar, C138613o oVar, AccountId accountId, C138019ak akVar, C47770dh dhVar, C28460e eVar, C28443m mVar2, C28306ab abVar, C133148g gVar, boolean z) {
        this.f377184c = mVar;
        this.f377187f = oVar;
        this.f377193l = accountId;
        this.f377192k = oVar.getResources();
        this.f377183b = oVar.getContext();
        this.f377182a = akVar;
        this.f377185d = dhVar;
        this.f377186e = eVar;
        this.f377188g = mVar2;
        this.f377194m = abVar;
        this.f377189h = gVar;
        this.f377190i = z;
    }

    /* renamed from: a */
    public final TextView mo114462a() {
        TextView textView = (TextView) LayoutInflater.from(this.f377183b).inflate(R.layout.googleapp_learn_more_view, (ViewGroup) null);
        textView.setText(C1951d.m5280a(this.f377192k.getString(R.string.ga_learn_more_link, new Object[]{this.f377182a.f375496e}), 0));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setOnClickListener(new C47591co(this.f377185d, "Learn More Clicked", new C138620v(this, textView)));
        C28306ab abVar = this.f377194m;
        abVar.mo33801b(textView, abVar.f76990a.mo33805a(C28427h.m53115a(108189)));
        return textView;
    }

    /* renamed from: b */
    public final void mo114463b(C0392m mVar, int i, int i2, int i3) {
        mVar.setOnShowListener(new C28458c(this.f377187f, new C138618t(this, i, i2, i3)));
    }

    /* renamed from: c */
    public final void mo114464c() {
        C138096am amVar = (C138096am) C138098ao.f375725f.createBuilder();
        C138030av avVar = this.f377182a.f375493b;
        if (avVar == null) {
            avVar = C138030av.f375536m;
        }
        amVar.copyOnWrite();
        C138098ao aoVar = (C138098ao) amVar.instance;
        avVar.getClass();
        aoVar.f375730d = avVar;
        aoVar.f375727a |= 2;
        String str = this.f377182a.f375499h;
        amVar.copyOnWrite();
        C138098ao aoVar2 = (C138098ao) amVar.instance;
        str.getClass();
        aoVar2.f375727a |= 4;
        aoVar2.f375731e = str;
        Intent intent = new Intent(this.f377183b, SuggestionFeedbackActivity.class);
        C45963aa.m82131a(intent, this.f377193l);
        ProtoParsers.m95531n(intent, "feedback_info", (C138098ao) amVar.build());
        intent.addFlags(268468224);
        C47810es.m84979s(this.f377183b, intent);
    }
}
