package com.google.android.apps.gsa.staticplugins.p7539bl;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.shared.util.C90758bb;
import com.google.android.apps.gsa.voiceime.view.DrawSoundLevelsView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bl.d */
/* compiled from: PG */
public final class C96655d {

    /* renamed from: a */
    public final C90743b f270416a;

    /* renamed from: b */
    public final C96654c f270417b;

    /* renamed from: c */
    public int f270418c = 0;

    /* renamed from: d */
    public TextView f270419d;

    /* renamed from: e */
    public ProgressBar f270420e;

    /* renamed from: f */
    public TextView f270421f;

    /* renamed from: g */
    public DrawSoundLevelsView f270422g;

    /* renamed from: h */
    public FrameLayout f270423h;

    /* renamed from: i */
    public String f270424i = null;

    /* renamed from: j */
    private final Activity f270425j;

    /* renamed from: k */
    private final C90758bb f270426k;

    /* renamed from: l */
    private View f270427l;

    /* renamed from: m */
    private Button f270428m;

    /* renamed from: n */
    private final boolean f270429n;

    /* renamed from: o */
    private boolean f270430o;

    /* renamed from: p */
    private final String f270431p;

    public C96655d(Activity activity, C90758bb bbVar, String str, C90743b bVar, boolean z) {
        this.f270425j = activity;
        this.f270426k = bbVar;
        this.f270424i = activity.getString(R.string.intent_api_start_speaking);
        this.f270431p = str;
        this.f270416a = bVar;
        this.f270429n = z;
        this.f270417b = new C96654c(activity);
    }

    /* renamed from: d */
    private final void m160166d() {
        this.f270425j.setContentView(R.layout.intent_api_material_activity);
        View findViewById = this.f270425j.findViewById(R.id.intent_api_main);
        findViewById.getClass();
        this.f270427l = findViewById;
        TextView textView = (TextView) this.f270425j.findViewById(R.id.intent_api_text);
        textView.getClass();
        this.f270419d = textView;
        Button button = (Button) this.f270425j.findViewById(R.id.retry_button);
        button.getClass();
        this.f270428m = button;
        TextView textView2 = (TextView) this.f270425j.findViewById(R.id.intent_api_language);
        textView2.getClass();
        this.f270421f = textView2;
        ProgressBar progressBar = (ProgressBar) this.f270425j.findViewById(R.id.waiting_for_results);
        progressBar.getClass();
        this.f270420e = progressBar;
        FrameLayout frameLayout = (FrameLayout) this.f270425j.findViewById(R.id.intent_api_ellipsis);
        frameLayout.getClass();
        this.f270423h = frameLayout;
        DrawSoundLevelsView drawSoundLevelsView = (DrawSoundLevelsView) this.f270425j.findViewById(R.id.sound_levels);
        drawSoundLevelsView.getClass();
        this.f270422g = drawSoundLevelsView;
        this.f270417b.mo90299a();
    }

    /* renamed from: a */
    public final void mo90303a() {
        if (this.f270427l == null || this.f270419d == null || this.f270428m == null || this.f270420e == null || this.f270421f == null || this.f270422g == null || this.f270423h == null) {
            m160166d();
        }
    }

    /* renamed from: b */
    public final void mo90304b() {
        C58976aa aaVar = C58975e.f156826a;
        mo90305c();
        this.f270422g.setEnabled(false);
        this.f270422g.setVisibility(4);
        this.f270421f.setVisibility(4);
        this.f270419d.setVisibility(4);
        this.f270420e.setVisibility(4);
        this.f270423h.setVisibility(4);
        C96654c cVar = this.f270417b;
        cVar.mo90300b();
        cVar.f270410c.setImageDrawable(cVar.f270408a);
        cVar.f270409b.setBackgroundResource(R.drawable.ime_initializing_mic);
        cVar.mo90301c();
        if (this.f270431p != null && !this.f270430o) {
            String string = this.f270425j.getString(R.string.audio_rationale_message);
            if (this.f270429n) {
                string = this.f270425j.getString(R.string.audio_rationale_message);
            }
            Toast.makeText(this.f270425j, string, 1).show();
            this.f270430o = true;
        }
    }

    /* renamed from: c */
    public final void mo90305c() {
        if (this.f270418c != 1) {
            this.f270418c = 1;
            m160166d();
            this.f270422g.f331102c = this.f270426k;
            this.f270428m.setVisibility(4);
            String str = this.f270424i;
            if (str != null) {
                this.f270419d.setText(str);
                return;
            }
            return;
        }
        mo90303a();
    }
}
