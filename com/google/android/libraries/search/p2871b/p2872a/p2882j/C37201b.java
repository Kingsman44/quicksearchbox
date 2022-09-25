package com.google.android.libraries.search.p2871b.p2872a.p2882j;

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

/* renamed from: com.google.android.libraries.search.b.a.j.b */
/* compiled from: PG */
public final class C37201b implements C37242d {

    /* renamed from: a */
    final Map f98711a;

    /* renamed from: b */
    final Map f98712b;

    /* renamed from: c */
    C37243e f98713c = null;

    public C37201b() {
        HashMap hashMap = new HashMap();
        this.f98711a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f98712b = hashMap2;
        hashMap.put(0, new C37245g(0, "FLOW_TYPE_UNKNOWN"));
        hashMap.put(1, new C37245g(1, "NONE"));
        hashMap.put(102, new C37245g(102, "PRONUNCIATION_CONTENT_VIEW"));
        hashMap.put(103, new C37245g(103, "PRONUNCIATION_PRACTICE_VIEW"));
        hashMap2.put(0, new C37244f(0, "UNKNOWN_EVENT"));
        hashMap2.put(1, new C37244f(1, "META_START_EVENT"));
        hashMap2.put(2, new C37244f(2, "META_END_EVENT"));
        hashMap2.put(104, new C37244f(104, "PRACTICE_BUTTON_TAPPED"));
        hashMap2.put(105, new C37244f(105, "PRACTICE_SUGGESTION_CHIP_TAPPED"));
        hashMap2.put(106, new C37244f(106, "CONTENT_VIEW_ENTERED"));
        hashMap2.put(107, new C37244f(107, "CONTENT_VIEW_EXITED"));
        hashMap2.put(108, new C37244f(108, "PRACTICE_VIEW_ENTERED"));
        hashMap2.put(109, new C37244f(109, "PRACTICE_VIEW_EXITED"));
        hashMap2.put(110, new C37244f(110, "PRACTICE_SPEAKING_START"));
        hashMap2.put(111, new C37244f(111, "PRACTICE_SPEAKING_FINISH"));
        hashMap2.put(112, new C37244f(112, "CONTENT_INPUT_BOX_TAPPED"));
        hashMap2.put(113, new C37244f(113, "EXPECTED_PHRASE_TTS_PLAY_BUTTON_TAPPED"));
        hashMap2.put(114, new C37244f(114, "EXPECTED_PHRASE_TTS_STOP_BUTTON_TAPPED"));
        hashMap2.put(115, new C37244f(115, "EXPECTED_WORD_TTS_PLAY_BUTTON_TAPPED"));
        hashMap2.put(116, new C37244f(116, "EXPECTED_WORD_TTS_STOP_BUTTON_TAPPED"));
        hashMap2.put(117, new C37244f(117, "USER_AUDIO_PLAY_BUTTON_TAPPED"));
        hashMap2.put(118, new C37244f(118, "USER_AUDIO_STOP_BUTTON_TAPPED"));
        hashMap2.put(119, new C37244f(119, "MISPRONOUNCED_WORD_TAPPED"));
        hashMap2.put(120, new C37244f(120, "PRACTICE_SUGGESTION_CHIPS_ALL_FINISHED"));
        hashMap2.put(121, new C37244f(121, "SUGGESTED_SIMPLE_PHRASES_ALL_FINISHED"));
        hashMap2.put(122, new C37244f(122, "SUGGESTED_TONGUE_TWISTERS_ALL_FINISHED"));
        C58490gz gzVar = new C58490gz(4);
        new C58490gz(4);
        this.f98713c = new C37246h(1870, "search_pronunciationlearning_android", "TNG Pronunciation Learning", gzVar.mo55427f(true));
    }

    /* renamed from: a */
    public final C37239a mo40690a(int i) {
        Map map = this.f98712b;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (C37239a) this.f98712b.get(valueOf);
        }
        return new C37244f(i, String.valueOf(i));
    }

    /* renamed from: b */
    public final C37240b mo40691b(int i) {
        C37240b bVar = (C37240b) this.f98711a.get(Integer.valueOf(i));
        if (bVar != null) {
            return bVar;
        }
        return new C37245g(i, String.valueOf(i));
    }

    /* renamed from: c */
    public final C37243e mo40692c() {
        return this.f98713c;
    }
}
