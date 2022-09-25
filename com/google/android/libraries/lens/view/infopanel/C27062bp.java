package com.google.android.libraries.lens.view.infopanel;

import android.content.Intent;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.libraries.lens.view.infopanel.p2142c.C27077d;
import com.google.android.libraries.lens.view.p2078at.C25536s;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.abp;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.lens.view.infopanel.bp */
/* compiled from: PG */
public final /* synthetic */ class C27062bp implements C25536s {

    /* renamed from: a */
    public final /* synthetic */ Fragment f73781a;

    /* renamed from: b */
    public final /* synthetic */ View f73782b;

    public /* synthetic */ C27062bp(Fragment fragment, View view) {
        this.f73781a = fragment;
        this.f73782b = view;
    }

    /* renamed from: a */
    public final boolean mo30290a(int i, Intent intent) {
        Fragment fragment = this.f73781a;
        View view = this.f73782b;
        if (i != -1 || intent == null) {
            return true;
        }
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty() || C58837ba.m90859h(stringArrayListExtra.get(0))) {
            ((C59052c) ((C59052c) C27063bq.f73783a.mo56226d()).mo56372aa(49525)).mo56386p("Received invalid speech recognition results.");
            return true;
        }
        C27077d dVar = new C27077d(stringArrayListExtra.get(0).trim(), abp.SPEECH_TRANSCRIPTION);
        if (fragment != null) {
            C47393f.m84236g(dVar, fragment);
            return true;
        } else if (view != null) {
            C47393f.m84237h(dVar, view);
            return true;
        } else {
            throw new AssertionError("No fragment or view to send event to.");
        }
    }
}
