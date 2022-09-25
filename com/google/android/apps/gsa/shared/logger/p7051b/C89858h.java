package com.google.android.apps.gsa.shared.logger.p7051b;

import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.logger.b.h */
/* compiled from: PG */
public final class C89858h {

    /* renamed from: a */
    private static final Map f246211a = m146306d();

    /* renamed from: a */
    public static C58528ij m146303a(C89849ae aeVar) {
        C89875y yVar = (C89875y) f246211a.get(aeVar);
        if (yVar == null) {
            return C58733pz.f156496a;
        }
        C58526ih C = C58528ij.m90003C(yVar.f246241b.length);
        for (C89849ae g : yVar.f246241b) {
            C.mo55373c(g);
        }
        return C.mo55486f();
    }

    /* renamed from: b */
    public static boolean m146304b(C89849ae aeVar) {
        C89875y yVar = (C89875y) f246211a.get(aeVar);
        return yVar != null && yVar.f246241b.length > 0;
    }

    /* renamed from: c */
    public static boolean m146305c(C89849ae aeVar) {
        C89875y yVar = (C89875y) f246211a.get(aeVar);
        return yVar != null && yVar.f246240a.length > 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.util.HashMap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Map m146306d() {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 1796(0x704, float:2.517E-42)
            r0.<init>(r1)
            r1 = 5
            com.google.android.apps.gsa.shared.logger.b.ae[] r2 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r1]
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SHORTCUTS_CONFIRMATION_PAGE_EXPLORE_CLICKED
            r4 = 0
            r2[r4] = r3
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_DEEPLINK_START
            r5 = 1
            r2[r5] = r3
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_NOTIFICATION_SHORTCUT_SAVE_CLICKED
            r7 = 2
            r2[r7] = r6
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_NOTIFICATION_SHORTCUT_VIEW_CLICKED
            r9 = 3
            r2[r9] = r8
            com.google.android.apps.gsa.shared.logger.b.ae r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SETTINGS_START
            r11 = 4
            r2[r11] = r10
            r12 = 12
            com.google.android.apps.gsa.shared.logger.b.ae[] r13 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            com.google.android.apps.gsa.shared.logger.b.ae r14 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SHORTCUTS_CONFIRMATION_PAGE_EXPLORE_CLICKED
            r13[r4] = r14
            r13[r5] = r3
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SETTINGS_UPDATE_CLICKED
            r13[r7] = r3
            r13[r9] = r6
            r13[r11] = r8
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_OVERLAY_SHORTCUT_SAVE_CLICKED
            r13[r1] = r6
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_OVERLAY_SHORTCUT_RETRY_CLICKED
            r14 = 6
            r13[r14] = r8
            com.google.android.apps.gsa.shared.logger.b.ae r15 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SETTINGS_QUICK_SAVE_CLICKED
            r12 = 7
            r13[r12] = r15
            com.google.android.apps.gsa.shared.logger.b.ae r17 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SETTINGS_SAVE_CLICKED
            r12 = 8
            r13[r12] = r17
            r14 = 9
            r13[r14] = r10
            com.google.android.apps.gsa.shared.logger.b.ae r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SETTINGS_DELETE_CLICKED
            r14 = 10
            r13[r14] = r10
            com.google.android.apps.gsa.shared.logger.b.ae r21 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SETTINGS_UNDO_CLICKED
            r22 = 11
            r13[r22] = r21
            com.google.android.apps.gsa.shared.logger.b.ae[] r14 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            com.google.android.apps.gsa.shared.logger.b.ae r24 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACITONS_INTENT_SHORTCUTS_CREATION_START
            r14[r4] = r24
            r14[r5] = r6
            r14[r7] = r8
            r14[r9] = r15
            r14[r11] = r17
            r14[r1] = r3
            r3 = 6
            r14[r3] = r10
            r3 = 7
            r14[r3] = r21
            com.google.android.apps.gsa.shared.logger.b.ae[] r3 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r7]
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_DIRECTORY_CATEGORY_PAGE_CREATE
            r3[r4] = r6
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_DIRECTORY_CATEGORY_PAGE_RETRY
            r3[r5] = r6
            com.google.android.apps.gsa.shared.logger.b.ae[] r6 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r7]
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_DIRECTORY_APP_DETAILS_PAGE_CREATE
            r6[r4] = r8
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_DIRECTORY_APP_DETAILS_PAGE_RETRY
            r6[r5] = r8
            com.google.android.apps.gsa.shared.logger.b.ae[] r8 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r7]
            com.google.android.apps.gsa.shared.logger.b.ae r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_DIRECTORY_HOME_PAGE_CREATE
            r8[r4] = r10
            com.google.android.apps.gsa.shared.logger.b.ae r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_DIRECTORY_HOME_PAGE_RETRY
            r8[r5] = r10
            com.google.android.apps.gsa.shared.logger.b.ag[] r10 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r7]
            com.google.android.apps.gsa.shared.logger.b.ag r15 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_ROUTINE_EMBEDDED
            r10[r4] = r15
            com.google.android.apps.gsa.shared.logger.b.ag r15 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_EMBEDDED
            r10[r5] = r15
            r12 = 34
            com.google.android.apps.gsa.shared.logger.b.ae[] r12 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            com.google.android.apps.gsa.shared.logger.b.ae r21 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_PTT_BUTTON
            r12[r4] = r21
            com.google.android.apps.gsa.shared.logger.b.ae r24 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_UNCLEAR
            r12[r5] = r24
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_DEBUG_QUERY
            r12[r7] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r26 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_SUGGESTIONS_MIC
            r12[r9] = r26
            com.google.android.apps.gsa.shared.logger.b.ae r27 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_SUGGESTIONS_TEXT
            r12[r11] = r27
            com.google.android.apps.gsa.shared.logger.b.ae r28 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_ON_SCREEN_MIC
            r12[r1] = r28
            com.google.android.apps.gsa.shared.logger.b.ae r29 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_MESSAGE_NOTIFICATION
            r19 = 6
            r12[r19] = r29
            com.google.android.apps.gsa.shared.logger.b.ae r30 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_HOTWORD
            r18 = 7
            r12[r18] = r30
            com.google.android.apps.gsa.shared.logger.b.ae r31 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_TAP_ASSISTANT_APP_ICON
            r17 = 8
            r12[r17] = r31
            com.google.android.apps.gsa.shared.logger.b.ae r32 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_WIRED_HEADSET_BUTTON
            r20 = 9
            r12[r20] = r32
            com.google.android.apps.gsa.shared.logger.b.ae r33 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_ACTION_V2_FOLLOW_ON_QUERY_COMMIT
            r23 = 10
            r12[r23] = r33
            com.google.android.apps.gsa.shared.logger.b.ae r34 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_MIC_OPEN_FOR_FOLLOW_ON
            r12[r22] = r34
            com.google.android.apps.gsa.shared.logger.b.ae r35 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_PTT_BUTTON
            r16 = 12
            r12[r16] = r35
            com.google.android.apps.gsa.shared.logger.b.ae r36 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_ON_SCREEN_MIC
            r1 = 13
            r12[r1] = r36
            com.google.android.apps.gsa.shared.logger.b.ae r38 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_MESSAGE_NOTIFICATION
            r1 = 14
            r12[r1] = r38
            com.google.android.apps.gsa.shared.logger.b.ae r40 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_HOTWORD
            r1 = 15
            r12[r1] = r40
            com.google.android.apps.gsa.shared.logger.b.ae r42 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_BY_OTHER_APP
            r43 = 16
            r12[r43] = r42
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_ACTION_V2_FOLLOW_ON_QUERY_COMMIT
            r11 = 17
            r12[r11] = r1
            com.google.android.apps.gsa.shared.logger.b.ae r46 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_MIC_OPEN_FOR_FOLLOW_ON
            r47 = 18
            r12[r47] = r46
            com.google.android.apps.gsa.shared.logger.b.ae r48 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_MEDIA_RECOMMENDATION
            r11 = 19
            r12[r11] = r48
            com.google.android.apps.gsa.shared.logger.b.ae r50 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_IMMERSIVE_UI_FOLLOW_ON
            r51 = 20
            r12[r51] = r50
            com.google.android.apps.gsa.shared.logger.b.ae r52 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_TAP_DIALER_NUDGE
            r53 = 21
            r12[r53] = r52
            com.google.android.apps.gsa.shared.logger.b.ae r54 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_ENTRYPOINT_UNKNOWN
            r55 = 22
            r12[r55] = r54
            com.google.android.apps.gsa.shared.logger.b.ae r55 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_ASSISTANT_SUGGESTION
            r56 = 23
            r12[r56] = r55
            com.google.android.apps.gsa.shared.logger.b.ae r56 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_AUTO_SUGGESTION_CHIP
            r57 = 24
            r12[r57] = r56
            com.google.android.apps.gsa.shared.logger.b.ae r57 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_TNG_IMMERSIVES
            r58 = 25
            r12[r58] = r57
            r58 = 26
            com.google.android.apps.gsa.shared.logger.b.ae r59 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAV_START_ON_SCREEN_MIC
            r12[r58] = r59
            r58 = 27
            com.google.android.apps.gsa.shared.logger.b.ae r59 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAV_START_BLUETOOTH
            r12[r58] = r59
            r58 = 28
            com.google.android.apps.gsa.shared.logger.b.ae r59 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAV_START_MESSAGE_NOTIFICATION
            r12[r58] = r59
            r58 = 29
            com.google.android.apps.gsa.shared.logger.b.ae r59 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAV_START_HOTWORD
            r12[r58] = r59
            r58 = 30
            com.google.android.apps.gsa.shared.logger.b.ae r59 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAV_START_PROXY_VOICE_BUTTON
            r12[r58] = r59
            r58 = 31
            com.google.android.apps.gsa.shared.logger.b.ae r59 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAV_START_WIRED_HEADSET_BUTTON
            r12[r58] = r59
            r58 = 32
            com.google.android.apps.gsa.shared.logger.b.ae r59 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAV_START_ACTION_V2_FOLLOW_ON_QUERY_COMMIT
            r12[r58] = r59
            r58 = 33
            com.google.android.apps.gsa.shared.logger.b.ae r59 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAV_START_MIC_OPEN_FOR_FOLLOW_ON
            r12[r58] = r59
            r11 = 26
            com.google.android.apps.gsa.shared.logger.b.ae[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r11]
            r11[r4] = r21
            r11[r5] = r24
            r11[r7] = r25
            r11[r9] = r26
            r24 = 4
            r11[r24] = r27
            r24 = 5
            r11[r24] = r28
            r19 = 6
            r11[r19] = r29
            r18 = 7
            r11[r18] = r30
            r17 = 8
            r11[r17] = r31
            r20 = 9
            r11[r20] = r32
            r23 = 10
            r11[r23] = r33
            r11[r22] = r34
            r16 = 12
            r11[r16] = r35
            r24 = 13
            r11[r24] = r36
            r24 = 14
            r11[r24] = r38
            r24 = 15
            r11[r24] = r40
            r11[r43] = r42
            r24 = 17
            r11[r24] = r1
            r11[r47] = r46
            r24 = 19
            r11[r24] = r48
            r11[r51] = r50
            r11[r53] = r52
            r24 = 22
            r11[r24] = r54
            r24 = 23
            r11[r24] = r55
            r24 = 24
            r11[r24] = r56
            r24 = 25
            r11[r24] = r57
            com.google.android.apps.gsa.shared.logger.b.ag[] r9 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r7]
            com.google.android.apps.gsa.shared.logger.b.ag r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_PROJECTED
            r9[r4] = r25
            com.google.android.apps.gsa.shared.logger.b.ag r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_ROUTINE_PROJECTED
            r9[r5] = r25
            r46 = r11
            r7 = 15
            com.google.android.apps.gsa.shared.logger.b.ae[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r7]
            r11[r4] = r55
            r11[r5] = r21
            r7 = 2
            r11[r7] = r28
            r7 = 3
            r11[r7] = r29
            r7 = 4
            r11[r7] = r30
            r7 = 5
            r11[r7] = r31
            r7 = 6
            r11[r7] = r48
            r7 = 7
            r11[r7] = r32
            r7 = 8
            r11[r7] = r33
            r7 = 9
            r11[r7] = r34
            r7 = 10
            r11[r7] = r50
            r11[r22] = r56
            r7 = 12
            r11[r7] = r57
            r7 = 13
            r11[r7] = r52
            r7 = 14
            r11[r7] = r54
            r7 = 2
            com.google.android.apps.gsa.shared.logger.b.ae[] r5 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r7]
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_CONTACTS_UNCHANGED
            r5[r4] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_SUCCEEDED
            r33 = 1
            r5[r33] = r25
            r34 = r11
            com.google.android.apps.gsa.shared.logger.b.ag[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r7]
            com.google.android.apps.gsa.shared.logger.b.ag r48 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.TTS_PLAYED_ENDSTATE
            r11[r4] = r48
            com.google.android.apps.gsa.shared.logger.b.ag r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_SOUND_SEARCH
            r11[r33] = r25
            r50 = r11
            com.google.android.apps.gsa.shared.logger.b.ae[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r7]
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.BACKGROUND_RETRY_IMPLICIT_OPTIN
            r11[r4] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.BACKGROUND_RETRY_EXPLICIT_OPTIN
            r11[r33] = r25
            r52 = r11
            com.google.android.apps.gsa.shared.logger.b.ae[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r7]
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_ENROLLMENT_START
            r11[r4] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_ENROLLMENT_START_OOBE
            r11[r33] = r25
            r55 = r11
            com.google.android.apps.gsa.shared.logger.b.ae[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r7]
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTSAUCE_SETTINGS_CENTRAL_START_FROM_ADJUST_MORE
            r11[r4] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTSAUCE_SETTINGS_CENTRAL_START
            r11[r33] = r25
            r56 = r11
            r7 = 3
            com.google.android.apps.gsa.shared.logger.b.ae[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r7]
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_MODEL_DOWNLOAD_REQUEST
            r11[r4] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_MODEL_DOWNLOAD_CONFIG_CHANGE_DETECTED
            r11[r33] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_MODEL_DOWNLOAD_REQUEST_PHONE_LOCALE_ONLY
            r25 = 2
            r11[r25] = r7
            r57 = r11
            r7 = 5
            com.google.android.apps.gsa.shared.logger.b.ae[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r7]
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_TRUSTED_DSP_TRIGGERED
            r11[r4] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_TRUSTED_NON_DSP_TRIGGERED
            r11[r33] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_BISTO_DSP_TRIGGERED
            r11[r25] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_DSP_TRIGGERED
            r4 = 3
            r11[r4] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_NON_DSP_TRIGGERED
            r24 = 4
            r11[r24] = r7
            com.google.android.apps.gsa.shared.logger.b.ae[] r7 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r4]
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.STATE_RECEIVED_HOTWORD_FROM_INTERACTOR
            r59 = 0
            r7[r59] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.STATE_RECEIVED_HOTWORD_FROM_INTERACTOR_FOR_NOTE4
            r7[r33] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_TRIGGERED_IN_SEARCHSERVICE
            r7[r25] = r4
            r60 = r7
            r4 = 8
            com.google.android.apps.gsa.shared.logger.b.ae[] r7 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r4]
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NOW_CARD_CLICK_CCT
            r7[r59] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SUGGEST_RESULT_CLICK
            r7[r33] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SRP_RESULT_CLICK_AMP
            r7[r25] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NOW_CARD_CLICK_AMP
            r61 = r11
            r11 = 3
            r7[r11] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SRP_RESULT_CLICK
            r24 = 4
            r7[r24] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPEN_URL_FROM_NOTIFICATION_CLICK
            r24 = 5
            r7[r24] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SRP_RESULT_CLICK
            r19 = 6
            r7[r19] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NAVIGATION_AFTER_BROWSER_FIRST_RUN_EXPERIENCE
            r18 = 7
            r7[r18] = r4
            com.google.android.apps.gsa.shared.logger.b.ae[] r4 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r11]
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_DEVICE_REFRESH_BUTTON
            r59 = 0
            r4[r59] = r11
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_DEVICE_REFRESH_AUTO_REFRESH
            r33 = 1
            r4[r33] = r11
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_DEVICE_REFRESH_ZERO_STATE
            r62 = r7
            r7 = 2
            r4[r7] = r11
            com.google.android.apps.gsa.shared.logger.b.ag[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r7]
            com.google.android.apps.gsa.shared.logger.b.ag r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_LANDING_PAGE_CLICK
            r11[r59] = r25
            com.google.android.apps.gsa.shared.logger.b.ag r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_LANDING_PAGE_JOURNEY
            r11[r33] = r25
            r63 = r4
            com.google.android.apps.gsa.shared.logger.b.ae[] r4 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r7]
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CCT_TAB_SHOWN
            r4[r59] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CARD_CLICK_CCT
            r4[r33] = r25
            r64 = r4
            r7 = 5
            com.google.android.apps.gsa.shared.logger.b.ae[] r4 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r7]
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_START_REQUESTED
            r4[r59] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r65 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ONBOARDING_SUCCESS
            r4[r33] = r65
            com.google.android.apps.gsa.shared.logger.b.ae r66 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ACCOUNT_MISMATCH_DIALOG_SUCCESS
            r67 = r11
            r11 = 2
            r4[r11] = r66
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_MISSING_START
            r24 = 3
            r4[r24] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r68 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_RESUME_REQUESTED
            r45 = 4
            r4[r45] = r68
            r69 = r4
            com.google.android.apps.gsa.shared.logger.b.ag[] r4 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r11]
            com.google.android.apps.gsa.shared.logger.b.ag r70 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_TAP_INTERACTION
            r4[r59] = r70
            com.google.android.apps.gsa.shared.logger.b.ag r71 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_FRAME_SELECTION_TO_GLEAM_RESPONSE
            r4[r33] = r71
            r71 = r4
            com.google.android.apps.gsa.shared.logger.b.ae[] r4 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r11]
            com.google.android.apps.gsa.shared.logger.b.ae r72 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PREFETCH_EXPIRED
            r4[r59] = r72
            com.google.android.apps.gsa.shared.logger.b.ae r72 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CAMERA_FIRST_FRAME_DISPLAYED
            r4[r33] = r72
            r74 = r4
            r11 = 8
            com.google.android.apps.gsa.shared.logger.b.ag[] r4 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r11]
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_LVF_END_TO_END
            r4[r59] = r11
            com.google.android.apps.gsa.shared.logger.b.ag r75 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_REQUEST_READY_TO_SEND
            r4[r33] = r75
            com.google.android.apps.gsa.shared.logger.b.ag r76 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_STARTUP_CAMERA_REQUESTED
            r77 = r12
            r12 = 2
            r4[r12] = r76
            com.google.android.apps.gsa.shared.logger.b.ag r73 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_STARTUP_ENTRY
            r24 = 3
            r4[r24] = r73
            com.google.android.apps.gsa.shared.logger.b.ag r78 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_STARTUP_BEGIN_IMAGE_PROCESSING_FOR_REQUEST
            r12 = 4
            r4[r12] = r78
            com.google.android.apps.gsa.shared.logger.b.ag r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_STARTUP_FIRST_NETWORK_REQUEST
            r37 = 5
            r4[r37] = r80
            com.google.android.apps.gsa.shared.logger.b.ag r81 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_STARTUP_NETWORK_CONNECTION_REQUESTED
            r19 = 6
            r4[r19] = r81
            com.google.android.apps.gsa.shared.logger.b.ag r82 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_STARTUP
            r18 = 7
            r4[r18] = r82
            r79 = r4
            r12 = 2
            com.google.android.apps.gsa.shared.logger.b.ae[] r4 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            r59 = 0
            r4[r59] = r7
            r33 = 1
            r4[r33] = r65
            r84 = r4
            r12 = 4
            com.google.android.apps.gsa.shared.logger.b.ag[] r4 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r12]
            r4[r59] = r73
            r4[r33] = r11
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_ONBOARDING
            r12 = 2
            r4[r12] = r11
            r11 = 3
            r4[r11] = r82
            com.google.android.apps.gsa.shared.logger.b.ae[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            com.google.android.apps.gsa.shared.logger.b.ae r83 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ONBOARDING_FALLBACK_START
            r11[r59] = r83
            com.google.android.apps.gsa.shared.logger.b.ae r83 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ONBOARDING_WELCOME_START
            r11[r33] = r83
            r85 = r4
            r12 = 4
            com.google.android.apps.gsa.shared.logger.b.ae[] r4 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_TEXT_FILTER_ENTER_FROZEN
            r4[r59] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_TEXT_FILTER_GALLERY_PICKER
            r4[r33] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_TEXT_FILTER_SHUTTER_TAP
            r86 = r11
            r11 = 2
            r4[r11] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_TEXT_FILTER_EXTERNAL_IMAGE
            r11 = 3
            r4[r11] = r12
            r12 = 5
            com.google.android.apps.gsa.shared.logger.b.ag[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r12]
            com.google.android.apps.gsa.shared.logger.b.ag r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_PREFETCH_WITH_DROPPED_GLEAMS
            r11[r59] = r12
            com.google.android.apps.gsa.shared.logger.b.ag r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_PREFETCH_WITHOUT_DROPPED_GLEAMS
            r11[r33] = r12
            com.google.android.apps.gsa.shared.logger.b.ag r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_TRANSLATE
            r87 = r4
            r4 = 2
            r11[r4] = r12
            com.google.android.apps.gsa.shared.logger.b.ag r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_PREFETCH
            r4 = 3
            r11[r4] = r12
            com.google.android.apps.gsa.shared.logger.b.ag r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_PREFETCH_TO_CHANNEL_COMPLETE
            r24 = 4
            r11[r24] = r12
            r12 = 2
            com.google.android.apps.gsa.shared.logger.b.ae[] r4 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            r4[r59] = r68
            r4[r33] = r72
            r88 = r4
            r12 = 5
            com.google.android.apps.gsa.shared.logger.b.ae[] r4 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            r4[r59] = r7
            r4[r33] = r65
            r12 = 2
            r4[r12] = r66
            r12 = 3
            r4[r12] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SINGLE_TAP_UP
            r4[r24] = r25
            r83 = r11
            com.google.android.apps.gsa.shared.logger.b.ae[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SINGLE_TAP_UP_FROZEN
            r11[r59] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SINGLE_TAP_UP_LVF
            r11[r33] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SHUTTER_TAP
            r89 = r4
            r4 = 2
            r11[r4] = r12
            com.google.android.apps.gsa.shared.logger.b.ag[] r12 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r4]
            com.google.android.apps.gsa.shared.logger.b.ag r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_REGION_SEARCH_BOX_ADJUSTED_AFTER_REQUEST
            r12[r59] = r25
            com.google.android.apps.gsa.shared.logger.b.ag r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_REGION_SEARCH_REQUEST
            r12[r33] = r25
            r72 = r12
            r4 = 3
            com.google.android.apps.gsa.shared.logger.b.ag[] r12 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r4]
            r12[r59] = r70
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_RESUME
            r12[r33] = r4
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_RESUME_CAMERA_REQUESTED
            r70 = r11
            r11 = 2
            r12[r11] = r4
            r4 = 4
            com.google.android.apps.gsa.shared.logger.b.ae[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r4]
            r11[r59] = r68
            r11[r33] = r65
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_VIEW_ON_CREATE
            r68 = r12
            r12 = 2
            r11[r12] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ACTIVITY_ON_CREATE
            r90 = r5
            r5 = 3
            r11[r5] = r25
            com.google.android.apps.gsa.shared.logger.b.ae[] r5 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            com.google.android.apps.gsa.shared.logger.b.ae r91 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ALL_START_REQUESTED
            r5[r59] = r91
            com.google.android.apps.gsa.shared.logger.b.ae r91 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ALL_RESUME_REQUESTED
            r5[r33] = r91
            r92 = r11
            r12 = 4
            com.google.android.apps.gsa.shared.logger.b.ag[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r12]
            r11[r59] = r80
            r11[r33] = r73
            r12 = 2
            r11[r12] = r81
            r12 = 3
            r11[r12] = r82
            r82 = r5
            com.google.android.apps.gsa.shared.logger.b.ae[] r5 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            r5[r59] = r66
            r5[r33] = r7
            r7 = 2
            r5[r7] = r65
            r12 = 5
            com.google.android.apps.gsa.shared.logger.b.ag[] r7 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r12]
            r7[r59] = r75
            r7[r33] = r76
            r12 = 2
            r7[r12] = r78
            r12 = 3
            r7[r12] = r80
            r75 = r5
            r5 = 4
            r7[r5] = r81
            com.google.android.apps.gsa.shared.logger.b.ae[] r5 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            r5[r59] = r25
            r5[r33] = r4
            r12 = 2
            r5[r12] = r65
            r76 = r5
            r12 = 4
            com.google.android.apps.gsa.shared.logger.b.ae[] r5 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            r5[r59] = r66
            r5[r33] = r25
            r12 = 2
            r5[r12] = r4
            r4 = 3
            r5[r4] = r65
            com.google.android.apps.gsa.shared.logger.b.ae[] r4 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_EARLY_SESSION_START
            r4[r59] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SESSION_START
            r4[r33] = r25
            r65 = r5
            com.google.android.apps.gsa.shared.logger.b.ae[] r5 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SEARCH_HOMESCREEN_LINGO_CAMERA_TAP
            r5[r59] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SEARCH_WIDGET_LINGO_CAMERA_TAP
            r5[r33] = r25
            r66 = r5
            r12 = 9
            com.google.android.apps.gsa.shared.logger.b.ae[] r5 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_STARTUP_ON_SCREEN_MIC
            r5[r59] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_STARTUP_HOTWORD
            r5[r33] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_STARTUP_ON_IMMERSIVE_MEDIA_BUTTON_TAP
            r25 = 2
            r5[r25] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_STARTUP_ON_SEND_MESSAGE_TAP
            r73 = r4
            r4 = 3
            r5[r4] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_STARTUP_ON_CALL_TAP
            r24 = 4
            r5[r24] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_STARTUP_GENERIC
            r24 = 5
            r5[r24] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_STARTUP_ON_EXPERIENCE_LAUNCHER_EXIT_BUTTON
            r19 = 6
            r5[r19] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_STARTUP_ON_GVIS
            r18 = 7
            r5[r18] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_STARTUP_ON_CLIENT_INPUT
            r78 = r7
            r7 = 8
            r5[r7] = r12
            com.google.android.apps.gsa.shared.logger.b.ag[] r12 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r4]
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_DELIBERATE_INTENT_DETECTION_TRANSCRIPTION
            r59 = 0
            r12[r59] = r4
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_QUERY
            r33 = 1
            r12[r33] = r4
            com.google.android.apps.gsa.shared.logger.b.ag r17 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_RECOGNITION
            r7 = 2
            r12[r7] = r17
            r81 = r12
            com.google.android.apps.gsa.shared.logger.b.ag[] r12 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r7]
            r12[r59] = r4
            r12[r33] = r17
            r4 = 8
            com.google.android.apps.gsa.shared.logger.b.ae[] r7 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r4]
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_UNKNOWN_RECOGNITION_START
            r7[r59] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_ASR_RECOGNITION_START
            r7[r33] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SODA_RECOGNITION_START
            r25 = 2
            r7[r25] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SYSTEM_RECOGNITION_START
            r24 = 3
            r7[r24] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_TEXT_QUERY_RECOGNITION_START
            r45 = 4
            r7[r45] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PROACTIVE_RECOGNITION_START
            r37 = 5
            r7[r37] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SUGGESTION_CHIP_RECOGNITION_START
            r19 = 6
            r7[r19] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_S3_RECOGNITION_START
            r18 = 7
            r7[r18] = r4
            r4 = 34
            com.google.android.apps.gsa.shared.logger.b.ae[] r4 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r4]
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_USER_REQUEST
            r59 = 0
            r4[r59] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_PUSH_TO_TALK
            r33 = 1
            r4[r33] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_UNKNOWN
            r25 = 2
            r4[r25] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_HOTWORD
            r24 = 3
            r4[r24] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_SQUEEZE
            r45 = 4
            r4[r45] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_MIC_TAP
            r37 = 5
            r4[r37] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_IMPLICIT_TRIGGER_UNKNOWN
            r19 = 6
            r4[r19] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_IMPLICIT_TRIGGER_PICKUP
            r18 = 7
            r4[r18] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_IMPLICIT_TRIGGER_WAKEWORD
            r17 = 8
            r4[r17] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FRE_ASYNC_FETCH_APP_CONTROL_DISCOVERY_SUGGESTIONS_REQUESTED
            r20 = 9
            r4[r20] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FRE_FETCH_APP_CONTROL_DISCOVERY_SUGGESTIONS_REQUESTED
            r23 = 10
            r4[r23] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_IMPLICIT_TRIGGER_ALARM
            r4[r22] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_SWIPE
            r16 = 12
            r4[r16] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_PROACTIVE
            r39 = 13
            r4[r39] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_DEEPLINK
            r41 = 14
            r4[r41] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_IMPLICIT_TRIGGER_DEEPLINK
            r44 = 15
            r4[r44] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DICTATION_TRIGGER_SQUEEZE
            r4[r43] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DICTATION_TRIGGER_HOTWORD
            r49 = 17
            r4[r49] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DICTATION_TRIGGER_OPA_REQUEST
            r4[r47] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DICTATION_TRIGGER_SWIPE
            r58 = 19
            r4[r58] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DICTATION_TRIGGER_KEYBOARD_MIC_TAP
            r4[r51] = r80
            com.google.android.apps.gsa.shared.logger.b.ae r80 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DICTATION_TRIGGER_DEEPLINK
            r4[r53] = r80
            r80 = 22
            com.google.android.apps.gsa.shared.logger.b.ae r91 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DICTATION_TRIGGER_UNKNOWN
            r4[r80] = r91
            r80 = 23
            com.google.android.apps.gsa.shared.logger.b.ae r91 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXECUTING_TRIGGER_NON_VOICE_INTERACTION
            r4[r80] = r91
            r80 = 24
            com.google.android.apps.gsa.shared.logger.b.ae r91 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXECUTING_TRIGGER_UNKNOWN
            r4[r80] = r91
            r80 = 25
            com.google.android.apps.gsa.shared.logger.b.ae r91 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_APP_CONTROL_DISCOVERY_FETCH
            r4[r80] = r91
            r80 = 26
            com.google.android.apps.gsa.shared.logger.b.ae r91 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_APP_CONTROL_DISCOVERY_IMMEDIATE_FETCH
            r4[r80] = r91
            r80 = 27
            com.google.android.apps.gsa.shared.logger.b.ae r91 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_LPH
            r4[r80] = r91
            r80 = 28
            com.google.android.apps.gsa.shared.logger.b.ae r91 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DICTATION_TRIGGER_LPH
            r4[r80] = r91
            r80 = 29
            com.google.android.apps.gsa.shared.logger.b.ae r91 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_OPA_REQUEST
            r4[r80] = r91
            r80 = 30
            com.google.android.apps.gsa.shared.logger.b.ae r91 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_IMPLICIT_TRIGGER_TIMER
            r4[r80] = r91
            r80 = 31
            com.google.android.apps.gsa.shared.logger.b.ae r91 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_WATCH
            r4[r80] = r91
            r80 = 32
            com.google.android.apps.gsa.shared.logger.b.ae r91 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_IMPLICIT_TRIGGER_CONTINUED_CONVERSATION
            r4[r80] = r91
            r80 = 33
            com.google.android.apps.gsa.shared.logger.b.ae r91 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_LOCKSCREEN_HOTWORD
            r4[r80] = r91
            r80 = r4
            r91 = r7
            r4 = 2
            com.google.android.apps.gsa.shared.logger.b.ae[] r7 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r4]
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_FROM_NOTIFICATION_START
            r59 = 0
            r7[r59] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_START
            r33 = 1
            r7[r33] = r25
            r93 = r12
            r4 = 9
            com.google.android.apps.gsa.shared.logger.b.ae[] r12 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r4]
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_PULL_TO_REFRESH_START
            r12[r59] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_AUTHENTICATION_ERROR_REFRESH_START
            r12[r33] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_DEBUG_PARAMS_UPDATED_REFRESH_START
            r25 = 2
            r12[r25] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_NO_CONTENT_ERROR_REFRESH_START
            r94 = r5
            r5 = 3
            r12[r5] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_RESPONSE_ERROR_REFRESH_START
            r24 = 4
            r12[r24] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_UNEXPECTED_ERROR_REFRESH_START
            r24 = 5
            r12[r24] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_XUIKIT_REFRESH_COMMAND_START
            r19 = 6
            r12[r19] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_GOOGLE_PLAY_ERROR_REFRESH_START
            r18 = 7
            r12[r18] = r4
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_TAP_TO_UPDATE_START
            r17 = 8
            r12[r17] = r4
            com.google.android.apps.gsa.shared.logger.b.ag[] r4 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r5]
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.STARTUP_FIRST_DRAW_DONE
            r59 = 0
            r4[r59] = r5
            com.google.android.apps.gsa.shared.logger.b.ag r95 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ACTIVITY_DISMISS
            r33 = 1
            r4[r33] = r95
            com.google.android.apps.gsa.shared.logger.b.ag r95 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.STARTUP_APPLICATION_INTERACTIVE
            r25 = 2
            r4[r25] = r95
            r97 = r7
            r96 = r11
            r11 = 4
            com.google.android.apps.gsa.shared.logger.b.ae[] r7 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r11]
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUM_CONTACT_SELECTION_CALL_ACTION
            r7[r59] = r11
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUM_CONTACT_SELECTION_MESSAGE_ACTION
            r7[r33] = r11
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUM_CONTACT_LOOKUP_CALL_ACTION
            r7[r25] = r11
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUM_CONTACT_LOOKUP_MSG_ACTION
            r98 = r12
            r12 = 3
            r7[r12] = r11
            com.google.android.apps.gsa.shared.logger.b.ag[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r12]
            com.google.android.apps.gsa.shared.logger.b.ag r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ANDROID_STARTUP_INPUT_PLATE_FIRST_DRAWN
            r11[r59] = r12
            com.google.android.apps.gsa.shared.logger.b.ag r99 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_CHAT_UI_ACTIVITY_STARTUP
            r11[r33] = r99
            com.google.android.apps.gsa.shared.logger.b.ag r100 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_VOICE_RELIABILITY
            r11[r25] = r100
            r101 = r7
            r102 = r11
            r7 = 10
            com.google.android.apps.gsa.shared.logger.b.ae[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r7]
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_OTHER
            r11[r59] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r103 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SEARCH_WIDGET_MIC_TAP
            r11[r33] = r103
            com.google.android.apps.gsa.shared.logger.b.ae r104 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_INTEGRATION_GRPC_MIC_TAP
            r11[r25] = r104
            com.google.android.apps.gsa.shared.logger.b.ae r105 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_LOCKSCREEN
            r24 = 3
            r11[r24] = r105
            com.google.android.apps.gsa.shared.logger.b.ae r106 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_HEADSET
            r45 = 4
            r11[r45] = r106
            com.google.android.apps.gsa.shared.logger.b.ae r107 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_RELAUNCH_FROM_ERROR
            r37 = 5
            r11[r37] = r107
            com.google.android.apps.gsa.shared.logger.b.ae r108 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_NOTIFICATION
            r19 = 6
            r11[r19] = r108
            com.google.android.apps.gsa.shared.logger.b.ae r109 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_ASSIST_GESTURE
            r18 = 7
            r11[r18] = r109
            com.google.android.apps.gsa.shared.logger.b.ae r110 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_HOTWORD
            r17 = 8
            r11[r17] = r110
            com.google.android.apps.gsa.shared.logger.b.ae r111 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_INTEGRATION_MIC_TAP
            r20 = 9
            r11[r20] = r111
            r113 = r8
            r112 = r11
            r11 = 3
            com.google.android.apps.gsa.shared.logger.b.ag[] r8 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r11]
            r24 = 0
            r8[r24] = r12
            r33 = 1
            r8[r33] = r99
            com.google.android.apps.gsa.shared.logger.b.ag r59 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_CLIENT_INTERACTION_RELIABILITY
            r25 = 2
            r8[r25] = r59
            r115 = r8
            r11 = 4
            com.google.android.apps.gsa.shared.logger.b.ag[] r8 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r11]
            r8[r24] = r12
            r8[r33] = r99
            r8[r25] = r100
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.INTENT_API_OR_LEGACY_VOICE_SEARCH
            r12 = 3
            r8[r12] = r11
            r11 = 23
            com.google.android.apps.gsa.shared.logger.b.ae[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r11]
            com.google.android.apps.gsa.shared.logger.b.ae r99 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_MIC_TAP
            r11[r24] = r99
            r11[r33] = r103
            com.google.android.apps.gsa.shared.logger.b.ae r100 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_LOGO_CLICKED_ON_ZEROSTATE
            r11[r25] = r100
            com.google.android.apps.gsa.shared.logger.b.ae r114 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_MIC_OPEN_FOR_FOLLOW_ON
            r11[r12] = r114
            r12 = 4
            r11[r12] = r104
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_NOTIFICATION_TAPPED_ASSISTANT_INTERACTION
            r37 = 5
            r11[r37] = r12
            r19 = 6
            r11[r19] = r109
            r18 = 7
            r11[r18] = r110
            r17 = 8
            r11[r17] = r107
            r20 = 9
            r11[r20] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r116 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CLIENT_INPUT_SUBMIT
            r23 = 10
            r11[r23] = r116
            com.google.android.apps.gsa.shared.logger.b.ae r117 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CLIENT_OP_RESULT_SUBMIT
            r11[r22] = r117
            com.google.android.apps.gsa.shared.logger.b.ae r118 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_FOLLOW_ON_QUERY_COMMIT_ACTION_V2
            r16 = 12
            r11[r16] = r118
            com.google.android.apps.gsa.shared.logger.b.ae r119 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SRP_RESULT_CLICK_REFINE_SEARCH
            r39 = 13
            r11[r39] = r119
            com.google.android.apps.gsa.shared.logger.b.ae r120 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_TEXT_QUERY_SUBMIT
            r41 = 14
            r11[r41] = r120
            com.google.android.apps.gsa.shared.logger.b.ae r121 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SUGGESTION_CHIP_TAP
            r44 = 15
            r11[r44] = r121
            r11[r43] = r106
            r122 = r8
            r8 = 17
            r11[r8] = r105
            r11[r47] = r108
            com.google.android.apps.gsa.shared.logger.b.ae r123 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SUGGESTION_TAP
            r49 = 19
            r11[r49] = r123
            com.google.android.apps.gsa.shared.logger.b.ae r124 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INLINE_REFINEMENT
            r11[r51] = r124
            com.google.android.apps.gsa.shared.logger.b.ae r125 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_TEXT_QUERY_UNKNOWN
            r11[r53] = r125
            r49 = 22
            r11[r49] = r111
            r126 = r11
            com.google.android.apps.gsa.shared.logger.b.ae[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r8]
            r8 = 0
            r11[r8] = r7
            r8 = 1
            r11[r8] = r103
            r8 = 2
            r11[r8] = r99
            r8 = 3
            r11[r8] = r104
            r8 = 4
            r11[r8] = r116
            r8 = 5
            r11[r8] = r117
            r8 = 6
            r11[r8] = r118
            r8 = 7
            r11[r8] = r100
            r8 = 8
            r11[r8] = r114
            r8 = 9
            r11[r8] = r105
            r8 = 10
            r11[r8] = r106
            r11[r22] = r107
            r8 = 12
            r11[r8] = r108
            r8 = 13
            r11[r8] = r12
            r8 = 14
            r11[r8] = r109
            r8 = 15
            r11[r8] = r110
            r11[r43] = r111
            r127 = r11
            r8 = 4
            com.google.android.apps.gsa.shared.logger.b.ae[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r8]
            r8 = 0
            r11[r8] = r12
            r12 = 1
            r11[r12] = r117
            r12 = 2
            r11[r12] = r108
            r24 = 3
            r11[r24] = r116
            r108 = r11
            com.google.android.apps.gsa.shared.logger.b.ae[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_BROWSE_FULLSCREEN_USER_CLICK
            r11[r8] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_BROWSE_ITEM_USER_CLICK
            r33 = 1
            r11[r33] = r25
            r116 = r11
            r12 = 17
            com.google.android.apps.gsa.shared.logger.b.ae[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_MORRIS_STATUS_PROVIDER_CAR_MODE_ENTRY_DRIVING_MODE
            r11[r8] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_MORRIS_STATUS_PROVIDER_CAR_MODE_ENTRY_VANAGON
            r11[r33] = r8
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_MORRIS_STATUS_PROVIDER_CAR_MODE_ENTRY_ASSISTANT_SERVER
            r12 = 2
            r11[r12] = r8
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_MORRIS_STATUS_PROVIDER_CAR_MODE_ENTRY
            r12 = 3
            r11[r12] = r8
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_MORRIS_STATUS_PROVIDER_CAR_MODE_ENTRY_NO_TRIGGER_SOURCE
            r12 = 4
            r11[r12] = r8
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_GUIDED_NAV_IN_FOREGROUND
            r12 = 5
            r11[r12] = r8
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_RESUME_GUIDED_NAV_IN_FOREGROUND
            r12 = 6
            r11[r12] = r8
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_DRIVING_SCREEN_ACTIVITY_ON_START_START_MORRIS_BY_LETS_DRIVE
            r12 = 7
            r11[r12] = r8
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_DRIVING_SCREEN_ACTIVITY_ON_START_START_MORRIS_BY_BLUETOOTH
            r12 = 8
            r11[r12] = r8
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_DRIVING_SCREEN_ACTIVITY_ON_START_START_MORRIS_BY_ACTIVITY_RECOGNITION
            r12 = 9
            r11[r12] = r8
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_GUIDED_NAV_IN_FOREGROUND_TRIGGERED_BY_SCREEN_ROTATION
            r12 = 10
            r11[r12] = r8
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_DRIVING_SCREEN_ACTIVITY_ON_CREATE_BY_LETS_DRIVE
            r11[r22] = r8
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_DRIVING_SCREEN_ACTIVITY_ON_CREATE_BY_BLUETOOTH
            r12 = 12
            r11[r12] = r8
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_DRIVING_SCREEN_ACTIVITY_ON_CREATE_BY_ACTIVITY_RECOGNITION
            r12 = 13
            r11[r12] = r8
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_DRIVING_SCREEN_ACTIVITY_ON_RESUME_START_MORRIS_BY_LETS_DRIVE
            r12 = 14
            r11[r12] = r8
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_DRIVING_SCREEN_ACTIVITY_ON_RESUME_START_MORRIS_BY_BLUETOOTH
            r12 = 15
            r11[r12] = r8
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_DRIVING_SCREEN_ACTIVITY_ON_RESUME_START_MORRIS_BY_ACTIVITY_RECOGNITION
            r11[r43] = r8
            r8 = 22
            com.google.android.apps.gsa.shared.logger.b.ae[] r8 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r8]
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_USER_DISABLED_DRIVING_MODE
            r59 = 0
            r8[r59] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_MAESTRO_CONNECTOR_SERVICE_DISCONNECTED
            r33 = 1
            r8[r33] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_UNCAUGHT_EXCEPTION_HANDLER_TRIGGERED
            r25 = 2
            r8[r25] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_DRIVING_SCREEN_ACTIVITY_ON_STOP
            r24 = 3
            r8[r24] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_CONFIGURATION_CHANGE_LANDSCAPE_MODE
            r45 = 4
            r8[r45] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_GSA_VOICE_INTERACTION_SESSION_HIDE
            r37 = 5
            r8[r37] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_GSA_VOICE_INTERACTION_SESSION_FINISH_DURING_ON_SHOW
            r19 = 6
            r8[r19] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_ASSISTANT_PROCESS_KILLED
            r18 = 7
            r8[r18] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_TEARDOWN_EXIT_DRIVING_MODE_INTENT_RECEIVED
            r17 = 8
            r8[r17] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_APP_INTEGRATION_SERVICE_SEARCH_PROCESS_BINDER_DIED
            r20 = 9
            r8[r20] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_ON_SEARCH_PROCESS_START_CLEAN_UP_STATES
            r23 = 10
            r8[r23] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_WINDOW_TOKEN_INVALID
            r8[r22] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_WINDOW_NOT_ATTACHED
            r16 = 12
            r8[r16] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_TEARDOWN_MORRIS_STATUS_PROVIDER_CAR_MODE_EXIT
            r39 = 13
            r8[r39] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_CONFIGURATION_CHANGE_UPSIDE_DOWN
            r41 = 14
            r8[r41] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_WINDOW_TOKEN_MISSING
            r44 = 15
            r8[r44] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_NAV_IN_BACKGROUND
            r8[r43] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_NAV_STOPPED
            r49 = 17
            r8[r49] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_CLIENT_PACKAGE_NAME_CHANGED
            r8[r47] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_FOREGROUND_APP_POLLING_NOT_WHITELISTED
            r58 = 19
            r8[r58] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_FOREGROUND_APP_POLLING_LANDSCAPE_MODE
            r8[r51] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_TEARDOWN_DRIVING_SCREEN_ACTIVITY_ON_PAUSE
            r8[r53] = r12
            r51 = r8
            r12 = 3
            com.google.android.apps.gsa.shared.logger.b.ae[] r8 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_STARTUP_ON_CREATE
            r53 = 0
            r8[r53] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_STARTUP_POST_ONBOARDING
            r33 = 1
            r8[r33] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_STARTUP_RETRY
            r25 = 2
            r8[r25] = r12
            r117 = r8
            r12 = 4
            com.google.android.apps.gsa.shared.logger.b.ae[] r8 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_HOME_AUTOMATION_ACCOUNT_LINKING_FROM_PROVIDER_LINK_INTENT
            r8[r53] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_HOME_AUTOMATION_ACCOUNT_LINKING_FROM_PROVIDER_RESYNC_INTENT
            r8[r33] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_HOME_AUTOMATION_ACCOUNT_LINKING_FROM_USER_LINK_SELECTION
            r8[r25] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_HOME_AUTOMATION_ACCOUNT_LINKING_FROM_USER_RESYNC_SELECTION
            r24 = 3
            r8[r24] = r12
            r12 = 19
            com.google.android.apps.gsa.shared.logger.b.ae[] r12 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            r12[r53] = r99
            r12[r33] = r103
            r12[r25] = r100
            r12[r24] = r114
            r45 = 4
            r12[r45] = r104
            r37 = 5
            r12[r37] = r109
            r19 = 6
            r12[r19] = r110
            r18 = 7
            r12[r18] = r107
            r17 = 8
            r12[r17] = r7
            r20 = 9
            r12[r20] = r118
            r23 = 10
            r12[r23] = r119
            r12[r22] = r120
            r16 = 12
            r12[r16] = r121
            r53 = r8
            r8 = 13
            r12[r8] = r106
            r39 = 14
            r12[r39] = r105
            r39 = 15
            r12[r39] = r123
            r12[r43] = r124
            r39 = 17
            r12[r39] = r125
            r12[r47] = r111
            r43 = r12
            com.google.android.apps.gsa.shared.logger.b.ae[] r12 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r8]
            r8 = 0
            r12[r8] = r7
            r7 = 1
            r12[r7] = r103
            r7 = 2
            r12[r7] = r99
            r7 = 3
            r12[r7] = r104
            r7 = 4
            r12[r7] = r118
            r7 = 5
            r12[r7] = r100
            r7 = 6
            r12[r7] = r114
            r7 = 7
            r12[r7] = r105
            r8 = 8
            r12[r8] = r106
            r8 = 9
            r12[r8] = r107
            r8 = 10
            r12[r8] = r109
            r12[r22] = r110
            r8 = 12
            r12[r8] = r111
            com.google.android.apps.gsa.shared.logger.b.ae[] r8 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r7]
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_ADD_CHECKLIST_ITEM
            r44 = 0
            r8[r44] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_CHECKLIST_CARD_ADD_ITEM
            r33 = 1
            r8[r33] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_ADD_SHOPPING_ITEM
            r25 = 2
            r8[r25] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_ADD_NOTE
            r24 = 3
            r8[r24] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_SHOPING_LIST_CARD_ADD_ITEM
            r44 = 4
            r8[r44] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_NAL_CARD_ADD_NOTE
            r37 = 5
            r8[r37] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_NAL_CARD_ADD_LIST
            r19 = 6
            r8[r19] = r7
            r44 = r8
            r7 = 7
            com.google.android.apps.gsa.shared.logger.b.ae[] r8 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r7]
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CLIENT_INPUT_FAB_ADD_REMINDER
            r47 = 0
            r8[r47] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CLIENT_INPUT_FAB_ADD_EVENT
            r33 = 1
            r8[r33] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CLIENT_INPUT_FAB_ADD_SHOPPING_ITEM
            r47 = r12
            r12 = 2
            r8[r12] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CLIENT_INPUT_FAB_ADD_NOTE
            r24 = 3
            r8[r24] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CLIENT_INPUT_SHOPING_LIST_CARD_ADD_ITEM
            r25 = 4
            r8[r25] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CLIENT_INPUT_NAL_CARD_ADD_NOTE
            r25 = 5
            r8[r25] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CLIENT_INPUT_NAL_CARD_ADD_LIST
            r19 = 6
            r8[r19] = r7
            com.google.android.apps.gsa.shared.logger.b.ae[] r7 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_ZERO_STATE_CREATE_ACTIVITY
            r49 = 0
            r7[r49] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_ZERO_STATE_ENTER
            r33 = 1
            r7[r33] = r25
            r58 = r8
            com.google.android.apps.gsa.shared.logger.b.ag[] r8 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r12]
            com.google.android.apps.gsa.shared.logger.b.ag r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.PODCAST_IN_APP_SEARCH_SUCCESS
            r8[r49] = r25
            com.google.android.apps.gsa.shared.logger.b.ag r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.PODCAST_IN_APP_SEARCH_NO_RESULT
            r8[r33] = r25
            r99 = r8
            r12 = 4
            com.google.android.apps.gsa.shared.logger.b.ae[] r8 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_PLAYBACK_TOGGLE_PLAY
            r8[r49] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_PLAYBACK_SEEK_FORWARD
            r8[r33] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_PLAYBACK_SEEK_BACKWARD
            r100 = r7
            r7 = 2
            r8[r7] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_PLAYBACK_SEEK_POSITION
            r7 = 3
            r8[r7] = r12
            com.google.android.apps.gsa.shared.logger.b.ae[] r12 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r7]
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_STARTUP_SHOW_INITIATED_FROM_OPA
            r12[r49] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_STARTUP_SHOW_INITIATED_FROM_AGSA_SRP
            r12[r33] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_STARTUP_SHOW_INITIATED_FROM_CHROME_SRP
            r104 = r8
            r8 = 2
            r12[r8] = r7
            r7 = 4
            com.google.android.apps.gsa.shared.logger.b.ae[] r8 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r7]
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VBUS_SEARCH_RECOMMIT
            r8[r49] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VBUS_TEXT_SEARCH_COMMIT
            r8[r33] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r59 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VBUS_VOICE_SEARCH_COMMIT
            r105 = r12
            r12 = 2
            r8[r12] = r59
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VBUS_NATIVE_SOUND_SEARCH_COMMIT
            r24 = 3
            r8[r24] = r25
            r106 = r8
            com.google.android.apps.gsa.shared.logger.b.ae[] r8 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_UPDATE_DSE_RECEIVED
            r8[r49] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_UPDATE_APP_STATE_RECEIVED
            r8[r33] = r25
            r107 = r8
            r12 = 5
            com.google.android.apps.gsa.shared.logger.b.ae[] r8 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r12]
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_START_NEW_MODEL_DOWNLOAD
            r8[r49] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_START_RESTORE_SPEAKER_MODEL
            r8[r33] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_START_APP_UPGRADE
            r109 = r11
            r11 = 2
            r8[r11] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_START_BAKED_IN_HOTWORD_MODEL
            r24 = 3
            r8[r24] = r12
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_START_ON_INSTALL
            r25 = 4
            r8[r25] = r12
            com.google.android.apps.gsa.shared.logger.b.ae[] r12 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r11]
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_START_ASR
            r12[r49] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_START_ASR_ON_HOTWORD
            r12[r33] = r25
            r110 = r12
            com.google.android.apps.gsa.shared.logger.b.ae[] r12 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r11]
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_READ_IT_LATER_REQUESTED
            r12[r49] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_PLAYLIST_REQUESTED
            r12[r33] = r25
            r111 = r12
            com.google.android.apps.gsa.shared.logger.b.ae[] r12 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r11]
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_NEW_PLAYBACK_REQUESTED
            r12[r49] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r59 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_READ_IT_NOW_REQUESTED
            r12[r33] = r59
            r118 = r12
            r11 = 3
            com.google.android.apps.gsa.shared.logger.b.ae[] r12 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r11]
            r12[r49] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_PLAYBACK_STARTED
            r12[r33] = r11
            r11 = 2
            r12[r11] = r59
            r114 = r12
            com.google.android.apps.gsa.shared.logger.b.ag[] r12 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r11]
            com.google.android.apps.gsa.shared.logger.b.ag r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.SPEAKR_START_READ_IT_NOW
            r12[r49] = r25
            com.google.android.apps.gsa.shared.logger.b.ag r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.SPEAKR_READ_IT_NOW_PLAYBACK
            r12[r33] = r25
            r119 = r12
            com.google.android.apps.gsa.shared.logger.b.ag[] r12 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r11]
            r12[r49] = r5
            r12[r33] = r95
            r5 = 3
            com.google.android.apps.gsa.shared.logger.b.ae[] r11 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r5]
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APPLICATION_CREATE
            r11[r49] = r5
            com.google.android.apps.gsa.shared.logger.b.ae r59 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACTIVITY_ON_CREATE
            r11[r33] = r59
            com.google.android.apps.gsa.shared.logger.b.ae r95 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TRAMPOLINE_STARTUP
            r120 = r8
            r8 = 2
            r11[r8] = r95
            r121 = r3
            r8 = 4
            com.google.android.apps.gsa.shared.logger.b.ae[] r3 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r8]
            r3[r49] = r5
            r3[r33] = r59
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SEARCH_SERVICE_ON_CREATE
            r8 = 2
            r3[r8] = r5
            r5 = 3
            r3[r5] = r95
            r5 = 4
            com.google.android.apps.gsa.shared.logger.b.ae[] r8 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r5]
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_OPA_KEYBOARD_INDICATOR_CLICKED
            r8[r49] = r5
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_NGA_KEYBOARD_INDICATOR_CLICKED_OPA_ACTIVE
            r8[r33] = r5
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_START_WITH_TAPAS
            r95 = r3
            r3 = 2
            r8[r3] = r5
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_NGA_KEYBOARD_INDICATOR_CLICKED
            r24 = 3
            r8[r24] = r5
            com.google.android.apps.gsa.shared.logger.b.ae[] r5 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r3]
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_START
            r5[r49] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_START_MID_QUERY
            r5[r33] = r25
            r123 = r8
            com.google.android.apps.gsa.shared.logger.b.ae[] r8 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r3]
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AGSA_TEXT_TAPAS_CORRECTIONS_START
            r8[r49] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AGSA_TEXT_START
            r8[r33] = r25
            r124 = r5
            com.google.android.apps.gsa.shared.logger.b.ag[] r5 = new com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[r3]
            r5[r49] = r48
            com.google.android.apps.gsa.shared.logger.b.ag r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.TEXT_SEARCH
            r5[r33] = r25
            r48 = r5
            r3 = 3
            com.google.android.apps.gsa.shared.logger.b.ae[] r5 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r3]
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SOUND_SEARCH_START
            r5[r49] = r3
            r5[r33] = r7
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEECH_END_RECEIVED
            r7 = 2
            r5[r7] = r3
            r3 = 4
            com.google.android.apps.gsa.shared.logger.b.ae[] r7 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r3]
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_PHONE_ENROLLMENT_START
            r7[r49] = r3
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SHARED_DEVICE_ENROLLMENT_START
            r7[r33] = r3
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SLA_STRUCTURE_ENROLLMENT_START
            r125 = r5
            r5 = 2
            r7[r5] = r3
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SLA_DEVICE_ENROLLMENT_START
            r24 = 3
            r7[r24] = r3
            com.google.android.apps.gsa.shared.logger.b.ae[] r3 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r5]
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SETTINGS_DSP_ENTER
            r3[r49] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SETTINGS_NON_DSP_ENTER
            r3[r33] = r25
            r128 = r3
            com.google.android.apps.gsa.shared.logger.b.ae[] r3 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r5]
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_APP_CLOSE_BACKGROUND_REFRESH_START
            r3[r49] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_BACKGROUND_REFRESH_START
            r3[r33] = r25
            r129 = r7
            r5 = 8
            com.google.android.apps.gsa.shared.logger.b.ae[] r7 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r5]
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_LOCATION_SHARE
            r7[r49] = r5
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_WEB_URL_SHARE
            r7[r33] = r5
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SEND_TEXT_MSG
            r49 = r3
            r3 = 2
            r7[r3] = r5
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SEND_AUDIO_MSG
            r24 = 3
            r7[r24] = r5
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SCREENSHOT_SHARE_FALLBACK
            r25 = 4
            r7[r25] = r5
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_ATTACHMENTS_SHARE
            r25 = 5
            r7[r25] = r5
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_GOOGLE_PHOTO_SHARE
            r19 = 6
            r7[r19] = r5
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SCREENSHOT_SHARE
            r18 = 7
            r7[r18] = r5
            com.google.android.apps.gsa.shared.logger.b.ae[] r5 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r3]
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_2ND_STAGE_HOTWORD_INITIALIZATION_CREATE_SODA
            r59 = 0
            r5[r59] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_2ND_STAGE_HOTWORD_INITIALIZATION_UPDATE_SODA
            r33 = 1
            r5[r33] = r25
            r130 = r5
            r3 = 3
            com.google.android.apps.gsa.shared.logger.b.ae[] r5 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r3]
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_OPEN_OVERLAY_START
            r5[r59] = r3
            com.google.android.apps.gsa.shared.logger.b.ae r131 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_OVERLAY_ATTACH_START
            r5[r33] = r131
            com.google.android.apps.gsa.shared.logger.b.ae r131 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_CLOSE_OVERLAY_START
            r132 = r7
            r7 = 2
            r5[r7] = r131
            r133 = r6
            com.google.android.apps.gsa.shared.logger.b.ae[] r6 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r7]
            r6[r59] = r3
            r6[r33] = r131
            r3 = 9
            com.google.android.apps.gsa.shared.logger.b.ae[] r7 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r3]
            r7[r59] = r103
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ERROR_CARD_VOICE_SEARCH_RETRY
            r7[r33] = r3
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_SEARCH_ICON_SHORTCUT_TAP
            r25 = 2
            r7[r25] = r3
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_SEARCH_BOX_MIC_TAP
            r24 = 3
            r7[r24] = r3
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_PLATE_MIC_TAP
            r45 = 4
            r7[r45] = r3
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MINUS_ONE_SEARCH_BOX_MIC_TAP
            r37 = 5
            r7[r37] = r3
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.QSB_MIC_TAP
            r19 = 6
            r7[r19] = r3
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_SEARCH_ICON_TAP
            r18 = 7
            r7[r18] = r3
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.QEA_VOICE_ENTRY
            r17 = 8
            r7[r17] = r3
            r103 = r7
            r3 = 2
            com.google.android.apps.gsa.shared.logger.b.ae[] r7 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r3]
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_FRE_INPUT_PLATE_QUERY_SUGGESTION_SHOWN
            r59 = 0
            r7[r59] = r25
            com.google.android.apps.gsa.shared.logger.b.ae r25 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_OVERAPP_INPUT_PLATE_QUERY_SUGGESTION_SHOWN
            r33 = 1
            r7[r33] = r25
            r3 = 14
            com.google.android.apps.gsa.shared.logger.b.ae[] r3 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r3]
            r3[r59] = r35
            r3[r33] = r36
            r25 = 2
            r3[r25] = r38
            r24 = 3
            r3[r24] = r21
            r21 = 4
            r3[r21] = r28
            r21 = 5
            r3[r21] = r29
            r19 = 6
            r3[r19] = r30
            r18 = 7
            r3[r18] = r31
            r17 = 8
            r3[r17] = r32
            r17 = 9
            r3[r17] = r40
            r17 = 10
            r3[r17] = r42
            r3[r22] = r26
            r16 = 12
            r3[r16] = r27
            r16 = 13
            r3[r16] = r54
            r17 = r3
            r16 = r7
            r7 = 2
            com.google.android.apps.gsa.shared.logger.b.ae[] r3 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r7]
            com.google.android.apps.gsa.shared.logger.b.ae r18 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_START_HOTWORD_RECOGNITION_EXHAUSTED_RETRIES
            r19 = 0
            r3[r19] = r18
            com.google.android.apps.gsa.shared.logger.b.ae r18 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_START_HOTWORD_RECOGNITION
            r20 = 1
            r3[r20] = r18
            r7 = 3
            com.google.android.apps.gsa.shared.logger.b.ae[] r7 = new com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[r7]
            com.google.android.apps.gsa.shared.logger.b.ae r18 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_INTERACTION_SERVICE_START
            r7[r19] = r18
            com.google.android.apps.gsa.shared.logger.b.ae r18 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_SEARCH_LANGUAGE_CHANGE
            r7[r20] = r18
            com.google.android.apps.gsa.shared.logger.b.ae r18 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_HARDWARE_AVAILABILITY_CHANGE
            r19 = 2
            r7[r19] = r18
            r18 = r3
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r15)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_BY_OTHER_APP
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r10)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_DEBUG_QUERY
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r15 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_EMBEDDED
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r15)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_HOTWORD
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r10)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_MESSAGE_NOTIFICATION
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r10)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_MIC_OPEN_FOR_FOLLOW_ON
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r15 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_EMBEDDED
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r15)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_ON_SCREEN_MIC
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r10)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_PTT_BUTTON
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r10)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_SUGGESTIONS_MIC
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r10)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_SUGGESTIONS_TEXT
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r10)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_UNCLEAR
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_EMBEDDED
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r10)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_ACTION_V2_FOLLOW_ON_QUERY_COMMIT
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_PROJECTED
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r10)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_ASSISTANT_SUGGESTION
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_PROJECTED
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r10)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_AUTO_SUGGESTION_CHIP
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_PROJECTED
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r10)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_ENTRYPOINT_UNKNOWN
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_HOTWORD
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_IMMERSIVE_UI_FOLLOW_ON
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_PROJECTED
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r10)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_MEDIA_RECOMMENDATION
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_PROJECTED
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r10)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_MESSAGE_NOTIFICATION
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_MIC_OPEN_FOR_FOLLOW_ON
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_PROJECTED
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r10)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_ON_SCREEN_MIC
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_PTT_BUTTON
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_TAP_ASSISTANT_APP_ICON
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_TAP_DIALER_NUDGE
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_PROJECTED
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r10)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_TNG_IMMERSIVES
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_PROJECTED
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r10)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAP_START_WIRED_HEADSET_BUTTON
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAV_START_ACTION_V2_FOLLOW_ON_QUERY_COMMIT
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_VANAGON
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAV_START_BLUETOOTH
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_VANAGON
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAV_START_HOTWORD
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_VANAGON
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAV_START_MESSAGE_NOTIFICATION
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_VANAGON
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAV_START_MIC_OPEN_FOR_FOLLOW_ON
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_VANAGON
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAV_START_ON_SCREEN_MIC
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_VANAGON
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAV_START_PROXY_VOICE_BUTTON
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_VANAGON
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAV_START_WIRED_HEADSET_BUTTON
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_VANAGON
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_CLOSE_OVERLAY_START
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ACETONE_OVERLAY_TRANSITION
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_OPEN_OVERLAY_START
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ACETONE_OVERLAY_TRANSITION
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_OVERLAY_ATTACHED_IN_BACKGROUND_MODE
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_OVERLAY_ATTACH_START
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_OVERLAY_ATTACHED_NOOP_MODE
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_OVERLAY_ATTACH_START
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_OVERLAY_ATTACH_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_OVERLAY_ATTACH_START
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_OVERLAY_ATTACH_NO_CREATE_DONE
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_OVERLAY_ATTACH_START
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_OVERLAY_ATTACH_START
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ACETONE_OVERLAY_ATTACH
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_OVERLAY_FLOW_CANCELED
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_OVERLAY_FLOW_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_OVERLAY_HEADER_BINDING_COMPLETE
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_OVERLAY_ATTACH_START
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_OVERLAY_SNO_CONTROLLER_CREATED
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_OVERLAY_ATTACH_START
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_OVERLAY_TRANSITION_COMPLETE
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACETONE_SEARCH_BOX_MIC_TAP
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.INTENT_API_OR_LEGACY_VOICE_SEARCH
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACTIVITY_ON_CREATE
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r4)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AGSA_TEXT_ENDSTATE_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AGSA_TEXT_EXPERIENCE_DISMISS
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AGSA_TEXT_OPA_QUERY_SUBMIT
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AGSA_TEXT_OPA_SUGGESTION_SUBMIT
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AGSA_TEXT_START
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.AGSA_OPA_TEXT_FLOW
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AGSA_TEXT_TAPAS_CORRECTIONS_DISMISS
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AGSA_TEXT_TAPAS_CORRECTIONS_START
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.AGSA_OPA_TEXT_FLOW
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AGSA_TEXT_TAPAS_CORRECTIONS_SUBMIT
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AGSA_TEXT_TAPAS_DISMISS_AFTER_ATTENTION
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AGSA_TEXT_TAPAS_DISMISS_AFTER_INLINE_SUGGESTION_CLICK
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AGSA_TEXT_TAPAS_QUERY_SUBMIT
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AGSA_TEXT_TAPAS_SUGGESTION_SUBMIT
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ANY_DEEPLINK_INTENT
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.SEARCH_QUERY_DEEPLINK
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APPLICATION_CREATE
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r12)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APPLICATION_INTERACTIVE_CANCEL
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APPLICATION_INTERACTIVE_DISCOVER_GOOGLE_APP
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APPLICATION_INTERACTIVE_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APPLICATION_INTERACTIVE_HOTWORD_VOICE_INPUT_OPA
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APPLICATION_INTERACTIVE_INTERESTS_TAB_SNA
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APPLICATION_INTERACTIVE_LONG_PRESS_HOME_TEXT_INPUT_OPA
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APPLICATION_INTERACTIVE_LONG_PRESS_HOME_VOICE_INPUT_OPA
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APPLICATION_INTERACTIVE_SHELL_APP_TEXT_INPUT_OPA
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APPLICATION_INTERACTIVE_SHELL_APP_VOICE_INPUT_OPA
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APPLICATION_INTERACTIVE_TEXT_SEARCH_GOOGLE_APP
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APPLICATION_INTERACTIVE_TEXT_SEARCH_QEA
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APPLICATION_INTERACTIVE_TEXT_SEARCH_SNA
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APPLICATION_INTERACTIVE_VOICE_SEARCH_GOOGLE_APP
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APPLICATION_INTERACTIVE_VOICE_SEARCH_QEA
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APPLICATION_INTERACTIVE_VOICE_SEARCH_SNA
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACITONS_INTENT_SHORTCUTS_CREATION_START
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.APP_ACTIONS_INTENT_SHORTCUTS_CREATION
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_DEEPLINK_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r2)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_DEEPLINK_START
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.APP_ACTIONS_SHORTCUTS_STARTUP
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_NOTIFICATION_SHORTCUT_SAVE_CLICKED
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.APP_ACTIONS_SHORTCUTS_STARTUP
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_NOTIFICATION_SHORTCUT_SAVE_RESPONSE_CLIENT_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r2)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_NOTIFICATION_SHORTCUT_SAVE_RESPONSE_SERVER_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r2)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_NOTIFICATION_SHORTCUT_VIEW_CLICKED
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.APP_ACTIONS_SHORTCUTS_STARTUP
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_OVERLAY_SHORTCUT_RETRY_CLICKED
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.APP_ACTIONS_SHORTCUTS_UPDATE
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_OVERLAY_SHORTCUT_SAVE_CLICKED
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.APP_ACTIONS_SHORTCUTS_UPDATE
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SETTINGS_ABORT
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r2)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SETTINGS_DATA_FETCH_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r2)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SETTINGS_DELETE_CLICKED
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.APP_ACTIONS_SHORTCUTS_UPDATE
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SETTINGS_PAGE_LOADED
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r2)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SETTINGS_QUICK_SAVE_CLICKED
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.APP_ACTIONS_SHORTCUTS_UPDATE
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SETTINGS_SAVE_CLICKED
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.APP_ACTIONS_SHORTCUTS_UPDATE
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SETTINGS_START
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.APP_ACTIONS_SHORTCUTS_STARTUP
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SETTINGS_UNDO_CLICKED
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.APP_ACTIONS_SHORTCUTS_UPDATE
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SETTINGS_UPDATE_CLICKED
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.APP_ACTIONS_SHORTCUTS_UPDATE
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SHORTCUTS_CONFIRMATION_PAGE_EXPLORE_CLICKED
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.APP_ACTIONS_SHORTCUTS_STARTUP
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SHORTCUTS_CONFIRMATION_PAGE_LOADED
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r2)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SHORTCUTS_CONTENT_PAGE_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r2)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SHORTCUTS_CONTENT_PAGE_LOADED
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r2)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SHORTCUTS_CONTENT_PAGE_RESPONSE_CLIENT_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r2)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SHORTCUTS_CONTENT_PAGE_RESPONSE_SERVER_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r3 = new com.google.android.apps.gsa.shared.logger.b.y
            r3.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r2)
            r0.put(r1, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_CLIENT_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r14)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_SERVER_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r14)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r14)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SLICE_CLIENTOP_RECEIVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.APP_ACTIONS_SLICE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SLICE_END_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SLICE_CLIENTOP_RECEIVED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SLICE_END_PERMISSION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SLICE_CLIENTOP_RECEIVED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SLICE_END_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SLICE_CLIENTOP_RECEIVED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r13)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_DIRECTORY_APP_DETAILS_PAGE_CREATE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_APP_DIRECTORY_DETAILS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_DIRECTORY_APP_DETAILS_PAGE_DONE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r133
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_DIRECTORY_APP_DETAILS_PAGE_RETRY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_APP_DIRECTORY_DETAILS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_DIRECTORY_CATEGORY_PAGE_CREATE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_APP_DIRECTORY_CATEGORY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_DIRECTORY_CATEGORY_PAGE_DONE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r121
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_DIRECTORY_CATEGORY_PAGE_RETRY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_APP_DIRECTORY_CATEGORY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_DIRECTORY_HOME_PAGE_CREATE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_APP_DIRECTORY_HOME
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_DIRECTORY_HOME_PAGE_DONE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r113
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_DIRECTORY_HOME_PAGE_RETRY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_APP_DIRECTORY_HOME
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_INTEGRATION_GRPC_MIC_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r102
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_INTEGRATION_MIC_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASR_PREFETCH_RECEIVED_BY_SEARCH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_ASR_PREFETCH_IN_SEARCH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASR_PREFETCH_RECOGNITION_EVENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_ASR_PREFETCH_IN_INTERACTOR
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASR_PREFETCH_S3_HANDOVER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASR_PREFETCH_RECEIVED_BY_SEARCH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASR_PREFETCH_SEARCH_HANDOVER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASR_PREFETCH_RECOGNITION_EVENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_ACTION_DATA_RENDER_STARTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_TEXT_SEARCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CAR_CAPABILITIES_END
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CAR_CAPABILITIES_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CAR_CAPABILITIES_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_CAR_CAPABILITIES
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CAR_PROJECT_ID_END
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CAR_PROJECT_ID_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CAR_PROJECT_ID_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_CAR_PROJECT_ID
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CAR_PROPERTY_METADATA_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CAR_PROPERTY_METADATA_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CAR_PROPERTY_METADATA_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_CAR_PROPERTY_METADATA
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CAR_PROPERTY_METADATA_SUCCESSFUL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CAR_PROPERTY_METADATA_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CLIENTOP_RENDER_STARTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_TEXT_SEARCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_ACCOUNT_CHANGED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r4 = r90
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_CONTACTS_UNCHANGED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_CONTACT_UPLOAD_ACCOUNT_CHANGE
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_SYNC_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4, (com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_SYNC_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_HASH_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_SYNC_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_NOTICE_ACCEPTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_NOTICE_SHOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_NOTICE_DECLINED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_NOTICE_SHOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_NOTICE_SHOWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_CONTACT_UPLOAD_NOTICE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_NO_PAIRED_CONTACTS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_SYNC_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_PERMISSION_UNAVAILABLE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_SYNC_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_SERVER_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_SYNC_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_SUCCEEDED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_CONTACT_UPLOAD_ACCOUNT_CHANGE
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_SYNC_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4, (com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_CONTACT_UPLOAD_SYNC_STARTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_CONTACT_UPLOAD
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_END_GENERAL_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r4 = r77
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_END_IMMERSIVE_UI_CLICKED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r5 = r34
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_END_NO_SPEECH_DETECTED_CANCEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_END_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_END_TIMEOUT_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_END_USER_TAPPED_OUT_CANCEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_HOTWORD_OVERRIDE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r4 = r46
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_ONLINE_ACTION_DATA_RENDER_STARTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_TEXT_SEARCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_ONLINE_CLIENTOP_RENDER_STARTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_TEXT_SEARCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_PUNT_RENDER_STARTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_TEXT_SEARCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_ROUTINE_EXECUTION_CANCELLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r4 = r17
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_ROUTINE_EXECUTION_ENDED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_ROUTINE_EXECUTION_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_SUGGESTION_GENERATION_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_SUGGESTION_GENERATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_SUGGESTION_GENERATION_SKIPPED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_SUGGESTION_GENERATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_SUGGESTION_GENERATION_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_SUGGESTIONS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_SUGGESTION_GENERATION_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_SUGGESTION_GENERATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_TEXT_SEARCH_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_TEXT_SEARCH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AVS_ENABLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AVS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AVS_GLEAMS_DISPOSED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AVS_ENABLED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_LOCK_SCREEN_ENTRY_POINT_DISMISSED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_LOCK_SCREEN_ENTRY_POINT_DISMISS_REQUESTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_LOCK_SCREEN_ENTRY_POINT_DISMISS_REQUESTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_LOCK_SCREEN_ENTRY_POINT_DISMISS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_LOCK_SCREEN_ENTRY_POINT_DISPLAYED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_LOCK_SCREEN_ENTRY_POINT_REQUESTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_LOCK_SCREEN_ENTRY_POINT_REQUESTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_LOCK_SCREEN_ENTRY_POINT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_PREINVOCATION_CONTENT_FETCH_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_PREINVOCATION_STAGE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_PREINVOCATION_CONTENT_RESPONSE_IGNORED_IN_DRL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_PREINVOCATION_CONTENT_FETCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_PREINVOCATION_CONTENT_RESPONSE_SHOWING_CHIPS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_PREINVOCATION_CONTENT_FETCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_PREINVOCATION_CONTENT_RESPONSE_SHOWING_FRE_SUGGESTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_PREINVOCATION_CONTENT_FETCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_PREINVOCATION_CONTENT_RESPONSE_SHOWING_GREETING
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_PREINVOCATION_CONTENT_FETCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AUM_ACTION_LOGGED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AUM_RESOLVE_CONTACT_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AUM_RESOLVE_CONTACT_STARTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.AUM_CLIENT_EXECUTOR
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.BACKGROUND_RETRY_CACHE_HIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.BACKGROUND_RETRY_SEARCH_GRAPH_SUCCESS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.BACKGROUND_RETRY_EXPLICIT_OPTIN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.BACKGROUND_RETRY_SUCCESSFUL_RETRY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.BACKGROUND_RETRY_IMPLICIT_OPTIN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.BACKGROUND_RETRY_SUCCESSFUL_RETRY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.BACKGROUND_RETRY_SEARCH_GRAPH_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.BACKGROUND_RETRY_OPENING_RESULTS
            r5 = r52
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4, (com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.CCT_FIRST_CONTENTFUL_PAINT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r4 = r62
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.CCT_LAUNCHED_WITHOUT_SESSION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.CCT_NAVIGATION_ABORTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.CCT_NAVIGATION_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.CCT_NOT_LAUNCHED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.CCT_SHARE_URL_BROADCAST_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.CCT_SHARE_URL_BROADCAST_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.CCT_SHARE_URL_BROADCAST_STARTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.CCT_SHARE_URL
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.CCT_SHARE_URL_BROADCAST_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.CCT_SHARE_URL_BROADCAST_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.COLLECTIONS_TAB_TAPPED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.COLLECTIONS_TAB_LOAD
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_DRIVING_SCREEN_ACTIVITY_ON_CREATE_BY_ACTIVITY_RECOGNITION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DEPRECATED_MORRIS_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_DRIVING_SCREEN_ACTIVITY_ON_CREATE_BY_BLUETOOTH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DEPRECATED_MORRIS_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_DRIVING_SCREEN_ACTIVITY_ON_CREATE_BY_LETS_DRIVE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DEPRECATED_MORRIS_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_DRIVING_SCREEN_ACTIVITY_ON_RESUME_START_MORRIS_BY_ACTIVITY_RECOGNITION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DEPRECATED_MORRIS_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_DRIVING_SCREEN_ACTIVITY_ON_RESUME_START_MORRIS_BY_BLUETOOTH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DEPRECATED_MORRIS_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_DRIVING_SCREEN_ACTIVITY_ON_RESUME_START_MORRIS_BY_LETS_DRIVE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DEPRECATED_MORRIS_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_DRIVING_SCREEN_ACTIVITY_ON_START_START_MORRIS_BY_ACTIVITY_RECOGNITION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DEPRECATED_MORRIS_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_DRIVING_SCREEN_ACTIVITY_ON_START_START_MORRIS_BY_BLUETOOTH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DEPRECATED_MORRIS_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_DRIVING_SCREEN_ACTIVITY_ON_START_START_MORRIS_BY_LETS_DRIVE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DEPRECATED_MORRIS_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_ENABLE_CAR_MODE_MORRIS_ALREADY_RUNNING
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r5 = r109
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_FRAMEWORK_START_MORRIS_ALREADY_RUNNING
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_GUIDED_NAV_IN_FOREGROUND
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DEPRECATED_MORRIS_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_GUIDED_NAV_IN_FOREGROUND_TRIGGERED_BY_SCREEN_ROTATION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DEPRECATED_MORRIS_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_MINI_ALREADY_RUNNING
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_MORRIS_CONTROLLER_SHOW_MORRIS_UI_FAILED_CAR_MODE_NOT_TRIGGERED_BY_MORRIS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_MORRIS_CONTROLLER_SHOW_MORRIS_UI_FAILED_INVALID_HOSTING_APP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_MORRIS_STATUS_PROVIDER_CAR_MODE_ENTRY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DEPRECATED_MORRIS_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_MORRIS_STATUS_PROVIDER_CAR_MODE_ENTRY_ASSISTANT_SERVER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DEPRECATED_MORRIS_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_MORRIS_STATUS_PROVIDER_CAR_MODE_ENTRY_DRIVING_MODE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DEPRECATED_MORRIS_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_MORRIS_STATUS_PROVIDER_CAR_MODE_ENTRY_NO_TRIGGER_SOURCE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DEPRECATED_MORRIS_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_MORRIS_STATUS_PROVIDER_CAR_MODE_ENTRY_VANAGON
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DEPRECATED_MORRIS_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_NOT_ELIGIBLE_FOR_MORRIS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_NOT_ELIGIBLE_FOR_MORRIS_DISABLED_BY_CAR_MODE_ALREADY_ENABLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_NOT_ELIGIBLE_FOR_MORRIS_DISABLED_BY_EXPERIMENT_FLAG
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_NOT_ELIGIBLE_FOR_MORRIS_DISABLED_BY_FREENAV
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_NOT_ELIGIBLE_FOR_MORRIS_DISABLED_BY_GEARHEAD_CONDITIONS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_NOT_ELIGIBLE_FOR_MORRIS_DISABLED_BY_LANDSCAPE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_NOT_ELIGIBLE_FOR_MORRIS_DISABLED_BY_OOBE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_NOT_ELIGIBLE_FOR_MORRIS_DISABLED_BY_OPA_AVAILABILITY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_NOT_ELIGIBLE_FOR_MORRIS_DISABLED_BY_OPT_IN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_NOT_ELIGIBLE_FOR_MORRIS_DISABLED_BY_OPT_OUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_NOT_ELIGIBLE_FOR_MORRIS_DISABLED_BY_SETTING
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_NOT_ELIGIBLE_FOR_MORRIS_DISABLED_BY_TALKBACK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_NOT_ELIGIBLE_FOR_MORRIS_DISABLED_BY_UPSIDE_DOWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_NOT_ELIGIBLE_FOR_MORRIS_DISABLED_BY_VANAGON
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_NOT_ELIGIBLE_FOR_MORRIS_DISABLED_ON_AMBIENT_SCREEN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_NOT_ELIGIBLE_FOR_MORRIS_DISABLED_OPT_IN_NEEDED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_NOT_ELIGIBLE_FOR_MORRIS_OPT_OUT_DIALOG_A_NEEDED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_NOT_ELIGIBLE_FOR_MORRIS_OPT_OUT_DIALOG_B_NEEDED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_RENDERING_COMPLETE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_RESUME_GUIDED_NAV_IN_FOREGROUND
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DEPRECATED_MORRIS_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_TIMED_OUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_STARTUP_WINDOW_TOKEN_MISSING
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_TEARDOWN_DRIVING_SCREEN_ACTIVITY_ON_PAUSE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_TEARDOWN_EXIT_DRIVING_MODE_INTENT_RECEIVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_TEARDOWN_MORRIS_CONTROLLER_NOT_RESUMED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r5 = r51
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_TEARDOWN_MORRIS_STATUS_PROVIDER_CAR_MODE_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DEPRECATED_MORRIS_TEARDOWN_RENDERING_COMPLETE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_ACTION_UPLOAD_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_ACTION_UPLOAD_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_ACTION_UPLOAD_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DISCOVER_TNG_ACTION_UPLOAD
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_ACTION_UPLOAD_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_ACTION_UPLOAD_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_APP_CLOSE_BACKGROUND_REFRESH_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DISCOVER_TNG_BACKGROUND_REFRESH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_AUTHENTICATION_ERROR_REFRESH_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DISCOVER_TNG_PULL_TO_REFRESH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_BACKGROUND_REFRESH_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r6 = r49
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_BACKGROUND_REFRESH_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DISCOVER_TNG_BACKGROUND_REFRESH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_BACKGROUND_REFRESH_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_DEBUG_PARAMS_UPDATED_REFRESH_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DISCOVER_TNG_PULL_TO_REFRESH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_GOOGLE_PLAY_ERROR_REFRESH_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DISCOVER_TNG_PULL_TO_REFRESH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_NO_CONTENT_ERROR_REFRESH_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DISCOVER_TNG_PULL_TO_REFRESH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_PULL_TO_REFRESH_CANCEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r6 = r98
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_PULL_TO_REFRESH_DISABLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_PULL_TO_REFRESH_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_PULL_TO_REFRESH_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DISCOVER_TNG_PULL_TO_REFRESH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_PULL_TO_REFRESH_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_RESPONSE_ERROR_REFRESH_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DISCOVER_TNG_PULL_TO_REFRESH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_TAP_TO_UPDATE_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DISCOVER_TNG_PULL_TO_REFRESH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_UNEXPECTED_ERROR_REFRESH_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DISCOVER_TNG_PULL_TO_REFRESH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_XUIKIT_REFRESH_COMMAND_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DISCOVER_TNG_PULL_TO_REFRESH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_ALWAYS_ON_DETECTOR_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_HARDWARE_AVAILABILITY_CHANGE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_DSP_ENROLLMENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_HARDWARE_UNAVAILABLE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_KEYPHRASE_LOCALE_ENROLLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_KEYPHRASE_LOCALE_UNSUPPORTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_REJECTED_BISTO_DEVICE_HOTWORD_ACTIVE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r6 = r61
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_START_HOTWORD_RECOGNITION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DSP_HOTWORD_RECOGNITION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_START_HOTWORD_RECOGNITION_ALL_ATTEMPTS_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r7 = r18
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_START_HOTWORD_RECOGNITION_EXHAUSTED_RETRIES
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.DSP_HOTWORD_RECOGNITION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_START_HOTWORD_RECOGNITION_NOT_ENROLLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_START_HOTWORD_RECOGNITION_SUCCEEDED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_START_HOTWORD_RECOGNITION_UNSUPPORTED_OPERATION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ERROR_CARD_VOICE_SEARCH_RETRY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.INTENT_API_OR_LEGACY_VOICE_SEARCH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ESCAPE_HATCH_DISPLAYED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ESCAPE_HATCH_PROVIDED_FROM_SERVER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ESCAPE_HATCH_NGA_SENDER_DROPPED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ESCAPE_HATCH_PERFORMER_RECEIVED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ESCAPE_HATCH_NOT_DISPLAYED_DUE_TO_DRL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ESCAPE_HATCH_PROVIDED_FROM_SERVER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ESCAPE_HATCH_NOT_DISPLAYED_OTHER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ESCAPE_HATCH_PROVIDED_FROM_SERVER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ESCAPE_HATCH_PERFORMER_DROPPED_DUE_TO_IMMERSIVE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ESCAPE_HATCH_PERFORMER_RECEIVED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ESCAPE_HATCH_PERFORMER_DROPPED_DUE_TO_NGA_DISABLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ESCAPE_HATCH_PERFORMER_RECEIVED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ESCAPE_HATCH_PERFORMER_RECEIVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ESCAPE_HATCH_OPA_TO_NGA
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ESCAPE_HATCH_PROVIDED_FROM_SERVER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ESCAPE_HATCH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ESCAPE_HATCH_SENT_FROM_OPA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ESCAPE_HATCH_PERFORMER_RECEIVED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.EXPLORE_ON_CONTENT_CREATED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.EXPLORE_ON_CONTENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.EXPLORE_ON_CONTENT_DRAW_DONE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.EXPLORE_ON_CONTENT_CREATED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.EXPLORE_ON_CONTENT_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.EXPLORE_ON_CONTENT_CREATED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.EXPLORE_ON_CONTENT_NO_SUGGESTIONS_DRAW_DONE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.EXPLORE_ON_CONTENT_CREATED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_CONSENT_SCREEN_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r7 = r55
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_DEVICE_ENROLLMENT_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_DEVICE_SCAN_SCREEN_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_ENROLLMENT_ERROR_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_ENROLLMENT_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.FACE_MATCH_ENROLLMENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_ENROLLMENT_START_OOBE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.FACE_MATCH_ENROLLMENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_ENROLLMENT_SUCCESS_WITHOUT_PERSONAL_RESULTS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_ENROLLMENT_SUCCESS_WITH_PERSONAL_RESULTS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_RECORD_FACE_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_VALUE_PROP_SCREEN_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FAILED_TO_START_2ND_STAGE_HOTWORD
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_CANCEL_BAD
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r7 = r97
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_CANCEL_GOOD
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_DISABLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_FROM_NOTIFICATION_CONTENT_NOT_FOUND_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_FROM_NOTIFICATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_FROM_NOTIFICATION_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NOW_FEED_LAUNCH_FROM_NOTIFICATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_FROM_NOTIFICATION_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_FROM_NOTIFICATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_FROM_NOTIFICATION_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_FROM_NOTIFICATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NOW_FEED_LAUNCH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_NEXT_PAGE_CANCELLED_VIA_NAVIGATION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_NEXT_PAGE_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_NEXT_PAGE_CANCELLED_VIA_REFRESH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_NEXT_PAGE_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_NEXT_PAGE_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_NEXT_PAGE_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_NEXT_PAGE_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.FEED_NEXT_PAGE_SPINNER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_NEXT_PAGE_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_NEXT_PAGE_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_NEXT_PAGE_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_NEXT_PAGE_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_NOT_SHOWN_ON_DRL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_ONBOARDING_CHIP_FETCH_IN_PREINVOCATION_STAGE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_SUCCESS_BLUE_BAR_ASSISTANT_ON_LOCKSCREEN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_SUCCESS_BLUE_BAR_NEST_PROMO
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_SUCCESS_BLUE_BAR_OOBE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_SUCCESS_BLUE_BAR_TELL_MY_FAMILY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_SUCCESS_BLUE_BAR_VOICE_MATCH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_SUCCESS_HERO_CHIP_ASSISTANT_ON_LOCKSCREEN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_SUCCESS_HERO_CHIP_HOMESCREEN_ENTRY_POINT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_SUCCESS_HERO_CHIP_LONG_PRESS_POWER_CONTEXTUAL_EDU
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_SUCCESS_HERO_CHIP_NEST_PROMO
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_SUCCESS_HERO_CHIP_OOBE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_SUCCESS_HERO_CHIP_VOICE_MATCH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ONBOARDING_CHIP_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ORCHESTRATOR_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ORCHESTRATOR_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ORCHESTRATOR_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_FETCH_ORCHESTRATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ORCHESTRATOR_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FETCH_ORCHESTRATOR_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FIRST_DRAW_DONE_CANCEL_ACTIVITY_STOPPED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r7 = r95
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FIRST_DRAW_DONE_DISCOVER_GOOGLE_APP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FIRST_DRAW_DONE_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FIRST_DRAW_DONE_HOME_NIU
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FIRST_DRAW_DONE_HOTWORD_OPA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FIRST_DRAW_DONE_INTERESTS_TAB_SNA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FIRST_DRAW_DONE_LONG_PRESS_HOME_OPA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FIRST_DRAW_DONE_NOTIFICATION_SEARCH_SNA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FIRST_DRAW_DONE_OTHER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FIRST_DRAW_DONE_OTHER_OPA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FIRST_DRAW_DONE_SHELL_APP_OPA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FIRST_DRAW_DONE_SRP_NIU
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FIRST_DRAW_DONE_SUGGEST_NIU
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FIRST_DRAW_DONE_TEXT_SEARCH_GOOGLE_APP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FIRST_DRAW_DONE_TEXT_SEARCH_QEA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FIRST_DRAW_DONE_TEXT_SEARCH_SNA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FIRST_DRAW_DONE_UNKNOWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FIRST_DRAW_DONE_VOICE_SEARCH_GOOGLE_APP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FIRST_DRAW_DONE_VOICE_SEARCH_QEA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FIRST_DRAW_DONE_VOICE_SEARCH_SNA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FRE_ASYNC_FETCH_APP_CONTROL_DISCOVERY_SUGGESTIONS_REQUESTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FRE_FETCH_APP_CONTROL_DISCOVERY_SUGGESTIONS_REQUESTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FRE_SHOW_QUERY_SUGGESTION_FETCH_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FRE_SHOW_QUERY_SUGGESTION_FETCH_REQUESTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FRE_SHOW_QUERY_SUGGESTION_FETCH_REQUESTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.FRE_QUERY_SUGGESTION_INPUT_PLATE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FRE_SHOW_QUERY_SUGGESTION_FETCH_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FRE_SHOW_QUERY_SUGGESTION_FETCH_REQUESTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.GOOGLE_APP_BROWSER_FIRST_RUN_EXPERIENCE_SHOWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HINT_TEXT_RENDER_FINISH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HINT_TEXT_RENDER_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HINT_TEXT_RENDER_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HINT_TEXT_RENDER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTSAUCE_SETTINGS_CENTRAL_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r4 = r56
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTSAUCE_SETTINGS_CENTRAL_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTSAUCE_CENTRAL
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTSAUCE_SETTINGS_CENTRAL_START_FROM_ADJUST_MORE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTSAUCE_CENTRAL
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTSAUCE_SETTINGS_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTSAUCE_SETTINGS_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTSAUCE_SETTINGS_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTSAUCE_SETTINGS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_2ND_STAGE_DSP_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_2ND_STAGE_RECOGNITION_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_2ND_STAGE_VOICE_MATCH_REJECTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_AUTO_MULTI_CLIENT_CANCEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r4 = r60
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_AUTO_ONGOING_SESSION_CANCEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_BISTO_DSP_TRIGGERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_TRIGGER_FLOW_INTERACTOR
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_CALL_OR_QUARTZ_MODE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_CAR_MODE_DETECTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_CLIENT_HANDLES_QUERY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_DETECTED_IN_INTERACTOR_SENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_DSP_TRIGGERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_TRIGGER_FLOW_INTERACTOR
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_DUMP_UTTERANCE_MODE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_IMPOSTER_DETECTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_LOCKSCREEN_ENTRY_DETECTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_MODEL_ASSET_FILE_ALREADY_ENROLLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r7 = r57
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_MODEL_ASSET_FILE_ENROLLMENT_STARTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_MODEL_ASSET_FILE_NOT_FOUND
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_MODEL_DOWNLOAD_CONFIG_CHANGE_DETECTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_MODEL_DOWNLOAD
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_MODEL_DOWNLOAD_REQUEST
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_MODEL_DOWNLOAD
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_MODEL_DOWNLOAD_REQUEST_PHONE_LOCALE_ONLY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_MODEL_DOWNLOAD
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_MODEL_GENERIC_DOWNLOAD_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_MODEL_LEGACY_DOWNLOAD_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_MODEL_LEGACY_DOWNLOAD_SKIPPED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_MODEL_LEGACY_DOWNLOAD_STARTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_MODEL_MDD_DOWNLOAD_AND_INSTALLATION_SKIPPED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_MODEL_MDD_ENROLLMENT_SUCCEEDED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_MODEL_MDD_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_NGA_ALREADY_LISTENING
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_NON_DSP_TRIGGERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_TRIGGER_FLOW_INTERACTOR
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_OPA_DISABLED_DETECTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_OPA_INELIGIBLE_ABLATED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_OPA_ONBOARDING_TRIGGERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_PHONE_CALL_ACTIVE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_QUERY_COMMITTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_REJECTED_BY_SERVER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.WORKER_RECEIVED_HOTWORD_FROM_INTERACTOR
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_SETUP_OR_RETAIL_MODE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_TRIGGERED_IN_SEARCHSERVICE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_TRIGGER_FLOW_SEARCHSERVICE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_TRIGGER_DELEGATED_TO_NGA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_TRIGGER_DROPPED_BY_NGA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_TRIGGER_PASSED_TO_MORRIS_SPEEDRACER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_TRUSTED_DSP_TRIGGERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_TRIGGER_FLOW_INTERACTOR
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_TRUSTED_NON_DSP_TRIGGERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_TRIGGER_FLOW_INTERACTOR
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_VERIFIED_BY_SERVER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.WORKER_RECEIVED_HOTWORD_FROM_INTERACTOR
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_VOICE_ACCESS_DETECTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_VOICE_MATCH_DEFERRED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.IMMERSIVE_CANVAS_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.IMMERSIVE_CANVAS_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.IMMERSIVE_CANVAS_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.IMMERSIVE_CANVAS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.INTENT_API_OR_LEGACY_VOICE_ENDSTATE_CANCEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r4 = r103
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.INTENT_API_OR_LEGACY_VOICE_ENDSTATE_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.INTENT_API_OR_LEGACY_VOICE_ENDSTATE_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.KEYGUARD_UNLOCKED_AFTER_NEAR_MISS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.KEYGUARD_UNLOCKED_AFTER_NEAR_MISS_SINGLETON_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.KEYGUARD_UNLOCKED_AFTER_NEAR_MISS_SINGLETON_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_NEAR_MISS_UNLOCK
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ACCOUNT_MISMATCH_DIALOG_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r7 = r96
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ACTIVITY_ON_CREATE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r7 = r75
            r8 = r78
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r8, (com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ALL_ON_PAUSE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r9 = r82
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ALL_RESUME_REQUESTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_ALL_LOGS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ALL_START_REQUESTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_ALL_LOGS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ASK_CAMERA_PERMISSION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ONBOARDING_WELCOME_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_AUTH_TOKEN_EXCEPTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_AUTH_TOKEN_REQUESTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_AUTH_TOKEN_RECEIVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_AUTH_TOKEN_REQUESTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_AUTH_TOKEN_REQUESTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_AUTH_TOKEN_LOGS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CAMERA_FIRST_FRAME_DISPLAYED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r9 = r69
            r10 = r71
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r10, (com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CAMERA_FIRST_FRAME_DISPLAYED_FOR_STARTUP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CAMERA_OPEN_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CAMERA_OPEN_REQUESTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CAMERA_OPEN_REQUESTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_STARTUP_FIRST_FRAME_CAPTURED
            r10 = r92
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9, (com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r10)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CARD_CLICK_CCT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r9 = r67
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CCT_INTENT_CANCELLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CARD_CLICK_CCT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CCT_INTENT_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CARD_CLICK_CCT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CCT_NAVIGATION_ABORTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CCT_TAB_SHOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CCT_NAVIGATION_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CCT_TAB_SHOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CCT_NOT_LAUNCHED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CARD_CLICK_CCT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CCT_TAB_HIDDEN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r9 = r64
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CCT_TAB_SHOWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_LANDING_PAGE_CCT
            com.google.android.apps.gsa.shared.logger.b.ae r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CARD_CLICK_CCT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9, (com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r10)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CHANNEL_COMPLETE_FINAL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_FINAL_RESPONSE_RENDER
            com.google.android.apps.gsa.shared.logger.b.ae r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_FINAL_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9, (com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r10)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CHANNEL_COMPLETE_GLEAM
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PREFETCH_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CHANNEL_COMPLETE_OTHER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PREFETCH_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_CANCEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_TEXT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_CLIENT_INTERNAL_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_TEXT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_CONTENT_SIZE_LIMIT_EXCEEDED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_TEXT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_DEVICE_REFRESH_AUTO_REFRESH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_CLOUD_COPY_DEVICE_REFRESH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_DEVICE_REFRESH_BUTTON
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_CLOUD_COPY_DEVICE_REFRESH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_DEVICE_REFRESH_INTERNAL_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r9 = r63
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_DEVICE_REFRESH_UPDATED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_DEVICE_REFRESH_ZERO_STATE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_CLOUD_COPY_DEVICE_REFRESH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_INTERNAL_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_TEXT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_NETWORK_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_TEXT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_SEND_THROTTLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_TEXT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_SENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_TEXT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_TEXT_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_CLOUD_COPY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CLOUD_COPY_TEXT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_DOCUMENT_SCANNER_CANCEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_DOCUMENT_SCANNER_TRIGGERED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_DOCUMENT_SCANNER_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_DOCUMENT_SCANNER_TRIGGERED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_DOCUMENT_SCANNER_SHARE_IMAGE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_DOCUMENT_SCANNER_TRIGGERED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_DOCUMENT_SCANNER_SHARE_PDF
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_DOCUMENT_SCANNER_TRIGGERED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_DOCUMENT_SCANNER_TRIGGERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_DOCUMENT_SCANNER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_EARLY_SESSION_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_STARTUP_NETWORK_CONNECTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_FE_CONNECTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r9 = r73
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_FE_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_FE_ERROR_FOR_FINAL_REQUEST_FLOW
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_FINAL_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_FE_ERROR_FOR_HEARTBEAT_FLOW
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_HEARTBEAT_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_FE_ERROR_FOR_PREFETCH_FLOW
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PREFETCH_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_FINAL_REQUEST_SENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_FINAL_REQUEST_TO_RESPONSE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_FIRST_FRAME_CAPTURED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_STARTUP_FIRST_FRAME_RENDERED
            com.google.android.apps.gsa.shared.logger.b.ae r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CAMERA_OPEN_REQUESTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9, (com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r10)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_FIRST_FRAME_DISPLAYED_FOR_FIRST_FRAME_CAPTURED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_FIRST_FRAME_CAPTURED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_FIRST_NETWORK_REQUEST
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r9 = r65
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_FUNNEL_ENTRY_END
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_FUNNEL_ENTRY_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r10)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_FUNNEL_ENTRY_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_FUNNEL_ENTRY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r10)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_GLEAM_RENDERED_AFTER_PREFETCH_RESPONSE_WITH_CHANNEL_COMPLETE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r10 = r74
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r10)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_GRANT_CAMERA_PERMISSION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ONBOARDING_FALLBACK_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_HEARTBEAT_REQUEST_SENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_HEARTBEAT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_HEARTBEAT_RESPONSE_RECEIVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_HEARTBEAT_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_INFO_PANEL_OFFLINE_RENDERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r11 = r89
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_INFO_PANEL_OFFLINE_RENDERED_FOR_STARTUP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_INFO_PANEL_RENDERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_INFO_PANEL_RENDERED_FOR_FINAL_RESPONSE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_CHANNEL_COMPLETE_FINAL
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_INFO_PANEL_RENDERED_FOR_LVF
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r11 = r84
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_INFO_PANEL_RENDERED_FOR_QUERY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r11 = r70
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_INFO_PANEL_RENDERED_FOR_STARTUP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_LIVING_SCENE_CREATE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_LIVING_SCENE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_LIVING_SCENE_HIDDEN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_LIVING_SCENE_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_LIVING_SCENE_LOAD_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_LIVING_SCENE_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_LIVING_SURFACE_HIDDEN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_LIVING_SURFACE_SHOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_LIVING_SURFACE_SHOWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_LIVING_SURFACE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_MISSING_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_STARTUP_MISSED_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_NULL_TOKEN_RECEIVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_AUTH_TOKEN_REQUESTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ONBOARDING_BACK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r11 = r86
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ONBOARDING_DISPLAYED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r13 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_START_REQUESTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r13)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ONBOARDING_FALLBACK_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r13 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_ONBOARDING_FALLBACK
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r13)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ONBOARDING_OPEN_APP_SETTINGS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r13 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ONBOARDING_FALLBACK_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r13)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ONBOARDING_PAUSE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ONBOARDING_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r11 = r79
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ONBOARDING_WELCOME_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_ONBOARDING_WELCOME
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_ENGINE_BEGIN_CREATION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_ON_DEVICE_ENGINE_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_ENGINE_REQUEST_SENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_ON_DEVICE_ENGINE_REQUEST_TO_RESPONSE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_ENGINE_RESPONSE_RECEIVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_ENGINE_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_ENGINE_STARTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_ENGINE_BEGIN_CREATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_INFERENCE_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_ON_DEVICE_INFERENCE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_INIT_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_INIT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_INIT_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_ON_DEVICE_INIT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_INIT_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_INIT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_RESULT_IGNORED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_INFERENCE_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_RESULT_SENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_INFERENCE_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_TRANSLATE_DARK_OCR_RESULTS_RECEIVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_TRANSLATE_OCR_IMAGE_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_TRANSLATE_OCR_IMAGE_SENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_ON_DEVICE_TRANSLATE_INFERENCE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_TRANSLATE_TRANSLATION_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_TRANSLATE_OCR_IMAGE_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_TRANSLATE_TRANSLATION_RECEIVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_DEVICE_TRANSLATE_OCR_IMAGE_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_PAUSE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_ON_PAUSE_FOR_STARTUP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PRECACHE_PREFETCH_REQUEST_SENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_PRECACHE_PREFETCH_REQUEST
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PRECACHE_PREFETCH_RESPONSE_COMPLETE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PRECACHE_PREFETCH_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PRECACHE_PREFETCH_VALIDATION_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PRECACHE_PREFETCH_VALIDATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PRECACHE_PREFETCH_VALIDATION_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_PRECACHE_PREFETCH_VALIDATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PRECACHE_PREFETCH_VALIDATION_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PRECACHE_PREFETCH_VALIDATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PRECACHE_TAP_REQUEST_SENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_PRECACHE_TAP_REQUEST
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PRECACHE_TAP_RESPONSE_COMPLETE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PRECACHE_TAP_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PRECACHE_TAP_VALIDATION_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PRECACHE_TAP_VALIDATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PRECACHE_TAP_VALIDATION_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_PRECACHE_TAP_VALIDATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PRECACHE_TAP_VALIDATION_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PRECACHE_TAP_VALIDATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PREFETCH_ACK_RESPONSE_RECEIVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PREFETCH_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PREFETCH_EXPIRED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_FRAME_SELECTION_TO_GLEAM_RESPONSE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PREFETCH_GLEAMING_RESPONSE_RECEIVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PREFETCH_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PREFETCH_GLEAMING_RESPONSE_RECEIVED_DROPPED_GLEAMS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PREFETCH_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PREFETCH_GLEAMING_RESPONSE_RECEIVED_NO_DROPPED_GLEAMS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PREFETCH_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PREFETCH_REQUEST_SENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r11 = r83
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PREWARM_STREAM_PHOTOS_CONNECTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_PREWARM_STREAM_LOGS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PREWARM_STREAM_PHOTOS_DISCONNECTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PREWARM_STREAM_PHOTOS_CONNECTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PREWARM_STREAM_STOPPED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PREWARM_STREAM_PHOTOS_CONNECTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PRIME_SESSION_REQUEST_TO_CONNECT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_PRIME_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PRIME_SESSION_STOPPED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PRIME_SESSION_REQUEST_TO_CONNECT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_RECEIVED_NO_GLEAMS_FOR_PREFETCH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r10)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_REGION_SEARCH_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_REGION_SEARCH_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r10)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_REGION_SEARCH_REGION_ADJUSTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_REGION_SEARCH
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_REGION_SEARCH_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r10, (com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_REGION_SEARCH_REQUEST_CANCELLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_REGION_SEARCH_REGION_ADJUSTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r10)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_REGION_SEARCH_REQUEST_DROPPED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_REGION_SEARCH_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r10)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_REGION_SEARCH_REQUEST_SENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_REGION_SEARCH_REGION_ADJUSTED
            r11 = r72
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r11, (com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r10)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_REGION_SEARCH_RESPONSE_RECEIVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r10 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_REGION_SEARCH_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r10)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_REQUEST_READY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r10 = r76
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r10)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_RESUME_REQUESTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r11 = r68
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SERVER_BREAKDOWN_END
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SERVER_BREAKDOWN_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SERVER_BREAKDOWN_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_SERVER_BREAKDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SESSION_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_STARTUP_NETWORK_CONNECTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r11, (com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SHUTTER_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_QUERY_TO_RENDER_LVF
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SINGLE_TAP_UP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_QUERY_TO_RENDER
            r11 = r88
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9, (com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r11)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SINGLE_TAP_UP_FROZEN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_QUERY_TO_RENDER_FROZEN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SINGLE_TAP_UP_LVF
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_QUERY_TO_RENDER_LVF
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SRP_CONTENT_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SRP_CONTENT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SRP_CONTENT_FAILURE_BY_CAPTCHA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SRP_CONTENT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SRP_CONTENT_LOADED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SRP_CONTENT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SRP_CONTENT_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_SRP_CONTENT_LOAD
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SRP_WEBVIEW_APP_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SRP_WEBVIEW_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SRP_WEBVIEW_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SRP_WEBVIEW_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SRP_WEBVIEW_FAILURE_BY_CAPTCHA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SRP_WEBVIEW_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SRP_WEBVIEW_INTERRUPTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SRP_WEBVIEW_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SRP_WEBVIEW_LOADED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SRP_WEBVIEW_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_SRP_WEBVIEW_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_SRP_WEBVIEW_LOAD
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_STARTUP_IMAGE_PROCESSING_END
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_STARTUP_IMAGE_PROCESSING_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_STARTUP_IMAGE_PROCESSING_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_STARTUP_IMAGE_READY_FOR_REQUEST
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9, (com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r10)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_START_REQUESTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r9 = r85
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_TEXT_FILTER_ENTER_FROZEN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_TEXT_FILTER_QUERY_TO_RENDER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_TEXT_FILTER_EXTERNAL_IMAGE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_TEXT_FILTER_QUERY_TO_RENDER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_TEXT_FILTER_GALLERY_PICKER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_TEXT_FILTER_QUERY_TO_RENDER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_TEXT_FILTER_INFO_PANEL_RENDERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r9 = r87
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_TEXT_FILTER_SHUTTER_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LENS_TEXT_FILTER_QUERY_TO_RENDER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_TRANSLATE_DEEP_GLEAM_RECEIVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_PREFETCH_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r9)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.LENS_VIEW_ON_CREATE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r8, (com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MDD_LP_DOWNLOAD_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MDD_LP_DOWNLOAD_INITIALIZE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MDD_LP_DOWNLOAD_INITIALIZE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_AUTO_MDD_LP_DOWNLOAD
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MDD_LP_DOWNLOAD_INITIALIZE_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MDD_LP_DOWNLOAD_INITIALIZE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MINUS_ONE_SEARCH_BOX_MIC_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.INTENT_API_OR_LEGACY_VOICE_SEARCH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MONET_ELEMENTS_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.EXPLORE_ON_CONTENT_CREATED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MONET_ELEMENTS_NO_DATA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.EXPLORE_ON_CONTENT_CREATED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_CANCEL_ACTIVITY_STOP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r7 = r94
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_CANCEL_CALL_CONNECTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_CANCEL_CALL_DISCONNECTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_CANCEL_EXISTING_FLOW
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_CANCEL_GENERIC
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_CANCEL_NO_SPEECH_DETECTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_CANCEL_ON_MESSAGE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_CANCEL_ON_SCREEN_MIC
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_END_FAILURE_CANNOT_CONNECT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_END_FAILURE_INTERRUPTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_END_FAILURE_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_END_FAILURE_UNABLE_TO_START_ACTIVITY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_END_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_STARTUP_GENERIC
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_ASSISTANT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_STARTUP_HOTWORD
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_ASSISTANT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_STARTUP_ON_CALL_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_ASSISTANT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_STARTUP_ON_CLIENT_INPUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_ASSISTANT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_STARTUP_ON_EXPERIENCE_LAUNCHER_EXIT_BUTTON
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_ASSISTANT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_STARTUP_ON_GVIS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_ASSISTANT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_STARTUP_ON_IMMERSIVE_MEDIA_BUTTON_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_ASSISTANT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_STARTUP_ON_SCREEN_MIC
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_ASSISTANT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_ASSISTANT_STARTUP_ON_SEND_MESSAGE_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_ASSISTANT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_CALL_INCOMING_CALL_ACCEPTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_CALL_INCOMING_CALL_ADDED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_CALL_INCOMING_CALL_ADDED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_CALL_INCOMING
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_CALL_INCOMING_CALL_DECLINED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_CALL_INCOMING_CALL_ADDED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_CALL_INCOMING_CALL_IGNORED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_CALL_INCOMING_CALL_ADDED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_CALL_INCOMING_CALL_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_CALL_INCOMING_CALL_ADDED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_CALL_OUTGOING_CALL_ADDED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_CALL_OUTGOING
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_CALL_OUTGOING_CALL_RENDERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_CALL_OUTGOING_CALL_ADDED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_CALL_OUTGOING_CALL_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_CALL_OUTGOING_CALL_ADDED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_BROWSE_APP_LIST_LOADING_END
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_BROWSE_APP_LIST_LOADING_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_BROWSE_APP_LIST_LOADING_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_MEDIA_BROWSE_APP_LIST_LOADING
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_BROWSE_FULLSCREEN_USER_CLICK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_MEDIA_BROWSE_ITEM_LOADING
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_BROWSE_ITEM_LOADING_CANCEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r7 = r116
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_BROWSE_ITEM_LOADING_FIND_SOMETHING_ELSE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_BROWSE_ITEM_LOADING_YOUTUBE_FREE_USER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_BROWSE_ITEM_RENDER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_BROWSE_ITEM_USER_CLICK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_MEDIA_BROWSE_ITEM_LOADING
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_BROWSE_PREFETCH_NON_BLOCKING_RETURN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_BROWSE_PREFETCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_BROWSE_PREFETCH_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_MEDIA_BROWSE_PREFETCH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_INITIATED_FROM_EMPTY_STATE_PLAYER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_USER_TAP_EMPTY_STATE_PLAYER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_INITIATION_FROM_EMPTY_STATE_PLAYER_CANCEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_USER_TAP_EMPTY_STATE_PLAYER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_INITIATION_FROM_EMPTY_STATE_PLAYER_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_USER_TAP_EMPTY_STATE_PLAYER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_PLAYED_FROM_MEDIA_BROWSE_ITEM
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_USER_TAP_MEDIA_BROWSE_ITEM
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_PLAYED_FROM_MEDIA_BROWSE_ITEM_CANCEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_USER_TAP_MEDIA_BROWSE_ITEM
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_PLAYED_FROM_MEDIA_BROWSE_ITEM_OR_AUTO_SWITCH_TO_NEXT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_USER_TAP_MEDIA_BROWSE_ITEM
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_PLAYED_FROM_MEDIA_BROWSE_ITEM_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_USER_TAP_MEDIA_BROWSE_ITEM
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_USER_TAP_EMPTY_STATE_PLAYER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_MEDIA_INITIATION_FROM_EMPTY_STATE_PLAYER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_MEDIA_USER_TAP_MEDIA_BROWSE_ITEM
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_MEDIA_PLAY_MEDIA_BROWSE_ITEM
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_APP_INTEGRATION_SERVICE_CLEANUP_COMPLETED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_APP_INTEGRATION_SERVICE_SEARCH_PROCESS_BINDER_DIED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_ASSISTANT_PROCESS_KILLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_CLIENT_PACKAGE_NAME_CHANGED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_CONFIGURATION_CHANGE_LANDSCAPE_MODE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_CONFIGURATION_CHANGE_UPSIDE_DOWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_DISABLE_CAR_MODE_MORRIS_IS_STOPPING
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_DISABLE_CAR_MODE_MORRIS_NOT_ENABLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_DISABLE_CAR_MODE_NOT_TRIGGERED_BY_MORRIS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_DRIVING_SCREEN_ACTIVITY_ON_STOP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_FOREGROUND_APP_POLLING_LANDSCAPE_MODE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_FOREGROUND_APP_POLLING_NOT_WHITELISTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_FRAMEWORK_STOP_MORRIS_NOT_RUNNING
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_GSA_VOICE_INTERACTION_SESSION_FINISH_DURING_ON_SHOW
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_GSA_VOICE_INTERACTION_SESSION_HIDE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_MAESTRO_CONNECTOR_NOTIFY_CLIENT_APP_OF_SERVICE_DISCONNECTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_MAESTRO_CONNECTOR_SERVICE_DISCONNECTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_MODE_ALREADY_OFF
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_NAV_IN_BACKGROUND
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_NAV_STOPPED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_NORMAL_FLOW_COMPLETE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_ON_SEARCH_PROCESS_START_CLEAN_UP_STATES
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_ON_SEARCH_PROCESS_START_CLEAN_UP_STATES_COMPLETED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_RENDERING_MODE_ALREADY_OFF
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_TIMED_OUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_UNCAUGHT_EXCEPTION_HANDLER_CLEANUP_COMPLETED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_UNCAUGHT_EXCEPTION_HANDLER_TRIGGERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_USER_DISABLED_DRIVING_MODE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_WINDOW_NOT_ATTACHED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_WINDOW_TOKEN_INVALID
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MORRIS_TEARDOWN_WINDOW_TOKEN_MISSING
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MORRIS_TEARDOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MULTI_STEP_TRY_SAYING_FLOW_ENDED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MULTI_STEP_TRY_SAYING_FLOW_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MULTI_STEP_TRY_SAYING_FLOW_FOLLOW_UP_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MULTI_STEP_TRY_SAYING_FLOW_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MULTI_STEP_TRY_SAYING_FLOW_QUERY_MISMATCH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MULTI_STEP_TRY_SAYING_FLOW_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MULTI_STEP_TRY_SAYING_FLOW_STARTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.MULTI_STEP_FLOW_FLOW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MULTI_STEP_TRY_SAYING_FLOW_UI_DISMISSED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.MULTI_STEP_TRY_SAYING_FLOW_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NATIVE_COLLECTIONS_INITIALIZE_END
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.COLLECTIONS_TAB_TAPPED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NATIVE_COLLECTIONS_LOAD_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.COLLECTIONS_TAB_TAPPED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NAVIGATION_AFTER_BROWSER_FIRST_RUN_EXPERIENCE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LANDING_PAGE_CLICK
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_ANSWER_UI_RENDERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_ANSWER_UI_RENDER_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_ANSWER_UI_RENDER_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_EXECUTION_UI
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_APP_CONTROL_DISCOVERY_FETCH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_APP_CONTROL_DISCOVERY_IMMEDIATE_FETCH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_ASR_RECOGNITION_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r5 = r93
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_CONFIRMATION_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_CONFIRMATION_USER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_CONFIRMATION_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_CONFIRMATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_CONFIRMATION_USER_ABORT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_CONFIRMATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_CONFIRMATION_USER_ACCEPT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_CONFIRMATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_CONTEXTUAL_PROCESSING_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_CONTEXTUAL_PROCESSING_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_CONTEXTUAL_PROCESSING_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_CONTEXTUAL_PROCESSING
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_CONTEXTUAL_PROCESSING_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_CONTEXTUAL_PROCESSING_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DELIBERATE_INTENT_ACCEPT_CANDIDATE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_RECOGNITION_CANDIDATE_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DELIBERATE_INTENT_ACCEPT_FINAL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_RECOGNITION_CANDIDATE_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DELIBERATE_INTENT_ACCEPT_UTTERANCE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SODA_RECOGNITION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DELIBERATE_INTENT_REJECT_CANDIDATE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_RECOGNITION_CANDIDATE_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DELIBERATE_INTENT_REJECT_FINAL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_RECOGNITION_CANDIDATE_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DELIBERATE_INTENT_REJECT_UTTERANCE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SODA_RECOGNITION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DICTATION_TRIGGER_DEEPLINK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DICTATION_TRIGGER_HOTWORD
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DICTATION_TRIGGER_KEYBOARD_MIC_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DICTATION_TRIGGER_LPH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DICTATION_TRIGGER_OPA_REQUEST
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DICTATION_TRIGGER_SQUEEZE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DICTATION_TRIGGER_SWIPE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DICTATION_TRIGGER_UNKNOWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DISAMBIGUATION_BY_CONTEXT_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DISAMBIGUATION_BY_CONTEXT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DISAMBIGUATION_BY_CONTEXT_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_DISAMBIGUATION_BY_CONTEXT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DISAMBIGUATION_BY_CONTEXT_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DISAMBIGUATION_BY_CONTEXT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DISAMBIGUATION_BY_USER_COMPLETE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DISAMBIGUATION_BY_USER_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DISAMBIGUATION_BY_USER_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_DISAMBIGUATION_BY_USER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DISAMBIGUATION_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DISAMBIGUATION_BY_USER_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DISAMBIGUATION_USER_ABORT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_DISAMBIGUATION_BY_USER_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXECUTING_TRIGGER_NON_VOICE_INTERACTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXECUTING_TRIGGER_UNKNOWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXECUTION_CANCELLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r7 = r91
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXECUTION_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXECUTION_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_DEEPLINK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_HOTWORD
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_LOCKSCREEN_HOTWORD
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_LPH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_MIC_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_OPA_REQUEST
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_PROACTIVE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_PUSH_TO_TALK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_SQUEEZE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_SWIPE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_UNKNOWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_USER_REQUEST
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_EXPLICIT_TRIGGER_WATCH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_HOTWORD_2ND_STAGE_DSP_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_HOTWORD_2ND_STAGE_VOICE_MATCH_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_HOTWORD_2ND_STAGE_VOICE_MATCH_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_IMPLICIT_TRIGGER_ALARM
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_IMPLICIT_TRIGGER_CONTINUED_CONVERSATION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_IMPLICIT_TRIGGER_DEEPLINK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_IMPLICIT_TRIGGER_PICKUP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_IMPLICIT_TRIGGER_TIMER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_IMPLICIT_TRIGGER_UNKNOWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_IMPLICIT_TRIGGER_WAKEWORD
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_VOICE_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_INITIALIZATION_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_INITIALIZATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_INITIALIZATION_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_INITIALIZATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_INITIALIZATION_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_INITIALIZATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_LIFECYCLE_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_LIFECYCLE_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_LIFECYCLE_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_LIFECYCLE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_LIFECYCLE_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_LIFECYCLE_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_AUDIO_PLAYING
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r8 = r80
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_BY_INPUT_PLATE_EXPANSION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_BY_USER_EXPLICIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_BY_USER_IMPLICIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_DATA_STORE_CHANGED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_DIALOG_TERMINATED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_DICTATION_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_EXECUTION_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_HELP_PANEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_INACTIVITY_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_INVALID_REQUEST
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_LOCKED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_LOST_AUDIO_EXCLUSIVE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_MIC_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_NO_CC
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_NO_HL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_NO_RECOGNITION_RECEIVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_NO_SPEECH_DETECTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_OAUTH_USER_RECOVERABLE_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_OPA_KEYBOARD_INPUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_OPA_REQUEST
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_SEARCH_PROCESS_DEAD
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_SHUTDOWN_GESTURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_SPEECH_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_SPEED_BUMP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_TTS_PLAY_STARTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_UNKNOWN_REASON
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PAUSED_ZERO_STATE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_PROACTIVE_RECOGNITION_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_RECOGNITION_CANDIDATE_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_DELIBERATE_INTENT_DETECTION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r8)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_RECOGNITION_END
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_S3_CONNECTION_ABORT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_S3_INITIAL_REQUEST_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_S3_FINAL_RESPONSE_RECEIVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_S3_INITIAL_REQUEST_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_S3_INITIAL_REQUEST_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_S3_COMMUNICATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_S3_RECOGNITION_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_S3_REQUEST_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_S3_INITIAL_REQUEST_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SCREEN_ANNOTATION_ENGINE_PROCESSING_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SCREEN_ANNOTATION_ENGINE_PROCESSING_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SCREEN_ANNOTATION_ENGINE_PROCESSING_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_SCREEN_ANNOTATION_ENGINE_PROCESSING
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SCREEN_ANNOTATION_ENGINE_PROCESSING_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SCREEN_ANNOTATION_ENGINE_PROCESSING_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SESSION_CREATED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_LOGGING_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SESSION_EXPUNGED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SESSION_CREATED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SESSION_LOGGED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SESSION_CREATED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SESSION_LOG_LOST
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SESSION_CREATED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SODA_RECOGNITION_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r7 = r81
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SUGGESTION_CHIP_RECOGNITION_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SYSTEM_RECOGNITION_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_TEXT_QUERY_RECOGNITION_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_UNKNOWN_RECOGNITION_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_WARMACTIONS_CONTEXT_END
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_WARMACTIONS_CONTEXT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_WARMACTIONS_CONTEXT_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.NGA_WARMACTIONS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_WARMACTIONS_CONTEXT_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_WARMACTIONS_CONTEXT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NOTIFICATION_REFRESH_AND_CONTENT_DISPLAYED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_FROM_NOTIFICATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NOTIFICATION_REFRESH_FAILED_CONTENT_MISSING
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FEED_LAUNCH_FROM_NOTIFICATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NOT_SENDING_HOTWORD_DETECTED_IN_INTERACTOR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NOT_SENDING_HOTWORD_DETECTED_NO_AUDIO
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NOT_SENDING_HOTWORD_FOR_ANDROID_TV
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NOT_SENDING_HOTWORD_MISSING_RESULT_OR_DETECTOR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NOW_CARD_CLICK_AMP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LANDING_PAGE_CLICK
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NOW_CARD_CLICK_CCT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LANDING_PAGE_CLICK
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OFFLINE_ACTION_BUILD_END
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OFFLINE_ACTION_BUILD_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OFFLINE_ACTION_BUILD_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_OFFLINE_ACTION_BUILD
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OFFLINE_PUMPKIN_INITIALIZATION_END
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OFFLINE_PUMPKIN_INITIALIZATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OFFLINE_PUMPKIN_INITIALIZATION_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_OFFLINE_ACTION_PUMPKIN_TAGGER_INITIALIZATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OFFLINE_PUMPKIN_TAGGER_END
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OFFLINE_PUMPKIN_TAGGER_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OFFLINE_PUMPKIN_TAGGER_GET_ACTION_DATA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PUMPKIN_GRAPH_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OFFLINE_PUMPKIN_TAGGER_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_OFFLINE_ACTION_PUMPKIN_TAGGER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_CANCEL_DUE_TO_PHONE_COMMUNICATION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r5 = r112
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_3P
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACTIVITY_ON_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_AUTO_TIMER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACTIVITY_ON_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_BACK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACTIVITY_ON_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_BACK_FROM_TAPAS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACTIVITY_ON_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_CLICK_OUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACTIVITY_ON_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_CLICK_TAPAS_BACKGROUND
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACTIVITY_ON_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_CLIENT_OP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACTIVITY_ON_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_CLOSE_IMMERSIVE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACTIVITY_ON_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_DRAG
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACTIVITY_ON_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_FLING
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACTIVITY_ON_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_HOME
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACTIVITY_ON_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_LANGUAGE_CHANGED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACTIVITY_ON_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_NGA_CANCEL_QUERY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACTIVITY_ON_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_OTHER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACTIVITY_ON_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_RELAUNCH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACTIVITY_ON_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_SCROLL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACTIVITY_ON_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_VP_CANCEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACTIVITY_ON_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_START_WITH_TAPAS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.TAPAS_START_UP_FLOW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AMBIENT_UPDATES_CLIENT_SYNC_REQUEST_SENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_AMBIENT_UPDATES_CLIENT_SYNC_REQUEST
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AMBIENT_UPDATES_CLIENT_SYNC_REQUEST_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AMBIENT_UPDATES_CLIENT_SYNC_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AMBIENT_UPDATES_CLIENT_SYNC_REQUEST_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AMBIENT_UPDATES_CLIENT_SYNC_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_ACTIVITY_INPUT_PLATE_FIRST_DRAWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_RICH_INPUT_DRAW_COMPLETE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_RICH_INPUT_DRAW_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_RICH_INPUT_DRAW_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_RICH_INPUT_DRAW_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_RICH_INPUT_DRAW_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ANDROID_RICH_INPUT_DRAW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_ASSIST_GESTURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_END
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_EXPIRED_HOTWORD_TRIGGER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_HEADSET
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_HOTWORD
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_INTERRUPTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_LOCKSCREEN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_MIC_SPEEDBUMP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r6 = r47
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_NOTIFICATION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r7 = r115
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r7)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_OTHER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_REDIRECT_TO_ONBOARDING
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_RELAUNCH_FROM_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_SUPER_LIGHT_INPUT_FIRST_DRAWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_WUWA_ALARM_DISMISSED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ANDROID_WAKE_UP_WITH_ASSISTANT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_WUWA_EXECUTION_CLEANUP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_WUWA_ALARM_DISMISSED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_ZERO_STATE_CREATE_ACTIVITY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_LATENCY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_ZERO_STATE_ENTER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_LATENCY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_ZERO_STATE_RENDERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r100
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_ZERO_STATE_RENDER_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_ZERO_STATE_USER_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CALL_CALLLOG_PERMISSION_DENIED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CALL_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CALL_CALLLOG_QUERY_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CALL_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CALL_CALLLOG_QUERY_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CALL_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CALL_CALL_INTENT_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CALL_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CALL_CALL_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CALL_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CALL_CONNECT_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CALL_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CALL_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_APP_USAGE_REPORT_CALL
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CALL_STARTCALL_PERMISSION_DENIED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CALL_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CAMERA_DONE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CAMERA_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_APP_USAGE_REPORT_CAMERA_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_APP_USAGE_REPORT_CAMERA
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUDIO_PLAYER_CONTROLLER_MEDIA_SESSION_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUDIO_PLAYER_CONTROLLER_MEDIA_SESSION_INITIATED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUDIO_PLAYER_CONTROLLER_MEDIA_SESSION_FINISHED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUDIO_PLAYER_CONTROLLER_MEDIA_SESSION_INITIATED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUDIO_PLAYER_CONTROLLER_MEDIA_SESSION_INITIATED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.AGSA_AUDIO_PLAYER_CONTROLLER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUM_CALL_DIFF_ENDPOINT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r101
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUM_CALL_SAME_ENDPOINT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUM_CONTACT_LOOKUP_CALL_ACTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_AUM_CLIENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUM_CONTACT_LOOKUP_MSG_ACTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_AUM_CLIENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUM_CONTACT_SELECTION_CALL_ACTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_AUM_CLIENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUM_CONTACT_SELECTION_MESSAGE_ACTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_AUM_CLIENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUM_INSTANCE_PICKED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUM_INSTANCE_RESOLVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUM_MSG_DIFF_ENDPOINT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUM_MSG_SAME_ENDPOINT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUM_NOT_APPLIED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUM_RESOLVE_CONTACT_NO_SELECTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUM_RESOLVE_INSTANCE_NO_SELECTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUM_RESOLVE_LABEL_NO_SELECTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUM_RESOLVE_PROVIDER_NO_SELECTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUTO_EMBEDDED_ODL_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUTO_EMBEDDED_RADIO_ODL_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUTO_EMBEDDED_RADIO_ACCESS_DENIED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUTO_EMBEDDED_RADIO_ODL_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUTO_EMBEDDED_RADIO_ENTITY_NOT_FOUND
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUTO_EMBEDDED_RADIO_ODL_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUTO_EMBEDDED_RADIO_FOLDER_NOT_FOUND
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUTO_EMBEDDED_RADIO_ODL_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_AUTO_EMBEDDED_RADIO_ODL_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_AUTO_EMBEDDED_RADIO_ODL
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_ATTACHMENTS_SHARE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_CHAT_PERFORMER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_GOOGLE_PHOTO_SHARE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_CHAT_PERFORMER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_INVALID_ARGS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r132
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_LOCATION_SHARE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_CHAT_PERFORMER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_NO_IMAGE_URI
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_NULL_CHAT_ARGS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SCREENSHOT_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SCREENSHOT_SHARE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_CHAT_PERFORMER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SCREENSHOT_SHARE_FALLBACK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_CHAT_PERFORMER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SEND_AUDIO_MSG
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_CHAT_PERFORMER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SEND_AUDIO_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SEND_MSG_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SEND_TEXT_MSG
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_CHAT_PERFORMER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SEND_TEXT_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SHARE_CONTENT_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SHARE_FILES_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_UNKNOWN_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_WEB_URL_SHARE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_CHAT_PERFORMER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_XMS_WORKER_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHROME_VOICE_SEARCH_CANCEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHROME_VOICE_SEARCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHROME_VOICE_SEARCH_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHROME_VOICE_SEARCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHROME_VOICE_SEARCH_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_CHROME_VOICE_SEARCH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHROME_VOICE_SEARCH_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHROME_VOICE_SEARCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CLIENT_INPUT_SUBMIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_CLIENT_INTERACTION_RELIABILITY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CLIENT_OP_RESULT_SUBMIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_CLIENT_INTERACTION_RELIABILITY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_ACTIVITY_AUTODISMISS_NO_SPEECH_DETECTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_3P_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r126
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_ACTIVITY_STOP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_BACK_PRESSED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_ENTER_LENS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_EXPLICIT_CLOSE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_INLINE_REFINEMENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_KEYBORAD
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r5 = r127
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_LPH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_MIC_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_MULTI_HOTWORD
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_NEW_HOTWORD
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_SQUEEZE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_SUGGESTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_SUGGESTION_CHIP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_TRACKING_NEW_QUERY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_UNKNOWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_USER_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r5 = r108
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_VISUAL_STAGE_CHANGE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CLIENTOP_EXECUTION_CANCELLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CLIENTOP_EXECUTION_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_FAILURE_GENERIC_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_FAILURE_GENERIC_GSA_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_FAILURE_GRAPH_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r5 = r43
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_FAILURE_INVALID_OAUTH_TOKEN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_FAILURE_MISSING_LANGUAGE_PACK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_FAILURE_NO_CONNECTIVITY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_FAILURE_NO_RECOGNITION_RECEIVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_FAILURE_OPA_SSC_USER_DISCONNECT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_FAILURE_RECOGNIZER_NO_MATCH_FROM_NETWORK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_FAILURE_S3_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_FAILURE_SEARCH_PROCESS_DEAD
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_FAILURE_SERVER_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_FAILURE_SPEECH_PIPELINE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_FAILURE_UNRELIABLE_NETWORK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_NGA_HANDOVER_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_NO_SPEECH_DETECTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_RECOGNIZER_NO_SPEECH_DETECTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_EXPLORE_WEBVIEW_CREATE_DONE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_EXPLORE_WEBVIEW_CREATE_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_EXPLORE_WEBVIEW_CREATE_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_EXPLORE_WEBVIEW_CREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_EXPLORE_WEBVIEW_INITIAL_PAGE_DONE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_EXPLORE_WEBVIEW_INITIAL_PAGE_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_EXPLORE_WEBVIEW_INITIAL_PAGE_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_EXPLORE_WEBVIEW_INITIAL_PAGE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_FLUID_ACTION_FLOW_CANCEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_FLUID_ACTION_FLOW_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_FLUID_ACTION_FLOW_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_FLUID_ACTION_FLOW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_FLUID_ACTION_FLOW_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_FLUID_ACTION_FLOW_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_FOLLOW_ON_QUERY_COMMIT_ACTION_V2
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_VOICE_RELIABILITY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_FRE_INPUT_PLATE_CLOSED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r16
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_FRE_INPUT_PLATE_QUERY_SUGGESTION_CLICKED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_FRE_INPUT_PLATE_QUERY_SUGGESTION_SHOWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_FRE_INPUT_PLATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_FRE_INPUT_PLATE_QUERY_SUGGESTION_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_FRE_INPUT_PLATE_SWIPE_UP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_FRE_INPUT_PLATE_VOICE_QUERY_COMMITTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_GROWTH_NUDGE_UI_CREATION_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_GROWTH_NUDGE_UI_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_GROWTH_NUDGE_UI_DISPLAY_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_GROWTH_NUDGE_UI_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_GROWTH_NUDGE_UI_HIDDEN_BY_OUTSIDE_TOUCH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_GROWTH_NUDGE_UI_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_GROWTH_NUDGE_UI_HIDDEN_BY_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_GROWTH_NUDGE_UI_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_GROWTH_NUDGE_UI_HIDDEN_FOREGROUND_CHANGE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_GROWTH_NUDGE_UI_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_GROWTH_NUDGE_UI_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_GROWTH_NUDGE_UI_DISPLAY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_GROWTH_NUDGE_UI_USER_DISMISSED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_GROWTH_NUDGE_UI_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_IMAGES_LOADED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_RESPONSE_UI_FIRST_DISPLAYED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INLINE_REFINEMENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_TEXT_RELIABILITY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INPUT_PLATE_CLOSED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INPUT_PLATE_SHOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INPUT_PLATE_EXPLORE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INPUT_PLATE_SHOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INPUT_PLATE_OTHER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INPUT_PLATE_SHOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INPUT_PLATE_SHOWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_INPUT_PLATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INPUT_PLATE_SWIPE_UP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INPUT_PLATE_SHOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INPUT_PLATE_TEXT_QUERY_COMMITTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INPUT_PLATE_SHOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INPUT_PLATE_TEXT_QUERY_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INPUT_PLATE_SHOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INPUT_PLATE_VOICE_QUERY_COMMITTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INPUT_PLATE_SHOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INPUT_PLATE_ZERO_STATE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INPUT_PLATE_SHOWN
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_LOGO_CLICKED_ON_ZEROSTATE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_VOICE_RELIABILITY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_MIC_OPEN_FOR_FOLLOW_ON
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_VOICE_RELIABILITY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_MIC_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_VOICE_RELIABILITY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_MORRIS_DASHBOARD_GET_CONTENT_VIEW_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_MORRIS_DASHBOARD_START_GET_CONTENT_VIEW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_MORRIS_DASHBOARD_GET_CONTENT_VIEW_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_MORRIS_DASHBOARD_START_GET_CONTENT_VIEW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_MORRIS_DASHBOARD_START_GET_CONTENT_VIEW
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_MORRIS_DASHBOARD_GET_CONTENT_VIEW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_NOTIFICATION_TAPPED_ASSISTANT_INTERACTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_CLIENT_INTERACTION_RELIABILITY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_NOTIFICATION_TAPPED_EXTERNAL_ACTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_NOTIFICATION_TAP_EXTERNAL_ACTION_RELIABILITY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_OVERAPP_INPUT_PLATE_QUERY_SUGGESTION_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_OVERAPP_INPUT_PLATE_QUERY_SUGGESTION_SHOWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_FRE_INPUT_PLATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_PROACTIVE_AUTO_EMBEDDED_CLIENT_SYNC_REQUEST_SENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_PROACTIVE_AUTO_EMBEDDED_CLIENT_SYNC_REQUEST
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_PROACTIVE_AUTO_EMBEDDED_CLIENT_SYNC_REQUEST_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_PROACTIVE_AUTO_EMBEDDED_CLIENT_SYNC_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_PROACTIVE_AUTO_EMBEDDED_CLIENT_SYNC_REQUEST_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_PROACTIVE_AUTO_EMBEDDED_CLIENT_SYNC_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_PROACTIVE_AUTO_EMBEDDED_DATA_LOADED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_PROACTIVE_AUTO_EMBEDDED_INITIALIZE_DATA
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_PROACTIVE_AUTO_EMBEDDED_INITIALIZE_DATA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_PROACTIVE_AUTO_EMBEDDED_DATA_INITIALIZATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_RESPONSE_UI_FIRST_DISPLAYED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_CARD_IMAGES_RELIABILITY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_CAR_SETUP_ADD_CAR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_SETTINGS_CAR_SETUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_CAR_SETUP_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_CAR_SETUP_ADD_CAR
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_HOME_AUTOMATION_ACCOUNT_LINKING_FROM_PROVIDER_LINK_INTENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_SETTINGS_HOME_AUTOMATION_ACCOUNT_LINKING
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_HOME_AUTOMATION_ACCOUNT_LINKING_FROM_PROVIDER_RESYNC_INTENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_SETTINGS_HOME_AUTOMATION_ACCOUNT_LINKING
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_HOME_AUTOMATION_ACCOUNT_LINKING_FROM_USER_LINK_SELECTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_SETTINGS_HOME_AUTOMATION_ACCOUNT_LINKING
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_HOME_AUTOMATION_ACCOUNT_LINKING_FROM_USER_RESYNC_SELECTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_SETTINGS_HOME_AUTOMATION_ACCOUNT_LINKING
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_HOME_AUTOMATION_ACCOUNT_LINKING_OAUTH_CANCELLATION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r53
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_HOME_AUTOMATION_ACCOUNT_LINKING_OAUTH_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_HOME_AUTOMATION_ACCOUNT_LINKING_SYNC_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_HOME_AUTOMATION_ACCOUNT_LINKING_SYNC_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_PAGE_MAIN_END
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_PAGE_MAIN_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_PAGE_MAIN_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_SETTINGS_PAGE_MAIN_DWELL
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_STARTUP_FRAGMENT_FAILED_TO_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r117
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_STARTUP_INVALID_ACCOUNT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_STARTUP_NETWORK_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_STARTUP_ON_CREATE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_SETTINGS_STARTUP
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_NOTIFICATION_TAPPED_EXTERNAL_ACTION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5, (com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_STARTUP_POST_ONBOARDING
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_SETTINGS_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_STARTUP_REDIRECT_ONBOARDING
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_STARTUP_REDIRECT_TNG
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_STARTUP_REDIRECT_TNG_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_STARTUP_RETRY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_SETTINGS_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_STARTUP_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_STARTUP_UNAUTHORIZED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_WEBVIEW_STARTUP_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_WEBVIEW_STARTUP_ONCREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_WEBVIEW_STARTUP_ONCREATE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_SETTINGS_WEBVIEW_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_WEBVIEW_STARTUP_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SETTINGS_WEBVIEW_STARTUP_ONCREATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SHORTCUT_CONTACT_MATCH_COMPLETE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SHORTCUT_CONTACT_MATCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SHORTCUT_CONTACT_MATCH_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SHORTCUT_CONTACT_MATCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SHORTCUT_CONTACT_MATCH_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_SHORTCUT_CONTACT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SOUND_SEARCH_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SOUND_SEARCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SOUND_SEARCH_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SOUND_SEARCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SOUND_SEARCH_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r50
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SOUND_SEARCH_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SOUND_SEARCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SRP_RESULT_CLICK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LANDING_PAGE_CLICK
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SRP_RESULT_CLICK_REFINE_SEARCH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_TEXT_RELIABILITY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SUGGESTION_CHIP_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_TEXT_RELIABILITY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SUGGESTION_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_TEXT_RELIABILITY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_TEXT_QUERY_SUBMIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_TEXT_RELIABILITY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_TEXT_QUERY_UNKNOWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_TEXT_RELIABILITY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_VOICE_AUTOCOMPLETE_SUGGESTIONS_NOT_RENDERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_VOICE_AUTOCOMPLETE_TRANSCRIPTION_RENDERED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_VOICE_AUTOCOMPLETE_SUGGESTIONS_RENDERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_VOICE_AUTOCOMPLETE_TRANSCRIPTION_RENDERED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_VOICE_AUTOCOMPLETE_TRANSCRIPTION_RENDERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_VOICE_AUTOCOMPLETE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CLIENT_INPUT_FAB_ADD_EVENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_USER_INPUT_REQUIRED_CONVERSATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CLIENT_INPUT_FAB_ADD_NOTE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_USER_INPUT_REQUIRED_CONVERSATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CLIENT_INPUT_FAB_ADD_REMINDER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_USER_INPUT_REQUIRED_CONVERSATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CLIENT_INPUT_FAB_ADD_SHOPPING_ITEM
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_USER_INPUT_REQUIRED_CONVERSATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CLIENT_INPUT_NAL_CARD_ADD_LIST
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_USER_INPUT_REQUIRED_CONVERSATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CLIENT_INPUT_NAL_CARD_ADD_NOTE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_USER_INPUT_REQUIRED_CONVERSATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CLIENT_INPUT_SHOPING_LIST_CARD_ADD_ITEM
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_USER_INPUT_REQUIRED_CONVERSATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CLIENT_SYNC_REQUEST_SENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_CLIENT_SYNC_REQUEST
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CLIENT_SYNC_REQUEST_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CLIENT_SYNC_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CLIENT_SYNC_REQUEST_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CLIENT_SYNC_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CONVERSATION_CANCELED_BY_CLIENT_INPUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r58
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CONVERSATION_CANCELED_BY_NEW_QUERY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CONVERSATION_CANCELED_BY_OPEN_MIC_FROM_ZERO_STATE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CONVERSATION_LOGGING_ON_OPA_ACTIVITY_DESTROY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_CONVERSATION_LOGGING_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_DEEP_LINK_FALLBACK_INTENT_TRIGGERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_DEEP_LINK_HELPER_SCROLL_TO_ELEMENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_DEEP_LINK_FALLBACK_TOAST_MESSAGE_TRIGGERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_DEEP_LINK_HELPER_SCROLL_TO_ELEMENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_DEEP_LINK_FROM_CHAT_UI_FALLBACK_TRIGGERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_DEEP_LINK_FROM_CHAT_UI_TARGET_FOUND
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_DEEP_LINK_FROM_CHAT_UI_TARGET_NOT_FOUND_AND_NO_FALLBACK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_DEEP_LINK_FROM_NOTIFICATION_FALLBACK_TRIGGERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_NOTIFICATION_TAPPED_EXTERNAL_ACTION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_DEEP_LINK_FROM_NOTIFICATION_TARGET_FOUND
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_NOTIFICATION_TAPPED_EXTERNAL_ACTION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_DEEP_LINK_FROM_NOTIFICATION_TARGET_NOT_FOUND_AND_NO_FALLBACK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_NOTIFICATION_TAPPED_EXTERNAL_ACTION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_DEEP_LINK_HELPER_SCROLL_TO_ELEMENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_DEEP_LINK_HANDLING
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_DEEP_LINK_TARGET_FOUND
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_DEEP_LINK_HELPER_SCROLL_TO_ELEMENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_DEEP_LINK_TARGET_NOT_FOUND_AND_NO_FALLBACK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_DEEP_LINK_HELPER_SCROLL_TO_ELEMENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_ADD_CHECKLIST_ITEM
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_FAB_V2_FLOW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_ADD_NOTE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_FAB_V2_FLOW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_ADD_SHOPPING_ITEM
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_FAB_V2_FLOW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_CARD_SOFT_RELOAD
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r44
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_CHECKLIST_CARD_ADD_ITEM
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_FAB_V2_FLOW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_DEEP_LINK_TARGET_FOUND
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_DEEP_LINK_TARGET_NOT_FOUND_AND_NO_FALLBACK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_DISMISSED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_NAL_CARD_ADD_LIST
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_FAB_V2_FLOW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_NAL_CARD_ADD_NOTE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_FAB_V2_FLOW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_OPA_ACTIVITY_DESTROY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_SHOPING_LIST_CARD_ADD_ITEM
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_FAB_V2_FLOW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FAIL_TO_LOAD_SECTION_DATA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_INITIALIZE_SECTION_DATA
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_FRESH_CACHE_LOADED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_INITIALIZE_SECTION_DATA
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_INITIALIZE_LOCAL_DATA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_LOCAL_INITIALIZATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_INITIALIZE_SECTION_DATA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_SECTION_DATA_INITIALIZATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_LOCAL_DATA_LOADED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_INITIALIZE_LOCAL_DATA
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_LOCAL_DATA_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_INITIALIZE_LOCAL_DATA
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_MEDIA_RECOMMENDATION_CLIENT_SYNC_REQUEST_SENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OPA_ZERO_STATE_MEDIA_RECOMMENDATION_CLIENT_SYNC_REQUEST
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_MEDIA_RECOMMENDATION_CLIENT_SYNC_REQUEST_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_MEDIA_RECOMMENDATION_CLIENT_SYNC_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_MEDIA_RECOMMENDATION_CLIENT_SYNC_REQUEST_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_MEDIA_RECOMMENDATION_CLIENT_SYNC_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_NETWORK_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_INITIALIZE_SECTION_DATA
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_NEW_RESPONSE_LOADED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_INITIALIZE_SECTION_DATA
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_REFRESHED_RESPONSE_LOADED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ZERO_STATE_INITIALIZE_SECTION_DATA
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPEN_URL_FROM_NOTIFICATION_CLICK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LANDING_PAGE_CLICK
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OVERAPP_PLATE_AFTER_NUDGE_DISPLAYED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OVERAPP_PLATE_AFTER_NUDGE_REQUESTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OVERAPP_PLATE_AFTER_NUDGE_REQUESTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.OVERAPP_PLATE_AFTER_NUDGE_SHOW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PCP_FORCE_GET_PROACTIVE_CONTENT_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.PCP_FORCE_GET_PROACTIVE_CONTENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PCP_FORCE_GET_PROACTIVE_CONTENT_SUCCEED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PCP_FORCE_GET_PROACTIVE_CONTENT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PCP_FORCE_GET_PROACTIVE_CONTENT_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PCP_FORCE_GET_PROACTIVE_CONTENT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PIE_ELIGIBILITY_REQUEST_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PIE_ELIGIBILITY_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PIE_ELIGIBILITY_REQUEST_SENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.PIE_ELIGIBILITY_REQUEST
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PIE_ELIGIBILITY_REQUEST_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PIE_ELIGIBILITY_REQUEST_SENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PIE_FLOW_DONE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PIE_FLOW_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PIE_FLOW_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.PIE_FLOW_LOG
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_HOMEBASE_LOAD_MORE_RECOMMENDATION_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.PODCAST_LOAD_RECOMENDATIONS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_HOMEBASE_MORE_RECOMMENDATION_LOADED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_HOMEBASE_LOAD_MORE_RECOMMENDATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_IN_APP_SEARCH_RESULT_FULLY_RENDERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_IN_APP_SEARCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_IN_APP_SEARCH_RESULT_RENDERED_NO_RESULT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_IN_APP_SEARCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_IN_APP_SEARCH_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r99
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_IN_APP_SEARCH_START_WAITING_SUGGESTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.PODCAST_SEARCH_SUGGESTIONS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_IN_APP_SEARCH_SUGGESTION_RENDERED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_IN_APP_SEARCH_START_WAITING_SUGGESTION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_PLAYBACK_AUDIO_START_PLAYING
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r104
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_PLAYBACK_SEEK_BACKWARD
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.PODCAST_PLAYBACK
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_PLAYBACK_SEEK_FORWARD
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.PODCAST_PLAYBACK
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_PLAYBACK_SEEK_POSITION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.PODCAST_PLAYBACK
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_PLAYBACK_TOGGLE_PLAY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.PODCAST_PLAYBACK
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_PLAYING_WITH_TRANSCRIPTS_END
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_PLAYING_WITH_TRANSCRIPTS_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_PLAYING_WITH_TRANSCRIPTS_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.PODCAST_PLAYING_WITH_TRANSCRIPTS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_STARTUP_ABORTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r105
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_STARTUP_SHOW_INITIATED_FROM_AGSA_SRP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.PODCAST_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_STARTUP_SHOW_INITIATED_FROM_CHROME_SRP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.PODCAST_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_STARTUP_SHOW_INITIATED_FROM_OPA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.PODCAST_STARTUP
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PODCAST_STARTUP_SHOW_RENDERED_WITH_FULL_DATA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.PUMPKIN_GRAPH_CREATE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_OFFLINE_FROM_QUERY_PROCESS_TO_ACTION_BUILD
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.QEA_VOICE_ENTRY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.INTENT_API_OR_LEGACY_VOICE_SEARCH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.QSB_MIC_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.INTENT_API_OR_LEGACY_VOICE_SEARCH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.RECOGNITION_SERVICE_CANCELLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.RECOGNITION_SERVICE_START_LISTENING
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.RECOGNITION_SERVICE_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.RECOGNITION_SERVICE_START_LISTENING
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.RECOGNITION_SERVICE_START_LISTENING
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.RECOGNITION_SERVICE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.RECOGNITION_SERVICE_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.RECOGNITION_SERVICE_START_LISTENING
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.RUN_ENROLLMENT_GET_HOTWORD_DATA_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r120
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.RUN_ENROLLMENT_INCOMPATIBLE_HOTWORD_MODEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.RUN_ENROLLMENT_NO_AUDIO_SOURCES
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.RUN_ENROLLMENT_NO_UTTERANCES
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.S3_HEADER_REQUEST_CREATION_ABORTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.S3_HEADER_REQUEST_CREATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.S3_HEADER_REQUEST_CREATION_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.S3_HEADER_REQUEST_CREATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.S3_HEADER_REQUEST_CREATION_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.S3_HEADER_REQUEST_CREATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.S3_HEADER_REQUEST_CREATION_SUCCESSFUL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.S3_HEADER_REQUEST_CREATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SEARCH_FROM_NOTIFICATION_COMMITTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SEARCH_FROM_NOTIFICATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SEARCH_FROM_NOTIFICATION_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.SEARCH_FROM_NOTIFICATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SEARCH_FROM_NOTIFICATION_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SEARCH_FROM_NOTIFICATION_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SEARCH_HOMESCREEN_LINGO_CAMERA_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LINGO_CAMERA_STARTUP_ENTRY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SEARCH_LINGO_CAMERA_PERMISSION_DENIED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r5 = r66
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SEARCH_LINGO_CAMERA_VIEWFINDER_CREATED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SEARCH_QUERY_DEEPLINK_INTENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ANY_DEEPLINK_INTENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SEARCH_SERVICE_ON_CREATE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.STARTUP_FIRST_DRAW_DONE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SEARCH_WIDGET_LINGO_CAMERA_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LINGO_CAMERA_STARTUP_ENTRY
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SEARCH_WIDGET_MIC_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r5 = r122
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_PROVIDERS_DOWNLOAD_COMPLETED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_PROVIDERS_DOWNLOAD_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_PROVIDERS_DOWNLOAD_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_PROVIDERS_DOWNLOAD_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_PROVIDERS_DOWNLOAD_STARTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.SELECTABLE_SEARCH_WIDGET_PROVIDERS_DOWNLOAD
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_PROVIDERS_DOWNLOAD_URL_MALFORMED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_PROVIDERS_DOWNLOAD_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_PROVIDERS_READ_DATA_INVALID
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_PROVIDERS_DOWNLOAD_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_PROVIDERS_READ_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_PROVIDERS_DOWNLOAD_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_UPDATE_APP_STATE_COMPLETED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r5 = r107
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_UPDATE_APP_STATE_DISABLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_UPDATE_APP_STATE_RECEIVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.SELECTABLE_SEARCH_WIDGET_UPDATE_REQUESTS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_UPDATE_DSE_COMPLETED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_UPDATE_DSE_DISABLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SELECTABLE_SEARCH_WIDGET_UPDATE_DSE_RECEIVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.SELECTABLE_SEARCH_WIDGET_UPDATE_REQUESTS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SETUP_BAR_CONTENT_EMPTY_DEMO_USER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SETUP_BAR_CONTENT_FETCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SETUP_BAR_CONTENT_EMPTY_SIGNED_OUT_MODE_USER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SETUP_BAR_CONTENT_FETCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SETUP_BAR_CONTENT_EMPTY_SUPPRESSED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SETUP_BAR_CONTENT_FETCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SETUP_BAR_CONTENT_FETCH_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.ASSISTANT_SETUP_BAR_CONTENT_FETCH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SETUP_BAR_CONTENT_FETCH_SUCCESS_ASSISTANT_ON_LOCKSCREEN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SETUP_BAR_CONTENT_FETCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SETUP_BAR_CONTENT_FETCH_SUCCESS_ENTRY_POINT_OPTIN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SETUP_BAR_CONTENT_FETCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SETUP_BAR_CONTENT_FETCH_SUCCESS_NEST_PROMO
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SETUP_BAR_CONTENT_FETCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SETUP_BAR_CONTENT_FETCH_SUCCESS_OOBE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SETUP_BAR_CONTENT_FETCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SETUP_BAR_CONTENT_FETCH_SUCCESS_VOICE_MATCH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SETUP_BAR_CONTENT_FETCH_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SHARE_SCREENSHOT_CANCELLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SHARE_SCREENSHOT_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SHARE_SCREENSHOT_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SHARE_SCREENSHOT_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SHARE_SCREENSHOT_STARTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.SHARE_SCREENSHOT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SHARE_SCREENSHOT_SUCCESSFUL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SHARE_SCREENSHOT_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_ALWAYS_ON_ENROLLMENT_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_FETCH_UTTERANCES_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_GET_HOTWORD_DATA_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_HOTWORD_EVERYWHERE_DISABLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_NO_HOTWORD_DATA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_NO_SPEAKER_ID_MODEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_NO_SPEAKER_ID_SUPPORT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_NO_UTTERANCES
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_SERVICE_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_SPEAKER_ID_MODEL_ALREADY_COMPATIBLE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_START_APP_UPGRADE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_SILENT_ENROLLMENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_START_BAKED_IN_HOTWORD_MODEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_SILENT_ENROLLMENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_START_NEW_MODEL_DOWNLOAD
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_SILENT_ENROLLMENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_START_ON_INSTALL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_SILENT_ENROLLMENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_START_RESTORE_SPEAKER_MODEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_SILENT_ENROLLMENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILENT_ENROLLMENT_UNSUPPORTED_LOCALE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILKYTAB_LOAD_FAILURE_CREATE_WEBVIEW_EXCEPTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.COLLECTIONS_TAB_TAPPED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILKYTAB_LOAD_FAILURE_RESTORE_WEBVIEW_EXCEPTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.COLLECTIONS_TAB_TAPPED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILKYTAB_LOAD_FAILURE_RESTORE_WEBVIEW_NULL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.COLLECTIONS_TAB_TAPPED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILKYTAB_LOAD_FAILURE_WEBVIEW_ERROR_RECEIVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.COLLECTIONS_TAB_TAPPED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SILKYTAB_PAGE_LOAD_END
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.COLLECTIONS_TAB_TAPPED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_2ND_STAGE_HOTWORD_INITIALIZATION_CREATE_SODA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.SODA_2ND_STAGE_HOTWORD_INITIALIZATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_2ND_STAGE_HOTWORD_INITIALIZATION_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r5 = r130
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_2ND_STAGE_HOTWORD_INITIALIZATION_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_2ND_STAGE_HOTWORD_INITIALIZATION_UPDATE_SODA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.SODA_2ND_STAGE_HOTWORD_INITIALIZATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_ENROLLMENT_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_ENROLLMENT_SAVE_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_ENROLLMENT_SAVE_FAILED_NO_ACCOUNT_OR_RESULT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_ENROLLMENT_SAVE_FAILED_NO_MODEL_BYTES
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_ENROLLMENT_SAVE_FAILED_NO_SPEAKER_MODEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_ENROLLMENT_SAVE_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_ENROLLMENT_SODA_ALREADY_IN_USE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_ENROLLMENT_SODA_INIT_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_ENROLLMENT_SODA_NOT_PRESENT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_ENROLLMENT_UTTERANCES_NOT_FOUND
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_START_ASR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.SODA_ASR_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_START_ASR_ON_HOTWORD
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.SODA_ASR_SESSION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SODA_STOP_ASR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r110
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SOFTWARE_HOTWORD_RECOGNITION_FAILED_TO_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.START_SOFTWARE_HOTWORD_RECOGNITION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SOFTWARE_HOTWORD_RECOGNITION_FINISHED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.START_SOFTWARE_HOTWORD_RECOGNITION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_NEW_PLAYBACK_REQUESTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.SPEAKR_PLAYBACK_REQUESTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_PLAYBACK_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r114
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_PLAYBACK_FINISHED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_PLAYBACK_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_PLAYBACK_STARTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.SPEAKR_PLAYBACK
            r5 = r118
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3, (com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_PLAYBACK_STOPPED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_PLAYBACK_STARTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_PLAYLIST_REQUESTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.SPEAKR_GENERATE_PLAYLIST
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_PLAYLIST_REQUEST_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r111
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_PLAYLIST_REQUEST_SUCCEEDED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_PLAYLIST_REQUESTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_READ_IT_LATER_REQUESTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.SPEAKR_START_READ_IT_LATER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_READ_IT_LATER_STARTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_READ_IT_LATER_REQUESTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_READ_IT_NOW_REQUESTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r119
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_READ_IT_NOW_STARTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_READ_IT_NOW_REQUESTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_READ_STATE_UPDATE_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_READ_STATE_UPDATE_REQUESTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_READ_STATE_UPDATE_REQUESTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.SPEAKR_READ_STATUS_UPDATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_READ_STATE_UPDATE_SUCCEEDED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEAKR_READ_STATE_UPDATE_REQUESTED
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SPEECH_END_RECEIVED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.TTS_PLAYED_ENDSTATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SRP_RESULT_CLICK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LANDING_PAGE_CLICK
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SRP_RESULT_CLICK_AMP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LANDING_PAGE_CLICK
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.START_SOFTWARE_HOTWORD_RECOGNITION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.SOFTWARE_HOTWORD_RECOGNITION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.STATE_RECEIVED_HOTWORD_FROM_INTERACTOR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_TRIGGER_FLOW_SEARCHSERVICE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.STATE_RECEIVED_HOTWORD_FROM_INTERACTOR_FOR_NOTE4
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_TRIGGER_FLOW_SEARCHSERVICE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SUGGEST_RESULT_CLICK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.LANDING_PAGE_CLICK
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_ACTIVITY_STOP_CANCEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r124
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_ANSWER_ATTENTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_APP_ACTIONS_SLICE_CHANGE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_CALL_CONTACT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_CANCEL_SUGGESTIONS_FIRST_DRAWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r5 = r123
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_DEVICE_ACTION_SLICE_CHANGE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_ENDSTATE_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_EXTERNAL_APP_OPEN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_EXTERNAL_APP_OPEN_VIDEO
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_NGA_KEYBOARD_INDICATOR_CLICKED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.TAPAS_START_UP_FLOW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_NGA_KEYBOARD_INDICATOR_CLICKED_OPA_ACTIVE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.TAPAS_START_UP_FLOW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_N_PREFIX_CANCEL_SUGGESTIONS_DRAWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_N_PREFIX_UPDATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_N_PREFIX_SUGGESTIONS_DRAWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_N_PREFIX_UPDATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_N_PREFIX_UPDATE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.TAPAS_SERVER_SOURCE_N_PREFIX_FETCH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_OPA_KEYBOARD_INDICATOR_CLICKED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.TAPAS_START_UP_FLOW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_PERFORM_APP_ACTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_PERFORM_HOME_AUTOMATION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_PERFORM_PRODUCTIVITY_ACTION
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_PLAY_MEDIA
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_QUANTUM_KEYBOARD_DISMISSED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_QUANTUM_KEYBOARD_SHOW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_QUANTUM_KEYBOARD_QUERY_SUBMIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_QUANTUM_KEYBOARD_SHOW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_QUANTUM_KEYBOARD_SHOW
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.TAPAS_QUANTUM_KEYBOARD_FLOW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_QUANTUM_KEYBOARD_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_QUANTUM_KEYBOARD_SHOW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_SEND_MESSAGE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.TAPAS_ACTION_FLOW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_START_MID_QUERY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.TAPAS_ACTION_FLOW
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r6)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_START_UP_ENDSTATE_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_SUGGESTIONS_FIRST_DRAWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_TEXT_QUERY_SUBMIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_TEXT_SUGGESTION_SUBMIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_USER_CLEARED_QUERY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_VOICE_SEARCH_REINVOKE_CANCEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_ZERO_PREFIX_CANCEL_SUGGESTIONS_DRAWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_ZERO_PREFIX_UPDATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_ZERO_PREFIX_SUGGESTIONS_DRAWN
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_ZERO_PREFIX_UPDATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_ZERO_PREFIX_UPDATE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.TAPAS_SERVER_SOURCE_ZERO_PREFIX_FETCH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TAPAS_ZERO_STATE_CANCEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TIPMANAGER_SETUP_END
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TIPMANAGER_SETUP_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TIPMANAGER_SETUP_ERROR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TIPMANAGER_SETUP_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TIPMANAGER_SETUP_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.TIPMANAGER
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TNG_VOICE_SEARCH_ASSISTANT_HANDOFF
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TNG_VOICE_SEARCH_CANCEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TNG_VOICE_SEARCH_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TRAMPOLINE_STARTUP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r12)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TTS_PLAY_REQUESTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r125
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VAA_CONSENT_DEEPLINK_COMPLETE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VAA_CONSENT_DEEPLINK_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VAA_CONSENT_DEEPLINK_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VAA_CONSENT_DEEPLINK_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VAA_CONSENT_DEEPLINK_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.VAA_CONSENT_DEEPLINK
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VBUS_ENDSTATE_CANCEL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r106
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VBUS_ENDSTATE_FAILURE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VBUS_ENDSTATE_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VBUS_ENDSTATE_TIMEOUT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VBUS_TEXT_SEARCH_COMMIT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VBUS_NATIVE_SOUND_SEARCH_COMMIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.SOUND_SEARCH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VBUS_SEARCH_RECOMMIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.SEARCH_RECOMMIT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VBUS_TEXT_SEARCH_COMMIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r48
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VBUS_VOICE_SEARCH_COMMIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.VOICE_SEARCH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VELOUR_DEMO_START_WORK
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.VELOUR_JAR_DEMO
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VELOUR_DEMO_WORK_DONE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VELOUR_DEMO_START_WORK
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_INTERACTION_SERVICE_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_DSP_ENROLLMENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_BOTTOM_SHEET_INTRO_SCREEN_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r3 = r129
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_CLOUD_ENROLLMENT_SCREEN_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_CONSENT_SCREEN_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_DEEPLINK_DEVICE_SCAN_SCREEN_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_DEEPLINK_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_DEEPLINK_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.VOICE_MATCH_DEEPLINK
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_DEEPLINK_WELCOME_SCREEN_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_DEEPLINK_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_ENROLLMENT_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_ENROLLMENT_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_ENROLLMENT_SUCCESS_PERSONAL_RESULT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_ENROLLMENT_SUCCESS_SUMMARY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_ENROLLMENT_SUCCESS_TRUSTED_VOICE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_ENROLLMENT_WITH_MODEL_DOWNLOAD_FINISH
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_ENROLLMENT_WITH_MODEL_DOWNLOAD_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_ENROLLMENT_WITH_MODEL_DOWNLOAD_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.VOICE_MATCH_ENROLLMENT_WITH_MODEL_DOWNLOAD
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_DEVICE_SCAN_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_DEVICE_SCAN_EXIT_WITH_NO_SUPPORTED_DEVICE_FOUND
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_PR_DISABLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_PR_ENABLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.VOICE_MATCH_FACE_MATCH_ENROLLMENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_HOTWORD_CONSENT_SCREEN_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_HOTWORD_ENROLLMENT_SCREEN_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_INTRO_SCREEN_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_MULTI_DEVICE_ENROLLMENT_SCREEN_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_PHONE_ENROLLMENT_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.VOICE_MATCH_ENROLLMENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SETTINGS_ALWAYS_ON_DISABLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r4 = r128
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SETTINGS_BLACKLISTED_DEVICE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SETTINGS_COMPLETE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SETTINGS_DSP_ENTER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.VOICE_MATCH_SETTINGS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SETTINGS_FAS_NOT_SUPPORTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SETTINGS_HARDWARE_UNAVAILABLE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SETTINGS_LANGUAGE_UNSUPPORTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SETTINGS_NON_DSP_ENTER
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.VOICE_MATCH_SETTINGS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r5)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SETTINGS_NOT_ENROLLED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SETTINGS_NO_ACCOUNT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SETTINGS_SPEAKER_ID_NOT_SUPPORTED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SETTINGS_SPEAKER_MODEL_NOT_FOUND
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SHARED_DEVICE_ENROLLMENT_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.VOICE_MATCH_ENROLLMENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SLA_ALREADY_ENABLED_SCREEN_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SLA_CONFIRMATION_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SLA_DEVICE_ENROLLMENT_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.VOICE_MATCH_ENROLLMENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SLA_ENROLLMENT_SUCCESS_CONFIRMATION_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SLA_PERSONAL_RESULTS_CONSENT_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SLA_STRUCTURE_ENROLLMENT_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.VOICE_MATCH_ENROLLMENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SLA_VOICE_MATCH_CONSENT_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SUPERVISION_INFO_LOOKUP_FAILED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SUPERVISION_INFO_LOOKUP_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SUPERVISION_INFO_LOOKUP_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.VOICE_MATCH_SUPERVISION_INFO
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SUPERVISION_INFO_LOOKUP_SUCCEEDED
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SUPERVISION_INFO_LOOKUP_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_TRACKER_END
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_TRACKER_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_TRACKER_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.VOICE_MATCH_TRACKER_EVENTS
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r4)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_UPGRADE_SCREEN_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_WAITING_SCREEN_EXIT
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae[]) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_PLATE_MIC_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.INTENT_API_OR_LEGACY_VOICE_SEARCH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_SEARCH_ICON_SHORTCUT_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.INTENT_API_OR_LEGACY_VOICE_SEARCH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_SEARCH_ICON_TAP
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.INTENT_API_OR_LEGACY_VOICE_SEARCH
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_SEARCH_LANGUAGE_CHANGE
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_DSP_ENROLLMENT
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.WIDGET_DOODLE_DOWNLOAD_FAIL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.WIDGET_DOODLE_DOWNLOAD_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.WIDGET_DOODLE_DOWNLOAD_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.WIDGET_DOODLE_DOWNLOAD
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.WIDGET_DOODLE_DOWNLOAD_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.WIDGET_DOODLE_DOWNLOAD_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.WIDGET_DOODLE_SCHEDULE_DOWNLOAD_FAIL
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.WIDGET_DOODLE_SCHEDULE_UPDATE_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.WIDGET_DOODLE_SCHEDULE_DOWNLOAD_SUCCESS
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.WIDGET_DOODLE_SCHEDULE_UPDATE_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.WIDGET_DOODLE_SCHEDULE_UPDATE_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.WIDGET_DOODLE_SCHEDULE_UPDATE
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.WIDGET_DOODLE_SCHEDULE_UPDATE_UNNECESSARY
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.WIDGET_DOODLE_SCHEDULE_UPDATE_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.WIDGET_INSTALL_PROMO_HAS_WIDGET_END
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.WIDGET_INSTALL_PROMO_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.WIDGET_INSTALL_PROMO_NO_WIDGET_END
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.WIDGET_INSTALL_PROMO_START
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89849ae) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.WIDGET_INSTALL_PROMO_START
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.WIDGET_INSTALL_PROMO
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.WORKER_RECEIVED_HOTWORD_FROM_INTERACTOR
            com.google.android.apps.gsa.shared.logger.b.y r2 = new com.google.android.apps.gsa.shared.logger.b.y
            com.google.android.apps.gsa.shared.logger.b.ag r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89851ag.HOTWORD_TRIGGER_FLOW_SERVER_VALIDATION
            r2.<init>((com.google.android.apps.gsa.shared.logger.p7051b.C89851ag) r3)
            r0.put(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.logger.p7051b.C89858h.m146306d():java.util.Map");
    }
}
