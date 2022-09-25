package com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.drltranscription.impl;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.C108801ee;
import com.google.android.apps.search.assistant.libraries.p8984ui.transcription.C119494b;
import com.google.android.apps.search.assistant.libraries.p8984ui.transcription.C119495c;
import java.util.concurrent.CopyOnWriteArraySet;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.drltranscription.impl.a */
/* compiled from: PG */
public final class C128686a {

    /* renamed from: a */
    public final CopyOnWriteArraySet f353748a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private String f353749b = BuildConfig.FLAVOR;

    /* renamed from: a */
    public final void mo108617a(String str) {
        C69664n.m101061g(str, "transcription");
        if (!C69664n.m101066l(this.f353749b, str)) {
            C119494b a = C119495c.m198347a(this.f353749b, str);
            this.f353749b = str;
            for (C108801ee a2 : this.f353748a) {
                String str2 = a.f333096a;
                C69664n.m101060f(str2, "stringStabilityInfo.stable");
                String str3 = a.f333097b;
                C69664n.m101060f(str3, "stringStabilityInfo.unstable");
                a2.mo97171a(str2, str3);
            }
        }
    }

    /* renamed from: b */
    public final void mo108618b(String str) {
        C69664n.m101061g(str, "transcription");
        if (!C69664n.m101066l(this.f353749b, str)) {
            this.f353749b = str;
            for (C108801ee a : this.f353748a) {
                a.mo97171a(str, BuildConfig.FLAVOR);
            }
        }
    }
}
