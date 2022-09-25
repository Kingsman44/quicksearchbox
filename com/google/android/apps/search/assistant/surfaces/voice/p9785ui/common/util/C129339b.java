package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.util;

import android.view.View;
import com.google.apps.tiktok.tracing.C47589cm;
import com.google.apps.tiktok.tracing.C47770dh;
import java.util.ArrayList;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.util.b */
/* compiled from: PG */
public final class C129339b {
    /* renamed from: a */
    public static final void m211160a(View view, View.OnLayoutChangeListener onLayoutChangeListener, C47770dh dhVar) {
        C69664n.m101061g(view, "<this>");
        C69664n.m101061g(dhVar, "traceCreation");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C47589cm(dhVar, new C129338a(arrayList, onLayoutChangeListener)));
        view.addOnLayoutChangeListener((View.OnLayoutChangeListener) arrayList.get(0));
    }
}
