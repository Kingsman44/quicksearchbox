package com.google.android.apps.gsa.staticplugins.p7638ca.p7641c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88391zy;
import com.google.android.apps.gsa.search.shared.service.p6935b.aaa;
import com.google.android.apps.gsa.shared.p7019bc.C89407a;
import com.google.android.apps.gsa.shared.p7148ui.C90638an;
import com.google.android.apps.gsa.shared.p7148ui.p7152d.C90668a;
import com.google.android.apps.gsa.shared.p7148ui.p7152d.C90670c;
import com.google.android.apps.gsa.shared.p7148ui.p7152d.C90671d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.ca.c.d */
/* compiled from: PG */
public final /* synthetic */ class C97510d implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C97511e f272318a;

    public /* synthetic */ C97510d(C97511e eVar) {
        this.f272318a = eVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C97511e eVar = this.f272318a;
        ServiceEventData serviceEventData = (ServiceEventData) ((C58833ax) obj).mo56111f();
        if (serviceEventData != null) {
            Query query = (Query) serviceEventData.mo81912b(Query.class);
            aaa aaa = (aaa) serviceEventData.mo81918e(C88391zy.f239008a);
            boolean z = aaa.f237055b;
            long j = aaa.f237056c;
            boolean z2 = aaa.f237057d;
            C90671d dVar = eVar.f272320b;
            boolean z3 = true;
            C58838bb.m90869d(j >= 0, "elapsedTimeMs must be >= 0");
            Context context = dVar.f253560a;
            ((TextView) ((View) dVar.f253562c.mo6453a()).findViewById(R.id.timestamp_label)).setText(context.getString(R.string.results_from_ago, new Object[]{C89407a.m145422e(context, j, true)}));
            eVar.f272320b.mo84966a(z2);
            C90671d dVar2 = eVar.f272320b;
            if (query == null) {
                z3 = false;
            }
            C58838bb.m90869d(z3, "currentQuery must be nonnull");
            ((TextView) ((View) dVar2.f253562c.mo6453a()).findViewById(R.id.get_latest_button)).setOnClickListener(new C90670c(dVar2));
            if (!z) {
                C97508b bVar = eVar.f272321c;
                int indexOf = C90668a.f253557a.indexOf(2);
                if (indexOf < 0) {
                    ((C59052c) ((C59052c) C97508b.f272312a.mo56226d()).mo56372aa(21318)).mo56386p("Native View is not registered and thus cannot be detached.");
                    int i = C90755l.f253831a;
                    return;
                }
                View view = bVar.f272314c[indexOf];
                if (view != null) {
                    bVar.f272313b.mo84839b(view);
                    bVar.f272314c[indexOf] = null;
                }
            } else if (j > 0) {
                View view2 = (View) eVar.f272320b.f253562c.mo6453a();
                if (view2 == null) {
                    ((C59052c) ((C59052c) C97511e.f272319a.mo56225c()).mo56372aa(21319)).mo56386p("Got a null timestampView from factory");
                    return;
                }
                C97508b bVar2 = eVar.f272321c;
                int indexOf2 = C90668a.f253557a.indexOf(2);
                if (indexOf2 < 0) {
                    ((C59052c) ((C59052c) C97508b.f272312a.mo56226d()).mo56372aa(21315)).mo56386p("Native View is not registered and thus cannot be attached.");
                    int i2 = C90755l.f253831a;
                } else if (bVar2.f272314c[indexOf2] == null) {
                    if (view2.getParent() != null) {
                        ViewGroup viewGroup = (ViewGroup) view2.getParent();
                        if (viewGroup == bVar2.f272313b) {
                            ((C59052c) ((C59052c) C97508b.f272312a.mo56226d()).mo56372aa(21314)).mo56386p("Native view already attached.");
                            return;
                        } else {
                            ((C59052c) ((C59052c) C97508b.f272312a.mo56226d()).mo56372aa(21313)).mo56389s("Force-detached native view from previous parent: %s", viewGroup);
                            viewGroup.removeView(view2);
                        }
                    }
                    bVar2.f272314c[indexOf2] = view2;
                    C90638an anVar = new C90638an(bVar2.f272313b.generateDefaultLayoutParams());
                    anVar.f253474c = false;
                    anVar.f253489r = 4;
                    anVar.f253490s = 5;
                    view2.setLayoutParams(anVar);
                    bVar2.f272313b.addView(view2, indexOf2);
                }
            }
        }
    }
}
