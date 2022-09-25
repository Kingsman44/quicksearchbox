package com.google.android.apps.gsa.nga.engine.recognition.concurrency;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.recognition.C77548aa;
import com.google.android.apps.gsa.nga.engine.recognition.C77892x;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80561f;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.voiceinteraction.hotword.C118726n;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37561eb;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.concurrency.f */
/* compiled from: PG */
public final class C77610f implements C77892x {

    /* renamed from: a */
    private final Context f213826a;

    /* renamed from: b */
    private final C91142g f213827b;

    /* renamed from: c */
    private int f213828c = 0;

    public C77610f(Context context, C91142g gVar) {
        this.f213826a = context;
        this.f213827b = gVar;
    }

    /* renamed from: b */
    private final void m124557b(boolean z) {
        Intent intent = new Intent("com.google.android.googlequicksearchbox.HOTWORD_STATUS_CHANGED");
        intent.putExtra("audio_source_type", 7);
        intent.putExtra("audio_active", z);
        intent.setPackage("com.google.android.googlequicksearchbox");
        this.f213826a.sendOrderedBroadcast(intent, "android.permission.MANAGE_VOICE_KEYPHRASES");
    }

    /* renamed from: c */
    private static boolean m124558c(C77548aa aaVar) {
        return aaVar == C77548aa.DSP || aaVar == C77548aa.PREEMPTIBLE;
    }

    /* renamed from: a */
    public final void mo72712a(C77548aa aaVar) {
        if (!m124558c(aaVar) || C118726n.m197095c(this.f213827b.mo85405j(C90082eg.f249911aa))) {
            int i = this.f213828c - 1;
            this.f213828c = i;
            if (i == 0) {
                m124557b(false);
            }
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo72713g(C80561f fVar, C37514du duVar) {
    }

    /* renamed from: h */
    public final /* synthetic */ void mo72715h(Optional optional) {
    }

    /* renamed from: i */
    public final /* synthetic */ void mo72716i(C80561f fVar, C37561eb ebVar) {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo72717j(C80561f fVar, int i) {
    }

    /* renamed from: k */
    public final void mo72718k(C77548aa aaVar) {
        if (!m124558c(aaVar) || C118726n.m197095c(this.f213827b.mo85405j(C90082eg.f249911aa))) {
            int i = this.f213828c;
            this.f213828c = i + 1;
            if (i == 0) {
                m124557b(true);
            }
        }
    }

    /* renamed from: l */
    public final /* synthetic */ void mo72719l(C77548aa aaVar) {
    }
}
