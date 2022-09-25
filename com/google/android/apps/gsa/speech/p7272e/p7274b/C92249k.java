package com.google.android.apps.gsa.speech.p7272e.p7274b;

import java.io.File;

/* renamed from: com.google.android.apps.gsa.speech.e.b.k */
/* compiled from: PG */
public enum C92249k {
    NO_GRAMMAR("all", false, C92252n.GRAMMAR, C92252n.COMPILER, 0),
    CONTACT_DIALING("contacts", true, C92252n.GRAMMAR, C92252n.COMPILER, 0),
    HANDS_FREE_COMMANDS("hands_free_commands", false, C92252n.GRAMMAR, C92252n.COMPILER, 0),
    CONTACT_NAMES("contact_names", false, C92252n.VOICE_ACTIONS, C92252n.VOICE_ACTIONS_COMPILER, 0),
    MUSIC_NAMES("music_names", false, C92252n.VOICE_ACTIONS, C92252n.VOICE_ACTIONS_COMPILER, 209),
    APP_NAMES("app_names", false, C92252n.VOICE_ACTIONS, C92252n.VOICE_ACTIONS_COMPILER, 209),
    LOCAL_NAMES("local_names", false, C92252n.VOICE_ACTIONS, C92252n.VOICE_ACTIONS_COMPILER, 400);
    

    /* renamed from: h */
    public static final int f257207h = 0;

    /* renamed from: i */
    public final String f257209i;

    /* renamed from: j */
    public final boolean f257210j;

    /* renamed from: k */
    public final C92252n f257211k;

    /* renamed from: l */
    public final C92252n f257212l;

    /* renamed from: m */
    public final int f257213m;

    static {
        f257207h = values().length;
    }

    private C92249k(String str, boolean z, C92252n nVar, C92252n nVar2, int i) {
        this.f257209i = str;
        this.f257210j = z;
        this.f257211k = nVar;
        this.f257212l = nVar2;
        this.f257213m = i;
    }

    /* renamed from: a */
    public static C92249k m151476a(String str) {
        for (C92249k kVar : values()) {
            if (kVar.f257209i.equals(str)) {
                return kVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C92249k m151477b(File file) {
        return m151476a(file.getName());
    }
}
