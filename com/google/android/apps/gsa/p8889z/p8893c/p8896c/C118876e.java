package com.google.android.apps.gsa.p8889z.p8893c.p8896c;

import android.content.Context;
import com.google.android.apps.gsa.c.f.al;
import com.google.android.apps.gsa.c.f.bd;
import com.google.android.apps.gsa.c.f.f;
import com.google.android.apps.gsa.c.f.g;
import com.google.android.apps.gsa.c.f.h;
import com.google.android.apps.gsa.c.f.i;
import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.speech.p7139a.C90509a;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.speech.audio.C92209t;
import com.google.android.apps.gsa.speech.p7294j.C92434d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2904c.p2976v.C38120a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.z.c.c.e */
/* compiled from: PG */
public final class C118876e {

    /* renamed from: a */
    public final u f331539a;

    /* renamed from: b */
    private final Context f331540b;

    /* renamed from: c */
    private final C22871g f331541c;

    /* renamed from: d */
    private final C92209t f331542d;

    public C118876e(Context context, C22871g gVar, u uVar, C92209t tVar) {
        this.f331540b = context;
        this.f331541c = gVar;
        this.f331539a = uVar;
        this.f331542d = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo104053a(C92434d dVar, C58833ax axVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (!C38120a.m67298b(this.f331540b, "android.permission.RECORD_AUDIO")) {
            this.f331539a.g("AudioStartHelper", axVar, false);
            return C60856cj.m92899h(new C90509a(C89885b.AUDIO_CANT_START_RECORDING_VALUE));
        } else if (!axVar.mo56113h()) {
            return C60856cj.m92899h(new RuntimeException("AudioListeningSessionAdapter is missing"));
        } else {
            this.f331542d.mo86889b(2);
            al alVar = (C74458k) axVar.mo56107c();
            C22871g gVar = this.f331541c;
            if (alVar instanceof al) {
                new C90873ag(alVar.f(), gVar, "getAudioSourceOpeningStatus", new f(dVar)).mo85223a(new g());
            } else if (alVar instanceof bd) {
                new C90873ag(((bd) alVar).f(), gVar, "getMicOpeningStatus", new h(dVar)).mo85223a(new i());
            }
            return C60856cj.m92900i(new C118875d(this, axVar));
        }
    }
}
