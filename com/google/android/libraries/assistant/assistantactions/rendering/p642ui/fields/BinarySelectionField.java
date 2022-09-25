package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11296d;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageToggleComponent;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
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
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.BinarySelectionField */
/* compiled from: PG */
public class BinarySelectionField extends C11407n {

    /* renamed from: a */
    private static final C59071e f36911a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.BinarySelectionField");

    /* renamed from: b */
    private TextView f36912b;

    /* renamed from: c */
    private TextView f36913c;

    /* renamed from: d */
    private TextView f36914d;

    /* renamed from: e */
    private ImageComponent f36915e;

    /* renamed from: f */
    private Switch f36916f;

    /* renamed from: g */
    private ImageToggleComponent f36917g;

    public BinarySelectionField(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo19817a(boolean z) {
        C51163t tVar;
        C51163t tVar2;
        C28292j jVar;
        C11295c cVar = this.f37153l;
        if (cVar == null || this.f37152k == null) {
            ((C59052c) ((C59052c) f36911a.mo56226d()).mo56372aa(43208)).mo56386p("missing callback or field data, will take no action");
            return;
        }
        C51941eu euVar = cVar.f36729a;
        C51937eq eqVar = (C51937eq) euVar.toBuilder();
        if (euVar.f136277e == 5) {
            tVar = (C51163t) euVar.f136278f;
        } else {
            tVar = C51163t.f133176l;
        }
        C51162s sVar = (C51162s) tVar.toBuilder();
        sVar.copyOnWrite();
        C51163t tVar3 = (C51163t) sVar.instance;
        tVar3.f133178a |= 4;
        tVar3.f133181d = z;
        eqVar.copyOnWrite();
        C51941eu euVar2 = (C51941eu) eqVar.instance;
        C51163t tVar4 = (C51163t) sVar.build();
        tVar4.getClass();
        euVar2.f136278f = tVar4;
        euVar2.f136277e = 5;
        C51941eu euVar3 = (C51941eu) eqVar.build();
        this.f37153l.f36729a = euVar3;
        C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
        String str = this.f37153l.f36729a.f136279g;
        tpVar.copyOnWrite();
        C52490tr trVar = (C52490tr) tpVar.instance;
        str.getClass();
        trVar.f137797a |= 1;
        trVar.f137800d = str;
        String str2 = this.f37153l.f36729a.f136280h;
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
        this.f37153l.f36730b = (C52490tr) tpVar.build();
        if (euVar3.f136277e == 5) {
            tVar2 = (C51163t) euVar3.f136278f;
        } else {
            tVar2 = C51163t.f133176l;
        }
        int i = tVar2.f133182e;
        int a = C51161r.m86047a(i);
        if (a != 0 && a == 3) {
            jVar = C28295m.m52915a(this.f36916f);
        } else {
            int a2 = C51161r.m86047a(i);
            if (a2 != 0 && a2 == 4) {
                jVar = C28295m.m52915a(this.f36917g);
            } else {
                jVar = null;
            }
        }
        if (jVar != null) {
            this.f37152k.mo19732o(jVar);
        } else {
            int i2 = tVar2.f133182e;
        }
        if (z) {
            C51165v vVar = tVar2.f133183f;
            if (vVar == null) {
                vVar = C51165v.f133190c;
            }
            C51098gh ghVar = vVar.f133193b;
            if (ghVar == null) {
                ghVar = C51098gh.f133009e;
            }
            mo19944l(ghVar);
        } else {
            C51165v vVar2 = tVar2.f133184g;
            if (vVar2 == null) {
                vVar2 = C51165v.f133190c;
            }
            C51098gh ghVar2 = vVar2.f133193b;
            if (ghVar2 == null) {
                ghVar2 = C51098gh.f133009e;
            }
            mo19944l(ghVar2);
        }
        C11296d dVar = this.f37154m;
        if (dVar != null) {
            mo19941h(dVar.mo19691a(this.f37153l));
        }
    }

    /* renamed from: b */
    public final void mo19809b() {
        C51163t tVar;
        super.mo19809b();
        C11295c cVar = this.f37153l;
        if (cVar != null && this.f37154m != null) {
            C51941eu euVar = cVar.f36729a;
            if (euVar.f136277e == 5) {
                tVar = (C51163t) euVar.f136278f;
            } else {
                tVar = C51163t.f133176l;
            }
            int i = 1;
            if ((tVar.f133178a & 1) != 0) {
                String str = tVar.f133179b;
                this.f36912b.setVisibility(0);
                this.f36912b.setText(str);
            } else {
                this.f36912b.setVisibility(8);
            }
            C51141hx hxVar = tVar.f133180c;
            if (hxVar == null) {
                hxVar = C51141hx.f133119h;
            }
            if (hxVar.f133122b == 1) {
                this.f36913c.setVisibility(0);
                this.f36913c.setText((String) hxVar.f133123c);
            } else {
                this.f36913c.setVisibility(8);
            }
            if ((hxVar.f133121a & 4) != 0) {
                C51141hx hxVar2 = tVar.f133180c;
                if (hxVar2 == null) {
                    hxVar2 = C51141hx.f133119h;
                }
                String str2 = hxVar2.f133124d;
                this.f36914d.setVisibility(0);
                this.f36914d.setText(str2);
            } else {
                this.f36914d.setVisibility(8);
            }
            C51141hx hxVar3 = tVar.f133180c;
            if (hxVar3 == null) {
                hxVar3 = C51141hx.f133119h;
            }
            C51012dc dcVar = hxVar3.f133126f;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            this.f36915e.mo19786b(dcVar, (Drawable) null);
            this.f36916f.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.f36917g.f36866c = null;
            boolean z = tVar.f133181d;
            int a = C51161r.m86047a(tVar.f133182e);
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if (i2 == 2) {
                this.f36916f.setVisibility(0);
                this.f36916f.setChecked(z);
                this.f36916f.setOnCheckedChangeListener(new C11408o(this));
            } else if (i2 != 3) {
                C59052c cVar2 = (C59052c) ((C59052c) f36911a.mo56225c()).mo56372aa(43214);
                int a2 = C51161r.m86047a(tVar.f133182e);
                if (a2 != 0) {
                    i = a2;
                }
                cVar2.mo56387q("unimplemented field type %d requested, this will look really strange as noselection control will be visible", i - 1);
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
                this.f36917g.setVisibility(0);
                ImageToggleComponent imageToggleComponent = this.f36917g;
                imageToggleComponent.mo19791b(dcVar2, imageToggleComponent.f36864a);
                imageToggleComponent.mo19791b(dcVar3, imageToggleComponent.f36865b);
                this.f36917g.setChecked(z);
                this.f36917g.f36866c = new C11409p(this);
            }
        }
    }

    /* renamed from: k */
    public final void mo19818k() {
        C51163t tVar;
        C11295c cVar = this.f37153l;
        if (cVar != null) {
            C51941eu euVar = cVar.f36729a;
            if (euVar.f136277e == 5) {
                tVar = (C51163t) euVar.f136278f;
            } else {
                tVar = C51163t.f133176l;
            }
            int i = tVar.f133178a;
            int i2 = (i & 128) != 0 ? tVar.f133186i : 82027;
            int i3 = tVar.f133182e;
            int a = C51161r.m86047a(i3);
            if (a != 0 && a == 4) {
                ImageToggleComponent imageToggleComponent = this.f36917g;
                C28292j jVar = new C28292j(i2);
                jVar.mo33795i(5);
                jVar.mo33795i(4);
                C28295m.m52919e(imageToggleComponent, jVar);
                int i4 = tVar.f133186i;
                return;
            }
            int a2 = C51161r.m86047a(i3);
            if (a2 != 0 && a2 == 3) {
                if ((i & 256) != 0 && tVar.f133181d) {
                    i2 = tVar.f133187j;
                } else if ((i & 512) != 0 && !tVar.f133181d) {
                    i2 = tVar.f133188k;
                }
                Switch switchR = this.f36916f;
                C28292j jVar2 = new C28292j(i2);
                jVar2.mo33795i(5);
                jVar2.mo33795i(4);
                C28295m.m52919e(switchR, jVar2);
                int i5 = tVar.f133186i;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36912b = (TextView) findViewById(R.id.binary_selection_title_text);
        this.f36913c = (TextView) findViewById(R.id.binary_selection_primary_text);
        this.f36914d = (TextView) findViewById(R.id.binary_selection_secondary_text);
        this.f36915e = (ImageComponent) findViewById(R.id.binary_selection_icon);
        this.f36916f = (Switch) findViewById(R.id.binary_selection_switch);
        this.f36917g = (ImageToggleComponent) findViewById(R.id.binary_selection_image_toggle);
    }

    public BinarySelectionField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BinarySelectionField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
