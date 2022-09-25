package com.google.android.libraries.search.assistant.fluidactions.rendering.p2557b;

import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32973f;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32974g;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32975h;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.b.b */
/* compiled from: PG */
public final class C33186b implements C32974g {

    /* renamed from: a */
    public static final C59071e f88755a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.b.b");

    /* renamed from: b */
    public static final C46690ah f88756b = new C46885y("FA_DEVICE_SETTING_DATA_SOURCE_KEY");

    /* renamed from: c */
    public final ConcurrentMap f88757c = new ConcurrentHashMap();

    /* renamed from: d */
    public final Queue f88758d = new ConcurrentLinkedQueue();

    /* renamed from: e */
    public final C32975h f88759e;

    /* renamed from: f */
    public final C46723bg f88760f;

    /* renamed from: g */
    private final C46778cv f88761g;

    public C33186b(C32975h hVar, C46778cv cvVar, C46723bg bgVar) {
        this.f88759e = hVar;
        this.f88761g = cvVar;
        this.f88760f = bgVar;
    }

    /* renamed from: a */
    public final void mo38428a(C32973f fVar) {
        this.f88758d.add(fVar);
        this.f88761g.mo50787a(C60866ct.f164955a, f88756b);
    }
}
