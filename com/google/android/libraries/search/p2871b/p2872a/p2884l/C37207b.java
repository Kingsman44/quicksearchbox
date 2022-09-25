package com.google.android.libraries.search.p2871b.p2872a.p2884l;

import com.google.android.libraries.search.p2871b.p2892g.C37239a;
import com.google.android.libraries.search.p2871b.p2892g.C37240b;
import com.google.android.libraries.search.p2871b.p2892g.C37242d;
import com.google.android.libraries.search.p2871b.p2892g.C37243e;
import com.google.android.libraries.search.p2871b.p2892g.C37244f;
import com.google.android.libraries.search.p2871b.p2892g.C37245g;
import com.google.android.libraries.search.p2871b.p2892g.C37246h;
import com.google.common.p4522b.C58490gz;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.b.a.l.b */
/* compiled from: PG */
public final class C37207b implements C37242d {

    /* renamed from: a */
    final Map f98804a;

    /* renamed from: b */
    final Map f98805b;

    /* renamed from: c */
    C37243e f98806c = null;

    public C37207b() {
        HashMap hashMap = new HashMap();
        this.f98804a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f98805b = hashMap2;
        hashMap.put(0, new C37245g(0, "FLOW_TYPE_UNKNOWN"));
        hashMap.put(1, new C37245g(1, "NONE"));
        hashMap.put(101, new C37245g(101, "TRANSCRIPTION_INTENT_API"));
        hashMap.put(102, new C37245g(102, "TRANSCRIPTION_RECOGNITION_SERVICE"));
        hashMap.put(103, new C37245g(103, "TRANSCRIPTION_VOICE_IME"));
        hashMap.put(104, new C37245g(104, "BACKGROUND_SYNC"));
        hashMap.put(105, new C37245g(105, "INTENT_DOWNLOAD_LANGUAGE"));
        hashMap.put(106, new C37245g(106, "INTENT_GET_LANGUAGE_DETAILS"));
        hashMap.put(107, new C37245g(107, "SETTINGS_DOWNLOAD_CONDITION"));
        hashMap.put(108, new C37245g(108, "SETTINGS_LOAD_AVAILABLE_PACK_LIST"));
        hashMap.put(109, new C37245g(109, "SETTINGS_LOAD_DOWNLOADED_PACK_LIST"));
        hashMap.put(110, new C37245g(110, "SETTINGS_PACK_DIALOG"));
        hashMap2.put(0, new C37244f(0, "UNKNOWN_EVENT"));
        hashMap2.put(1, new C37244f(1, "META_START_EVENT"));
        hashMap2.put(2, new C37244f(2, "META_END_EVENT"));
        hashMap2.put(101, new C37244f(101, "INTENT_API_START"));
        hashMap2.put(102, new C37244f(102, "INTENT_API_USER_RETRY"));
        hashMap2.put(103, new C37244f(103, "INTENT_API_FINISH"));
        hashMap2.put(104, new C37244f(104, "INTENT_API_START_OF_SPEECH"));
        hashMap2.put(105, new C37244f(105, "INTENT_API_END_OF_SPEECH"));
        hashMap2.put(106, new C37244f(106, "INTENT_API_MIC_OPENED"));
        hashMap2.put(107, new C37244f(107, "INTENT_API_MIC_CLOSE_REQUESTED"));
        hashMap2.put(108, new C37244f(108, "RECOGNITION_SERVICE_START"));
        hashMap2.put(109, new C37244f(109, "RECOGNITION_SERVICE_FINISH"));
        hashMap2.put(110, new C37244f(110, "RECOGNITION_SERVICE_START_OF_SPEECH"));
        hashMap2.put(111, new C37244f(111, "RECOGNITION_SERVICE_END_OF_SPEECH"));
        hashMap2.put(112, new C37244f(112, "RECOGNITION_SERVICE_MIC_OPENED"));
        hashMap2.put(113, new C37244f(113, "RECOGNITION_SERVICE_MIC_CLOSE_REQUESTED"));
        hashMap2.put(114, new C37244f(114, "RECOGNITION_SERVICE_PREFER_OFFLINE"));
        hashMap2.put(115, new C37244f(115, "RECOGNITION_SERVICE_AUDIO_SOURCE"));
        hashMap2.put(116, new C37244f(116, "INTENT_API_PREFER_OFFLINE"));
        hashMap2.put(117, new C37244f(117, "INTENT_API_AUDIO_RECORDING_REQUESTED"));
        hashMap2.put(118, new C37244f(118, "RECOGNITION_SERVICE_MIC_DEACTIVATED"));
        hashMap2.put(119, new C37244f(119, "INTENT_API_MIC_DEACTIVATED"));
        hashMap2.put(120, new C37244f(120, "RECOGNITION_SERVICE_FALLBACK"));
        hashMap2.put(121, new C37244f(121, "INTENT_API_FALLBACK"));
        hashMap2.put(122, new C37244f(122, "VOICE_IME_START"));
        hashMap2.put(123, new C37244f(123, "VOICE_IME_FINISH"));
        hashMap2.put(124, new C37244f(124, "VOICE_IME_RECOGNITION_START"));
        hashMap2.put(125, new C37244f(125, "VOICE_IME_RECOGNITION_FINISH"));
        hashMap2.put(126, new C37244f(126, "VOICE_IME_RECOGNITION_FALLBACK"));
        hashMap2.put(127, new C37244f(127, "MANAGER_GET_SUPPORTED_PACKS"));
        hashMap2.put(128, new C37244f(128, "MANAGER_GET_INSTALLED_PACKS"));
        hashMap2.put(129, new C37244f(129, "MANAGER_GET_PENDING_PACKS"));
        hashMap2.put(130, new C37244f(130, "MANAGER_INSTALL_PACK"));
        hashMap2.put(131, new C37244f(131, "MANAGER_UNINSTALL_PACK"));
        hashMap2.put(132, new C37244f(132, "MANAGER_GET_PACK"));
        hashMap2.put(133, new C37244f(133, "MANAGER_GET_SUPPORTED_PACKS_DONE"));
        hashMap2.put(134, new C37244f(134, "MANAGER_GET_INSTALLED_PACKS_DONE"));
        hashMap2.put(135, new C37244f(135, "MANAGER_GET_PENDING_PACKS_DONE"));
        hashMap2.put(136, new C37244f(136, "MANAGER_INSTALL_PACK_DONE"));
        hashMap2.put(137, new C37244f(137, "MANAGER_UNINSTALL_PACK_DONE"));
        hashMap2.put(138, new C37244f(138, "MANAGER_GET_PACK_DONE"));
        hashMap2.put(139, new C37244f(139, "ZIPFILE_GET_SUPPORTED_PACKS"));
        hashMap2.put(140, new C37244f(140, "ZIPFILE_GET_SUPPORTED_PACKS_DONE"));
        hashMap2.put(141, new C37244f(141, "ZIPFILE_GET_INSTALLED_PACKS"));
        hashMap2.put(142, new C37244f(142, "ZIPFILE_GET_INSTALLED_PACKS_DONE"));
        hashMap2.put(143, new C37244f(143, "ZIPFILE_GET_PENDING_PACKS"));
        hashMap2.put(144, new C37244f(144, "ZIPFILE_GET_PENDING_PACKS_DONE"));
        hashMap2.put(145, new C37244f(145, "ZIPFILE_INSTALL_PACK"));
        hashMap2.put(146, new C37244f(146, "ZIPFILE_INSTALL_PACK_DONE"));
        hashMap2.put(147, new C37244f(147, "ZIPFILE_UNINSTALL_PACK"));
        hashMap2.put(148, new C37244f(148, "ZIPFILE_UNINSTALL_PACK_DONE"));
        hashMap2.put(149, new C37244f(149, "ZIPFILE_GET_PACK"));
        hashMap2.put(150, new C37244f(150, "ZIPFILE_GET_PACK_DONE"));
        hashMap2.put(151, new C37244f(151, "SYSTEM_GET_SUPPORTED_PACKS"));
        hashMap2.put(152, new C37244f(152, "SYSTEM_GET_SUPPORTED_PACKS_DONE"));
        hashMap2.put(153, new C37244f(153, "SYSTEM_GET_INSTALLED_PACKS"));
        hashMap2.put(154, new C37244f(154, "SYSTEM_GET_INSTALLED_PACKS_DONE"));
        hashMap2.put(155, new C37244f(155, "SYSTEM_GET_PACK"));
        hashMap2.put(156, new C37244f(156, "SYSTEM_GET_PACK_DONE"));
        hashMap2.put(157, new C37244f(157, "REQUEST_LOCALE"));
        hashMap2.put(158, new C37244f(158, "DEREQUEST_LOCALE"));
        hashMap2.put(159, new C37244f(159, "SET_BACKGROUND_DOWNLOAD_CONDITION"));
        hashMap2.put(160, new C37244f(160, "BACKGROUND_SYNC_START"));
        hashMap2.put(161, new C37244f(161, "BACKGROUND_SYNC_END"));
        hashMap2.put(162, new C37244f(162, "INTENT_GET_LANGUAGE_DETAILS_START"));
        hashMap2.put(163, new C37244f(163, "INTENT_GET_LANGUAGE_DETAILS_END"));
        hashMap2.put(164, new C37244f(164, "INTENT_DOWNLOAD_LANGUAGE_START"));
        hashMap2.put(165, new C37244f(165, "INTENT_DOWNLOAD_LANGUAGE_SHOW_DIALOG"));
        hashMap2.put(166, new C37244f(166, "INTENT_DOWNLOAD_LANGUAGE_END"));
        hashMap2.put(167, new C37244f(167, "SETTINGS_PACK_DOWNLOAD_START"));
        hashMap2.put(168, new C37244f(168, "SETTINGS_PACK_UPDATE_START"));
        hashMap2.put(169, new C37244f(169, "SETTINGS_PACK_UNINSTALL_START"));
        hashMap2.put(170, new C37244f(170, "SETTINGS_PACK_DIALOG_END"));
        hashMap2.put(171, new C37244f(171, "SETTINGS_SET_DOWNLOAD_CONDITION_START"));
        hashMap2.put(172, new C37244f(172, "SETTINGS_SET_DOWNLOAD_CONDITION_END"));
        hashMap2.put(173, new C37244f(173, "SETTINGS_LOAD_DOWNLOADED_PACK_LIST_START"));
        hashMap2.put(174, new C37244f(174, "SETTINGS_LOAD_DOWNLOADED_PACK_LIST_END"));
        hashMap2.put(175, new C37244f(175, "SETTINGS_LOAD_AVAILABLE_PACK_LIST_START"));
        hashMap2.put(176, new C37244f(176, "SETTINGS_LOAD_AVAILABLE_PACK_LIST_END"));
        C58490gz gzVar = new C58490gz(4);
        new C58490gz(4);
        gzVar.mo55429h("agsa_transcription_CANCELLED", new C58490gz(4).mo55427f(true));
        gzVar.mo55429h("agsa_transcription_CREATE_RECORDING_FAILED", new C58490gz(4).mo55427f(true));
        gzVar.mo55429h("agsa_transcription_GENERIC", new C58490gz(4).mo55427f(true));
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(0, "OK");
        gzVar2.mo55429h(1, "CANCELLED");
        gzVar2.mo55429h(2, "UNKNOWN");
        gzVar2.mo55429h(3, "INVALID_ARGUMENT");
        gzVar2.mo55429h(4, "DEADLINE_EXCEEDED");
        gzVar2.mo55429h(5, "NOT_FOUND");
        gzVar2.mo55429h(6, "ALREADY_EXISTS");
        gzVar2.mo55429h(7, "PERMISSION_DENIED");
        gzVar2.mo55429h(16, "UNAUTHENTICATED");
        gzVar2.mo55429h(8, "RESOURCE_EXHAUSTED");
        gzVar2.mo55429h(9, "FAILED_PRECONDITION");
        gzVar2.mo55429h(10, "ABORTED");
        gzVar2.mo55429h(11, "OUT_OF_RANGE");
        gzVar2.mo55429h(12, "UNIMPLEMENTED");
        gzVar2.mo55429h(13, "INTERNAL");
        gzVar2.mo55429h(14, "UNAVAILABLE");
        gzVar2.mo55429h(15, "DATA_LOSS");
        gzVar.mo55429h("agsa_transcription_GRPC_ERROR", gzVar2.mo55427f(true));
        gzVar.mo55429h("agsa_transcription_INVALID_INTENT", new C58490gz(4).mo55427f(true));
        gzVar.mo55429h("agsa_transcription_LANGUAGE_PACK_ERROR", new C58490gz(4).mo55427f(true));
        gzVar.mo55429h("agsa_transcription_MICROPHONE_AUDIO_BUFFER_OVERFLOW", new C58490gz(4).mo55427f(true));
        C58490gz gzVar3 = new C58490gz(4);
        gzVar3.mo55429h(0, "UNKNOWN_OPENING_FAILURE");
        gzVar3.mo55429h(100, "FAILED_TO_OPEN_AUDIO_SOURCE");
        gzVar3.mo55429h(101, "FAILED_OPENING_DUE_TO_INACTIVE_CLIENT");
        gzVar3.mo55429h(102, "FAILED_OPENING_MICROPHONE_PERMISSION_DENIED");
        gzVar3.mo55429h(103, "FAILED_OPENING_HOTWORD_DUE_TO_AUDIO_REQUEST_CLIENT_LISTENING");
        gzVar3.mo55429h(104, "FAILED_TO_OPEN_AUDIO_SOURCE_DUE_TO_FAILED_ROUTING");
        gzVar3.mo55429h(105, "FAILED_OPENING_NOT_ALLOWED_HOTWORD_SOURCE_USAGE");
        gzVar3.mo55429h(106, "FAILED_OPENING_DUE_TO_INACTIVE_SESSION");
        gzVar3.mo55429h(107, "FAILED_OPENING_DUE_TO_INACTIVE_AUDIO_ROUTE_SESSION");
        gzVar3.mo55429h(108, "FAILED_OPENING_HOTWORD_INCORRECT_AUDIO_SOURCE_TYPE");
        gzVar3.mo55429h(109, "FAILED_OPENING_OP_NOT_ALLOWED");
        gzVar3.mo55429h(110, "FAILED_OPENING_NOT_ALLOWED_ZERO_MIC_LATENCY_USAGE");
        gzVar3.mo55429h(111, "FAILED_OPENING_PERMISSION_CAPTURE_AUDIO_HOTWORD_DENIED");
        gzVar3.mo55429h(113, "FAILED_OPENING_MIC_OCCUPIED");
        gzVar3.mo55429h(200, "FAILED_OPENING_ERROR_INIT");
        gzVar3.mo55429h(201, "FAILED_OPENING_ERROR_MODE_IN_CALL");
        gzVar3.mo55429h(202, "FAILED_OPENING_ERROR_START_RECORDING");
        gzVar3.mo55429h(203, "FAILED_OPENING_FILE_NOT_FOUND");
        gzVar3.mo55429h(204, "FAILED_OPENING_FILE_SECURITY");
        gzVar3.mo55429h(205, "FAILED_OPENING_FILE_DESCRIPTOR_ERROR");
        gzVar3.mo55429h(206, "FAILED_OPENING_URI_AUTHORITY_ABSENT");
        gzVar3.mo55429h(207, "FAILED_OPENING_CONTENT_PROVIDER_NOT_FOUND");
        gzVar3.mo55429h(208, "FAILED_OPENING_INVALID_CAPTURE_SESSION_ID");
        gzVar3.mo55429h(211, "FAILED_OPENING_ZERO_LATENCY_MIC_INVALID_AUDIO_SOURCE");
        gzVar3.mo55429h(212, "FAILED_OPENING_ZERO_LATENCY_MIC_INVALID_CHANNEL_MASK");
        gzVar3.mo55429h(213, "FAILED_OPENING_ZERO_LATENCY_MIC_REFLECTION_ERROR");
        gzVar3.mo55429h(214, "FAILED_OPENING_MEDIA_SYNC_MIC_INVALID_AUDIO_SOURCE");
        gzVar3.mo55429h(215, "FAILED_OPENING_INVALID_MEDIA_SYNC_EVENT");
        gzVar3.mo55429h(216, "FAILED_OPENING_MISSING_ZERO_LATENCY_MIC_IMPLEMENTATION");
        gzVar3.mo55429h(217, "FAILED_OPENING_MISSING_MEDIA_SYNC_MIC_IMPLEMENTATION");
        gzVar3.mo55429h(218, "FAILED_OPENING_MISSING_SOURCE_ATTRIBUTION");
        gzVar3.mo55429h(219, "FAILED_OPENING_SOURCE_ATTRIBUTION_EXCEPTION");
        gzVar3.mo55429h(220, "FAILED_OPENING_SOURCE_ATTRIBUTION_UNSUPPORTED_AUDIO_SDK");
        gzVar3.mo55429h(222, "FAILED_OPENING_ID_ATTRIBUTION_UNSUPPORTED_AUDIO_SDK");
        gzVar3.mo55429h(221, "FAILED_OPENING_MISSING_DSP_MIC_IMPLEMENTATION");
        gzVar3.mo55429h(300, "FAILED_OPENING_INVALID_WRITEABLE_AUDIO_BUFFER_DATA");
        gzVar3.mo55429h(303, "FAILED_OPENING_ABSENT_WRITEABLE_AUDIO_BUFFER_DATA");
        gzVar3.mo55429h(304, "FAILED_OPENING_HOTWORD_DUE_TO_EXTERNAL_CLIENT_LISTENING");
        gzVar3.mo55429h(307, "FAILED_OPENING_NO_CONNECTION_TO_AUDIO_ADAPTER_FOUND");
        gzVar3.mo55429h(308, "FAILED_OPENING_NO_AUDIO_ADAPTER_FOUND");
        gzVar3.mo55429h(400, "FAILED_OPENING_GRPC_START_LISTENING_STATUS_NOT_RECEIVED");
        gzVar3.mo55429h(401, "FAILED_OPENING_GRPC_START_LISTENING_HOTWORD_STATUS_NOT_RECEIVED");
        gzVar3.mo55429h(500, "FAILED_OPENING_ERROR_RETRIEVING_STATUS");
        gzVar3.mo55429h(501, "FAILED_OPENING_ERROR_RETRIEVING_AUDIO_PARAMS");
        gzVar3.mo55429h(600, "FAILED_OPENING_NO_AUDIO_STREAM_IN_STORE");
        gzVar.mo55429h("agsa_transcription_MICROPHONE_UNAVAILABLE", gzVar3.mo55427f(true));
        gzVar.mo55429h("agsa_transcription_NETWORK_REQUEST_BUILDING", new C58490gz(4).mo55427f(true));
        gzVar.mo55429h("agsa_transcription_NO_SPEECH_DETECTED", new C58490gz(4).mo55427f(true));
        gzVar.mo55429h("agsa_transcription_OFFLINE_RECOGNITION_UNAVAILABLE", new C58490gz(4).mo55427f(true));
        gzVar.mo55429h("agsa_transcription_ONLINE_NO_PROGRESS", new C58490gz(4).mo55427f(true));
        gzVar.mo55429h("agsa_transcription_S3_ERROR", new C58490gz(4).mo55427f(true));
        C58490gz gzVar4 = new C58490gz(4);
        gzVar4.mo55429h(0, "UNKNOWN");
        gzVar4.mo55429h(1, "ALREADY_RUNNING");
        gzVar4.mo55429h(2, "STOPPED_BY_ERROR");
        gzVar.mo55429h("agsa_transcription_SODA_ERROR", gzVar4.mo55427f(true));
        C58490gz gzVar5 = new C58490gz(4);
        gzVar5.mo55429h(0, "NO_ERROR");
        gzVar5.mo55429h(1, "UNKNOWN_FAILURE");
        gzVar5.mo55429h(2, "DOUBLE_INIT");
        gzVar5.mo55429h(3, "INVALID_CONFIG");
        gzVar5.mo55429h(4, "UNSUPPORTED_LOCALE");
        gzVar5.mo55429h(5, "INVALID_LANGUAGE_PACK");
        gzVar5.mo55429h(6, "UNDEFINED_BEHAVIOR");
        gzVar5.mo55429h(7, "MISSING_HOTWORD");
        gzVar5.mo55429h(8, "UNSUPPORTED_LANGUAGE_PACK");
        gzVar5.mo55429h(9, "INVALID_LANGUAGE_PACK_FOR_LANGID");
        gzVar5.mo55429h(10, "INVALID_LANGUAGE_PACK_FOR_DIARIZATION");
        gzVar.mo55429h("agsa_transcription_SODA_INITIALIZATION_ERROR", gzVar5.mo55427f(true));
        this.f98806c = new C37246h(1673, "search_transcription_android", "TNG Transcription", gzVar.mo55427f(true));
    }

    /* renamed from: a */
    public final C37239a mo40690a(int i) {
        Map map = this.f98805b;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (C37239a) this.f98805b.get(valueOf);
        }
        return new C37244f(i, String.valueOf(i));
    }

    /* renamed from: b */
    public final C37240b mo40691b(int i) {
        C37240b bVar = (C37240b) this.f98804a.get(Integer.valueOf(i));
        if (bVar != null) {
            return bVar;
        }
        return new C37245g(i, String.valueOf(i));
    }

    /* renamed from: c */
    public final C37243e mo40692c() {
        return this.f98806c;
    }
}
