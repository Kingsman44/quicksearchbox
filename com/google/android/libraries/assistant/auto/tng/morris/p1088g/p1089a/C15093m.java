package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14129bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14144n;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14594p;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14630t;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14632v;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14634x;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15336j;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15375c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;
import p3186j$.util.OptionalInt;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.m */
/* compiled from: PG */
public final class C15093m implements C15006ao {

    /* renamed from: a */
    public static final C59071e f45297a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.a.m");

    /* renamed from: b */
    public final C14986h f45298b;

    /* renamed from: c */
    public final C14132bf f45299c;

    /* renamed from: d */
    public OptionalInt f45300d = OptionalInt.empty();

    /* renamed from: e */
    public View f45301e;

    /* renamed from: f */
    public TextView f45302f;

    /* renamed from: g */
    public ImageView f45303g;

    /* renamed from: h */
    public Chronometer f45304h;

    /* renamed from: i */
    public Button f45305i;

    /* renamed from: j */
    public Button f45306j;

    /* renamed from: k */
    public Button f45307k;

    /* renamed from: l */
    public TextView f45308l;

    /* renamed from: m */
    private final C15336j f45309m;

    /* renamed from: n */
    private final C69464a f45310n;

    public C15093m(C14986h hVar, C15336j jVar, C14132bf bfVar, C69464a aVar) {
        this.f45298b = hVar;
        this.f45309m = jVar;
        this.f45299c = bfVar;
        this.f45310n = aVar;
    }

    /* renamed from: a */
    public final View mo21891a() {
        View view = this.f45301e;
        view.getClass();
        return view;
    }

