package com.google.android.apps.search.assistant.libraries.dictation.starter;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.starter.a */
/* compiled from: PG */
public final class C119305a {

    /* renamed from: b */
    private static final C59071e f332683b = C59071e.m91332i("com.google.android.apps.search.assistant.libraries.dictation.starter.a");

    /* renamed from: a */
    public final AtomicBoolean f332684a = new AtomicBoolean(false);

    /* renamed from: a */
    public final void mo104279a(boolean z) {
        if (z != this.f332684a.getAndSet(z)) {
            ((C59052c) ((C59052c) f332683b.mo56224b()).mo56372aa(34352)).mo56389s("DictationEligibilityCache value changed to: %s [SD]", Boolean.valueOf(z));
        }
    }
}
