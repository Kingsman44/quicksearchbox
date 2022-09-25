package com.google.android.apps.gsa.staticplugins.opa.apa.migration;

import android.content.Context;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108237bh;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9877f.p9878a.C130266a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28293k;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class ChatUiFragmentElement extends C108232bc implements C2376g {

    /* renamed from: a */
    ViewGroup f298405a;

    /* renamed from: b */
    private final C0167am f298406b;

    /* renamed from: c */
    private final Context f298407c;

    /* renamed from: d */
    private final Fragment f298408d;

    /* renamed from: e */
    private Optional f298409e = Optional.empty();

    public ChatUiFragmentElement(Context context, C0167am amVar, Fragment fragment) {
        super((byte[]) null);
        this.f298407c = context;
        this.f298406b = amVar;
        this.f298408d = fragment;
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 0;
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        this.f298409e.ifPresent(C107215b.f298411a);
    }

    /* renamed from: gW */
    public final void mo3521gW(C2391v vVar) {
        this.f298409e.ifPresent(C107217d.f298413a);
        this.f298406b.getLifecycle().mo5791c(this);
    }

    /* renamed from: gX */
    public final void mo3522gX(C2391v vVar) {
        this.f298409e.ifPresent(C107218e.f298414a);
    }

    /* renamed from: gY */
    public final void mo3523gY(C2391v vVar) {
        this.f298409e.ifPresent(C107214a.f298410a);
    }

    /* renamed from: gZ */
    public final void mo3524gZ(C2391v vVar) {
        this.f298409e.ifPresent(C107219f.f298415a);
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 34;
    }

    /* renamed from: ha */
    public final void mo3525ha(C2391v vVar) {
        this.f298409e.ifPresent(C107216c.f298412a);
    }

    /* renamed from: i */
    public final C28293k mo95831i() {
        return null;
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        if (this.f298409e.isEmpty()) {
            this.f298405a = (ViewGroup) LayoutInflater.from(this.f298407c).inflate(R.layout.chatui_fragment, (ViewGroup) null);
            Window window = this.f298406b.getWindow();
            ViewGroup viewGroup = this.f298405a;
            viewGroup.getClass();
            C130266a aVar = new C130266a();
            aVar.mo51130t(window, viewGroup, viewGroup.getContext());
            this.f298409e = Optional.m71637of(aVar);
            this.f298406b.getLifecycle().mo5790b(this);
            C0154a aVar2 = new C0154a(((C130266a) this.f298409e.get()).mo51122q());
            aVar2.mo689v(R.id.chatui_fragment_container, this.f298408d, (String) null);
            aVar2.mo509f();
            ViewGroup viewGroup2 = blVar.f301068R;
            ViewGroup viewGroup3 = this.f298405a;
            viewGroup3.getClass();
            viewGroup2.addView(viewGroup3);
        }
    }

    /* renamed from: k */
    public final void mo95833k(C108241bl blVar) {
        blVar.f301068R.removeAllViews();
    }
}
