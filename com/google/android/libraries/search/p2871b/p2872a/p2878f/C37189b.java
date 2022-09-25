package com.google.android.libraries.search.p2871b.p2872a.p2878f;

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

/* renamed from: com.google.android.libraries.search.b.a.f.b */
/* compiled from: PG */
public final class C37189b implements C37242d {

    /* renamed from: a */
    final Map f98383a;

    /* renamed from: b */
    final Map f98384b;

    /* renamed from: c */
    C37243e f98385c = null;

    public C37189b() {
        HashMap hashMap = new HashMap();
        this.f98383a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f98384b = hashMap2;
        hashMap.put(0, new C37245g(0, "FLOW_TYPE_UNKNOWN"));
        hashMap.put(1, new C37245g(1, "NONE"));
        hashMap.put(101, new C37245g(101, "SODA_HOTWORD_INITIALIZATION"));
        hashMap.put(102, new C37245g(102, "HOTWORD_PFD_CLOSE_BY_TIMEOUT"));
        hashMap.put(103, new C37245g(103, "SILENT_ENROLLMENT"));
        hashMap.put(104, new C37245g(104, "SPEECH_DEEPLINK"));
        hashMap.put(105, new C37245g(105, "SPEECH_DEEPLINK_ENROLL_RESULT"));
        hashMap2.put(0, new C37244f(0, "UNKNOWN_EVENT"));
        hashMap2.put(1, new C37244f(1, "META_START_EVENT"));
        hashMap2.put(2, new C37244f(2, "META_END_EVENT"));
        hashMap2.put(101, new C37244f(101, "SODA_HOTWORD_INITIALIZATION_CREATE_SODA"));
        hashMap2.put(102, new C37244f(102, "SODA_HOTWORD_INITIALIZATION_UPDATE_SODA"));
        hashMap2.put(103, new C37244f(103, "SODA_HOTWORD_INITIALIZATION_UPDATE_DELAYED"));
        hashMap2.put(104, new C37244f(104, "SODA_HOTWORD_LIBRARY_LINK_ERROR"));
        hashMap2.put(105, new C37244f(105, "SODA_HOTWORD_INITIALIZATION_FAILED"));
        hashMap2.put(106, new C37244f(106, "SODA_HOTWORD_INITIALIZATION_SUCCESS"));
        hashMap2.put(107, new C37244f(107, "HOTWORD_PFD_TIME_OUT_EXECUTE"));
        hashMap2.put(108, new C37244f(108, "HOTWORD_PFD_TIME_OUT_SCHEDULED"));
        hashMap2.put(109, new C37244f(109, "HOTWORD_PFD_TIME_OUT_CANCEL"));
        hashMap2.put(110, new C37244f(110, "SILENT_ENROLLMENT_START_NEW_MODEL_DOWNLOAD"));
        hashMap2.put(111, new C37244f(111, "SILENT_ENROLLMENT_START_RESTORE_SPEAKER_MODEL"));
        hashMap2.put(112, new C37244f(112, "SILENT_ENROLLMENT_START_APP_UPGRADE"));
        hashMap2.put(113, new C37244f(113, "SILENT_ENROLLMENT_START_BAKED_IN_HOTWORD_MODEL"));
        hashMap2.put(114, new C37244f(114, "SILENT_ENROLLMENT_SUCCESS"));
        hashMap2.put(115, new C37244f(115, "SILENT_ENROLLMENT_HOTWORD_EVERYWHERE_DISABLED"));
        hashMap2.put(116, new C37244f(116, "SILENT_ENROLLMENT_UNSUPPORTED_LOCALE"));
        hashMap2.put(117, new C37244f(117, "SILENT_ENROLLMENT_NO_SPEAKER_ID_MODEL"));
        hashMap2.put(118, new C37244f(118, "SILENT_ENROLLMENT_SPEAKER_ID_MODEL_ALREADY_COMPATIBLE"));
        hashMap2.put(119, new C37244f(119, "SILENT_ENROLLMENT_SODA_INTERNAL_ERROR"));
        hashMap2.put(120, new C37244f(120, "SILENT_ENROLLMENT_MISSING_ENROLLMENT_DATA"));
        hashMap2.put(121, new C37244f(121, "SILENT_ENROLLMENT_INVALID_ENROLLMENT_DATA"));
        hashMap2.put(122, new C37244f(122, "SILENT_ENROLLMENT_MISSING_HOTWORD_MODEL"));
        hashMap2.put(123, new C37244f(123, "SILENT_ENROLLMENT_STATUS_DELETED_BY_LOCALE_CHANGE"));
        hashMap2.put(124, new C37244f(124, "SILENT_ENROLLMENT_OTHER_ERROR"));
        hashMap2.put(125, new C37244f(125, "SILENT_ENROLLMENT_FIRST_TIME_SODA_MIGRATION"));
        hashMap2.put(126, new C37244f(126, "SILENT_ENROLLMENT_UTTERANCE_FETCH_ATTEMPT"));
        hashMap2.put(127, new C37244f(127, "SILENT_ENROLLMENT_MISSING_ENROLLMENT_DATA_NO_TDSID_MODEL"));
        hashMap2.put(128, new C37244f(128, "SPEECH_DEEPLINK_START"));
        hashMap2.put(129, new C37244f(129, "SPEECH_DEEPLINK_FAIL"));
        hashMap2.put(130, new C37244f(130, "SPEECH_DEEPLINK_FAIL_SILENTLY"));
        hashMap2.put(131, new C37244f(131, "SPEECH_DEEPLINK_FAIL_WITH_SNACKBAR"));
        hashMap2.put(132, new C37244f(132, "SPEECH_DEEPLINK_CANCEL"));
        hashMap2.put(133, new C37244f(133, "SPEECH_DEEPLINK_END_SILENTLY"));
        hashMap2.put(134, new C37244f(134, "SPEECH_DEEPLINK_DELEGATE"));
        hashMap2.put(135, new C37244f(135, "SPEECH_DEEPLINK_HANDLE_ENROLL_RESULT_START"));
        hashMap2.put(136, new C37244f(136, "SPEECH_DEEPLINK_HANDLE_ENROLL_RESULT_SUCCESS"));
        hashMap2.put(137, new C37244f(137, "SPEECH_DEEPLINK_HANDLE_ENROLL_RESULT_ERROR"));
        hashMap2.put(138, new C37244f(138, "SPEECH_DEEPLINK_HANDLE_ENROLL_RESULT_PARTIAL_BUT_ROLLED_BACK"));
        hashMap2.put(139, new C37244f(139, "SPEECH_DEEPLINK_HANDLE_ENROLL_RESULT_PARTIAL_NOT_ROLLED_BACK"));
        C58490gz gzVar = new C58490gz(4);
        new C58490gz(4);
        this.f98385c = new C37246h(1869, "hotword_library_android", "Hotword Library Android", gzVar.mo55427f(true));
    }

    /* renamed from: a */
    public final C37239a mo40690a(int i) {
        Map map = this.f98384b;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (C37239a) this.f98384b.get(valueOf);
        }
        return new C37244f(i, String.valueOf(i));
    }

    /* renamed from: b */
    public final C37240b mo40691b(int i) {
        C37240b bVar = (C37240b) this.f98383a.get(Integer.valueOf(i));
        if (bVar != null) {
            return bVar;
        }
        return new C37245g(i, String.valueOf(i));
    }

    /* renamed from: c */
    public final C37243e mo40692c() {
        return this.f98385c;
    }
}
