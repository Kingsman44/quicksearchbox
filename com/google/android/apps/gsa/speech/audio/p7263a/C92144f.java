package com.google.android.apps.gsa.speech.audio.p7263a;

import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.speech.audio.a.f */
/* compiled from: PG */
final class C92144f implements C92146h {

    /* renamed from: a */
    final /* synthetic */ C92145g f256896a;

    public C92144f(C92145g gVar) {
        this.f256896a = gVar;
    }

    /* renamed from: c */
    private final void m151258c(boolean z) {
        if (this.f256896a.f256907j != null) {
            Intent intent = new Intent("com.google.android.apps.gsa.handsfree.ACTION_SCO_STATE_CHANGED");
            intent.putExtra("com.google.android.apps.gsa.handsfree.EXTRA_SCO_ESTABLISHED", z);
            this.f256896a.f256907j.mo5805d(intent);
        }
    }

    /* renamed from: a */
    public final void mo71726a(int i, int i2) {
        if (i != i2) {
            if (i2 == 12) {
                m151258c(true);
            } else if (i2 == 10) {
                m151258c(false);
            }
        }
    }

    /* renamed from: b */
    public final void mo71727b(int i, int i2) {
    }
}
