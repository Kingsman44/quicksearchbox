package com.google.p4242bp.p4257f.p4262c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bp.f.c.b */
/* compiled from: PG */
public enum C56340b implements C62957cd {
    CANDIDATE_SOURCE_UNSPECIFIED(0),
    ENTITY_REPLACEMENTS(1),
    IDENTITY(7),
    PRONOUN_REPLACEMENTS(8),
    CONCATENATION(135),
    ADD_WITH_PREPOSITION(9),
    ADD_TIME(10),
    PHONETIC_REPLACEMENTS(11),
    COMMAND(12),
    COMMAND_PHONETIC(13),
    LOCAL(18),
    INTENT(19),
    TRUSTED_PATTERN(20),
    NEW_TRUSTED_PATTERN(145),
    NOUN_PHRASE_REPLACEMENTS(21),
    PRONOUN_IT_REPLACEMENTS(22),
    MERGED_PRONOUN(83),
    TRANSLATION(24),
    DEDUP(29),
    SEMANTIC_LOCAL(30),
    LIST_DISAMBIGUATION(31),
    REWRITE_TO_OPEN_URL(55),
    VERTICAL_FLIGHTS(36),
    VERTICAL_HOTELS(49),
    VERTICAL_KEROUAC(48),
    VERTICAL_RESTAURANTS(50),
    VERTICAL_WEATHER(37),
    VERTICAL_SPORTS(39),
    VERTICAL_COMMAND(41),
    VERTICAL_MESSAGES(44),
    VERTICAL_MOVIES(45),
    VERTICAL_MOVIES_EXPLORATORY(84),
    VERTICAL_MOVIES_NAVIGATIONAL(75),
    VERTICAL_MUSIC(81),
    VERTICAL_NUTRITION(47),
    VERTICAL_LANGUAGE(59),
    VERTICAL_CALCULATOR(94),
    VERTICAL_PRODUCT(131),
    VERTICAL_GOOGLEBOT(71),
    VERTICAL_NOW_ON_CHAT(16),
    VERTICAL_NOW_ON_CHAT_PERSONALITY(91),
    VERTICAL_LOCAL_EXPLORATORY(77),
    VERTICAL_DIRECTIONS(79),
    VERTICAL_EVENTS(125),
    VERTICAL_SHOPPING(115),
    VERTICAL_PATTERNS(119),
    VERTICAL_HOME_AUTOMATION(120),
    VERTICAL_DEVICE_SETTINGS(133),
    VERTICAL_GLASSES_STANDALONE(146),
    REPEAT(38),
    ALIAS_REPLACEMENT(46),
    HOSPITALITY_ALIAS(137),
    REPEATED_PREFIX_OR_SUFFIX(51),
    QUESTION_SUFFIX(53),
    AGGRESSIVE_QUESTION_SUFFIX(121),
    REFINEMENT(56),
    QUERIES_BY_IMPORTANT_TERMS(57),
    ENTITY_Q2_CONCAT(60),
    SINGLE_QUERY_TRUSTED_PATTERN(61),
    SINGLE_QUERY_QUITE(63),
    SINGLE_QUERY_CONV_TERMS_DROPPING(65),
    SINGLE_QUERY_VERTICAL(66),
    SINGLE_QUERY_VERTICAL_LANGUAGE(88),
    SINGLE_QUERY_VERTICAL_NOW_ON_CHAT(74),
    SINGLE_QUERY_GOOGLEBOT_SUGGESTION(67),
    SINGLE_QUERY_GOOGLEBOT_GRAMMAR(68),
    SINGLE_QUERY_GOOGLEBOT_CANONIC(69),
    SINGLE_QUERY_GOOGLEBOT_VERTICAL(72),
    SINGLE_QUERY_IDENTITY(70),
    SINGLE_QUERY_ASSISTANT_KNOWLEDGE(123),
    SINGLE_QUERY_FAKE_CANDIDATE(126),
    POSSESSIVE_ENTITY_REPLACEMENTS(62),
    GINA_PERSONALITY(64),
    COLLECTION_PROPERTIES(76),
    PRONOUN_REFINEMENT(82),
    DESCRIPTION(116),
    RELATIVE_DATE_NUMBER(118),
    RELATED_ENTITIES(124),
    VERTICAL_ESTUARY(130),
    LOCATION_CONTEXT_NOUN_REPLACEMENT(25),
    LOCATION_CONTEXT_NAME_MATCH(43),
    LOCATION_CONTEXT_PREFIX_SUFFIX_MATCH(26),
    LOCATION_CONTEXT_MANUAL_PATTERN(27),
    LOCATION_CONTEXT_AUTOMATIC_PATTERN(28),
    VERTICAL_ANDROID_TV(136),
    CONVERSATION_RULE(122),
    GPAT(128),
    INTENT_PATTERN(129),
    FAKE_FROM_RATING(150),
    LASERTAGGER(134),
    EDIT5(143),
    GROUNDED_MEENA2(140),
    CONFIDENT_GROUNDED_MEENA2(141),
    QBST_DISAMBIGUATION(138),
    DISAMBIGUATION(142),
    ENTITY_DISAMBIGUATION(144),
    ASR_CORRECTION(139),
    UNRECOGNIZED(-1);
    

