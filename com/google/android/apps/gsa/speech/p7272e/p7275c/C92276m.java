package com.google.android.apps.gsa.speech.p7272e.p7275c;

import com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n;

/* renamed from: com.google.android.apps.gsa.speech.e.c.m */
/* compiled from: PG */
public final class C92276m {

    /* renamed from: a */
    private static final C92275l f257315a = new C92275l(52);

    /* renamed from: b */
    private static final C92275l f257316b = new C92275l(89);

    /* renamed from: c */
    private static final C92275l f257317c = new C92275l(474);

    /* renamed from: d */
    private static final C92275l f257318d = new C92275l(496);

    /* renamed from: a */
    public final C92275l mo86962a(C92252n nVar) {
        if (nVar.mo86935b()) {
            return null;
        }
        if (nVar == C92252n.HOTWORD) {
            return f257316b;
        }
        if (nVar == C92252n.VOICE_ACTIONS) {
            return f257317c;
        }
        return nVar == C92252n.DICTATION ? f257318d : f257315a;
    }
}
