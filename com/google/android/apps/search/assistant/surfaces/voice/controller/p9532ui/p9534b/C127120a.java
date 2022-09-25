package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119785ag;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129566ah;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.apps.tiktok.dataservice.local.C46855i;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.a */
/* compiled from: PG */
public interface C127120a {

    /* renamed from: a */
    public static final C46690ah f350019a = new C46885y("ConversationDataService.TRANSCRIPTION");

    /* renamed from: b */
    public static final C46690ah f350020b = new C46885y("ConversationDataService.STATE");

    /* renamed from: c */
    public static final C46690ah f350021c = new C46885y("ConversationDataService.AUDIO_LEVEL_KEY");

    /* renamed from: d */
    public static final C46690ah f350022d = new C46885y("ConversationDataService.INTERACTION_RESULT_KEY");

    /* renamed from: e */
    public static final C46690ah f350023e = new C46885y("ConversationDataService.ERRORDATA_KEY");

    static {
        new C46885y("ConversationDataService.CLIENT_OP");
    }

    /* renamed from: a */
    C119785ag mo107942a();

    /* renamed from: b */
    C46851e mo107943b();

    /* renamed from: c */
    C46851e mo107944c();

    /* renamed from: d */
    C46851e mo107945d();

    /* renamed from: e */
    void mo107946e(int i, Consumer consumer, Consumer consumer2);

    /* renamed from: f */
    void mo107947f(C46855i iVar, int i, C129566ah ahVar);
}
