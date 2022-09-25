package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C1877c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.p2554e.C33148d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33170a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33234l;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.C33260a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.NonScrollableLinearLayoutManager;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33244c;
import com.google.assistant.p3897e.p3902c.p3907c.C50964bi;
import com.google.assistant.p3897e.p3902c.p3907c.C50965bj;
import com.google.assistant.p3897e.p3902c.p3907c.C50968bm;
import com.google.assistant.p3897e.p3902c.p3907c.C50969bn;
import com.google.assistant.p3897e.p3902c.p3907c.C51030du;
import com.google.assistant.p3897e.p3921j.C52479tg;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52491ts;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52506ug;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.alf;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ae */
/* compiled from: PG */
public final class C33272ae implements C33177b, C33244c {

    /* renamed from: a */
    public static final C59071e f89230a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ae");

    /* renamed from: b */
    public C51941eu f89231b;

    /* renamed from: c */
    public C33182g f89232c;

    /* renamed from: d */
    public C32951d f89233d;

    /* renamed from: e */
    public C32942a f89234e;

    /* renamed from: f */
    public C33170a f89235f;

    /* renamed from: g */
    private final ContactSelectionField f89236g;

    /* renamed from: h */
    private final C33148d f89237h;

    /* renamed from: i */
    private final C60887da f89238i;

    /* renamed from: j */
    private final LinearLayout f89239j;

    /* renamed from: k */
    private final RecyclerView f89240k;

    /* renamed from: l */
    private final RelativeLayout f89241l;

    /* renamed from: m */
    private final TextView f89242m;

    /* renamed from: n */
    private final LinearLayout f89243n;

    /* renamed from: o */
    private int f89244o = 1;

