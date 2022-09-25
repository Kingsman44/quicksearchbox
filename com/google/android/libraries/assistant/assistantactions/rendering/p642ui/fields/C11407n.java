package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.content.Intent;
import android.support.p031v4.app.C0167am;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.p633d.C11270g;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11296d;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11298f;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11299g;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11301i;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52077ej;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52491ts;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n */
/* compiled from: PG */
public class C11407n extends LinearLayout {

    /* renamed from: a */
    private static final C59071e f37150a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n");

    /* renamed from: j */
    public boolean f37151j = false;

    /* renamed from: k */
    protected C11301i f37152k;

    /* renamed from: l */
    public C11295c f37153l;

    /* renamed from: m */
    protected C11296d f37154m;

    /* renamed from: n */
    protected C11054a f37155n;

    /* renamed from: o */
    protected C0167am f37156o;

    /* renamed from: p */
    protected C11270g f37157p;

    /* renamed from: q */
    protected boolean f37158q;

    /* renamed from: r */
    protected final Context f37159r;

    /* renamed from: s */
    protected int f37160s;

    public C11407n(Context context) {
        super(context);
        this.f37159r = context;
    }

    /* renamed from: b */
    public void mo19809b() {
        C11295c cVar = this.f37153l;
        if (cVar != null) {
            C51941eu euVar = cVar.f36729a;
            int i = euVar.f136275c;
            if (i == 24) {
                setOnClickListener(new C11404k(this, euVar));
            } else if (i == 22) {
                setOnClickListener(new C11405l(this, (C51098gh) euVar.f136276d));
            } else if (i == 1) {
                setOnClickListener(new C11406m(this, cVar, (C51016dg) euVar.f136276d));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo19940g(C58485gu guVar, boolean z) {
        if (this.f37152k != null) {
            C28292j a = C28295m.m52915a(this);
            if (a != null) {
                this.f37152k.mo19732o(a);
            }
            this.f37152k.mo19719b(guVar, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo19941h(C11298f fVar) {
        if (this.f37152k != null) {
            C28292j a = C28295m.m52915a(this);
            if (a != null) {
                this.f37152k.mo19732o(a);
            }
            this.f37152k.mo19720c(fVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo19942i(C51016dg dgVar, C11298f fVar) {
        if ((dgVar.f132829a & 8) != 0) {
            C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
            jzVar.copyOnWrite();
            C52230ka kaVar = (C52230ka) jzVar.instance;
            kaVar.f137059a |= 1;
            kaVar.f137060b = "assistant.api.client_input.FormInput";
            C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
            C51953ff b = fVar.mo19713b();
            tsVar.copyOnWrite();
            C52492tt ttVar = (C52492tt) tsVar.instance;
            b.getClass();
            ttVar.f137806b = b;
            ttVar.f137805a |= 1;
            C52507uh a = fVar.mo19712a();
            tsVar.copyOnWrite();
            C52492tt ttVar2 = (C52492tt) tsVar.instance;
            a.getClass();
            ttVar2.f137807c = a;
            ttVar2.f137805a |= 2;
            C63088z byteString = ((C52492tt) tsVar.build()).toByteString();
            jzVar.copyOnWrite();
            C52230ka kaVar2 = (C52230ka) jzVar.instance;
            byteString.getClass();
            kaVar2.f137059a |= 2;
            kaVar2.f137061c = byteString;
            C52230ka kaVar3 = (C52230ka) jzVar.build();
            C51805du duVar = dgVar.f132833e;
            if (duVar == null) {
                duVar = C51805du.f135924e;
            }
            C51803ds dsVar = (C51803ds) duVar.toBuilder();
            dsVar.mo53729a("form_input", kaVar3);
            ejVar.copyOnWrite();
            C52078ek ekVar = (C52078ek) ejVar.instance;
            C51805du duVar2 = (C51805du) dsVar.build();
            duVar2.getClass();
            ekVar.f136675c = duVar2;
            ekVar.f136674b = 5;
            C52078ek ekVar2 = (C52078ek) ejVar.build();
            if (this.f37152k != null) {
                C28292j a2 = C28295m.m52915a(this);
                if (a2 != null) {
                    this.f37152k.mo19732o(a2);
                }
                this.f37152k.mo19722e(ekVar2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo19943j(C51805du duVar) {
        C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
        ejVar.copyOnWrite();
        C52078ek ekVar = (C52078ek) ejVar.instance;
        duVar.getClass();
        ekVar.f136675c = duVar;
        ekVar.f136674b = 5;
        C52078ek ekVar2 = (C52078ek) ejVar.build();
        if (this.f37152k != null) {
            C28292j a = C28295m.m52915a(this);
            if (a != null) {
                this.f37152k.mo19732o(a);
            }
            this.f37152k.mo19722e(ekVar2);
        }
    }

    /* renamed from: k */
    public void mo19818k() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo19944l(C51098gh ghVar) {
        if (ghVar != null) {
            C58833ax d = C11307e.m26911d(getContext(), ghVar);
            if (this.f37152k == null) {
                ((C59052c) ((C59052c) f37150a.mo56226d()).mo56372aa(43206)).mo56386p("Unable to start activity as callback is null");
            } else if (d.mo56113h()) {
                this.f37152k.mo19725h((Intent) d.mo56107c());
            } else {
                ((C59052c) ((C59052c) f37150a.mo56226d()).mo56372aa(43205)).mo56386p("Unable to handle click for provider, as it does not resolve to an intent");
            }
        }
    }

    /* renamed from: m */
    public void mo19821m(C11295c cVar) {
        this.f37153l = cVar;
        mo19809b();
    }

    /* renamed from: n */
    public final void mo19945n(C11299g gVar, int i) {
        this.f37152k = gVar.f36733c;
        this.f37154m = gVar.f36734d;
        this.f37155n = gVar.f36736f;
        this.f37156o = gVar.f36735e;
        this.f37158q = gVar.f36737g.f36739a;
        this.f37160s = i;
        this.f37157p = gVar.f36738h;
    }

    /* renamed from: o */
    public void mo19841o() {
    }

    /* renamed from: p */
    public void mo19843p() {
    }

    /* renamed from: q */
    public void mo19853q(boolean z) {
    }

    public C11407n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37159r = context;
    }

    public C11407n(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37159r = context;
    }

    public C11407n(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f37159r = context;
    }
}
