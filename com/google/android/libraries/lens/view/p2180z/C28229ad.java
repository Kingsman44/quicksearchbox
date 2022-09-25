package com.google.android.libraries.lens.view.p2180z;

import android.accounts.Account;
import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.p097i.C1970e;
import androidx.p197u.C4199aj;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26968d;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26973i;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26980p;
import com.google.android.libraries.lens.view.p2056af.C25050av;
import com.google.android.libraries.lens.view.p2067ak.C25217aw;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2067ak.C25275n;
import com.google.android.libraries.lens.view.p2067ak.C25277p;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.session.ondevice.p2169d.C27953i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.surveys.C43025b;
import com.google.android.libraries.surveys.C43026c;
import com.google.android.libraries.surveys.C43028e;
import com.google.android.libraries.surveys.C43169j;
import com.google.android.libraries.surveys.C43170k;
import com.google.android.libraries.surveys.SurveyData;
import com.google.android.libraries.surveys.SurveyMetadata;
import com.google.android.material.p3516m.C44808d;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.aar;
import com.google.common.p4552o.aas;
import com.google.common.p4552o.p4563i.C59936cr;
import com.google.common.p4552o.p4563i.C59937cs;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62948a;
import com.google.protobuf.p4750c.C62953e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;
import p3186j$.util.stream.Stream;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.view.z.ad */
/* compiled from: PG */
public final class C28229ad implements C28225a, C43169j, C43028e {

    /* renamed from: c */
    public static final /* synthetic */ int f76850c = 0;

    /* renamed from: d */
    private static final C58974d f76851d = C58974d.m91135i("HatsNextController");

    /* renamed from: A */
    private final C27953i f76852A;

    /* renamed from: B */
    private final boolean f76853B;

    /* renamed from: C */
    private boolean f76854C;

    /* renamed from: D */
    private boolean f76855D;

    /* renamed from: E */
    private boolean f76856E;

    /* renamed from: F */
    private ViewGroup f76857F;

    /* renamed from: a */
    public final Activity f76858a;

    /* renamed from: b */
    public SurveyMetadata f76859b;

    /* renamed from: e */
    private final C28227ab f76860e = new C28227ab("BUKvMENeB0qMhXZpyv70WECaodyo", C28228ac.RECURRING);

    /* renamed from: f */
    private final C28227ab f76861f;

    /* renamed from: g */
    private final C28227ab f76862g;

    /* renamed from: h */
    private final C28227ab f76863h;

    /* renamed from: i */
    private final C28226aa f76864i;

    /* renamed from: j */
    private final C28226aa f76865j;

    /* renamed from: k */
    private final C28226aa f76866k;

    /* renamed from: l */
    private final C28226aa f76867l;

    /* renamed from: m */
    private final C28226aa f76868m;

    /* renamed from: n */
    private final C58833ax f76869n;

    /* renamed from: o */
    private final C21370a f76870o;

    /* renamed from: p */
    private final String f76871p;

    /* renamed from: q */
    private final C69464a f76872q;

    /* renamed from: r */
    private final boolean f76873r;

    /* renamed from: s */
    private final C25989d f76874s;

    /* renamed from: t */
    private final C26980p f76875t;

    /* renamed from: u */
    private final C27232l f76876u;

    /* renamed from: v */
    private final C25050av f76877v;

    /* renamed from: w */
    private final C25225bd f76878w;

    /* renamed from: x */
    private final C60887da f76879x;

    /* renamed from: y */
    private final PriorityQueue f76880y;

    /* renamed from: z */
    private final HashMap f76881z;

