package com.google.android.apps.gsa.nga.shared.p6309ag;

import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.nga.shared.ag.s */
/* compiled from: PG */
public enum C80624s {
    NEURAL_MATCHING_ENCODER(C80627v.NEURAL_MATCHING_ENCODER, "apa_neural_matching_encoder", "apa_neural_matching_encoder"),
    BLOCK_WORDS(C80627v.BLOCK_WORDS, "apa_block_words", "apa_block_words"),
    CONTACT_NAMES(C80627v.CONTACT_NAMES, "apa_contact", "apa_contact"),
    NGA_TELEPORT(C80627v.TELEPORT, "nga_teleport", "apa_teleport"),
    NGA_QUERY_DEEP_LINKS(C80627v.QUERY_DEEP_LINKS, "nga_query_deep_links", "apa_query_deep_links"),
    NGA_GENIE_FM(C80627v.GENIE_FM, "nga_genie_fm", "apa_genie_fm"),
    NGA_SODA(C80627v.SODA, "nga_soda", "nga_soda"),
    NGA_APP_ACTIONS(C80627v.APP_ACTIONS, "nga_app_actions", "apa_app_actions"),
    WEBREF_MODEL_NGA(C80627v.WEBREF, "webref-model-nga", "webref-model-nga"),
    TEXT_CLASSIFIER(C80627v.TCLIB, "text_classifier", "apa_text_classifier"),
    NGA_CANTEEN(C80627v.CANTEEN, "nga_canteen_03_01", "apa_canteen_03_01"),
    NGA_INTENTS(C80627v.INTENTS, "nga_intents_5", "apa_intents_5"),
    NGA_SKIP_COMPONENT_LIST(C80627v.SKIP_COMPONENT_LIST, "nga_blacklist", "apa_skip_component_list"),
    NGA_CORTEX(C80627v.CORTEX, "nga_cortex_4", "apa_cortex_4"),
    NGA_DICTATION_FORMATTING(C80627v.DICTATION_FORMATTING, "nga_dictation_formatting", "nga_dictation_formatting"),
    NGA_CORRECTIONS_ALTERNATIVES(C80627v.CORRECTIONS_ALTERNATIVES, "apa_corrections", "apa_corrections"),
    SAFT_SEGMENTER(C80627v.SAFT_SEGMENTER, "nga_saft_segmenter", "apa_saft_segmenter"),
    SOT_CONFIGS(C80627v.SOT_CONFIGS, "nga_sot_configs", "nga_sot_configs"),
    NGA_TCLIB_PERSON_NAME(C80627v.TCLIB_PERSON_NAME, "nga_tclib_person_name", "apa_tclib_person_name"),
    NGA_POP(C80627v.POP, "nga_pop", "apa_pop"),
    NGA_WARMACTIONS(C80627v.WARMACTIONS, "apa_warmactions", "apa_warmactions"),
    NGA_TACTILE(C80627v.TACTILE, "apa_tactile", "apa_tactile"),
    NGA_LIGHTWEIGHT_TOKENS(C80627v.LIGHTWEIGHT_TOKENS, "apa_lightweight_tokens", "apa_lightweight_tokens");
    

    /* renamed from: A */
    private static final Map f221305A = null;

    /* renamed from: B */
    private static final Map f221306B = null;

    /* renamed from: C */
    private static final Map f221307C = null;

    /* renamed from: x */
    public final C80627v f221332x;

    /* renamed from: y */
    public final String f221333y;

    /* renamed from: z */
    public final String f221334z;

    static {
        f221305A = new ConcurrentHashMap();
        f221306B = new ConcurrentHashMap();
        f221307C = new ConcurrentHashMap();
    }

    private C80624s(C80627v vVar, String str, String str2) {
        this.f221332x = vVar;
        this.f221333y = str;
        this.f221334z = str2;
    }

    /* renamed from: a */
    public static C80624s m128248a(C80627v vVar) {
        return (C80624s) Map.EL.computeIfAbsent(f221305A, vVar, C80621p.f221302a);
    }

    /* renamed from: b */
    public static Optional m128249b(String str) {
        return Optional.ofNullable((C80624s) Map.EL.computeIfAbsent(f221307C, str, C80620o.f221301a));
    }

    /* renamed from: c */
    public static Optional m128250c(String str) {
        return Optional.ofNullable((C80624s) Map.EL.computeIfAbsent(f221306B, str, C80619n.f221300a));
    }
}
