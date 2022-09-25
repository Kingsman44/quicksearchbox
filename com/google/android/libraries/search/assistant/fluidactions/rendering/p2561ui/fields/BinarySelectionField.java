package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.databinding.C0118a;
import android.graphics.drawable.Drawable;
import android.support.p031v4.app.Fragment;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32953f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33230h;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageToggleComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3902c.p3907c.C51141hx;
import com.google.assistant.p3897e.p3902c.p3907c.C51161r;
import com.google.assistant.p3897e.p3902c.p3907c.C51162s;
import com.google.assistant.p3897e.p3902c.p3907c.C51163t;
import com.google.assistant.p3897e.p3902c.p3907c.C51165v;
import com.google.assistant.p3897e.p3902c.p3907c.C51167x;
import com.google.assistant.p3897e.p3921j.C52471sz;
import com.google.assistant.p3897e.p3921j.C52473ta;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52491ts;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52506ug;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.BinarySelectionField */
/* compiled from: PG */
public final class BinarySelectionField extends LinearLayout implements C33177b {

    /* renamed from: f */
    private static final C59071e f89001f = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.BinarySelectionField");

    /* renamed from: a */
    public C51941eu f89002a;

    /* renamed from: b */
    public C33182g f89003b;

    /* renamed from: c */
    public C32953f f89004c;

    /* renamed from: d */
    public C32942a f89005d;

    /* renamed from: e */
    public Fragment f89006e;

    /* renamed from: g */
    private TextView f89007g = null;

    /* renamed from: h */
    private TextView f89008h = null;

    /* renamed from: i */
    private TextView f89009i = null;

    /* renamed from: j */
    private ImageComponent f89010j = null;

    /* renamed from: k */
    private Switch f89011k = null;

    /* renamed from: l */
    private ImageToggleComponent f89012l = null;