    public C28229ad(Activity activity, C21370a aVar, C69464a aVar2, C58833ax axVar, C25989d dVar, C26980p pVar, C27232l lVar, C25050av avVar, C60887da daVar, C25225bd bdVar, C27953i iVar, boolean z, String str, boolean z2) {
        C28228ac acVar = C28228ac.RECURRING;
        this.f76861f = new C28227ab("C6QghwB390qMhXZpyv70NUPeNEj1", acVar);
        this.f76862g = new C28227ab("X2fMf6M4C0qMhXZpyv70P8C8c9xz", acVar);
        this.f76863h = new C28227ab(BuildConfig.FLAVOR, C28228ac.UNIQUE);
        this.f76864i = new C28226aa("8djkc7d1E0qMhXZpyv70S8bwB256", C28228ac.DEFAULT, C28252w.f76903a, C28235f.f76885a, C28236g.f76886a);
        this.f76865j = new C28226aa("EMoMojqVJ0qMhXZpyv70TPmFH8hY", C28228ac.DEFAULT, C28237h.f76887a, C28238i.f76888a, C28239j.f76889a);
        this.f76866k = new C28226aa("CkXsmBhWj0qMhXZpyv70Phbv9DWK", C28228ac.DEFAULT, C28240k.f76890a, C28241l.f76891a, C28242m.f76892a);
        this.f76867l = new C28226aa("SgHqDUmfU0qMhXZpyv70RJEPnHhj", C28228ac.DEFAULT, C28244o.f76894a, C28253x.f76904a, C28254y.f76905a);
        this.f76868m = new C28226aa("r16cBkV840qMhXZpyv70WaEbGmst", C28228ac.DEFAULT, C28255z.f76906a, C28233d.f76883a, C28234e.f76884a);
        this.f76880y = new PriorityQueue();
        this.f76881z = new HashMap();
        this.f76859b = null;
        this.f76857F = null;
        this.f76869n = axVar;
        this.f76858a = activity;
        this.f76870o = aVar;
        this.f76877v = avVar;
        this.f76874s = dVar;
        this.f76875t = pVar;
        this.f76871p = str;
        this.f76878w = bdVar;
        this.f76876u = lVar;
        this.f76879x = daVar;
        this.f76872q = aVar2;
        this.f76873r = !z;
        this.f76852A = iVar;
        this.f76853B = z2;
    }

    /* renamed from: m */
    private final void m52794m(C28227ab abVar) {
        this.f76881z.put(abVar, true);
    }

    /* renamed from: n */
    private final void m52795n(C28227ab abVar) {
        if (!Boolean.TRUE.equals(this.f76881z.get(abVar))) {
            m52794m(abVar);
            mo33742k(abVar);
        }
    }

