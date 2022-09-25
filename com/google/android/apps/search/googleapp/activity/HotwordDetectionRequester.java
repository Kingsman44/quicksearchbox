package com.google.android.apps.search.googleapp.activity;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* compiled from: PG */
public final class HotwordDetectionRequester implements C2376g {

    /* renamed from: b */
    private static final C59071e f363417b = C59071e.m91332i("com.google.android.apps.search.googleapp.activity.HotwordDetectionRequester");

    /* renamed from: a */
    public Object f363418a;

    /* renamed from: c */
    private final Context f363419c;

    /* renamed from: d */
    private boolean f363420d;

    public HotwordDetectionRequester(Context context) {
        this.f363419c = context;
    }

    /* renamed from: g */
    public final void mo111108g() {
        if (!this.f363420d) {
            this.f363420d = true;
            ((C59052c) ((C59052c) f363417b.mo56224b()).mo56372aa(40050)).mo56386p("Sending broadcast to start hotword detection.");
            this.f363419c.sendOrderedBroadcast(new Intent("com.google.android.googlequicksearchbox.START_HOTWORD").setPackage("com.google.android.googlequicksearchbox"), "android.permission.MANAGE_VOICE_KEYPHRASES");
        }
    }

    /* renamed from: gV */
    public final /* synthetic */ void mo3520gV(C2391v vVar) {
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final void mo3522gX(C2391v vVar) {
        C19559g.m37304c();
        if (this.f363420d) {
            this.f363420d = false;
            ((C59052c) ((C59052c) f363417b.mo56224b()).mo56372aa(40051)).mo56386p("Sending broadcast to stop hotword detection.");
            this.f363419c.sendOrderedBroadcast(new Intent("com.google.android.googlequicksearchbox.STOP_HOTWORD").setPackage("com.google.android.googlequicksearchbox"), "android.permission.MANAGE_VOICE_KEYPHRASES");
        }
    }

    /* renamed from: gY */
    public final void mo3523gY(C2391v vVar) {
        C19559g.m37304c();
        if (this.f363418a != null) {
            mo111108g();
        }
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
