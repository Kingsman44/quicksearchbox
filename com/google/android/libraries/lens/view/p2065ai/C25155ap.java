package com.google.android.libraries.lens.view.p2065ai;

import android.support.p033v7.app.C0392m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.android.libraries.lens.view.p2067ak.C25195aa;
import com.google.android.libraries.lens.view.p2067ak.C25197ac;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2074ap.C25466f;
import com.google.android.libraries.lens.view.p2078at.C25497ac;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2088az.C25672g;
import com.google.android.libraries.lens.view.p2093d.C25752a;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47752cq;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.lens.view.ai.ap */
/* compiled from: PG */
public final class C25155ap {

    /* renamed from: a */
    public static final C59071e f68498a = C59071e.m91332i("com.google.android.libraries.lens.view.ai.ap");

    /* renamed from: A */
    private final C27232l f68499A;

    /* renamed from: B */
    private final boolean f68500B;

    /* renamed from: C */
    private final C58833ax f68501C;

    /* renamed from: D */
    private View f68502D;

    /* renamed from: b */
    public final C25149aj f68503b;

    /* renamed from: c */
    public final AccountId f68504c;

    /* renamed from: d */
    public final C21370a f68505d;

    /* renamed from: e */
    public final C25466f f68506e;

    /* renamed from: f */
    public final C25537t f68507f;

    /* renamed from: g */
    public final C25197ac f68508g;

    /* renamed from: h */
    public final C25225bd f68509h;

    /* renamed from: i */
    public final C25752a f68510i;

    /* renamed from: j */
    public final C46801dp f68511j;

    /* renamed from: k */
    public final C25672g f68512k;

    /* renamed from: l */
    public final boolean f68513l;

    /* renamed from: m */
    public C25167e f68514m;

    /* renamed from: n */
    public C25183u f68515n;

    /* renamed from: o */
    public C25141ab f68516o;

    /* renamed from: p */
    public C25147ah f68517p;

    /* renamed from: q */
    public ViewStub f68518q;

    /* renamed from: r */
    public View f68519r;

    /* renamed from: s */
    public boolean f68520s;

    /* renamed from: t */
    public boolean f68521t;

    /* renamed from: u */
    public String f68522u = BuildConfig.FLAVOR;

    /* renamed from: v */
    public C25497ac f68523v = C25497ac.NONE;

    /* renamed from: w */
    public boolean f68524w = false;

    /* renamed from: x */
    public final C25172j f68525x;

    /* renamed from: y */
    private final C24974a f68526y;

    /* renamed from: z */
    private final C47400m f68527z;

    /* renamed from: com.google.android.libraries.lens.view.ai.ap$a */
    /* compiled from: PG */
    public final class C25156a implements C47388b {
    }

    public C25155ap(C25149aj ajVar, AccountId accountId, C24974a aVar, C21370a aVar2, C25466f fVar, C25172j jVar, C25537t tVar, C47400m mVar, C25197ac acVar, C25225bd bdVar, C27232l lVar, C25752a aVar3, C58833ax axVar, C46801dp dpVar, C25672g gVar, boolean z, boolean z2) {
        this.f68503b = ajVar;
        this.f68504c = accountId;
        this.f68526y = aVar;
        this.f68505d = aVar2;
        this.f68506e = fVar;
        this.f68525x = jVar;
        this.f68507f = tVar;
        this.f68527z = mVar;
        this.f68508g = acVar;
        this.f68509h = bdVar;
        this.f68499A = lVar;
        this.f68510i = aVar3;
        this.f68501C = axVar;
        this.f68511j = dpVar;
        this.f68512k = gVar;
        this.f68513l = z2;
        this.f68500B = z;
    }

    /* renamed from: g */
    private final void m46486g(boolean z) {
        ViewStub viewStub = this.f68518q;
        if (viewStub != null) {
            if (z) {
                if (this.f68502D == null) {
                    View inflate = viewStub.inflate();
                    this.f68502D = inflate;
                    this.f68527z.mo51252a(inflate, new C25156a());
                }
                View view = this.f68502D;
                view.getClass();
                if (view.getVisibility() != 0) {
                    View view2 = this.f68502D;
                    view2.getClass();
                    C25185w.m46542a(view2);
                    return;
                }
                return;
            }
            viewStub.setVisibility(8);
        }
    }