    /* renamed from: o */
    private final void m52796o(C28226aa aaVar) {
        if (!Boolean.TRUE.equals(this.f76881z.get(aaVar.f76840a))) {
            if (!((Stream) aaVar.f76843d.apply(this.f76878w.mo30350f())).anyMatch(new C28232c(C62953e.m95484i(this.f76870o.mo26870b())))) {
                m52794m(aaVar.f76840a);
                C25277p f = this.f76878w.mo30350f();
                C63042fg i = C62953e.m95484i(this.f76870o.mo26870b());
                C63042fg l = C62953e.m95487l(i, C62948a.m95456g(28));
                C25275n nVar = (C25275n) f.toBuilder();
                aaVar.f76841b.accept(nVar);
                ((Stream) aaVar.f76843d.apply(f)).filter(new C28246q(l)).limit(27).forEach(new C28247r(aaVar, nVar));
                aaVar.f76842c.accept(nVar, i);
                this.f76878w.f68662a.mo30363c(new C25217aw((C25277p) nVar.build()));
                if (!TextUtils.isEmpty(aaVar.f76840a.f76844a)) {
                    if (((Stream) aaVar.f76843d.apply(this.f76878w.mo30350f())).count() >= 5) {
                        mo33742k(aaVar.f76840a);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        m52794m(aaVar.f76840a);
    }

    /* renamed from: p */
    private static void m52797p(C60887da daVar, C69464a aVar, Consumer consumer) {
        if (daVar.isShutdown()) {
            ((C58970a) ((C58970a) f76851d.mo56226d()).mo56372aa(49478)).mo56386p("SurveysClient call dropped: application is shutting down.");
            return;
        }
        Objects.requireNonNull(aVar);
        C46459k.m82829b(C60922j.m93044g(daVar.mo19399b(new C28243n(aVar)), new C28248s(consumer), daVar), "Failure while interacting with the SurveysClient", new Object[0]);
    }

    /* renamed from: a */
    public final void mo33737a(SurveyData surveyData) {
        if (!this.f76873r) {
            ((C58970a) ((C58970a) f76851d.mo56225c()).mo56372aa(49475)).mo56386p("Survey request received, but HaTS is not enabled. Something is wrong.");
        } else if (this.f76857F == null) {
            ((C58970a) ((C58970a) f76851d.mo56225c()).mo56372aa(49474)).mo56386p("Survey request received, but the container view is null. Aborting.");
        } else {
            ArrayList arrayList = new ArrayList();
            String str = "unknown";
            arrayList.add(new C1970e("entrypoint", (String) this.f76876u.mo32701h().mo56109e(str)));
            arrayList.add(new C1970e("current_filter", this.f76874s.f70642a.f70649b.name()));
            C26973i b = this.f76875t.mo32436b();
            if (b != null) {
                str = String.valueOf(b.mo32424m());
            }
            arrayList.add(new C1970e("is_good_result", str));
            C43025b bVar = new C43025b(this.f76858a, surveyData);
            ViewGroup viewGroup = this.f76857F;
            viewGroup.getClass();
            int id = viewGroup.getId();
            ViewGroup viewGroup2 = this.f76857F;
            viewGroup2.getClass();
            bVar.mo46052b(id, Integer.valueOf(viewGroup2.getWidth()));
            bVar.f112521c = arrayList;
            bVar.f112519a = this;
            if (this.f76869n.mo56113h()) {
                bVar.f112520b = (Account) this.f76869n.mo56107c();
            }
            m52797p(this.f76879x, this.f76872q, new C28245p(bVar));
            this.f76856E = true;
            this.f76880y.clear();
        }
    }

    /* renamed from: b */
    public final void mo33738b() {
        if (this.f76873r) {
            this.f76854C = false;
            mo33741i();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33732c(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            r1 = -526584950(0xffffffffe09cf38a, float:-9.047628E19)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = 3059573(0x2eaf75, float:4.287375E-39)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "copy"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 0
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "select-all-text"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 1
            goto L_0x0025
        L_0x0024:
            r4 = -1
        L_0x0025:
            if (r4 == 0) goto L_0x0030
            if (r4 == r2) goto L_0x002a
            goto L_0x0035
        L_0x002a:
            com.google.android.libraries.lens.view.z.aa r4 = r3.f76868m
            r3.m52796o(r4)
            goto L_0x0035
        L_0x0030:
            com.google.android.libraries.lens.view.z.aa r4 = r3.f76867l
            r3.m52796o(r4)
        L_0x0035:
            r3.mo33741i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2180z.C28229ad.mo33732c(java.lang.String):void");
    }

    /* renamed from: d */
    public final void mo33733d() {
        if (!TextUtils.isEmpty((CharSequence) ((C58833ax) this.f76875t.f73571e.mo3842a()).mo56106b(C28250u.f76901a).mo56109e(BuildConfig.FLAVOR))) {
            m52795n(this.f76862g);
        }
        mo33741i();
    }

    /* renamed from: e */
    public final void mo33734e(ViewGroup viewGroup) {
        this.f76857F = viewGroup;
    }

    /* renamed from: f */
    public final boolean mo33735f() {
        if (!this.f76873r || !this.f76855D) {
            return false;
        }
        m52797p(this.f76879x, this.f76872q, new C28249t(this));
        return true;
    }

    /* renamed from: g */
    public final void mo33739g(SurveyMetadata surveyMetadata) {
        this.f76855D = false;
        this.f76859b = null;
        if (this.f76869n.mo56113h() && surveyMetadata.f112518d == 3) {
            C59936cr crVar = (C59936cr) C59937cs.f161988d.createBuilder();
            String str = surveyMetadata.f112516b;
            str.getClass();
            crVar.copyOnWrite();
            C59937cs csVar = (C59937cs) crVar.instance;
            csVar.f161990a |= 1;
            csVar.f161991b = str;
            String str2 = surveyMetadata.f112515a;
            str2.getClass();
            crVar.copyOnWrite();
            C59937cs csVar2 = (C59937cs) crVar.instance;
            csVar2.f161990a |= 2;
            csVar2.f161992c = str2;
            C59937cs csVar3 = (C59937cs) crVar.build();
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1534;
            aar aar = (aar) aas.f158145p.createBuilder();
            aar.copyOnWrite();
            aas aas = (aas) aar.instance;
            csVar3.getClass();
            aas.f158159m = csVar3;
            aas.f158147a |= 1048576;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            aas aas2 = (aas) aar.build();
            aas2.getClass();
            ufVar2.f164197by = aas2;
            ufVar2.f164253h |= 8;
            C60555uf ufVar3 = (C60555uf) tzVar.build();
            if (ufVar3 != null) {
                this.f76877v.mo30241a(ufVar3);
            }
        }
        ViewGroup viewGroup = this.f76857F;
        if (viewGroup != null) {
            C4199aj.m12054b(viewGroup, new C44808d());
            viewGroup.setVisibility(4);
        }
    }

    /* renamed from: h */
    public final void mo33740h(SurveyMetadata surveyMetadata) {
        if (this.f76857F != null) {
            if (this.f76869n.mo56113h() && surveyMetadata.f112518d == 3) {
                C59936cr crVar = (C59936cr) C59937cs.f161988d.createBuilder();
                String str = surveyMetadata.f112516b;
                str.getClass();
                crVar.copyOnWrite();
                C59937cs csVar = (C59937cs) crVar.instance;
                csVar.f161990a |= 1;
                csVar.f161991b = str;
                String str2 = surveyMetadata.f112515a;
                str2.getClass();
                crVar.copyOnWrite();
                C59937cs csVar2 = (C59937cs) crVar.instance;
                csVar2.f161990a |= 2;
                csVar2.f161992c = str2;
                C59937cs csVar3 = (C59937cs) crVar.build();
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                ufVar.f164093a |= 2;
                ufVar.f164258m = 1532;
                aar aar = (aar) aas.f158145p.createBuilder();
                aar.copyOnWrite();
                aas aas = (aas) aar.instance;
                csVar3.getClass();
                aas.f158159m = csVar3;
                aas.f158147a |= 1048576;
                tzVar.copyOnWrite();
                C60555uf ufVar2 = (C60555uf) tzVar.instance;
                aas aas2 = (aas) aar.build();
                aas2.getClass();
                ufVar2.f164197by = aas2;
                ufVar2.f164253h |= 8;
                C60555uf ufVar3 = (C60555uf) tzVar.build();
                if (ufVar3 != null) {
                    this.f76877v.mo30241a(ufVar3);
                }
            }
            this.f76859b = surveyMetadata;
            this.f76855D = true;
            this.f76854C = false;
            ViewGroup viewGroup = this.f76857F;
            viewGroup.getClass();
            C44808d dVar = new C44808d();
            dVar.f116846p = null;
            C4199aj.m12054b(viewGroup, dVar);
            viewGroup.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo33741i() {
        while (!this.f76880y.isEmpty()) {
            C28227ab abVar = (C28227ab) this.f76880y.poll();
            abVar.getClass();
            String str = abVar.f76844a;
            if (!TextUtils.isEmpty(str) && !this.f76854C && !this.f76855D) {
                Application application = this.f76858a.getApplication();
                if (application == null) {
                    throw new IllegalArgumentException("Client context is not set.");
                } else if (!TextUtils.isEmpty(str)) {
                    C43170k kVar = new C43170k(application, str, this, this.f76871p, this.f76869n.mo56113h() ? (Account) this.f76869n.mo56107c() : null, this.f76853B);
                    this.f76859b = null;
                    this.f76854C = true;
                    m52797p(this.f76879x, this.f76872q, new C28251v(kVar));
                    return;
                } else {
                    throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo30856j(C26968d dVar) {
        if (this.f76873r && dVar == C26968d.OPEN) {
            if (this.f76874s.f70642a.f70649b == C25980d.TRANSLATE) {
                m52796o(this.f76864i);
                m52795n(this.f76861f);
                if (this.f76852A.mo33429b(this.f76874s.f70643b)) {
                    m52795n(this.f76863h);
                }
            } else {
                C25980d dVar2 = this.f76874s.f70642a.f70649b;
                if (dVar2 == C25980d.TEXT) {
                    m52796o(this.f76865j);
                } else if (dVar2 == C25980d.EDUCATION) {
                    m52796o(this.f76866k);
                }
            }
            m52795n(this.f76860e);
            mo33741i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo33742k(C28227ab abVar) {
        if (!this.f76856E) {
            this.f76880y.add(abVar);
        }
    }

    /* renamed from: l */
    public final void mo33743l(C43026c cVar) {
        ((C58970a) ((C58970a) f76851d.mo56225c()).mo56372aa(49472)).mo56389s("could not present survey (%s).", cVar);
        this.f76854C = false;
    }
}
