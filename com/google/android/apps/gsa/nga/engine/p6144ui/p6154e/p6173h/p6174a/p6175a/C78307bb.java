package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6178b.C78542a;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80577k;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80578l;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80859e;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80864j;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80865k;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.a.bb */
/* compiled from: PG */
public final class C78307bb {

    /* renamed from: a */
    private final C58485gu f215607a;

    /* renamed from: b */
    private final C78542a f215608b;

    public C78307bb(C81515c cVar, C83358h hVar, C78542a aVar) {
        C81515c cVar2 = cVar;
        this.f215608b = aVar;
        Locale locale = (Locale) ((C83361k) hVar).f227199b.get();
        this.f215607a = C58485gu.m89832B(m125804b(cVar2.mo75121a(locale).getString(R.string.privacy_primary_text_v1, new Object[0]), cVar2.mo75121a(locale).getString(R.string.privacy_click_text_v1, new Object[0]), cVar2.mo75121a(locale).getString(R.string.privacy_query_v1, new Object[0])), m125804b(cVar2.mo75121a(locale).getString(R.string.privacy_primary_text_v2, new Object[0]), cVar2.mo75121a(locale).getString(R.string.privacy_click_text_v2, new Object[0]), cVar2.mo75121a(locale).getString(R.string.privacy_query_v2, new Object[0])), m125804b(cVar2.mo75121a(locale).getString(R.string.privacy_primary_text_v3, new Object[0]), cVar2.mo75121a(locale).getString(R.string.privacy_click_text_v3, new Object[0]), cVar2.mo75121a(locale).getString(R.string.privacy_query_v3, new Object[0])), m125804b(cVar2.mo75121a(locale).getString(R.string.privacy_primary_text_v4, new Object[0]), cVar2.mo75121a(locale).getString(R.string.privacy_click_text_v4, new Object[0]), cVar2.mo75121a(locale).getString(R.string.privacy_query_v4, new Object[0])), m125804b(cVar2.mo75121a(locale).getString(R.string.privacy_primary_text_v5, new Object[0]), cVar2.mo75121a(locale).getString(R.string.privacy_click_text_v5, new Object[0]), cVar2.mo75121a(locale).getString(R.string.privacy_query_v5, new Object[0])), m125804b(cVar2.mo75121a(locale).getString(R.string.privacy_primary_text_v6, new Object[0]), cVar2.mo75121a(locale).getString(R.string.privacy_click_text_v6, new Object[0]), cVar2.mo75121a(locale).getString(R.string.privacy_query_v6, new Object[0])), m125804b(cVar2.mo75121a(locale).getString(R.string.privacy_primary_text_v7, new Object[0]), cVar2.mo75121a(locale).getString(R.string.privacy_click_text_v7, new Object[0]), cVar2.mo75121a(locale).getString(R.string.privacy_query_v7, new Object[0])), m125804b(cVar2.mo75121a(locale).getString(R.string.privacy_primary_text_v8, new Object[0]), cVar2.mo75121a(locale).getString(R.string.privacy_click_text_v8, new Object[0]), cVar2.mo75121a(locale).getString(R.string.privacy_query_v8, new Object[0])), m125804b(cVar2.mo75121a(locale).getString(R.string.privacy_primary_text_v9, new Object[0]), cVar2.mo75121a(locale).getString(R.string.privacy_click_text_v9, new Object[0]), cVar2.mo75121a(locale).getString(R.string.privacy_query_v9, new Object[0])), m125804b(cVar2.mo75121a(locale).getString(R.string.privacy_primary_text_v10, new Object[0]), cVar2.mo75121a(locale).getString(R.string.privacy_click_text_v10, new Object[0]), cVar2.mo75121a(locale).getString(R.string.privacy_query_v10, new Object[0])));
    }

    /* renamed from: b */
    private static C78306ba m125804b(String str, String str2, String str3) {
        C78305b bVar = new C78305b();
        bVar.f215602a = BuildConfig.FLAVOR;
        bVar.f215603b = BuildConfig.FLAVOR;
        bVar.f215604c = BuildConfig.FLAVOR;
        bVar.mo73291c(C80831aj.f221751c);
        bVar.mo73292d(1);
        if (str != null) {
            bVar.f215603b = str;
            if (str2 != null) {
                bVar.f215604c = str2;
                C80859e eVar = (C80859e) C80831aj.f221751c.createBuilder();
                C80864j jVar = (C80864j) C80865k.f221810c.createBuilder();
                C80577k kVar = (C80577k) C80578l.f221173g.createBuilder();
                kVar.copyOnWrite();
                C80578l lVar = (C80578l) kVar.instance;
                str3.getClass();
                lVar.f221175a = 2;
                lVar.f221176b = str3;
                C80578l lVar2 = (C80578l) kVar.build();
                jVar.copyOnWrite();
                lVar2.getClass();
                ((C80865k) jVar.instance).f221812a = lVar2;
                int i = e.F.ca;
                jVar.copyOnWrite();
                ((C80865k) jVar.instance).f221813b = i;
                C80865k kVar2 = (C80865k) jVar.build();
                eVar.copyOnWrite();
                C80831aj ajVar = (C80831aj) eVar.instance;
                kVar2.getClass();
                ajVar.f221754b = kVar2;
                ajVar.f221753a = 2;
                bVar.mo73291c((C80831aj) eVar.build());
                return bVar.mo73289a();
            }
            throw new NullPointerException("Null clickText");
        }
        throw new NullPointerException("Null primaryText");
    }

    /* renamed from: a */
    public final Optional mo73299a(int i) {
        C58485gu guVar = this.f215607a;
        C78306ba baVar = (C78306ba) guVar.get(this.f215608b.f216295a.nextInt(((C58724pq) guVar).f156474d));
        if (i == 4) {
            C78304az a = baVar.mo73293a();
            a.mo73290b(baVar.mo73297e() + " <a href=\"\">" + baVar.mo73296d() + "</a>");
            baVar = a.mo73289a();
        }
        C78304az a2 = baVar.mo73293a();
        a2.mo73292d(i);
        return Optional.m71637of(a2.mo73289a());
    }
}
