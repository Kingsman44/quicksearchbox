package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14129bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14152v;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14570oc;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15346t;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.at */
/* compiled from: PG */
public final class C15183at {

    /* renamed from: a */
    public final C14986h f45567a;

    /* renamed from: b */
    public final C14152v f45568b;

    /* renamed from: c */
    private final C15346t f45569c;

    /* renamed from: d */
    private final C14132bf f45570d;

    /* renamed from: e */
    private C14570oc f45571e;

    /* renamed from: f */
    private ViewGroup f45572f;

    /* renamed from: g */
    private TextView f45573g;

    /* renamed from: h */
    private Group f45574h;

    /* renamed from: i */
    private ImageView f45575i;

    /* renamed from: j */
    private TextView f45576j;

    public C15183at(C14986h hVar, C15346t tVar, C14132bf bfVar, C14152v vVar) {
        this.f45567a = hVar;
        this.f45569c = tVar;
        this.f45570d = bfVar;
        this.f45568b = vVar;
    }

    /* renamed from: b */
    public final void mo22061b() {
        this.f45573g = null;
        this.f45575i = null;
        this.f45576j = null;
        this.f45574h = null;
        this.f45572f = null;
        this.f45571e = null;
    }

    /* renamed from: a */
    public final void mo22060a(C14570oc ocVar, ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper) {
        C14570oc ocVar2 = ocVar;
        ViewGroup viewGroup2 = viewGroup;
        if (this.f45572f == null) {
            LayoutInflater.from(contextThemeWrapper).inflate(R.layout.media_empty_state_task, viewGroup2, true);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.media_empty_state_task);
            this.f45572f = viewGroup3;
            this.f45570d.mo21444a(viewGroup3, 114602);
            ViewGroup viewGroup4 = this.f45572f;
            viewGroup4.getClass();
            this.f45573g = (TextView) viewGroup4.findViewById(R.id.media_empty_state_play_command);
            ViewGroup viewGroup5 = this.f45572f;
            viewGroup5.getClass();
            this.f45574h = (Group) viewGroup5.findViewById(R.id.media_play_command_without_voice_intent_group);
            ViewGroup viewGroup6 = this.f45572f;
            viewGroup6.getClass();
            this.f45575i = (ImageView) viewGroup6.findViewById(R.id.media_empty_state_task_app_icon);
            ViewGroup viewGroup7 = this.f45572f;
            viewGroup7.getClass();
            this.f45576j = (TextView) viewGroup7.findViewById(R.id.media_empty_state_app_name);
        }
        if (!ocVar2.equals(this.f45571e)) {
            String str = ocVar2.f44052a;
            String str2 = ocVar2.f44053b;
            String f = this.f45569c.mo22216f(str, str2);
            int i = ocVar2.f44054c;
            char c = i != 0 ? i != 1 ? i != 2 ? (char) 0 : 4 : 3 : 2;
            if (c != 0 && c == 3) {
                TextView textView = this.f45573g;
                textView.getClass();
                textView.setVisibility(0);
                Group group = this.f45574h;
                group.getClass();
                group.setVisibility(8);
                if (!f.isEmpty()) {
                    TextView textView2 = this.f45573g;
                    textView2.getClass();
                    textView2.setText(contextThemeWrapper.getString(R.string.media_empty_state_task_play_media_app, new Object[]{f}));
                } else {
                    ContextThemeWrapper contextThemeWrapper2 = contextThemeWrapper;
                }
                TextView textView3 = this.f45573g;
                textView3.getClass();
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, textView3.getTextSize(), new int[]{contextThemeWrapper.getResources().getColor(R.color.media_empty_state_player_play_command_gradient_top), contextThemeWrapper.getResources().getColor(R.color.media_empty_state_player_play_command_gradient_bottom)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                TextView textView4 = this.f45573g;
                textView4.getClass();
                textView4.getPaint().setShader(linearGradient);
            } else {
                Group group2 = this.f45574h;
                group2.getClass();
                group2.setVisibility(0);
                TextView textView5 = this.f45573g;
                textView5.getClass();
                textView5.setVisibility(8);
                TextView textView6 = this.f45576j;
                textView6.getClass();
                textView6.setText(f);
                C15346t tVar = this.f45569c;
                ImageView imageView = this.f45575i;
                imageView.getClass();
                tVar.mo22221k(imageView, str, str2);
            }
            if (!str.isEmpty() && !str2.isEmpty()) {
                ViewGroup viewGroup8 = this.f45572f;
                viewGroup8.getClass();
                viewGroup8.setOnClickListener(new C14129bc(this.f45570d, Optional.empty(), new C15182as(this, str, str2)));
            }
            this.f45571e = ocVar2;
        }
    }
}
