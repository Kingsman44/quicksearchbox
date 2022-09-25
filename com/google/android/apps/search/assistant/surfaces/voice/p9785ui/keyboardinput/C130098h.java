package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput;

import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128565a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128567c;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.h */
/* compiled from: PG */
public final /* synthetic */ class C130098h implements C69626l {

    /* renamed from: a */
    public final /* synthetic */ View f356733a;

    public /* synthetic */ C130098h(View view) {
        this.f356733a = view;
    }

    /* renamed from: a */
    public final Object mo5761a(Object obj) {
        int i;
        View view = this.f356733a;
        C128565a aVar = (C128565a) obj;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        if (C128567c.m209822e(aVar.f353517a)) {
            i = C128567c.m209818a(aVar.f353517a).f5824e;
        } else {
            i = C128567c.m209820c(aVar.f353517a).f5824e;
        }
        view.setPaddingRelative(paddingStart, paddingTop, paddingEnd, i);
        return C69788q.f186170a;
    }
}
