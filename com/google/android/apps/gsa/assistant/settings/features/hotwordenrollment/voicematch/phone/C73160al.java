package com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.voicematch.phone;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.settingsui.hotword.C92591at;
import com.google.android.apps.gsa.speech.settingsui.hotword.C92617l;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92597d;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92558k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.voicematch.phone.al */
/* compiled from: PG */
public final class C73160al extends e {

    /* renamed from: a */
    public C69464a f193934a;

    /* renamed from: b */
    public C92558k f193935b;

    /* renamed from: c */
    public C92617l f193936c;

    /* renamed from: d */
    public C92597d f193937d;

    /* renamed from: e */
    public C86124t f193938e;

    /* renamed from: f */
    public C92591at f193939f;

    /* renamed from: g */
    public C89994f f193940g;

    /* renamed from: h */
    ad f193941h;

    /* renamed from: i */
    ad f193942i;

    /* renamed from: j */
    public ItemView f193943j;

    /* renamed from: k */
    private PreferenceInterfaces f193944k;

    /* renamed from: l */
    private ItemView f193945l;

    /* renamed from: m */
    private ItemView f193946m;

    /* renamed from: n */
    private ItemView f193947n;

    /* renamed from: o */
    private ItemView f193948o;

    /* renamed from: p */
    private TextView f193949p;

    /* renamed from: q */
    private FrameLayout f193950q;

    /* renamed from: e */
    private final void m107874e() {
        boolean z = this.f193941h.d;
        C58976aa aaVar = C58975e.f156826a;
        int i = 0;
        this.f193946m.setVisibility(true != z ? 8 : 0);
        if (z) {
            boolean e = this.f193938e.mo79746e(C90082eg.f249943bF);
            this.f193946m.setVisibility(true != e ? 0 : 8);
            ItemView itemView = this.f193947n;
            if (true != e) {
                i = 8;
            }
            itemView.setVisibility(i);
            this.f193948o.setVisibility(i);
            this.f193949p.setVisibility(i);
            this.f193950q.setVisibility(i);
            return;
        }
        this.f193946m.setVisibility(8);
        this.f193947n.setVisibility(8);
        this.f193948o.setVisibility(8);
        this.f193949p.setVisibility(8);
        this.f193950q.setVisibility(8);
    }

    /* renamed from: d */
    public final void mo64752d() {
        PreferenceInterfaces.c(this.f193945l, this.f193941h);
        m107874e();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        mo64752d();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.voicematch.phone.al, android.support.v4.app.Fragment, com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.voicematch.phone.e] */
    public final void onCreate(Bundle bundle) {
        C73160al.super.onCreate(bundle);
        this.f193944k = new PreferenceInterfaces(getLifecycle());
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.voicematch.phone.al.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final android.view.View onCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.voicematch.phone.al.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.voicematch.phone.C73160al.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        C73160al.super.onDestroy();
        this.f193937d.mo87371e();
    }
}
