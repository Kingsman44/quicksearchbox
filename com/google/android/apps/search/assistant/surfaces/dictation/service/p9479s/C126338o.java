package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119299u;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.o */
/* compiled from: PG */
public final class C126338o {

    /* renamed from: a */
    private final C62910ar f348025a;

    /* renamed from: b */
    private final C62910ar f348026b;

    /* renamed from: c */
    private final C62910ar f348027c;

    /* renamed from: d */
    private final AccessibilityManager f348028d;

    public C126338o(C62910ar arVar, C62910ar arVar2, C62910ar arVar3, AccessibilityManager accessibilityManager) {
        this.f348025a = arVar;
        this.f348026b = arVar2;
        this.f348027c = arVar3;
        this.f348028d = accessibilityManager;
    }

    /* renamed from: a */
    public final Duration mo107564a(C119299u uVar) {
        C62910ar arVar;
        if (this.f348028d.isTouchExplorationEnabled()) {
            return C62950b.m95473d(this.f348027c);
        }
        if (uVar.equals(C119299u.STICKY)) {
            arVar = this.f348025a;
        } else {
            arVar = this.f348026b;
        }
        return C62950b.m95473d(arVar);
    }
}
