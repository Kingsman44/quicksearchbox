package com.google.android.apps.gsa.assistant.settings.shared.p5800ui;

import android.os.Bundle;
import android.support.p033v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1626c.p1629c.C19522b;
import com.google.android.material.chip.Chip;

/* renamed from: com.google.android.apps.gsa.assistant.settings.shared.ui.g */
/* compiled from: PG */
public abstract class C73784g extends C19522b {

    /* renamed from: a */
    private TextView f195073a;

    /* renamed from: d */
    public boolean f195074d = false;

    /* renamed from: e */
    public C73782e f195075e;

    /* renamed from: f */
    public C73783f f195076f;

    /* renamed from: g */
    public ViewSwitcher f195077g;

    /* renamed from: h */
    public TextView f195078h;

    /* renamed from: i */
    public TextView f195079i;

    /* renamed from: j */
    public TextView f195080j;

    /* renamed from: k */
    public TextView f195081k;

    /* renamed from: l */
    public AppCompatImageView f195082l;

    /* renamed from: m */
    public AppCompatImageView f195083m;

    /* renamed from: n */
    public Chip f195084n;

    /* renamed from: j */
    public abstract void mo65262j();

    /* renamed from: k */
    public abstract void mo65263k();

    /* renamed from: l */
    public abstract void mo65264l();

    /* renamed from: m */
    public abstract boolean mo65265m();

    /* renamed from: o */
    public final void mo65266o() {
        C73783f fVar = this.f195076f;
        if (fVar != null) {
            fVar.mo18295a();
        }
        this.f195077g.setVisibility(8);
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.shared.ui.g.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public android.view.View onCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.shared.ui.g.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73784g.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onResume() {
        super.onResume();
        if (mo65265m()) {
            C73782e eVar = this.f195075e;
            if (eVar != null) {
                eVar.mo18294a();
                return;
            }
            return;
        }
        mo65266o();
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f54442o.mo24720k(bundle);
        this.f195078h = (TextView) view.findViewById(R.id.action_card_undecided_title);
        this.f195079i = (TextView) view.findViewById(R.id.action_card_undecided_text);
        this.f195073a = (TextView) view.findViewById(R.id.action_card_undecided_button_positive);
        this.f195081k = (TextView) view.findViewById(R.id.action_card_undecided_button_negative);
        this.f195082l = (AppCompatImageView) view.findViewById(R.id.action_card_undecided_icon);
        this.f195080j = (TextView) view.findViewById(R.id.action_card_denied_text);
        this.f195083m = (AppCompatImageView) view.findViewById(R.id.action_card_denied_icon);
        this.f195084n = (Chip) view.findViewById(R.id.action_card_denied_link);
        this.f195073a.setOnClickListener(new C73779b(this));
        this.f195081k.setOnClickListener(new C73780c(this));
        this.f195084n.setOnClickListener(new C73781d(this));
    }

    /* renamed from: p */
    public final void mo65267p(int i) {
        this.f195073a.setVisibility(0);
        this.f195073a.setText(i);
    }
}
