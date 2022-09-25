package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public class InterpreterIntroView extends RelativeLayout {

    /* renamed from: m */
    private static final C59071e f314725m = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterIntroView");

    /* renamed from: a */
    public final Animation f314726a;

    /* renamed from: b */
    public final Animation f314727b;

    /* renamed from: c */
    public final Animation f314728c;

    /* renamed from: d */
    public final Animation f314729d;

    /* renamed from: e */
    public String f314730e;

    /* renamed from: f */
    public String f314731f;

    /* renamed from: g */
    public String f314732g;

    /* renamed from: h */
    public String f314733h;

    /* renamed from: i */
    public String f314734i;

    /* renamed from: j */
    public String f314735j;

    /* renamed from: k */
    public C113680be f314736k = C113680be.UNKNOWN;

    /* renamed from: l */
    public boolean f314737l;

    public InterpreterIntroView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.interpreter_intro, this, true);
        this.f314726a = AnimationUtils.loadAnimation(context, R.anim.interpreter_fade_in);
        this.f314727b = AnimationUtils.loadAnimation(context, R.anim.interpreter_fade_out);
        this.f314728c = AnimationUtils.loadAnimation(context, R.anim.interpreter_mode_change_fade_in);
        this.f314729d = AnimationUtils.loadAnimation(context, R.anim.interpreter_mode_change_fade_out);
    }

    /* renamed from: c */
    private final void m188162c(String str, String str2) {
        ((TextView) findViewById(R.id.interpreter_source_intro)).setText(str);
        ((TextView) findViewById(R.id.interpreter_target_intro)).setText(str2);
    }

    /* renamed from: a */
    public final void mo100391a(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        Boolean.TRUE.equals(Boolean.valueOf(this.f314737l));
        this.f314727b.hasStarted();
        this.f314727b.hasEnded();
        if (this.f314737l) {
            this.f314737l = false;
            this.f314726a.cancel();
            this.f314726a.reset();
            if (z) {
                this.f314727b.cancel();
                setVisibility(8);
                return;
            }
            this.f314727b.cancel();
            this.f314727b.reset();
            startAnimation(this.f314727b);
        }
    }

    /* renamed from: b */
    public final void mo100392b(C113680be beVar) {
        C113680be beVar2 = C113680be.UNKNOWN;
        int ordinal = beVar.ordinal();
        if (ordinal == 1) {
            m188162c(this.f314730e, this.f314731f);
        } else if (ordinal == 2) {
            m188162c(this.f314732g, this.f314733h);
        } else if (ordinal != 3) {
            C59104x c = f314725m.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterIntro");
            ((C59052c) ((C59052c) c).mo56372aa(28210)).mo56389s("Unknown Mode Type: %s", beVar);
            m188162c(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
        } else {
            m188162c(this.f314734i, this.f314735j);
        }
    }
}
