package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.p287f.C5593j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14129bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14348fx;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14578ok;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14580om;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.bi */
/* compiled from: PG */
public final class C15199bi {

    /* renamed from: a */
    public final C14986h f45619a;

    /* renamed from: b */
    public ImageView f45620b;

    /* renamed from: c */
    public ImageView f45621c;

    /* renamed from: d */
    public C14578ok f45622d;

    /* renamed from: e */
    public TextView f45623e;

    /* renamed from: f */
    public TextView f45624f;

    /* renamed from: g */
    private final C15352z f45625g;

    /* renamed from: h */
    private final C14132bf f45626h;

    /* renamed from: i */
    private Button f45627i;

    /* renamed from: j */
    private Button f45628j;

    public C15199bi(C14986h hVar, C15352z zVar, C14132bf bfVar) {
        this.f45619a = hVar;
        this.f45625g = zVar;
        this.f45626h = bfVar;
    }

    /* renamed from: a */
    public final void mo22074a(C14578ok okVar, ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper) {
        TextView textView;
        TextView textView2;
        if (this.f45620b == null) {
            LayoutInflater.from(contextThemeWrapper).inflate(true != okVar.f44081e ? R.layout.message_confirm : R.layout.message_confirm_large, viewGroup, true);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.message_confirm_container);
            this.f45626h.mo21444a(viewGroup2, 114347);
            this.f45620b = (ImageView) viewGroup2.findViewById(R.id.message_receiver_avatar);
            this.f45621c = (ImageView) viewGroup2.findViewById(R.id.message_app_icon);
            viewGroup2.getClass();
            this.f45623e = (TextView) viewGroup2.findViewById(R.id.message_receiver_name);
            this.f45624f = (TextView) viewGroup2.findViewById(R.id.message_app_name);
            this.f45627i = (Button) viewGroup2.findViewById(R.id.change_message_button);
            this.f45628j = (Button) viewGroup2.findViewById(R.id.send_message_button);
        }
        if (!okVar.equals(this.f45622d)) {
            C14348fx fxVar = okVar.f44077a;
            if (fxVar != null) {
                if (!(!okVar.f44081e || (textView2 = this.f45623e) == null || this.f45624f == null)) {
                    textView2.setText(fxVar.f43416a);
                    TextView textView3 = this.f45624f;
                    textView3.getClass();
                    textView3.setText(this.f45625g.mo22227h(fxVar.f43418c));
                }
                C15352z zVar = this.f45625g;
                ImageView imageView = this.f45620b;
                imageView.getClass();
                C14361gj gjVar = fxVar.f43419d;
                if (gjVar == null) {
                    gjVar = C14361gj.f43456e;
                }
                zVar.mo22229l(imageView, gjVar, C15194bd.f45614a);
                C15352z zVar2 = this.f45625g;
                ImageView imageView2 = this.f45621c;
                imageView2.getClass();
                zVar2.mo22228k(imageView2, fxVar.f43418c);
            } else {
                C14580om omVar = okVar.f44078b;
                if (omVar == null) {
                    omVar = C14580om.f44082d;
                }
                if (!(!okVar.f44081e || (textView = this.f45623e) == null || this.f45624f == null)) {
                    textView.setText(omVar.f44084a);
                    TextView textView4 = this.f45624f;
                    textView4.getClass();
                    textView4.setText(this.f45625g.mo22227h(omVar.f44086c));
                }
                C15352z zVar3 = this.f45625g;
                ImageView imageView3 = this.f45620b;
                imageView3.getClass();
                zVar3.mo22232o(imageView3, omVar.f44085b, C15194bd.f45614a, C5593j.m14518b());
                C15352z zVar4 = this.f45625g;
                ImageView imageView4 = this.f45621c;
                imageView4.getClass();
                zVar4.mo22228k(imageView4, omVar.f44086c);
            }
            int i = okVar.f44079c;
            if (i != 0) {
                C14132bf bfVar = this.f45626h;
                Button button = this.f45627i;
                button.getClass();
                bfVar.mo21444a(button, i);
                Button button2 = this.f45627i;
                button2.getClass();
                button2.setOnClickListener(new C14129bc(this.f45626h, Optional.empty(), new C15195be(this)));
            } else {
                Button button3 = this.f45627i;
                button3.getClass();
                button3.setOnClickListener(new C15196bf(this));
            }
            int i2 = okVar.f44080d;
            if (i2 != 0) {
                C14132bf bfVar2 = this.f45626h;
                Button button4 = this.f45628j;
                button4.getClass();
                bfVar2.mo21444a(button4, i2);
                Button button5 = this.f45628j;
                button5.getClass();
                button5.setOnClickListener(new C14129bc(this.f45626h, Optional.empty(), new C15197bg(this)));
            } else {
                Button button6 = this.f45628j;
                button6.getClass();
                button6.setOnClickListener(new C15198bh(this));
            }
            this.f45622d = okVar;
        }
    }
}
