package com.google.android.apps.gsa.nga.engine.education;

import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6170f.p6171a.C78268c;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78815q;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78816r;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80587u;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80721cw;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90040cs;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3775ac.p3779d.C48468h;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.ad */
/* compiled from: PG */
public final /* synthetic */ class C75679ad implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C75688am f210075a;

    /* renamed from: b */
    public final /* synthetic */ Locale f210076b;

    /* renamed from: c */
    public final /* synthetic */ e f210077c;

    /* renamed from: d */
    public final /* synthetic */ int f210078d;

    public /* synthetic */ C75679ad(C75688am amVar, Locale locale, e eVar, int i) {
        this.f210075a = amVar;
        this.f210076b = locale;
        this.f210077c = eVar;
        this.f210078d = i;
    }

    public final Object apply(Object obj) {
        Optional optional;
        boolean z;
        Optional optional2;
        C75687al alVar;
        Optional optional3;
        C80721cw cwVar;
        C80587u uVar;
        String str;
        String str2;
        String str3;
        e eVar;
        C75688am amVar = this.f210075a;
        Locale locale = this.f210076b;
        e eVar2 = this.f210077c;
        int i = this.f210078d;
        Pair pair = (Pair) obj;
        if (((Optional) pair.first).isPresent()) {
            C58976aa aaVar = C58975e.f156826a;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            amVar.f210103f.mo74271b(C89849ae.FRE_SHOW_QUERY_SUGGESTION_FETCH_SUCCESS);
            Optional optional4 = (Optional) pair.first;
            C75746c cVar = (C75746c) pair.second;
            if (!optional4.isPresent()) {
                return Optional.empty();
            }
            C75687al alVar2 = (C75687al) optional4.get();
            C80905at.m128763g(amVar.f210108k.mo74873U(), C75752g.f210236a);
            boolean z2 = !amVar.f210109l.f208979b.isKeyguardLocked() || !amVar.f210106i.mo85405j(C90040cs.f248637D) || !amVar.f210106i.mo85405j(C90126fx.f251424iZ);
            boolean m = amVar.mo71837m();
            C80721cw d = amVar.mo71828d();
            C80587u b = amVar.mo71826b();
            if (!amVar.f210106i.mo85405j(C90040cs.f248651R)) {
                optional = Optional.empty();
            } else {
                C75684ai aiVar = alVar2.f210097c;
                if (!aiVar.f210092a) {
                    optional = Optional.empty();
                } else {
                    optional = Optional.m71637of(amVar.mo71827c(locale, aiVar.f210093b));
                }
            }
            C48468h hVar = C48468h.UNKNOWN_MODE;
            C75746c cVar2 = C75746c.OTHER;
            int ordinal = cVar.ordinal();
            if (ordinal == 1) {
                z = amVar.mo71836l(amVar.f210104g.mo71854b());
            } else if (ordinal != 3) {
                z = false;
            } else {
                z = amVar.mo71836l(amVar.f210104g.mo71855c(locale, amVar.mo71832h()));
            }
            String str4 = alVar2.f210095a;
            if (i != 2) {
                alVar = alVar2;
                optional2 = optional;
                if (i == 3) {
                    C78268c cVar3 = (C78268c) amVar.f210113p.mo27525b();
                    if (C78816r.m126597b((C78815q) cVar3.f215412b.mo76657c())) {
                        cVar3.mo73251a();
                    } else {
                        cVar3.f215413c = true;
                    }
                }
            } else if (!str4.isEmpty()) {
                alVar = alVar2;
                optional2 = optional;
                str4 = ((C81515c) amVar.f210111n.mo27525b()).mo75121a(locale).getString(R.string.nga_okg_suggestion_template, new Object[]{str4.substring(0, 1).toLowerCase(locale).concat(str4.substring(1))});
            } else {
                alVar = alVar2;
                optional2 = optional;
            }
            int ordinal2 = cVar.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    optional3 = Optional.m71637of(amVar.f210104g.mo71854b());
                } else if (ordinal2 == 2) {
                    optional3 = Optional.m71637of(amVar.f210104g.mo71856d());
                } else if (ordinal2 == 3) {
                    optional3 = Optional.m71637of(amVar.f210104g.mo71855c(locale, amVar.mo71832h()));
                } else if (ordinal2 == 4) {
                    optional3 = Optional.m71637of(amVar.f210104g.mo71857e());
                } else if (ordinal2 != 5) {
                    optional3 = Optional.empty();
                } else {
                    optional3 = Optional.m71637of(amVar.f210104g.mo71853a());
                }
            } else if (eVar2.equals(e.bi)) {
                optional3 = Optional.m71637of(C48468h.NOTIFICATION_SUGGESTION);
            } else {
                optional3 = Optional.empty();
            }
            String string = ((C81515c) amVar.f210111n.mo27525b()).mo75121a(locale).getString(i == 3 ? R.string.nga_assist_query_suggestion_swipe_and_try_saying : R.string.nga_assist_query_suggestion_try_saying, new Object[0]);
            C75640a aVar = new C75640a();
            aVar.mo71775f(false);
            aVar.mo71774e(false);
            aVar.mo71772c(C80721cw.MOLECULE);
            aVar.mo71776g(false);
            aVar.mo71771b(C80587u.CLICK_WHOLE_PLATE);
            aVar.mo71770a(Optional.empty());
            aVar.mo71778i(Optional.empty());
            aVar.f209980h = BuildConfig.FLAVOR;
            aVar.f209981i = BuildConfig.FLAVOR;
            aVar.f209982j = BuildConfig.FLAVOR;
            aVar.mo71773d(e.a);
            aVar.mo71777h(Optional.empty());
            aVar.mo71775f(z2);
            aVar.mo71774e(m);
            aVar.mo71772c(d);
            aVar.mo71776g(z);
            aVar.mo71771b(b);
            aVar.mo71770a(optional2);
            aVar.mo71778i(alVar.f210096b);
            if (string != null) {
                aVar.f209980h = string;
                String string2 = ((C81515c) amVar.f210111n.mo27525b()).mo75121a(locale).getString(R.string.nga_assist_display_query_quotation, new Object[]{str4});
                if (string2 != null) {
                    aVar.f209981i = string2;
                    if (str4 != null) {
                        aVar.f209982j = str4;
                        aVar.mo71773d(e.R);
                        aVar.mo71777h(optional3);
                        if (aVar.f209985m != 7 || (cwVar = aVar.f209975c) == null || (uVar = aVar.f209977e) == null || (str = aVar.f209980h) == null || (str2 = aVar.f209981i) == null || (str3 = aVar.f209982j) == null || (eVar = aVar.f209983k) == null) {
                            StringBuilder sb = new StringBuilder();
                            if ((aVar.f209985m & 1) == 0) {
                                sb.append(" showLogo");
                            }
                            if ((aVar.f209985m & 2) == 0) {
                                sb.append(" showIllustrationGif");
                            }
                            if (aVar.f209975c == null) {
                                sb.append(" illustrationGifType");
                            }
                            if ((aVar.f209985m & 4) == 0) {
                                sb.append(" showSuggestionChips");
                            }
                            if (aVar.f209977e == null) {
                                sb.append(" freClickHandling");
                            }
                            if (aVar.f209980h == null) {
                                sb.append(" suggestionHint");
                            }
                            if (aVar.f209981i == null) {
                                sb.append(" displayQuery");
                            }
                            if (aVar.f209982j == null) {
                                sb.append(" executionQuery");
                            }
                            if (aVar.f209983k == null) {
                                sb.append(" opaTriggerType");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                        }
                        return Optional.m71637of(new C75702b(aVar.f209973a, aVar.f209974b, cwVar, aVar.f209976d, uVar, aVar.f209978f, aVar.f209979g, str, str2, str3, eVar, aVar.f209984l));
                    }
                    throw new NullPointerException("Null executionQuery");
                }
                throw new NullPointerException("Null displayQuery");
            }
            throw new NullPointerException("Null suggestionHint");
        }
        amVar.f210103f.mo74271b(C89849ae.FRE_SHOW_QUERY_SUGGESTION_FETCH_FAILED);
        return Optional.empty();
    }
}