    /* renamed from: h */
    private final void m46487h(int i) {
        C25141ab abVar = this.f68516o;
        if (abVar != null) {
            ImageView a = abVar.mo30281a();
            int i2 = i - 1;
            if (i2 == 0) {
                a.setVisibility(8);
            } else if (i2 != 2) {
                if (a.getVisibility() != 0) {
                    C25185w.m46542a(a);
                    abVar.mo30282b(((Boolean) abVar.f68453b.f73043a.mo3842a()).booleanValue());
                }
            } else if (a.getVisibility() != 0) {
                a.setVisibility(0);
                abVar.mo30282b(((Boolean) abVar.f68453b.f73043a.mo3842a()).booleanValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo30292a(boolean z) {
        C25183u uVar = this.f68515n;
        if (uVar != null) {
            uVar.mo30327b(z);
        }
    }

    /* renamed from: b */
    public final void mo30293b(boolean z) {
        mo30297f(z ? 3 : 1);
        C25147ah ahVar = this.f68517p;
        ahVar.getClass();
        ahVar.f68484s = z;
        this.f68508g.f68625a.mo30363c(new C25195aa(z));
    }

    /* renamed from: c */
    public final void mo30294c() {
        C25183u uVar = this.f68515n;
        if (uVar != null) {
            C0392m mVar = uVar.f68595k;
            if (mVar == null || !mVar.isShowing()) {
                String string = uVar.f68588d.getString(R.string.lens_donate_data_optin_message);
                if (uVar.f68591g) {
                    string = "[" + uVar.f68588d.getString(R.string.lens_donate_data_optin_googlers_label) + "] " + string;
                }
                View inflate = LayoutInflater.from(uVar.f68588d).inflate(R.layout.donate_data_popup, (ViewGroup) null);
                ((TextView) inflate.findViewById(R.id.message)).setText(string);
                TextView textView = (TextView) inflate.findViewById(R.id.learn_more);
                textView.setPaintFlags(textView.getPaintFlags() | 8);
                textView.setOnClickListener(new C47591co(uVar.f68589e, "Clicked Learn More", new C25177o(uVar)));
                C44581b bVar = new C44581b(uVar.f68588d, 0);
                bVar.mo47604w(R.string.lens_donate_data_optin_title);
                bVar.mo47607z(inflate);
                bVar.mo47601t(17039370, new C47752cq(uVar.f68589e, "Clicked OK", new C25178p(uVar)));
                bVar.mo47598q(R.string.lens_donate_data_optin_no_thanks, new C47752cq(uVar.f68589e, "Clicked No Thanks", new C25179q(uVar)));
                uVar.f68595k = bVar.create();
                uVar.f68595k.show();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c0, code lost:
        if (r0 != false) goto L_0x0086;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30295d(boolean r11) {
        /*
            r10 = this;
            boolean r0 = r10.f68500B
            r1 = 5
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0044
            r10.m46487h(r3)
            r10.mo30292a(r2)
            r10.mo30297f(r3)
            com.google.android.libraries.lens.view.ai.e r11 = r10.f68514m
            r11.mo30313a(r1)
            com.google.android.libraries.lens.view.ai.ah r11 = r10.f68517p
            r11.mo30287c(r3)
            r10.m46486g(r2)
            android.view.View r11 = r10.f68519r
            if (r11 != 0) goto L_0x0022
            goto L_0x0043
        L_0x0022:
            r0 = 2131430099(0x7f0b0ad3, float:1.848189E38)
            android.view.View r11 = r11.findViewById(r0)
            android.view.ViewStub r11 = (android.view.ViewStub) r11
            if (r11 == 0) goto L_0x0043
            android.view.View r11 = r11.inflate()
            r0 = 2131430097(0x7f0b0ad1, float:1.8481885E38)
            android.view.View r11 = r11.findViewById(r0)
            r11.setVisibility(r2)
            com.google.android.libraries.lens.view.ai.an r0 = new com.google.android.libraries.lens.view.ai.an
            r0.<init>(r10)
            r11.setOnClickListener(r0)
        L_0x0043:
            return
        L_0x0044:
            com.google.android.libraries.lens.view.d.a r0 = r10.f68510i
            java.lang.Object r0 = r0.mo3842a()
            com.google.android.libraries.lens.view.onboarding.af r0 = (com.google.android.libraries.lens.view.onboarding.C27473af) r0
            boolean r0 = r0.mo33010b()
            com.google.android.libraries.lens.view.at.ac r4 = r10.f68523v
            boolean r4 = r4.mo30526c()
            r5 = 3
            r6 = 2
            if (r4 == 0) goto L_0x0063
            if (r11 == 0) goto L_0x005e
            r4 = 2
            goto L_0x005f
        L_0x005e:
            r4 = 3
        L_0x005f:
            r10.m46487h(r4)
            goto L_0x0066
        L_0x0063:
            r10.m46487h(r3)
        L_0x0066:
            java.lang.String r4 = r10.f68522u
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r3
            com.google.android.libraries.lens.view.l.l r7 = r10.f68499A
            com.google.common.base.ax r7 = r7.mo32701h()
            boolean r7 = com.google.lens.p4711m.C62632i.m94823h(r7)
            boolean r8 = r10.f68521t
            r9 = 4
            if (r8 != 0) goto L_0x00af
            if (r4 == 0) goto L_0x007f
            goto L_0x00af
        L_0x007f:
            if (r0 == 0) goto L_0x0088
            com.google.android.libraries.lens.view.ai.e r11 = r10.f68514m
            r11.mo30313a(r1)
        L_0x0086:
            r6 = 1
            goto L_0x00c3
        L_0x0088:
            com.google.android.libraries.lens.view.l.l r0 = r10.f68499A
            boolean r0 = r0.mo32721z()
            if (r0 == 0) goto L_0x00a9
            com.google.android.libraries.lens.view.l.l r0 = r10.f68499A
            boolean r0 = r0.mo32693C()
            if (r0 != 0) goto L_0x00a9
            if (r11 == 0) goto L_0x00a0
            if (r7 == 0) goto L_0x009e
            r5 = 2
            goto L_0x00a3
        L_0x009e:
            r5 = 4
            goto L_0x00a3
        L_0x00a0:
            if (r7 == 0) goto L_0x00a3
            r5 = 1
        L_0x00a3:
            com.google.android.libraries.lens.view.ai.e r11 = r10.f68514m
            r11.mo30313a(r5)
            goto L_0x00c3
        L_0x00a9:
            com.google.android.libraries.lens.view.ai.e r11 = r10.f68514m
            r11.mo30313a(r1)
            goto L_0x00c3
        L_0x00af:
            if (r11 == 0) goto L_0x00b7
            if (r7 == 0) goto L_0x00b5
            r5 = 4
            goto L_0x00bb
        L_0x00b5:
            r5 = 2
            goto L_0x00bb
        L_0x00b7:
            if (r7 == 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r5 = 1
        L_0x00bb:
            com.google.android.libraries.lens.view.ai.e r11 = r10.f68514m
            r11.mo30313a(r5)
            if (r0 == 0) goto L_0x00c3
            goto L_0x0086
        L_0x00c3:
            com.google.android.libraries.lens.view.ai.ah r11 = r10.f68517p
            r11.mo30287c(r6)
            boolean r11 = r10.f68520s
            if (r11 == 0) goto L_0x00d6
            com.google.android.libraries.lens.view.at.ac r11 = r10.f68523v
            boolean r11 = r11.mo30527d()
            if (r11 == 0) goto L_0x00d6
            r11 = 1
            goto L_0x00d7
        L_0x00d6:
            r11 = 0
        L_0x00d7:
            if (r11 == 0) goto L_0x00dc
            java.lang.String r0 = r10.f68522u
            goto L_0x00de
        L_0x00dc:
            java.lang.String r0 = ""
        L_0x00de:
            if (r11 == 0) goto L_0x00e9
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L_0x00e7
            goto L_0x00e9
        L_0x00e7:
            r11 = 0
            goto L_0x00ea
        L_0x00e9:
            r11 = 1
        L_0x00ea:
            com.google.android.libraries.lens.view.ac.a r1 = r10.f68526y
            android.app.Activity r1 = r1.f68122a
            boolean r1 = com.google.android.libraries.lens.view.p2052ac.C24974a.m46225a(r1)
            if (r1 != 0) goto L_0x010c
            com.google.android.libraries.lens.view.ai.aj r1 = r10.f68503b
            android.view.View r1 = r1.getView()
            if (r1 == 0) goto L_0x010a
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            if (r1 != r3) goto L_0x010a
            r1 = 1
            goto L_0x010b
        L_0x010a:
            r1 = 0
        L_0x010b:
            r11 = r11 & r1
        L_0x010c:
            r10.m46486g(r11)
            boolean r11 = android.text.TextUtils.isEmpty(r0)
            com.google.android.libraries.lens.view.ai.aj r1 = r10.f68503b
            android.view.View r1 = r1.getView()
            if (r1 != 0) goto L_0x0121
            java.lang.String r1 = "setSectionTitle before onCreateView: %s"
            com.google.common.base.C58838bb.m90873h(r11, r1, r0)
            goto L_0x0159
        L_0x0121:
            r4 = 2131435674(0x7f0b209a, float:1.8493197E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 != 0) goto L_0x014d
            if (r11 != 0) goto L_0x0159
            r11 = 2131435675(0x7f0b209b, float:1.8493199E38)
            android.view.View r11 = r1.findViewById(r11)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            android.content.Context r1 = r1.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r4 = 2131626797(0x7f0e0b2d, float:1.888084E38)
            android.view.View r1 = r1.inflate(r4, r11, r2)
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            r11.addView(r4)
            r11 = 0
        L_0x014d:
            if (r3 == r11) goto L_0x0151
            r11 = 0
            goto L_0x0153
        L_0x0151:
            r11 = 8
        L_0x0153:
            r4.setVisibility(r11)
            r4.setText(r0)
        L_0x0159:
            com.google.android.libraries.lens.view.at.ac r11 = r10.f68523v
            boolean r11 = r11.mo30525b()
            if (r11 == 0) goto L_0x0164
            r10.mo30292a(r2)
        L_0x0164:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2065ai.C25155ap.mo30295d(boolean):void");
    }

    /* renamed from: e */
    public final boolean mo30296e() {
        return this.f68501C.mo56113h() && this.f68508g.mo30344d();
    }

    /* renamed from: f */
    public final void mo30297f(int i) {
        ImageView imageView;
        C25183u uVar = this.f68515n;
        if (uVar != null && (imageView = uVar.f68592h) != null) {
            int i2 = i - 1;
            if (i2 == 0) {
                imageView.setVisibility(8);
            } else if (i2 == 2) {
                imageView.setVisibility(0);
            } else if (imageView.getVisibility() != 0) {
                C25185w.m46542a(uVar.f68592h);
            }
        }
    }
}
