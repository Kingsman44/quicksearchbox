package com.google.android.libraries.search.p2871b.p2872a.p2884l;

import com.google.android.libraries.search.p2871b.p2890e.C37234c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p5189s.p5190a.p5191a.p5192a.p5193a.p5194a.C66419b;

/* renamed from: com.google.android.libraries.search.b.a.l.c */
/* compiled from: PG */
public enum C37208c implements C37234c {
    FLOW_TYPE_UNKNOWN(0, 1, C58836b.f156633a),
    NONE(1, 1, C58836b.f156633a),
    TRANSCRIPTION_INTENT_API(101, 1, C58836b.f156633a),
    TRANSCRIPTION_RECOGNITION_SERVICE(102, 1, C58836b.f156633a),
    TRANSCRIPTION_VOICE_IME(103, 1, C58836b.f156633a),
    BACKGROUND_SYNC(104, 100, C58836b.f156633a),
    INTENT_DOWNLOAD_LANGUAGE(105, 1, C58836b.f156633a),
    INTENT_GET_LANGUAGE_DETAILS(106, 1, C58836b.f156633a),
    SETTINGS_DOWNLOAD_CONDITION(107, 1, C58836b.f156633a),
    SETTINGS_LOAD_AVAILABLE_PACK_LIST(108, 1, C58836b.f156633a),
    SETTINGS_LOAD_DOWNLOADED_PACK_LIST(109, 1, C58836b.f156633a),
    SETTINGS_PACK_DIALOG(110, 1, C58836b.f156633a);
    

    /* renamed from: n */
    private final int f98820n;

    /* renamed from: o */
    private final C58833ax f98821o;

    /* renamed from: p */
    private final int f98822p;

    private C37208c(int i, int i2, C58833ax axVar) {
        this.f98820n = i;
        C66419b bVar = C66419b.UNKNOWN;
        this.f98821o = axVar;
        this.f98822p = i2;
    }

    /* renamed from: a */
    public final int mo40693a() {
        return this.f98822p;
    }

    /* renamed from: b */
    public final int mo40694b() {
        return this.f98820n;
    }

    /* renamed from: c */
    public final C58833ax mo40695c() {
        return this.f98821o;
    }
}
