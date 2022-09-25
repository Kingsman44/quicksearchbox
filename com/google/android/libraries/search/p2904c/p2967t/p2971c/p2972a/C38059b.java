package com.google.android.libraries.search.p2904c.p2967t.p2971c.p2972a;

import android.media.AudioManager;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.t.c.a.b */
/* compiled from: PG */
final class C38059b extends AudioManager.AudioRecordingCallback {

    /* renamed from: a */
    final /* synthetic */ C38070m f100841a;

    public C38059b(C38070m mVar) {
        this.f100841a = mVar;
    }

    public final void onRecordingConfigChanged(List list) {
        C69664n.m101061g(list, "configs");
        C59052c cVar = (C59052c) C38070m.f100861a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "ALT.MicStateReporter");
        int size = list.size();
        cVar.mo56379ah(new C59094n(52947));
        cVar.mo56387q("#audio# on new audio recording configuration, total(%d)", size);
        C38070m mVar = this.f100841a;
        mVar.mo41237h(mVar.f100866f, "failed processing onRecordingConfigChanged", new C38058a(mVar, list, (C69577g) null));
    }
}
