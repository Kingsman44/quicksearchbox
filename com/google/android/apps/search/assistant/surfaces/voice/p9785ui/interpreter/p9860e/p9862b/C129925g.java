package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.p9862b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9865g.C129986a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.b.g */
/* compiled from: PG */
public final class C129925g {

    /* renamed from: a */
    public static final C59071e f356384a = C59071e.m91331h();

    /* renamed from: b */
    public final C71422aw f356385b;

    /* renamed from: c */
    public final C42876ab f356386c;

    public C129925g(C71422aw awVar, C42876ab abVar) {
        C69664n.m101061g(awVar, "futureScope");
        C69664n.m101061g(abVar, "protoDataStore");
        this.f356385b = awVar;
        this.f356386c = abVar;
    }

    /* renamed from: a */
    public static final String m212117a(String str, String str2) {
        if (str.length() == 0 || str2.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        String a = C129986a.m212186a(str);
        String a2 = C129986a.m212186a(str2);
        if (a.compareTo(a2) >= 0) {
            return "interpreter_which_mode_key:" + a + ":" + a2;
        }
        return "interpreter_which_mode_key:" + a2 + ":" + a;
    }
}
