package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import android.content.Intent;
import android.os.ParcelFileDescriptor;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.aiai.AiAiSession$intent$1", mo61344c = "AiAiSession.kt", mo61345d = "invokeSuspend", mo61346e = {108})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.bj */
/* compiled from: PG */
final class C125219bj extends C69572j implements C69626l {

    /* renamed from: a */
    int f345402a;

    /* renamed from: b */
    final /* synthetic */ C125234by f345403b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125219bj(C125234by byVar, C69577g gVar) {
        super(1, gVar);
        this.f345403b = byVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C125219bj(this.f345403b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f345402a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C125243cg cgVar = this.f345403b.f345464j;
            this.f345402a = 1;
            obj = cgVar.mo106875b(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            C125234by byVar = this.f345403b;
            C125258n nVar = byVar.f345456b;
            ParcelFileDescriptor a = byVar.mo106853a();
            C69664n.m101061g(a, "audioPfd");
            Intent putExtra = nVar.mo106884a().putExtra("android.speech.extra.MASK_OFFENSIVE_WORDS", nVar.f345548b).putExtra("android.speech.extra.SEGMENTED_SESSION", "android.speech.extra.AUDIO_SOURCE").putExtra("calling_package", "com.google.android.googlequicksearchbox");
            C69664n.m101060f(putExtra, "toCommonIntent()\n      .…CKAGE, AGSA_PACKAGE_NAME)");
            Intent putExtra2 = putExtra.putExtra("android.speech.extra.AUDIO_SOURCE", a);
            C69664n.m101060f(putExtra2, "toAndroidTIntent().putEx…A_AUDIO_SOURCE, audioPfd)");
            return putExtra2;
        }
        C125234by byVar2 = this.f345403b;
        C125258n nVar2 = byVar2.f345456b;
        ParcelFileDescriptor a2 = byVar2.mo106853a();
        C69664n.m101061g(a2, "audioPfd");
        Intent putExtra3 = nVar2.mo106884a().putExtra("com.google.recognition.extra.AUDIO_SOURCE", a2).putExtra("com.google.recognition.extra.MASK_OFFENSIVE_WORDS", nVar2.f345548b);
        C69664n.m101060f(putExtra3, "toCommonIntent()\n      .…ORDS, maskOffensiveWords)");
        return putExtra3;
    }
}
