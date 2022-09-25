package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14129bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14594p;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import p3186j$.util.Optional;
import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.f.j */
/* compiled from: PG */
public final class C15336j {

    /* renamed from: a */
    public static final C59071e f46020a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.f.j");

    /* renamed from: c */
    private static final C58495hd f46021c = C58495hd.m89903q(C14594p.BLUETOOTH, new C15329c(R.drawable.bluetooth_button_highlighted, R.drawable.bluetooth_button), C14594p.SPEAKER, new C15329c(R.drawable.speaker_button_highlighted, R.drawable.speaker_button), C14594p.WIRED_HEADSET, new C15329c(R.drawable.headset_button_highlighted, R.drawable.headset_button), C14594p.EARPIECE, new C15329c(R.drawable.earpiece_button_highlighted, R.drawable.earpiece_button));

    /* renamed from: d */
    private static final C15334h f46022d = new C15329c(R.drawable.speaker_button_highlighted, R.drawable.speaker_button);

    /* renamed from: e */
    private static final C58495hd f46023e = C58495hd.m89903q(C14594p.BLUETOOTH, new C15330d(R.string.bluetooth_on_label, R.string.bluetooth_off_label), C14594p.SPEAKER, new C15330d(R.string.speaker_on_label, R.string.speaker_off_label), C14594p.WIRED_HEADSET, new C15330d(R.string.wired_headset_on_label, R.string.wired_headset_off_label), C14594p.EARPIECE, new C15330d(R.string.earpiece_on_label, R.string.earpiece_off_label));

    /* renamed from: f */
    private static final C15335i f46024f = new C15330d(R.string.speaker_on_label, R.string.speaker_off_label);

    /* renamed from: g */
    private static final C58495hd f46025g = C58495hd.m89903q(C14594p.BLUETOOTH, Integer.valueOf(R.string.bluetooth_icon_description), C14594p.SPEAKER, Integer.valueOf(R.string.speaker_icon_description), C14594p.WIRED_HEADSET, Integer.valueOf(R.string.wired_headset_icon_description), C14594p.EARPIECE, Integer.valueOf(R.string.earpiece_icon_description));

    /* renamed from: b */
    public final C14986h f46026b;

    /* renamed from: h */
    private final Context f46027h;

    /* renamed from: i */
    private final C21370a f46028i;

    /* renamed from: j */
    private final C14132bf f46029j;

    public C15336j(Context context, C14986h hVar, C21370a aVar, C14132bf bfVar) {
        this.f46027h = context;
        this.f46026b = hVar;
        this.f46028i = aVar;
        this.f46029j = bfVar;
    }

    /* renamed from: a */
    public final void mo22205a(View view, C14594p pVar, boolean z, List list, int i) {
        String str;
        boolean z2 = view instanceof Button;
        boolean z3 = true;
        if (!z2 && !(view instanceof ImageButton)) {
            z3 = false;
        }
        C58838bb.m90868c(z3);
        if (pVar == C14594p.UNKNOWN) {
            C59104x c = f46020a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.CallHelper");
            ((C59052c) ((C59052c) c).mo56372aa(46050)).mo56386p("refreshAudioRouteButton(). Got invalid audioRouteType: CallAudioRouteType.UNKNOWN");
        }
        C15334h hVar = (C15334h) f46021c.getOrDefault(pVar, f46022d);
        Drawable drawable = this.f46027h.getDrawable(z ? hVar.mo22192a() : hVar.mo22193b());
        if (z2) {
            Button button = (Button) view;
            button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
            button.setText(this.f46027h.getString(((Integer) f46025g.getOrDefault(pVar, Integer.valueOf(R.string.speaker_icon_description))).intValue()));
        } else {
            ((ImageButton) view).setImageDrawable(drawable);
        }
        C15335i iVar = (C15335i) f46023e.getOrDefault(pVar, f46024f);
        if (z) {
            str = this.f46027h.getString(iVar.mo22198b());
        } else {
            str = this.f46027h.getString(iVar.mo22197a());
        }
        view.setContentDescription(str);
        view.setOnClickListener(new C14129bc(this.f46029j, Optional.empty(), new C15333g(this, i, list)));
    }

    /* renamed from: b */
    public final void mo22206b(View view, boolean z, OptionalInt optionalInt) {
        String str;
        boolean z2 = view instanceof Button;
        boolean z3 = true;
        if (!z2 && !(view instanceof ImageButton)) {
            z3 = false;
        }
        C58838bb.m90868c(z3);
        Drawable drawable = this.f46027h.getDrawable(z ? R.drawable.hold_button_highlighted : R.drawable.hold_button);
        if (z2) {
            ((Button) view).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        } else {
            ((ImageButton) view).setImageDrawable(drawable);
        }
        if (z) {
            str = this.f46027h.getString(R.string.resume_label);
        } else {
            str = this.f46027h.getString(R.string.hold_label);
        }
        view.setContentDescription(str);
        view.setOnClickListener(new C14129bc(this.f46029j, Optional.empty(), new C15332f(this, optionalInt, z)));
    }

    /* renamed from: c */
    public final void mo22207c(View view, boolean z) {
        String str;
        boolean z2 = view instanceof Button;
        boolean z3 = true;
        if (!z2 && !(view instanceof ImageButton)) {
            z3 = false;
        }
        C58838bb.m90868c(z3);
        Drawable drawable = this.f46027h.getDrawable(z ? R.drawable.mute_button_highlighted : R.drawable.mute_button);
        if (z2) {
            ((Button) view).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        } else {
            ((ImageButton) view).setImageDrawable(drawable);
        }
        if (z) {
            str = this.f46027h.getString(R.string.mute_on_label);
        } else {
            str = this.f46027h.getString(R.string.mute_off_label);
        }
        view.setContentDescription(str);
        view.setOnClickListener(new C14129bc(this.f46029j, Optional.empty(), new C15331e(this, z)));
    }

    /* renamed from: d */
    public final void mo22208d(int i, Chronometer chronometer, TextView textView, long j) {
        int i2 = i - 2;
        if (i2 == 1 || i2 == 2) {
            textView.setText(this.f46027h.getString(R.string.call_status_calling_text));
            textView.setVisibility(0);
            chronometer.setVisibility(4);
        } else if (i2 == 3) {
            long b = this.f46028i.mo26870b() - j;
            if (j > 0) {
                chronometer.setBase(this.f46028i.mo26871c() - b);
            } else {
                chronometer.setBase(this.f46028i.mo26871c());
            }
            chronometer.start();
            chronometer.setVisibility(0);
            textView.setVisibility(4);
        } else if (i2 == 4) {
            chronometer.stop();
            chronometer.setVisibility(4);
            textView.setText(this.f46027h.getString(R.string.call_status_holding_text));
            textView.setVisibility(0);
        } else if (i2 == 5) {
            chronometer.stop();
        }
    }
}
