package com.google.android.apps.gsa.staticplugins.opa.samson.p8442n;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.n.z */
/* compiled from: PG */
public final class C110289z {

    /* renamed from: n */
    private static final C59071e f307382n = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.n.z");

    /* renamed from: a */
    public final FrameLayout f307383a;

    /* renamed from: b */
    public final View f307384b;

    /* renamed from: c */
    public final View f307385c;

    /* renamed from: d */
    public final View f307386d;

    /* renamed from: e */
    public final View f307387e;

    /* renamed from: f */
    public final View f307388f;

    /* renamed from: g */
    public final ImageView f307389g;

    /* renamed from: h */
    public final TextView f307390h;

    /* renamed from: i */
    public final TextView f307391i;

    /* renamed from: j */
    public final ImageView f307392j;

    /* renamed from: k */
    public final TextView f307393k;

    /* renamed from: l */
    public final TextView f307394l;

    /* renamed from: m */
    public final List f307395m;

    /* renamed from: o */
    private final View f307396o;

    /* renamed from: p */
    private final Set f307397p;

    public C110289z(int i, Activity activity) {
        ArrayList arrayList = new ArrayList();
        this.f307395m = arrayList;
        HashSet hashSet = new HashSet();
        this.f307397p = hashSet;
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(activity).inflate(i == 1 ? R.layout.clock_smart_space : R.layout.photo_smart_space, (ViewGroup) null);
        this.f307383a = frameLayout;
        View findViewById = frameLayout.findViewById(R.id.smart_space_generic_card_container);
        this.f307387e = findViewById;
        this.f307389g = (ImageView) findViewById.findViewById(R.id.generic_card_image);
        this.f307390h = (TextView) findViewById.findViewById(R.id.generic_card_text);
        this.f307391i = (TextView) findViewById.findViewById(R.id.generic_card_secondary_text);
        View findViewById2 = frameLayout.findViewById(R.id.media_smart_space_generic_card_container);
        this.f307386d = findViewById2;
        this.f307392j = (ImageView) findViewById2.findViewById(R.id.generic_card_image);
        this.f307393k = (TextView) findViewById2.findViewById(R.id.generic_card_text);
        this.f307394l = (TextView) findViewById2.findViewById(R.id.generic_card_secondary_text);
        View findViewById3 = frameLayout.findViewById(R.id.smart_space_permission_prompt);
        this.f307385c = findViewById3;
        View findViewById4 = frameLayout.findViewById(R.id.photos_setup_prompt);
        this.f307384b = findViewById4;
        View findViewById5 = frameLayout.findViewById(R.id.morris_affordance_view);
        this.f307396o = findViewById5;
        View findViewById6 = frameLayout.findViewById(R.id.smart_space_no_network_prompt);
        this.f307388f = findViewById6;
        C28292j jVar = new C28292j(77883);
        jVar.mo33795i(5);
        jVar.mo33794h(2);
        C28292j jVar2 = new C28292j(78279);
        jVar2.mo33795i(5);
        jVar2.mo33794h(2);
        C28292j jVar3 = new C28292j(78302);
        jVar3.mo33795i(5);
        jVar3.mo33794h(2);
        C28292j jVar4 = new C28292j(88058);
        jVar4.mo33795i(5);
        jVar4.mo33794h(2);
        C28292j jVar5 = new C28292j(88059);
        jVar5.mo33795i(5);
        jVar5.mo33794h(2);
        C28295m.m52919e(findViewById2, jVar);
        C28295m.m52919e(findViewById, jVar2);
        C28295m.m52919e(findViewById5, jVar3);
        C28295m.m52919e(findViewById3, jVar4);
        C28295m.m52919e(findViewById6, jVar5);
        arrayList.add(C28293k.m52908e(jVar, new C28293k[0]));
        arrayList.add(C28293k.m52908e(jVar2, new C28293k[0]));
        arrayList.add(C28293k.m52908e(jVar3, new C28293k[0]));
        arrayList.add(C28293k.m52908e(jVar4, new C28293k[0]));
        arrayList.add(C28293k.m52908e(jVar5, new C28293k[0]));
        hashSet.addAll(Arrays.asList(new View[]{findViewById2, findViewById, findViewById5, findViewById4, findViewById3, findViewById6}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo98538a(View view, int i) {
        if (view.getVisibility() != i) {
            if (view != null && C28295m.m52917c().containsKey(view)) {
                C89949q.m146521e(C28285c.m52881h(i == 0 ? 2 : 3, C28295m.m52916b(view), (View) null), false);
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: b */
    public final void mo98539b(View view) {
        if (!this.f307397p.contains(view) && view != null) {
            C59104x d = f307382n.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SmartSpaceHolder");
            ((C59052c) ((C59052c) d).mo56372aa(25964)).mo56386p("switchSmartSpaceViewAndMaybeGraftVisibilityChanges(): Invalid smartspace view or inadequate view tracking.");
        }
        for (View view2 : this.f307397p) {
            if (view2.equals(view)) {
                mo98538a(view2, 0);
            } else {
                mo98538a(view2, 8);
            }
        }
    }
}
