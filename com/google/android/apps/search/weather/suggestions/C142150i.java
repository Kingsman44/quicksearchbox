package com.google.android.apps.search.weather.suggestions;

import android.content.Context;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.search.weather.suggestions.p10694a.C142125b;
import com.google.android.apps.search.weather.suggestions.p10697d.C142142a;
import com.google.android.apps.search.weather.suggestions.p10697d.C142143b;
import com.google.android.apps.search.weather.suggestions.p10697d.C142145d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.p3638c.C46755l;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.weather.suggestions.i */
/* compiled from: PG */
public final class C142150i {

    /* renamed from: a */
    public static final C59071e f385613a = C59071e.m91332i("com.google.android.apps.search.weather.suggestions.i");

    /* renamed from: b */
    public final C142147f f385614b;

    /* renamed from: c */
    public final C28310af f385615c;

    /* renamed from: d */
    public final C28306ab f385616d;

    /* renamed from: e */
    private final C46801dp f385617e;

    /* renamed from: f */
    private final C142125b f385618f;

    /* renamed from: g */
    private final Context f385619g;

    /* renamed from: com.google.android.apps.search.weather.suggestions.i$a */
    /* compiled from: PG */
    final class C142151a implements C46792di {
        public C142151a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C142150i.f385613a.mo56225c()).mo56382g(th)).mo56372aa(42035)).mo56386p("Error retrieving suggestions");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            View view = C142150i.this.f385614b.getView();
            view.getClass();
            C46755l lVar = (C46755l) ((RecyclerView) view.findViewById(R.id.weather_suggestions_list_view)).mAdapter;
            lVar.getClass();
            lVar.mo50772a(((C142145d) obj).f385606a);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C142150i(Context context, C142147f fVar, C46801dp dpVar, C142125b bVar, C28310af afVar, C28306ab abVar) {
        this.f385614b = fVar;
        this.f385617e = dpVar;
        this.f385618f = bVar;
        this.f385615c = afVar;
        this.f385616d = abVar;
        this.f385619g = context;
    }

    /* renamed from: a */
    public final void mo117029a(C58833ax axVar) {
        C142142a aVar = (C142142a) C142143b.f385599d.createBuilder();
        String languageTag = this.f385619g.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
        aVar.copyOnWrite();
        C142143b bVar = (C142143b) aVar.instance;
        languageTag.getClass();
        bVar.f385601a |= 2;
        bVar.f385603c = languageTag;
        if (axVar.mo56113h()) {
            String str = (String) axVar.mo56107c();
            aVar.copyOnWrite();
            C142143b bVar2 = (C142143b) aVar.instance;
            str.getClass();
            bVar2.f385601a |= 1;
            bVar2.f385602b = str;
        }
        this.f385617e.mo50707a(this.f385618f.mo117024a((C142143b) aVar.build()), new C142151a());
    }
}
