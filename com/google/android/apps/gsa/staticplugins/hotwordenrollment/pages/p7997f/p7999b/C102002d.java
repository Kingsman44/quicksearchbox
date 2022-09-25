package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.p7999b;

import android.content.Context;
import android.content.res.Resources;
import com.android.p265e.C5114a;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.p546a.C10001p;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.p546a.C9997m;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6332a.C81006b;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.p7311n.C92533a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.C102007c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.C102010e;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.C102012g;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.C102013h;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.C102017l;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.C102018m;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.C102019n;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C62912at;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.b.d */
/* compiled from: PG */
public final class C102002d implements C102019n {

    /* renamed from: a */
    public boolean f284593a = false;

    /* renamed from: b */
    private final Resources f284594b;

    /* renamed from: c */
    private final C74555u f284595c;

    /* renamed from: d */
    private final C101860a f284596d;

    /* renamed from: e */
    private final C101497ae f284597e;

    /* renamed from: f */
    private final C92486a f284598f;

    /* renamed from: g */
    private final boolean f284599g;

    /* renamed from: h */
    private final C10001p f284600h;

    /* renamed from: i */
    private final C81006b f284601i;

    /* renamed from: j */
    private final Executor f284602j;

    /* renamed from: k */
    private final C92533a f284603k;

