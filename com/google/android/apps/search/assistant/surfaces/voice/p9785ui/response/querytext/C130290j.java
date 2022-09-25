package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.querytext;

import android.text.TextUtils;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils.C130306d;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import com.google.assistant.p3897e.p3921j.p3922a.C51656n;
import com.google.common.p4526f.C59052c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.querytext.j */
/* compiled from: PG */
public final /* synthetic */ class C130290j implements C46852f {

    /* renamed from: a */
    public final /* synthetic */ C130293m f357146a;

    public /* synthetic */ C130290j(C130293m mVar) {
        this.f357146a = mVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final void mo20961j(Object obj) {
        C130293m mVar = this.f357146a;
        C51656n nVar = (C51656n) obj;
        if (!nVar.f134600b.isEmpty()) {
            if (TextUtils.isEmpty(mVar.mo109628b())) {
                ((C59052c) ((C59052c) C130293m.f357149a.mo56224b()).mo56372aa(38799)).mo56386p("transcription display text is empty.");
            } else if (!mVar.mo109628b().toString().equals(nVar.f134600b)) {
                ((C59052c) ((C59052c) C130293m.f357149a.mo56224b()).mo56372aa(38798)).mo56386p("transcription text does not match HighlightUserQuery argument.");
            } else {
                C69664n.m101061g(nVar, "args");
                mVar.mo109630d(C130306d.m212747a(nVar, false));
            }
        }
    }
}
