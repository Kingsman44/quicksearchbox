package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114860dc;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114872do;
import com.google.android.libraries.logging.C28289g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28294l;
import com.google.assistant.p3994s.p3995a.C53115by;
import com.google.assistant.p3994s.p3995a.C53118ca;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60214n;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.al */
/* compiled from: PG */
public final class C114627al implements C114629an, C28289g {

    /* renamed from: c */
    private static final C59071e f318005c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.al");

    /* renamed from: a */
    public C114675ce f318006a;

    /* renamed from: b */
    public C28293k f318007b;

    /* renamed from: d */
    private final Activity f318008d;

    /* renamed from: e */
    private final C53118ca f318009e;

    /* renamed from: f */
    private final C91097g f318010f;

    /* renamed from: g */
    private final C114860dc f318011g;

    /* renamed from: h */
    private final C114750d f318012h;

    public C114627al(Activity activity, C114860dc dcVar, C53118ca caVar, C91097g gVar, C114750d dVar) {
        this.f318008d = activity;
        this.f318009e = caVar;
        this.f318010f = gVar;
        this.f318012h = dVar;
        this.f318011g = dcVar;
    }

    /* renamed from: a */
    public final C28293k mo33782a() {
        return this.f318007b;
    }

    /* renamed from: c */
    public final void mo101478c() {
        C53118ca caVar = this.f318009e;
        C114630ao aoVar = new C114630ao();
        Bundle bundle = new Bundle();
        bundle.putByteArray("OverflowMenuKey", caVar.toByteArray());
        aoVar.setArguments(bundle);
        aoVar.f318017b = this;
        C58976aa aaVar = C58975e.f156826a;
        ArrayList arrayList = new ArrayList();
        for (C53115by byVar : caVar.f139196a) {
            int i = 65610;
            if ((byVar.f139188a & 4) != 0) {
                try {
                    C60214n a = C28294l.m52911a(byVar.f139191d);
                    if ((a.f162916a & 8) != 0) {
                        i = a.f162918c;
                    }
                } catch (IOException unused) {
                }
            }
            C28292j jVar = new C28292j(i);
            jVar.mo33795i(5);
            arrayList.add(C28293k.m52908e(jVar, new C28293k[0]));
        }
        aoVar.f318018c = C28293k.m52907d(new C28292j(65609), arrayList);
        this.f318008d.getFragmentManager().beginTransaction().add(aoVar, "OverflowMenu").setTransition(4097).commitAllowingStateLoss();
        this.f318007b = aoVar.f318018c;
    }

    /* renamed from: b */
    public final void mo101477b(C53115by byVar) {
        if ((byVar.f139188a & 8) != 0) {
            String str = byVar.f139192e;
            String a = C114872do.m190398a(str);
            if (TextUtils.isEmpty(a)) {
                this.f318010f.mo65089a(C87566i.m142325x(str));
            } else if (this.f318006a == null || !C114676cf.f318126b.contains(a)) {
                this.f318011g.mo101659d(C87566i.m142325x(str), this.f318012h);
            } else {
                this.f318006a.mo81667a(a, C58495hd.m89900n("IntentUrl", str));
            }
        } else {
            ((C59052c) ((C59052c) f318005c.mo56226d()).mo56372aa(29283)).mo56386p("Menu action has no url provided.");
        }
    }
}