    public C33272ae(ContactSelectionField contactSelectionField, C33148d dVar, C60887da daVar) {
        this.f89236g = contactSelectionField;
        this.f89237h = dVar;
        this.f89238i = daVar;
        RecyclerView recyclerView = (RecyclerView) contactSelectionField.findViewById(R.id.fa_contact_selection_field_contact_disambiguation_list);
        recyclerView.getClass();
        this.f89240k = recyclerView;
        RelativeLayout relativeLayout = (RelativeLayout) contactSelectionField.findViewById(R.id.fa_contact_selection_field_contact_selection);
        relativeLayout.getClass();
        this.f89241l = relativeLayout;
        TextView textView = (TextView) contactSelectionField.findViewById(R.id.fa_contact_selection_field_contact_selection_text);
        textView.getClass();
        this.f89242m = textView;
        LinearLayout linearLayout = (LinearLayout) contactSelectionField.findViewById(R.id.fa_contact_selection_field_pick_another_contact);
        linearLayout.getClass();
        this.f89243n = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) contactSelectionField.findViewById(R.id.fa_contact_selection_field_selected_item);
        linearLayout2.getClass();
        this.f89239j = linearLayout2;
    }

    /* renamed from: a */
    public static C52492tt m61871a(C51941eu euVar, C51953ff ffVar, C52479tg tgVar) {
        C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
        String str = euVar.f136279g;
        tpVar.copyOnWrite();
        C52490tr trVar = (C52490tr) tpVar.instance;
        str.getClass();
        trVar.f137797a |= 1;
        trVar.f137800d = str;
        String str2 = euVar.f136280h;
        tpVar.copyOnWrite();
        C52490tr trVar2 = (C52490tr) tpVar.instance;
        str2.getClass();
        trVar2.f137797a |= 2;
        trVar2.f137801e = str2;
        tpVar.copyOnWrite();
        C52490tr trVar3 = (C52490tr) tpVar.instance;
        trVar3.f137797a |= 4;
        trVar3.f137802f = true;
        tpVar.copyOnWrite();
        C52490tr trVar4 = (C52490tr) tpVar.instance;
        tgVar.getClass();
        trVar4.f137799c = tgVar;
        trVar4.f137798b = 8;
        C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
        tsVar.copyOnWrite();
        C52492tt ttVar = (C52492tt) tsVar.instance;
        ffVar.getClass();
        ttVar.f137806b = ffVar;
        ttVar.f137805a |= 1;
        C52506ug ugVar = (C52506ug) C52507uh.f137838b.createBuilder();
        ugVar.mo53877a((C52490tr) tpVar.build());
        tsVar.copyOnWrite();
        C52492tt ttVar2 = (C52492tt) tsVar.instance;
        C52507uh uhVar = (C52507uh) ugVar.build();
        uhVar.getClass();
        ttVar2.f137807c = uhVar;
        ttVar2.f137805a |= 2;
        return (C52492tt) tsVar.build();
    }

    /* renamed from: j */
    private final void m61873j(C50969bn bnVar) {
        alf alf;
        C50965bj bjVar = bnVar.f132682c;
        if (bjVar == null) {
            bjVar = C50965bj.f132670e;
        }
        int a = C50964bi.m85996a(bjVar.f132675d);
        if (a != 0 && a == 3) {
            C50965bj bjVar2 = bnVar.f132682c;
            if ((bjVar2 == null ? C50965bj.f132670e : bjVar2).f132673b == 2) {
                TextView textView = this.f89242m;
                if (bjVar2 == null) {
                    bjVar2 = C50965bj.f132670e;
                }
                if (bjVar2.f132673b == 2) {
                    alf = (alf) bjVar2.f132674c;
                } else {
                    alf = alf.f135314d;
                }
                textView.setText(alf.f135317b);
            }
        }
        this.f89241l.setVisibility(0);
        m61872i(this.f89241l, bnVar);
    }

    /* renamed from: k */
    private final void m61874k(C50969bn bnVar, boolean z, boolean z2) {
        C51030du duVar = bnVar.f132683d;
        if (duVar == null) {
            duVar = C51030du.f132868g;
        }
        if (!duVar.f132875f.isEmpty()) {
            C51030du duVar2 = bnVar.f132683d;
            if (duVar2 == null) {
                duVar2 = C51030du.f132868g;
            }
            this.f89240k.setAdapter(new C33270ac(this, duVar2.f132875f, this.f89236g.getContext(), z, z2));
            this.f89240k.setLayoutManager(new NonScrollableLinearLayoutManager(this.f89236g.getContext()));
            Drawable a = C1877c.m5125a(this.f89236g.getContext(), C33234l.m61646d(this.f89236g.getContext(), R.attr.fa_contact_disambiguation_list_divider_drawable, R.drawable.fa_contact_disambiguation_list_divider));
            a.getClass();
            this.f89240k.addItemDecoration$ar$ds(new C33260a(this.f89236g.getContext(), 1, a, true));
            this.f89240k.setVisibility(0);
        }
    }

    /* renamed from: l */
    private final void m61875l() {
        this.f89243n.setVisibility(0);
        this.f89243n.setOnClickListener(new C33392z(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m61876m(com.google.assistant.p3897e.p3902c.p3907c.C50969bn r11) {
        /*
            r10 = this;
            com.google.assistant.e.c.c.bj r0 = r11.f132682c
            if (r0 != 0) goto L_0x0006
            com.google.assistant.e.c.c.bj r0 = com.google.assistant.p3897e.p3902c.p3907c.C50965bj.f132670e
        L_0x0006:
            int r1 = r0.f132673b
            r2 = 3
            if (r1 != r2) goto L_0x0010
            java.lang.Object r0 = r0.f132674c
            com.google.assistant.e.c.c.hx r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r0
            goto L_0x0012
        L_0x0010:
            com.google.assistant.e.c.c.hx r0 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
        L_0x0012:
            android.widget.LinearLayout r1 = r10.f89239j
            r2 = 2131430725(0x7f0b0d45, float:1.848316E38)
            android.view.View r1 = r1.findViewById(r2)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ImageComponent r1 = (com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent) r1
            r1.getClass()
            android.widget.LinearLayout r2 = r10.f89239j
            r3 = 2131430726(0x7f0b0d46, float:1.8483161E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.getClass()
            android.widget.LinearLayout r3 = r10.f89239j
            r4 = 2131430724(0x7f0b0d44, float:1.8483157E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.getClass()
            r4 = 0
            r1.setVisibility(r4)
            int r5 = r0.f133122b
            r6 = 1
            if (r5 != r6) goto L_0x0065
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ContactSelectionField r5 = r10.f89236g
            android.content.Context r5 = r5.getContext()
            int r7 = r0.f133122b
            java.lang.String r8 = ""
            if (r7 != r6) goto L_0x0058
            java.lang.Object r7 = r0.f133123c
            java.lang.String r7 = (java.lang.String) r7
            r9 = r7
            r7 = 1
            goto L_0x0059
        L_0x0058:
            r9 = r8
        L_0x0059:
            if (r7 != r6) goto L_0x0060
            java.lang.Object r7 = r0.f133123c
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
        L_0x0060:
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.a.c r5 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2562a.C33241c.m61663a(r5, r9, r8)
            goto L_0x0066
        L_0x0065:
            r5 = 0
        L_0x0066:
            r1.f88960e = r6
            com.google.assistant.e.c.c.dc r7 = r0.f133126f
            if (r7 != 0) goto L_0x006e
            com.google.assistant.e.c.c.dc r7 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x006e:
            r1.mo38649b(r7, r5)
            int r1 = r0.f133122b
            if (r1 != r6) goto L_0x007f
            java.lang.Object r1 = r0.f133123c
            java.lang.String r1 = (java.lang.String) r1
            r2.setText(r1)
            r2.setVisibility(r4)
        L_0x007f:
            int r1 = r0.f133121a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x008d
            java.lang.String r0 = r0.f133124d
            r3.setText(r0)
            r3.setVisibility(r4)
        L_0x008d:
            android.widget.LinearLayout r0 = r10.f89239j
            r0.setVisibility(r4)
            android.widget.LinearLayout r0 = r10.f89239j
            r10.m61872i(r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields.C33272ae.m61876m(com.google.assistant.e.c.c.bn):void");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo38561b(C33176f fVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo38562c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo38563d(boolean z) {
    }

    /* renamed from: e */
    public final void mo38564e(C33180e eVar) {
        C50969bn bnVar;
        C50969bn bnVar2;
        C50969bn bnVar3;
        C51941eu euVar = this.f89231b;
        if (euVar == null || this.f89232c == null) {
            ((C59052c) ((C59052c) f89230a.mo56226d()).mo56372aa(51038)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f89231b = euVar2;
            this.f89232c.mo38581f(euVar2);
        }
        C51941eu euVar3 = this.f89231b;
        if (euVar3.f136277e == 16) {
            bnVar = (C50969bn) euVar3.f136278f;
        } else {
            bnVar = C50969bn.f132678i;
        }
        if ((bnVar.f132680a & 64) != 0) {
            C51941eu euVar4 = this.f89231b;
            if (euVar4.f136277e == 16) {
                bnVar3 = (C50969bn) euVar4.f136278f;
            } else {
                bnVar3 = C50969bn.f132678i;
            }
            int a = C50968bm.m85997a(bnVar3.f132687h);
            if (a == 0) {
                a = 1;
            }
            this.f89244o = a;
        }
        this.f89241l.setVisibility(8);
        this.f89240k.setVisibility(8);
        this.f89243n.setVisibility(8);
        this.f89239j.setVisibility(8);
        C51941eu euVar5 = this.f89231b;
        if (euVar5.f136277e == 16) {
            bnVar2 = (C50969bn) euVar5.f136278f;
        } else {
            bnVar2 = C50969bn.f132678i;
        }
        C50965bj bjVar = bnVar2.f132682c;
        if (bjVar == null) {
            bjVar = C50965bj.f132670e;
        }
        if ((bjVar.f132672a & 1) != 0) {
            C50965bj bjVar2 = bnVar2.f132682c;
            int a2 = C50964bi.m85996a((bjVar2 == null ? C50965bj.f132670e : bjVar2).f132675d);
            if (a2 == 0) {
                a2 = 1;
            }
            switch (a2 - 1) {
                case 1:
                    C51030du duVar = bnVar2.f132683d;
                    if (duVar == null) {
                        duVar = C51030du.f132868g;
                    }
                    if (duVar.f132875f.size() > 0) {
                        m61874k(bnVar2, true, false);
                        if ((bnVar2.f132680a & 8) != 0) {
                            m61875l();
                            return;
                        }
                        return;
                    }
                    m61873j(bnVar2);
                    return;
                case 2:
                    m61873j(bnVar2);
                    return;
                case 3:
                case 4:
                    if (bjVar2 == null) {
                        bjVar2 = C50965bj.f132670e;
                    }
                    if (bjVar2.f132673b == 3) {
                        m61876m(bnVar2);
                        return;
                    }
                    return;
                case 5:
                    m61874k(bnVar2, true, false);
                    if ((bnVar2.f132680a & 8) != 0) {
                        m61875l();
                        return;
                    }
                    return;
                case 6:
                    if (bjVar2 == null) {
                        bjVar2 = C50965bj.f132670e;
                    }
                    if (bjVar2.f132673b == 3) {
                        m61876m(bnVar2);
                    }
                    m61874k(bnVar2, false, true);
                    if ((bnVar2.f132680a & 8) != 0) {
                        m61875l();
                        return;
                    }
                    return;
                case 7:
                    m61874k(bnVar2, false, false);
                    return;
                default:
                    ((C59052c) ((C59052c) f89230a.mo56225c()).mo56372aa(51039)).mo56386p("Unsupported contact selection header UI mode.");
                    return;
            }
        }
    }

    /* renamed from: f */
    public final /* synthetic */ void mo38565f() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo38566g() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        if (r3 != 5) goto L_0x0036;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38630h(long r5) {
        /*
            r4 = this;
            com.google.assistant.e.j.e.eu r0 = r4.f89231b
            if (r0 == 0) goto L_0x0057
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r0 = r4.f89232c
            if (r0 == 0) goto L_0x0057
            com.google.android.libraries.search.assistant.fluidactions.a.a r0 = r4.f89234e
            if (r0 == 0) goto L_0x0057
            com.google.android.libraries.search.assistant.fluidactions.b.d r0 = r4.f89233d
            if (r0 != 0) goto L_0x0011
            goto L_0x0057
        L_0x0011:
            com.google.common.b.gu r1 = r0.mo38372d()
            int r2 = r4.f89244o
            int r3 = r2 + -1
            if (r2 == 0) goto L_0x0055
            r2 = 1
            if (r3 == r2) goto L_0x0032
            r2 = 3
            if (r3 == r2) goto L_0x002d
            r2 = 4
            if (r3 == r2) goto L_0x0028
            r2 = 5
            if (r3 == r2) goto L_0x0032
            goto L_0x0036
        L_0x0028:
            com.google.common.b.gu r1 = r0.mo38376g()
            goto L_0x0036
        L_0x002d:
            com.google.common.b.gu r1 = r0.mo38373e()
            goto L_0x0036
        L_0x0032:
            com.google.common.b.gu r1 = r0.mo38375f()
        L_0x0036:
            com.google.android.libraries.search.assistant.fluidactions.e.d r0 = r4.f89237h
            com.google.common.util.concurrent.cx r5 = r0.mo38557a(r5, r1)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ah r6 = new com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ah
            com.google.assistant.e.j.e.eu r0 = r4.f89231b
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r1 = r4.f89232c
            com.google.assistant.e.j.e.ff r1 = r1.mo38576a()
            com.google.android.libraries.search.assistant.fluidactions.a.a r2 = r4.f89234e
            r6.<init>(r0, r1, r2)
            com.google.common.util.concurrent.da r0 = r4.f89238i
            com.google.common.util.concurrent.bz r6 = com.google.apps.tiktok.tracing.C47810es.m84974n(r6)
            com.google.common.util.concurrent.C60856cj.m92911t(r5, r6, r0)
            return
        L_0x0055:
            r5 = 0
            throw r5
        L_0x0057:
            com.google.common.f.e r5 = f89230a
            com.google.common.f.x r5 = r5.mo56226d()
            r6 = 51036(0xc75c, float:7.1517E-41)
            com.google.common.f.ad r0 = com.google.common.p4526f.C58979ad.SMALL
            java.lang.String r1 = "Failed to send PersonalContactData due to invalid args"
            android.databinding.C0118a.m96d(r5, r1, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields.C33272ae.mo38630h(long):void");
    }

    /* renamed from: i */
    private final void m61872i(View view, C50969bn bnVar) {
        if ((bnVar.f132680a & 8) != 0) {
            view.setOnClickListener(new C33392z(this));
        } else {
            view.setOnClickListener(new C33268aa(this));
        }
    }
}
