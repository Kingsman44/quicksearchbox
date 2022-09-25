package com.google.android.apps.gsa.staticplugins.nowcards.p8117g;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91857e;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91940p;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58838bb;
import com.google.p375ai.p378b.C8072um;
import com.google.p375ai.p378b.C8074uo;
import com.google.p375ai.p378b.C8075up;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.bn */
/* compiled from: PG */
public final class C104943bn {

    /* renamed from: a */
    public final C91940p f292421a;

    /* renamed from: b */
    public boolean f292422b;

    /* renamed from: c */
    public C8075up f292423c;

    /* renamed from: d */
    View f292424d;

    /* renamed from: e */
    View f292425e;

    /* renamed from: f */
    public C8074uo f292426f;

    /* renamed from: g */
    private final C91857e f292427g;

    public C104943bn(C91940p pVar, C91857e eVar) {
        this.f292421a = pVar;
        this.f292427g = eVar;
    }

    /* renamed from: a */
    public final void mo94402a() {
        if (this.f292426f == null) {
            C8074uo a = C8074uo.m22931a(this.f292423c.f28427h);
            if (a == null) {
                a = C8074uo.NEUTRAL;
            }
            this.f292426f = a;
        }
        if (this.f292426f != C8074uo.CHECKED) {
            this.f292426f = C8074uo.CHECKED;
            C8072um umVar = (C8072um) this.f292423c.toBuilder();
            C8074uo uoVar = this.f292426f;
            umVar.copyOnWrite();
            C8075up upVar = (C8075up) umVar.instance;
            upVar.f28427h = uoVar.f28417d;
            upVar.f28420a |= 64;
            C8075up upVar2 = (C8075up) umVar.build();
            this.f292423c = upVar2;
            C91857e eVar = this.f292427g;
            if (eVar != null) {
                eVar.mo86359a("EVENT_TOGGLE_STATE_ACTION_CLICK", "TextOnlyRadioTSAP", C23245b.m43556a(upVar2));
            }
            mo94404c();
        }
    }

    /* renamed from: b */
    public final void mo94403b(boolean z) {
        int i = true != z ? 4 : 0;
        if (this.f292422b) {
            this.f292424d.setVisibility(i);
            this.f292425e.setClickable(z);
        }
    }

    /* renamed from: c */
    public final void mo94404c() {
        C58838bb.m90869d(this.f292422b, "maybePopulateView() must be called before the view can be setup.");
        if (this.f292426f == null) {
            C8074uo a = C8074uo.m22931a(this.f292423c.f28427h);
            if (a == null) {
                a = C8074uo.NEUTRAL;
            }
            this.f292426f = a;
        }
        if (this.f292426f == C8074uo.CHECKED) {
            ((ImageButton) this.f292424d).setImageResource(R.drawable.quantum_ic_radio_button_on_black_24);
        } else {
            ((ImageButton) this.f292424d).setImageResource(R.drawable.quantum_ic_radio_button_off_black_24);
        }
        if (this.f292426f == null) {
            C8074uo a2 = C8074uo.m22931a(this.f292423c.f28427h);
            if (a2 == null) {
                a2 = C8074uo.NEUTRAL;
            }
            this.f292426f = a2;
        }
        C8075up upVar = this.f292423c;
        String str = upVar.f28426g;
        if (this.f292426f == C8074uo.CHECKED) {
            str = (upVar.f28420a & 128) != 0 ? upVar.f28428i : upVar.f28424e;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f292424d.setContentDescription(str);
            this.f292424d.announceForAccessibility(str);
        }
    }
}
