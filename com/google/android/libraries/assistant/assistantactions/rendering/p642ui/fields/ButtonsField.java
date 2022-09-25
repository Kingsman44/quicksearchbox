package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11301i;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ButtonComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C50938aj;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.net.URISyntaxException;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ButtonsField */
/* compiled from: PG */
public class ButtonsField extends C11407n {

    /* renamed from: a */
    private static final C59071e f36923a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ButtonsField");

    public ButtonsField(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo19824a(C51098gh ghVar) {
        C51058ev evVar;
        C51058ev evVar2;
        C51058ev evVar3;
        C51058ev evVar4;
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        if ((evVar.f132943a & 32) != 0) {
            int i = ghVar.f133012b;
            if (i == 1) {
                evVar2 = (C51058ev) ghVar.f133013c;
            } else {
                evVar2 = C51058ev.f132941o;
            }
            if ((evVar2.f132943a & 1) != 0) {
                if (i == 1) {
                    try {
                        evVar3 = (C51058ev) ghVar.f133013c;
                    } catch (URISyntaxException e) {
                        ((C59052c) ((C59052c) ((C59052c) f36923a.mo56225c()).mo56382g(e)).mo56372aa(43219)).mo56386p("URI cannot be parsed.");
                        return;
                    }
                } else {
                    evVar3 = C51058ev.f132941o;
                }
                Intent parseUri = Intent.parseUri(evVar3.f132949g, 0);
                if (parseUri != null) {
                    if (ghVar.f133012b == 1) {
                        evVar4 = (C51058ev) ghVar.f133013c;
                    } else {
                        evVar4 = C51058ev.f132941o;
                    }
                    parseUri.setPackage(evVar4.f132944b);
                    C11301i iVar = this.f37152k;
                    if (iVar != null) {
                        iVar.mo19725h(parseUri);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo19809b() {
        C50938aj ajVar;
        C11295c cVar = this.f37153l;
        if (cVar != null && this.f37154m != null) {
            C51941eu euVar = cVar.f36729a;
            if (euVar.f136277e == 10) {
                ajVar = (C50938aj) euVar.f136278f;
            } else {
                ajVar = C50938aj.f132608b;
            }
            for (C50936ah ahVar : ajVar.f132610a) {
                ButtonComponent buttonComponent = (ButtonComponent) LayoutInflater.from(this.f37159r).inflate(R.layout.button_component, (ViewGroup) null);
                buttonComponent.mo19768a(ahVar, false, false);
                buttonComponent.setVisibility(0);
                buttonComponent.setOnClickListener(new C11411r(this, ahVar));
                addView(buttonComponent);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) buttonComponent.getLayoutParams();
                layoutParams.setMargins(getContext().getResources().getDimensionPixelSize(R.dimen.buttons_field_margin_left), 0, 0, 0);
                buttonComponent.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: m */
    public final void mo19821m(C11295c cVar) {
        this.f37153l = cVar;
        mo19809b();
    }

    public ButtonsField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ButtonsField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ButtonsField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
