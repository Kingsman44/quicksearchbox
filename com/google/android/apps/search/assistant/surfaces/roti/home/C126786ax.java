package com.google.android.apps.search.assistant.surfaces.roti.home;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119785ag;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119885dz;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.local.C46851e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.ax */
/* compiled from: PG */
public final class C126786ax implements C126781as {

    /* renamed from: a */
    public static final C46690ah f349146a = new C46885y("ConversationDataService.Transcription");

    /* renamed from: b */
    public static final C46690ah f349147b = new C46885y("ConversationDataService.AssistantState");

    /* renamed from: c */
    public static final C46690ah f349148c = new C46885y("ConversationDataService.ConnectionError");

    /* renamed from: d */
    public static final C46690ah f349149d = new C46885y("ConversationDataService.AudioLevel");

    /* renamed from: e */
    public final C46778cv f349150e;

    /* renamed from: f */
    public final AtomicReference f349151f = new AtomicReference(C119904w.f333909c);

    /* renamed from: g */
    public final AtomicReference f349152g = new AtomicReference(C119885dz.f333865f);

    /* renamed from: h */
    public final AtomicReference f349153h = new AtomicReference();

    /* renamed from: i */
    public final AtomicReference f349154i = new AtomicReference(C119785ag.f333648b);

    public C126786ax(C46778cv cvVar) {
        this.f349150e = cvVar;
    }

    /* renamed from: a */
    public final C46851e mo107780a() {
        return new C126782at(this);
    }

    /* renamed from: b */
    public final C46851e mo107781b() {
        return new C126785aw(this);
    }

    /* renamed from: c */
    public final C46851e mo107782c() {
        return new C126784av(this);
    }

    /* renamed from: d */
    public final C46851e mo107783d() {
        return new C126783au(this);
    }
}
