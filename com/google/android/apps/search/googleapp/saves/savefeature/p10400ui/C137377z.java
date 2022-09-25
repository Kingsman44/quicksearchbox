package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui;

import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.C137274p;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137246d;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137250h;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10403c.C137354b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.p3638c.C46753j;
import com.google.apps.tiktok.dataservice.p3638c.C46755l;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.z */
/* compiled from: PG */
public final class C137377z {

    /* renamed from: a */
    public static final C59071e f373666a = C59071e.m91332i("com.google.android.apps.search.googleapp.saves.savefeature.ui.z");

    /* renamed from: b */
    public final AccountId f373667b;

    /* renamed from: c */
    public final C137354b f373668c;

    /* renamed from: d */
    public final C137370s f373669d;

    /* renamed from: e */
    public final C137274p f373670e;

    /* renamed from: f */
    public final C46801dp f373671f;

    /* renamed from: g */
    public final C47770dh f373672g;

    /* renamed from: h */
    public final C28306ab f373673h;

    /* renamed from: i */
    public final C28443m f373674i;

    /* renamed from: j */
    public final C46756m f373675j = new C137376y(this);

    /* renamed from: k */
    public final C46755l f373676k;

    /* renamed from: l */
    public final C46792di f373677l;

    public C137377z(AccountId accountId, C137354b bVar, C137370s sVar, C137274p pVar, C46801dp dpVar, C47770dh dhVar, C28306ab abVar, C28443m mVar) {
        C46753j jVar = new C46753j();
        jVar.f122102a = new C137371t(this);
        jVar.mo50771b(C137372u.f373659a);
        this.f373676k = jVar.mo50770a();
        this.f373677l = new C46792di() {
            /* renamed from: a */
            public final void mo18077a(Throwable th) {
                ((C59052c) ((C59052c) ((C59052c) C137377z.f373666a.mo56226d()).mo56382g(th)).mo56372aa(40959)).mo56386p("Fetching list elements failed.");
            }

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
                C46755l lVar = C137377z.this.f373676k;
                C137250h hVar = ((C137246d) obj).f373392a;
                if (hVar == null) {
                    hVar = C137250h.f373398b;
                }
                lVar.mo50772a(hVar.f373400a);
                View view = C137377z.this.f373669d.getView();
                view.getClass();
                view.findViewById(R.id.googleapp_list_progress_bar).setVisibility(8);
                View view2 = C137377z.this.f373669d.getView();
                view2.getClass();
                ((RecyclerView) view2.findViewById(R.id.googleapp_list_view)).setVisibility(0);
            }

            /* renamed from: c */
            public final /* synthetic */ void mo18079c() {
            }
        };
        this.f373667b = accountId;
        this.f373668c = bVar;
        this.f373669d = sVar;
        this.f373670e = pVar;
        this.f373671f = dpVar;
        this.f373672g = dhVar;
        this.f373673h = abVar;
        this.f373674i = mVar;
    }
}