    /* renamed from: b */
    public final void mo21951b(C14630t tVar, ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper, boolean z) {
        if (this.f45301e == null) {
            if (viewGroup.findViewById(R.id.ongoing_call) != null) {
                viewGroup.removeView(viewGroup.findViewById(R.id.ongoing_call));
            }
            LayoutInflater.from(contextThemeWrapper).inflate(R.layout.ongoing_call_fullscreen, viewGroup, true);
            View findViewById = viewGroup.findViewById(R.id.ongoing_call);
            this.f45301e = findViewById;
            this.f45299c.mo21444a(findViewById, 104533);
            C15092l lVar = new C15092l(this);
            View view = this.f45301e;
            view.getClass();
            view.setOnTouchListener(new C14144n(contextThemeWrapper, this.f45299c, lVar));
            View view2 = this.f45301e;
            view2.getClass();
            view2.setPadding(0, ((Integer) this.f45310n.mo17428b()).intValue(), 0, 0);
            View view3 = this.f45301e;
            view3.getClass();
            this.f45302f = (TextView) view3.findViewById(R.id.ongoing_call_fullscreen_caller_name);
            View view4 = this.f45301e;
            view4.getClass();
            this.f45303g = (ImageView) view4.findViewById(R.id.ongoing_call_fullscreen_caller_avatar);
            View view5 = this.f45301e;
            view5.getClass();
            this.f45304h = (Chronometer) view5.findViewById(R.id.ongoing_call_fullscreen_call_duration);
            View view6 = this.f45301e;
            view6.getClass();
            this.f45308l = (TextView) view6.findViewById(R.id.ongoing_call_fullscreen_call_status);
            View view7 = this.f45301e;
            view7.getClass();
            Button button = (Button) view7.findViewById(R.id.ongoing_call_fullscreen_mute_mic_button);
            this.f45305i = button;
            C14132bf bfVar = this.f45299c;
            button.getClass();
            bfVar.mo21444a(button, 104534);
            View view8 = this.f45301e;
            view8.getClass();
            Button button2 = (Button) view8.findViewById(R.id.ongoing_call_fullscreen_hold_or_resume_call_button);
            this.f45306j = button2;
            C14132bf bfVar2 = this.f45299c;
            button2.getClass();
            bfVar2.mo21444a(button2, 104535);
            View view9 = this.f45301e;
            view9.getClass();
            Button button3 = (Button) view9.findViewById(R.id.ongoing_call_fullscreen_audio_button);
            this.f45307k = button3;
            C14132bf bfVar3 = this.f45299c;
            button3.getClass();
            bfVar3.mo21444a(button3, 104536);
            View view10 = this.f45301e;
            view10.getClass();
            ImageView imageView = (ImageView) view10.findViewById(R.id.ongoing_call_fullscreen_end_call_button);
            this.f45299c.mo21444a(imageView, 104538);
            imageView.setOnClickListener(new C14129bc(this.f45299c, Optional.empty(), new C15090j(this)));
            View view11 = this.f45301e;
            view11.getClass();
            Button button4 = (Button) view11.findViewById(R.id.ongoing_call_fullscreen_keypad_button);
            this.f45299c.mo21444a(button4, 104537);
            button4.setOnClickListener(new C15091k(this));
            if (z) {
                View view12 = this.f45301e;
                view12.getClass();
                view12.startAnimation(C15352z.m31954f(contextThemeWrapper, viewGroup));
                int[] iArr = {R.id.ongoing_call_fullscreen_caller_avatar, R.id.ongoing_call_fullscreen_call_status, R.id.ongoing_call_fullscreen_caller_name, R.id.ongoing_call_fullscreen_call_duration};
                for (int i = 0; i < 4; i++) {
                    int i2 = iArr[i];
                    View view13 = this.f45301e;
                    view13.getClass();
                    view13.findViewById(i2).startAnimation(C15352z.m31955g(contextThemeWrapper, 1));
                }
                View view14 = this.f45301e;
                view14.getClass();
                view14.findViewById(R.id.ongoing_call_fullscreen_mute_mic_button).startAnimation(C15352z.m31955g(contextThemeWrapper, 2));
                View view15 = this.f45301e;
                view15.getClass();
                view15.findViewById(R.id.ongoing_call_fullscreen_keypad_button).startAnimation(C15352z.m31955g(contextThemeWrapper, 2));
                View view16 = this.f45301e;
                view16.getClass();
                view16.findViewById(R.id.ongoing_call_fullscreen_audio_button).startAnimation(C15352z.m31955g(contextThemeWrapper, 2));
                View view17 = this.f45301e;
                view17.getClass();
                view17.findViewById(R.id.ongoing_call_fullscreen_hold_or_resume_call_button).startAnimation(C15352z.m31955g(contextThemeWrapper, 2));
                View view18 = this.f45301e;
                view18.getClass();
                view18.findViewById(R.id.ongoing_call_fullscreen_end_call_button).startAnimation(C15352z.m31955g(contextThemeWrapper, 3));
            }
        }
        C14634x xVar = tVar.f44216a;
        if (xVar == null) {
            xVar = C14634x.f44218k;
        }
        this.f45300d = OptionalInt.m71640of(xVar.f44222c);
        TextView textView = this.f45302f;
        textView.getClass();
        textView.setText(xVar.f44220a);
        C14361gj gjVar = xVar.f44229j;
        if (gjVar != null) {
            ImageView imageView2 = this.f45303g;
            imageView2.getClass();
            imageView2.setImageBitmap(C15375c.m31983a(gjVar));
        } else {
            ImageView imageView3 = this.f45303g;
            imageView3.getClass();
            imageView3.setImageResource(R.drawable.caller_avatar);
        }
        C15336j jVar = this.f45309m;
        int b = C14632v.m30648b(xVar.f44221b);
        int i3 = b == 0 ? 1 : b;
        Chronometer chronometer = this.f45304h;
        chronometer.getClass();
        TextView textView2 = this.f45308l;
        textView2.getClass();
        jVar.mo22208d(i3, chronometer, textView2, xVar.f44223d);
        C15336j jVar2 = this.f45309m;
        Button button5 = this.f45305i;
        button5.getClass();
        jVar2.mo22207c(button5, xVar.f44224e);
        C15336j jVar3 = this.f45309m;
        Button button6 = this.f45306j;
        button6.getClass();
        jVar3.mo22206b(button6, xVar.f44225f, this.f45300d);
        C15336j jVar4 = this.f45309m;
        Button button7 = this.f45307k;
        button7.getClass();
        C14594p a = C14594p.m30642a(xVar.f44226g);
        if (a == null) {
            a = C14594p.UNRECOGNIZED;
        }
        jVar4.mo22205a(button7, a, xVar.f44227h, xVar.f44228i, this.f45300d.getAsInt());
    }
}
