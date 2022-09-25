package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.staticplugins.actionsui.ContactDisambiguationView;
import com.google.android.apps.gsa.staticplugins.actionsui.LocalResultsView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class DisambiguationContent extends LinearLayout implements C93584ch {

    /* renamed from: a */
    public static final C59071e f261014a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actionsui.modular.DisambiguationContent");

    /* renamed from: b */
    public C93602cz f261015b;

    /* renamed from: c */
    protected ContactDisambiguationView f261016c;

    /* renamed from: d */
    protected EntityDisambiguationView f261017d;

    /* renamed from: e */
    protected LocalResultsView f261018e;

    /* renamed from: f */
    protected ProviderDisambiguationView f261019f;

    /* renamed from: g */
    protected Argument f261020g;

    /* renamed from: h */
    public PersonDisambiguation f261021h;

    /* renamed from: i */
    protected List f261022i;

    public DisambiguationContent(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public final List mo87839b() {
        return new ArrayList();
    }

    /* renamed from: c */
    public final void mo87840c(int i, int i2, C88511e eVar) {
        List<View> list;
        if (i2 == 2) {
            C93602cz czVar = this.f261015b;
            czVar.getClass();
            Argument H = czVar.mo88013H();
            C58838bb.m90868c(H.mo81263C());
            if (H instanceof PersonArgument) {
                this.f261021h = (PersonDisambiguation) ((PersonArgument) H).f236203n;
            } else {
                this.f261021h = null;
            }
            boolean i3 = mo87869i(H);
            this.f261020g = H.mo81278m(H.f236140a);
            if (!i3) {
                mo87866f();
                C93602cz czVar2 = this.f261015b;
                czVar2.getClass();
                H.mo81281p(new C93551bb(this, czVar2, eVar));
                if (i != 2 && (list = this.f261022i) != null) {
                    for (View visibility : list) {
                        visibility.setVisibility(8);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo87841d(C93602cz czVar) {
        this.f261015b = czVar;
    }

    /* renamed from: e */
    public final void mo87842e(int i, C88511e eVar) {
        if (i == 2) {
            setVisibility(0);
            List<View> list = this.f261022i;
            if (list != null) {
                for (View visibility : list) {
                    visibility.setVisibility(0);
                }
                return;
            }
            return;
        }
        setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo87866f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo87867g(ProviderArgument providerArgument) {
        this.f261019f.mo87720b(new C93548az(this, providerArgument));
    }

    /* renamed from: h */
    public final void mo87868h(View view) {
        View[] viewArr = {this.f261016c, this.f261017d, this.f261018e, this.f261019f};
        for (int i = 0; i < 4; i++) {
            View view2 = viewArr[i];
            view2.setVisibility(view2 == view ? 0 : 8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo87869i(Argument argument) {
        return Argument.m141690A(argument, this.f261020g);
    }

    /* renamed from: iM */
    public Pair mo87843iM(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Integer valueOf = Integer.valueOf(R.id.contact_details);
        C93617dn c = C93632eb.m154488c(-1, displayMetrics, this, valueOf);
        Object[] objArr = {this, valueOf};
        TransitionSet a = C93632eb.m154486a(getResources().getColor(R.color.action_card_medium_grey), objArr);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(c);
        transitionSet.addTransition(a);
        List list = this.f261022i;
        if (list != null) {
            C93632eb.m154490e(list, transitionSet, getResources().getDisplayMetrics());
        }
        return new Pair(transitionSet, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo87870j(Disambiguation disambiguation) {
        return false;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        ContactDisambiguationView contactDisambiguationView = (ContactDisambiguationView) findViewById(R.id.contact_disambiguation_view);
        contactDisambiguationView.getClass();
        this.f261016c = contactDisambiguationView;
        EntityDisambiguationView entityDisambiguationView = (EntityDisambiguationView) findViewById(R.id.entity_disambiguation_view);
        entityDisambiguationView.getClass();
        this.f261017d = entityDisambiguationView;
        LocalResultsView localResultsView = (LocalResultsView) findViewById(R.id.local_results_container);
        localResultsView.getClass();
        this.f261018e = localResultsView;
        ProviderDisambiguationView providerDisambiguationView = (ProviderDisambiguationView) findViewById(R.id.provider_disambiguation_view);
        providerDisambiguationView.getClass();
        this.f261019f = providerDisambiguationView;
    }

    public DisambiguationContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DisambiguationContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