    public C102002d(Context context, C74555u uVar, C101860a aVar, C101497ae aeVar, C92486a aVar2, boolean z, C92533a aVar3, C81006b bVar, C10001p pVar, C60887da daVar) {
        this.f284594b = context.getResources();
        this.f284595c = uVar;
        this.f284596d = aVar;
        this.f284597e = aeVar;
        this.f284598f = aVar2;
        this.f284599g = z;
        this.f284603k = aVar3;
        this.f284600h = pVar;
        this.f284601i = bVar;
        this.f284602j = daVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r0 != 5) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.apps.tiktok.dataservice.local.C46851e mo92762a() {
        /*
            r4 = this;
            com.google.android.apps.gsa.h.s.af r0 = com.google.android.apps.gsa.h.s.af.a
            com.google.android.apps.gsa.h.s.u r0 = r4.f284595c
            com.google.android.apps.gsa.h.s.ae r0 = r0.mo70887e()
            com.google.android.apps.gsa.h.s.af r0 = r0.mo70854b()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x002b
            r1 = 1
            if (r0 == r1) goto L_0x0022
            r1 = 2
            if (r0 == r1) goto L_0x002b
            r1 = 3
            if (r0 == r1) goto L_0x0022
            r1 = 4
            if (r0 == r1) goto L_0x0022
            r1 = 5
            if (r0 == r1) goto L_0x002b
            goto L_0x002e
        L_0x0022:
            com.google.android.apps.gsa.nga.shared.aq.a.b r0 = r4.f284601i
            boolean r0 = r0.mo74781g()
            r4.f284593a = r0
            goto L_0x002e
        L_0x002b:
            r0 = 0
            r4.f284593a = r0
        L_0x002e:
            boolean r0 = r4.f284593a
            if (r0 == 0) goto L_0x004d
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.o r0 = new com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.o
            com.google.android.apps.gsa.assistant.settings.features.ag.a.p r1 = r4.f284600h
            com.google.common.util.concurrent.cx r1 = r1.mo18177c()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.b.a r2 = new com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.b.a
            r2.<init>(r4)
            java.util.concurrent.Executor r3 = r4.f284602j
            com.google.common.base.ah r2 = com.google.apps.tiktok.tracing.C47810es.m84963c(r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93044g(r1, r2, r3)
            r0.<init>(r1)
            goto L_0x005a
        L_0x004d:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.o r0 = new com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.o
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.m r1 = r4.mo92771d()
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            r0.<init>(r1)
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.p7999b.C102002d.mo92762a():com.google.apps.tiktok.dataservice.local.e");
    }

    /* renamed from: b */
    public final C60870cx mo92763b() {
        this.f284603k.mo87307a(2);
        if (this.f284593a) {
            ((C9997m) this.f284600h).mo18175a(C9997m.f34183c, false);
        }
        return C60856cj.m92900i(C62912at.f169862a);
    }

    /* renamed from: c */
    public final C60870cx mo92764c() {
        this.f284603k.mo87307a(1);
        if (this.f284593a) {
            ((C9997m) this.f284600h).mo18175a(C9997m.f34183c, true);
        }
        return C60856cj.m92900i(C62912at.f169862a);
    }

    /* renamed from: d */
    public final C102018m mo92771d() {
        String str;
        String str2;
        C58485gu guVar;
        String str3;
        String str4;
        String str5;
        C58485gu guVar2;
        String str6;
        C102017l i = C102018m.m168905i();
        if (this.f284596d.f284137d.get()) {
            if (this.f284593a) {
                str4 = this.f284594b.getString(R.string.phone_hotword_screen_header_title_for_unicorn_with_warm_words, new Object[]{this.f284597e.mo92329b()});
            } else {
                str4 = this.f284594b.getString(R.string.phone_hotword_screen_header_title_for_unicorn, new Object[]{this.f284597e.mo92329b(), this.f284598f.mo87230d()});
            }
            i.mo92784f(str4);
            if (this.f284593a) {
                str5 = C5114a.m13988b(Locale.getDefault(), this.f284594b.getString(R.string.phone_hotword_screen_header_description_for_unicorn_with_warm_words, new Object[]{this.f284597e.mo92329b(), this.f284598f.mo87230d(), this.f284598f.mo87230d(), this.f284597e.mo92329b()}), "GENDER", this.f284597e.mo92330c());
            } else {
                str5 = C5114a.m13988b(Locale.getDefault(), this.f284594b.getString(R.string.phone_hotword_screen_header_description_for_unicorn, new Object[]{this.f284597e.mo92329b(), this.f284598f.mo87230d(), this.f284598f.mo87230d(), this.f284597e.mo92329b()}), "GENDER", this.f284597e.mo92330c());
            }
            C102010e eVar = (C102010e) i;
            eVar.f284624b = str5;
            C58480gp e = C58485gu.m89837e();
            if (this.f284593a) {
                C102012g c = C102013h.m168888c();
                c.mo92761c(this.f284594b.getString(R.string.phone_hotword_screen_with_warm_words_example_query_1_title, new Object[]{this.f284598f.mo87230d()}));
                c.mo92760b(this.f284594b.getString(R.string.phone_hotword_screen_with_warm_words_example_query_1_subtitle));
                e.mo55395g(c.mo92759a());
                C102012g c2 = C102013h.m168888c();
                c2.mo92761c(this.f284594b.getString(R.string.phone_hotword_screen_with_warm_words_example_query_2_title));
                c2.mo92760b(this.f284594b.getString(R.string.phone_hotword_screen_with_warm_words_query_2_subtitle_for_unicorn, new Object[]{this.f284597e.mo92329b()}));
                e.mo55395g(c2.mo92759a());
                guVar2 = e.mo55394f();
            } else {
                C102012g c3 = C102013h.m168888c();
                c3.mo92761c(this.f284594b.getString(R.string.phone_hotword_screen_example_query_1_title));
                c3.mo92760b(this.f284594b.getString(R.string.phone_hotword_screen_example_query_1_subtitle_for_unicorn));
                e.mo55395g(c3.mo92759a());
                C102012g c4 = C102013h.m168888c();
                c4.mo92761c(this.f284594b.getString(R.string.phone_hotword_screen_example_query_2_title_for_unicorn));
                c4.mo92760b(this.f284594b.getString(R.string.phone_hotword_screen_example_query_2_subtitle_for_unicorn));
                e.mo55395g(c4.mo92759a());
                C102012g c5 = C102013h.m168888c();
                c5.mo92761c(this.f284594b.getString(R.string.phone_hotword_screen_example_query_3_title));
                c5.mo92760b(this.f284594b.getString(R.string.phone_hotword_screen_example_query_3_subtitle_for_unicorn));
                e.mo55395g(c5.mo92759a());
                guVar2 = e.mo55394f();
            }
            i.mo92781c(guVar2);
            if (this.f284593a) {
                str6 = this.f284594b.getString(R.string.phone_hotword_screen_footer_disclosure_for_unicorn_with_warm_words, new Object[]{this.f284597e.mo92329b(), this.f284598f.mo87230d(), this.f284598f.mo87230d(), this.f284597e.mo92329b()});
            } else {
                str6 = this.f284594b.getString(R.string.phone_hotword_screen_footer_disclosure_for_unicorn, new Object[]{this.f284597e.mo92329b(), this.f284598f.mo87230d(), this.f284598f.mo87230d(), this.f284597e.mo92329b()});
            }
            eVar.f284626d = str6;
        } else {
            if (this.f284593a) {
                str = this.f284594b.getString(R.string.phone_hotword_screen_header_title_with_warm_words);
            } else {
                str = this.f284594b.getString(R.string.phone_hotword_screen_header_title, new Object[]{this.f284598f.mo87230d()});
            }
            i.mo92784f(str);
            if (this.f284593a) {
                str2 = this.f284594b.getString(R.string.phone_hotword_screen_header_description_with_warm_words, new Object[]{this.f284598f.mo87230d(), this.f284598f.mo87230d()});
            } else {
                str2 = this.f284594b.getString(R.string.phone_hotword_screen_header_description, new Object[]{this.f284598f.mo87230d(), this.f284598f.mo87230d()});
            }
            i.mo92780b(str2);
            C58480gp e2 = C58485gu.m89837e();
            if (this.f284593a) {
                C102012g c6 = C102013h.m168888c();
                c6.mo92761c(this.f284594b.getString(R.string.phone_hotword_screen_with_warm_words_example_query_1_title, new Object[]{this.f284598f.mo87230d()}));
                c6.mo92760b(this.f284594b.getString(R.string.phone_hotword_screen_with_warm_words_example_query_1_subtitle));
                e2.mo55395g(c6.mo92759a());
                C102012g c7 = C102013h.m168888c();
                c7.mo92761c(this.f284594b.getString(R.string.phone_hotword_screen_with_warm_words_example_query_2_title));
                c7.mo92760b(this.f284594b.getString(R.string.phone_hotword_screen_with_warm_words_example_query_2_subtitle));
                e2.mo55395g(c7.mo92759a());
                guVar = e2.mo55394f();
            } else {
                C102012g c8 = C102013h.m168888c();
                c8.mo92761c(this.f284594b.getString(R.string.phone_hotword_screen_example_query_1_title));
                c8.mo92760b(this.f284594b.getString(R.string.phone_hotword_screen_example_query_1_subtitle));
                e2.mo55395g(c8.mo92759a());
                C102012g c9 = C102013h.m168888c();
                c9.mo92761c(this.f284594b.getString(R.string.phone_hotword_screen_example_query_2_title));
                c9.mo92760b(this.f284594b.getString(R.string.phone_hotword_screen_example_query_2_subtitle));
                e2.mo55395g(c9.mo92759a());
                C102012g c10 = C102013h.m168888c();
                c10.mo92761c(this.f284594b.getString(R.string.phone_hotword_screen_example_query_3_title));
                c10.mo92760b(this.f284594b.getString(R.string.phone_hotword_screen_example_query_3_subtitle));
                e2.mo55395g(c10.mo92759a());
                guVar = e2.mo55394f();
            }
            i.mo92781c(guVar);
            if (this.f284593a) {
                str3 = this.f284594b.getString(R.string.phone_hotword_screen_footer_disclosure_with_warm_words, new Object[]{this.f284598f.mo87230d(), this.f284598f.mo87230d()});
            } else {
                str3 = this.f284594b.getString(R.string.phone_hotword_screen_footer_disclosure, new Object[]{this.f284598f.mo87230d(), this.f284598f.mo87230d()});
            }
            ((C102010e) i).f284626d = str3;
        }
        i.mo92783e(this.f284594b.getString(R.string.hotword_screen_accept_button_i_agree));
        i.mo92782d(this.f284594b.getString(true != this.f284595c.mo70887e().mo70857f() ? R.string.hotword_screen_cancel_button_no_thanks : R.string.hotword_screen_cancel_button_skip));
        C102007c cVar = new C102007c();
        cVar.f284619a = new C101999c(this.f284599g);
        C102010e eVar2 = (C102010e) i;
        eVar2.f284625c = cVar.mo92773a();
        eVar2.f284629g = true;
        return i.mo92779a();
    }
}