    /* renamed from: aU */
    private final int f150267aU;

    private C56340b(int i) {
        this.f150267aU = i;
    }

    /* renamed from: a */
    public static C56340b m87976a(int i) {
        switch (i) {
            case 0:
                return CANDIDATE_SOURCE_UNSPECIFIED;
            case 1:
                return ENTITY_REPLACEMENTS;
            case 7:
                return IDENTITY;
            case 8:
                return PRONOUN_REPLACEMENTS;
            case 9:
                return ADD_WITH_PREPOSITION;
            case 10:
                return ADD_TIME;
            case 11:
                return PHONETIC_REPLACEMENTS;
            case 12:
                return COMMAND;
            case 13:
                return COMMAND_PHONETIC;
            case 16:
                return VERTICAL_NOW_ON_CHAT;
            case 18:
                return LOCAL;
            case 19:
                return INTENT;
            case 20:
                return TRUSTED_PATTERN;
            case 21:
                return NOUN_PHRASE_REPLACEMENTS;
            case 22:
                return PRONOUN_IT_REPLACEMENTS;
            case 24:
                return TRANSLATION;
            case 25:
                return LOCATION_CONTEXT_NOUN_REPLACEMENT;
            case 26:
                return LOCATION_CONTEXT_PREFIX_SUFFIX_MATCH;
            case 27:
                return LOCATION_CONTEXT_MANUAL_PATTERN;
            case 28:
                return LOCATION_CONTEXT_AUTOMATIC_PATTERN;
            case 29:
                return DEDUP;
            case 30:
                return SEMANTIC_LOCAL;
            case 31:
                return LIST_DISAMBIGUATION;
            case 36:
                return VERTICAL_FLIGHTS;
            case 37:
                return VERTICAL_WEATHER;
            case 38:
                return REPEAT;
            case 39:
                return VERTICAL_SPORTS;
            case 41:
                return VERTICAL_COMMAND;
            case 43:
                return LOCATION_CONTEXT_NAME_MATCH;
            case 44:
                return VERTICAL_MESSAGES;
            case 45:
                return VERTICAL_MOVIES;
            case 46:
                return ALIAS_REPLACEMENT;
            case 47:
                return VERTICAL_NUTRITION;
            case 48:
                return VERTICAL_KEROUAC;
            case 49:
                return VERTICAL_HOTELS;
            case 50:
                return VERTICAL_RESTAURANTS;
            case 51:
                return REPEATED_PREFIX_OR_SUFFIX;
            case 53:
                return QUESTION_SUFFIX;
            case 55:
                return REWRITE_TO_OPEN_URL;
            case 56:
                return REFINEMENT;
            case 57:
                return QUERIES_BY_IMPORTANT_TERMS;
            case 59:
                return VERTICAL_LANGUAGE;
            case 60:
                return ENTITY_Q2_CONCAT;
            case 61:
                return SINGLE_QUERY_TRUSTED_PATTERN;
            case 62:
                return POSSESSIVE_ENTITY_REPLACEMENTS;
            case 63:
                return SINGLE_QUERY_QUITE;
            case 64:
                return GINA_PERSONALITY;
            case 65:
                return SINGLE_QUERY_CONV_TERMS_DROPPING;
            case 66:
                return SINGLE_QUERY_VERTICAL;
            case 67:
                return SINGLE_QUERY_GOOGLEBOT_SUGGESTION;
            case 68:
                return SINGLE_QUERY_GOOGLEBOT_GRAMMAR;
            case 69:
                return SINGLE_QUERY_GOOGLEBOT_CANONIC;
            case 70:
                return SINGLE_QUERY_IDENTITY;
            case 71:
                return VERTICAL_GOOGLEBOT;
            case 72:
                return SINGLE_QUERY_GOOGLEBOT_VERTICAL;
            case 74:
                return SINGLE_QUERY_VERTICAL_NOW_ON_CHAT;
            case 75:
                return VERTICAL_MOVIES_NAVIGATIONAL;
            case 76:
                return COLLECTION_PROPERTIES;
            case 77:
                return VERTICAL_LOCAL_EXPLORATORY;
            case 79:
                return VERTICAL_DIRECTIONS;
            case 81:
                return VERTICAL_MUSIC;
            case 82:
                return PRONOUN_REFINEMENT;
            case 83:
                return MERGED_PRONOUN;
            case 84:
                return VERTICAL_MOVIES_EXPLORATORY;
            case 88:
                return SINGLE_QUERY_VERTICAL_LANGUAGE;
            case 91:
                return VERTICAL_NOW_ON_CHAT_PERSONALITY;
            case 94:
                return VERTICAL_CALCULATOR;
            case 115:
                return VERTICAL_SHOPPING;
            case 116:
                return DESCRIPTION;
            case 118:
                return RELATIVE_DATE_NUMBER;
            case 119:
                return VERTICAL_PATTERNS;
            case 120:
                return VERTICAL_HOME_AUTOMATION;
            case 121:
                return AGGRESSIVE_QUESTION_SUFFIX;
            case 122:
                return CONVERSATION_RULE;
            case 123:
                return SINGLE_QUERY_ASSISTANT_KNOWLEDGE;
            case 124:
                return RELATED_ENTITIES;
            case 125:
                return VERTICAL_EVENTS;
            case 126:
                return SINGLE_QUERY_FAKE_CANDIDATE;
            case 128:
                return GPAT;
            case 129:
                return INTENT_PATTERN;
            case 130:
                return VERTICAL_ESTUARY;
            case 131:
                return VERTICAL_PRODUCT;
            case 133:
                return VERTICAL_DEVICE_SETTINGS;
            case 134:
                return LASERTAGGER;
            case 135:
                return CONCATENATION;
            case 136:
                return VERTICAL_ANDROID_TV;
            case 137:
                return HOSPITALITY_ALIAS;
            case 138:
                return QBST_DISAMBIGUATION;
            case 139:
                return ASR_CORRECTION;
            case 140:
                return GROUNDED_MEENA2;
            case 141:
                return CONFIDENT_GROUNDED_MEENA2;
            case 142:
                return DISAMBIGUATION;
            case 143:
                return EDIT5;
            case 144:
                return ENTITY_DISAMBIGUATION;
            case 145:
                return NEW_TRUSTED_PATTERN;
            case 146:
                return VERTICAL_GLASSES_STANDALONE;
            case 150:
                return FAKE_FROM_RATING;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87977b() {
        return C56329a.f150147a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f150267aU;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
