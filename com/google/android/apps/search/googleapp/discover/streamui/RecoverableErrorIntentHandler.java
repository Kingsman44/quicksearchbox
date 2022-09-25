package com.google.android.apps.search.googleapp.discover.streamui;

import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import androidx.activity.result.C0816c;
import androidx.activity.result.p046a.C0813f;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.search.googleapp.discover.p10181d.C134228q;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134709g;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class RecoverableErrorIntentHandler implements C2376g {

    /* renamed from: a */
    public static final C59071e f366797a = C59071e.m91331h();

    /* renamed from: b */
    public final Fragment f366798b;

    /* renamed from: c */
    public C0816c f366799c;

    /* renamed from: d */
    public C134228q f366800d;

    public RecoverableErrorIntentHandler(Fragment fragment) {
        C69664n.m101061g(fragment, "fragment");
        this.f366798b = fragment;
        fragment.getSavedStateRegistry().mo8585b("RecoverableErrorIntentHandler", new C134922j(this));
    }

    /* renamed from: g */
    public final void mo111888g(C134228q qVar) {
        C47393f.m84236g(new C134709g(qVar), this.f366798b);
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        C0816c cVar;
        Bundle a;
        String string;
        if (!mo111889h()) {
            cVar = null;
        } else {
            cVar = this.f366798b.registerForActivityResult(new C0813f(), new C134923k(this));
        }
        this.f366799c = cVar;
        if (this.f366798b.getSavedStateRegistry().f13079d && (a = this.f366798b.getSavedStateRegistry().mo8584a("RecoverableErrorIntentHandler")) != null && (string = a.getString("intent_in_progress_refresh_reason")) != null) {
            this.f366800d = C134228q.m217796a(string);
        }
    }

    /* renamed from: gW */
    public final void mo3521gW(C2391v vVar) {
        this.f366798b.getSavedStateRegistry().f13076a.mo3498b("RecoverableErrorIntentHandler");
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final void mo3523gY(C2391v vVar) {
        if (!mo111889h()) {
            C134228q qVar = this.f366800d;
            if (qVar != null) {
                mo111888g(qVar);
            }
            this.f366800d = null;
        }
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: h */
    public final boolean mo111889h() {
        return this.f366798b.getActivity() != null;
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