    public BinarySelectionField(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo38680a(boolean z) {
        C51163t tVar;
        C51163t tVar2;
        C51941eu euVar = this.f89002a;
        if (euVar == null || this.f89003b == null || this.f89004c == null || this.f89005d == null) {
            C0118a.m96d(f89001f.mo56226d(), "Failed to handle checked change due to invalid args", 51005, C58979ad.SMALL);
            return;
        }
        C51937eq eqVar = (C51937eq) euVar.toBuilder();
        C51941eu euVar2 = this.f89002a;
        if (euVar2.f136277e == 5) {
            tVar = (C51163t) euVar2.f136278f;
        } else {
            tVar = C51163t.f133176l;
        }
        C51162s sVar = (C51162s) tVar.toBuilder();
        sVar.copyOnWrite();
        C51163t tVar3 = (C51163t) sVar.instance;
        tVar3.f133178a |= 4;
        tVar3.f133181d = z;
        eqVar.copyOnWrite();
        C51941eu euVar3 = (C51941eu) eqVar.instance;
        C51163t tVar4 = (C51163t) sVar.build();
        tVar4.getClass();
        euVar3.f136278f = tVar4;
        euVar3.f136277e = 5;
        C51941eu euVar4 = (C51941eu) eqVar.build();
        this.f89002a = euVar4;
        this.f89003b.mo38581f(euVar4);
        C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
        String str = this.f89002a.f136279g;
        tpVar.copyOnWrite();
        C52490tr trVar = (C52490tr) tpVar.instance;
        str.getClass();
        trVar.f137797a |= 1;
        trVar.f137800d = str;
        String str2 = this.f89002a.f136280h;
        tpVar.copyOnWrite();
        C52490tr trVar2 = (C52490tr) tpVar.instance;
        str2.getClass();
        trVar2.f137797a |= 2;
        trVar2.f137801e = str2;
        tpVar.copyOnWrite();
        C52490tr trVar3 = (C52490tr) tpVar.instance;
        trVar3.f137797a |= 4;
        trVar3.f137802f = true;
        C52471sz szVar = (C52471sz) C52473ta.f137740c.createBuilder();
        szVar.copyOnWrite();
        C52473ta taVar = (C52473ta) szVar.instance;
        taVar.f137742a |= 1;
        taVar.f137743b = z;
        tpVar.copyOnWrite();
        C52490tr trVar4 = (C52490tr) tpVar.instance;
        C52473ta taVar2 = (C52473ta) szVar.build();
        taVar2.getClass();
        trVar4.f137799c = taVar2;
        trVar4.f137798b = 14;
        C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
        C51953ff a = this.f89003b.mo38576a();
        tsVar.copyOnWrite();
        C52492tt ttVar = (C52492tt) tsVar.instance;
        a.getClass();
        ttVar.f137806b = a;
        ttVar.f137805a |= 1;
        C52506ug ugVar = (C52506ug) C52507uh.f137838b.createBuilder();
        ugVar.mo53877a((C52490tr) tpVar.build());
        tsVar.copyOnWrite();
        C52492tt ttVar2 = (C52492tt) tsVar.instance;
        C52507uh uhVar = (C52507uh) ugVar.build();
        uhVar.getClass();
        ttVar2.f137807c = uhVar;
        ttVar2.f137805a |= 2;
        C52492tt ttVar3 = (C52492tt) tsVar.build();
        C51941eu euVar5 = this.f89002a;
        if (euVar5.f136277e == 5) {
            tVar2 = (C51163t) euVar5.f136278f;
        } else {
            tVar2 = C51163t.f133176l;
        }
        C51098gh ghVar = null;
        if (z) {
            C51165v vVar = tVar2.f133183f;
            if (vVar == null) {
                vVar = C51165v.f133190c;
            }
            if ((vVar.f133192a & 2) != 0) {
                C51165v vVar2 = tVar2.f133183f;
                if (vVar2 == null) {
                    vVar2 = C51165v.f133190c;
                }
                ghVar = vVar2.f133193b;
                if (ghVar == null) {
                    ghVar = C51098gh.f133009e;
                }
            }
        }
        if (!z) {
            C51165v vVar3 = tVar2.f133184g;
            if (vVar3 == null) {
                vVar3 = C51165v.f133190c;
            }
            if ((vVar3.f133192a & 2) != 0) {
                C51165v vVar4 = tVar2.f133184g;
                if (vVar4 == null) {
                    vVar4 = C51165v.f133190c;
                }
                ghVar = vVar4.f133193b;
                if (ghVar == null) {
                    ghVar = C51098gh.f133009e;
                }
            }
        }
        if (ghVar != null) {
            C33230h.m61622d(getContext(), this.f89006e, ghVar);
        }
        this.f89005d.mo38366c("FA BinarySelection", ttVar3);
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
        C51163t tVar;
        C51941eu euVar = this.f89002a;
        if (euVar == null || this.f89003b == null || this.f89007g == null || this.f89008h == null || this.f89009i == null || this.f89010j == null || this.f89011k == null || this.f89012l == null) {
            ((C59052c) ((C59052c) f89001f.mo56226d()).mo56372aa(51006)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f89002a = euVar2;
            this.f89003b.mo38581f(euVar2);
        }
        C51941eu euVar3 = this.f89002a;
        if (euVar3.f136277e == 5) {
            tVar = (C51163t) euVar3.f136278f;
        } else {
            tVar = C51163t.f133176l;
        }
        int i = 1;
        if ((tVar.f133178a & 1) != 0) {
            String str = tVar.f133179b;
            this.f89007g.setVisibility(0);
            this.f89007g.setText(str);
        } else {
            this.f89007g.setVisibility(8);
        }
        C51141hx hxVar = tVar.f133180c;
        if (hxVar == null) {
            hxVar = C51141hx.f133119h;
        }
        if (hxVar.f133122b == 1) {
            this.f89008h.setVisibility(0);
            this.f89008h.setText((String) hxVar.f133123c);
        } else {
            this.f89008h.setVisibility(8);
        }
        if ((hxVar.f133121a & 4) != 0) {
            C51141hx hxVar2 = tVar.f133180c;
            if (hxVar2 == null) {
                hxVar2 = C51141hx.f133119h;
            }
            String str2 = hxVar2.f133124d;
            this.f89009i.setVisibility(0);
            this.f89009i.setText(str2);
        } else {
            this.f89009i.setVisibility(8);
        }
        C51141hx hxVar3 = tVar.f133180c;
        if (hxVar3 == null) {
            hxVar3 = C51141hx.f133119h;
        }
        C51012dc dcVar = hxVar3.f133126f;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        this.f89010j.mo38649b(dcVar, (Drawable) null);
        this.f89011k.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        this.f89012l.f88968c = null;
        boolean z = tVar.f133181d;
        int a = C51161r.m86047a(tVar.f133182e);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 2) {
            this.f89011k.setVisibility(0);
            this.f89011k.setChecked(z);
            this.f89011k.setOnCheckedChangeListener(new C33379m(this));
        } else if (i2 != 3) {
            C59052c cVar = (C59052c) f89001f.mo56225c();
            cVar.mo56380ai(C58979ad.SMALL);
            C59052c cVar2 = (C59052c) cVar.mo56372aa(51007);
            int a2 = C51161r.m86047a(tVar.f133182e);
            if (a2 != 0) {
                i = a2;
            }
            cVar2.mo56387q("Unimplemented field type %d requested, this will look really strange as no selection control will be visible", i - 1);
        } else {
            C51167x xVar = tVar.f133185h;
            if (xVar == null) {
                xVar = C51167x.f133196c;
            }
            C51012dc dcVar2 = xVar.f133199b;
            if (dcVar2 == null) {
                dcVar2 = C51012dc.f132813k;
            }
            C51167x xVar2 = tVar.f133185h;
            if (xVar2 == null) {
                xVar2 = C51167x.f133196c;
            }
            C51012dc dcVar3 = xVar2.f133198a;
            if (dcVar3 == null) {
                dcVar3 = C51012dc.f132813k;
            }
            this.f89012l.setVisibility(0);
            ImageToggleComponent imageToggleComponent = this.f89012l;
            imageToggleComponent.mo38653b(dcVar2, imageToggleComponent.f88966a);
            imageToggleComponent.mo38653b(dcVar3, imageToggleComponent.f88967b);
            this.f89012l.setChecked(z);
            this.f89012l.f88968c = new C33380n(this);
        }
    }

    /* renamed from: f */
    public final /* synthetic */ void mo38565f() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo38566g() {
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f89007g = (TextView) findViewById(R.id.fa_binary_selection_field_title_text);
        this.f89008h = (TextView) findViewById(R.id.fa_binary_selection_field_primary_text);
        this.f89009i = (TextView) findViewById(R.id.fa_binary_selection_field_secondary_text);
        this.f89010j = (ImageComponent) findViewById(R.id.fa_binary_selection_field_icon);
        this.f89011k = (Switch) findViewById(R.id.fa_binary_selection_field_switch);
        this.f89012l = (ImageToggleComponent) findViewById(R.id.fa_binary_selection_field_image_toggle);
    }

    public BinarySelectionField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BinarySelectionField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
