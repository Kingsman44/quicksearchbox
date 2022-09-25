package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9794a;

import android.content.Intent;
import android.view.View;
import com.google.common.p4526f.C59052c;
import java.net.URISyntaxException;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.a.k */
/* compiled from: PG */
final class C129052k implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C129053l f354538a;

    public C129052k(C129053l lVar) {
        this.f354538a = lVar;
    }

    public final void onClick(View view) {
        ((C59052c) ((C59052c) C129053l.f354539a.mo56224b()).mo56372aa(38097)).mo56386p("CmlCardFragmentPeer: OnClickListener");
        try {
            this.f354538a.f354541c.mo20101f(Intent.parseUri("opa-android://send_feedback", 0));
        } catch (URISyntaxException e) {
            ((C59052c) ((C59052c) ((C59052c) C129053l.f354539a.mo56225c()).mo56382g(e)).mo56372aa(38098)).mo56389s("Error parsing uri [%s]", "opa-android://send_feedback");
        }
    }
}
