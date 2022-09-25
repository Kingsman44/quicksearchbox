package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.apps.gsa.nga.engine.p6044n.p6049c.C76288a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80309bd;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.x */
/* compiled from: PG */
public final class C76339x implements C76288a {

    /* renamed from: a */
    private final C58974d f211430a = C58974d.m91136j();

    /* renamed from: b */
    private final AudioManager f211431b;

    public C76339x(Context context) {
        this.f211431b = (AudioManager) context.getSystemService(AudioManager.class);
    }

    /* renamed from: a */
    public final C60870cx mo72159a(C80295aq aqVar, C65475b bVar) {
        C80309bd bdVar;
        AudioManager audioManager = this.f211431b;
        if (audioManager != null) {
            if (aqVar.f220359a == 13) {
                bdVar = (C80309bd) aqVar.f220360b;
            } else {
                bdVar = C80309bd.f220388b;
            }
            audioManager.setRingerMode(bdVar.f220390a);
        } else {
            ((C58970a) ((C58970a) this.f211430a.mo56225c()).mo56372aa(3519)).mo56386p("AudioManager is not available. Not changing the ringer mode.");
        }
        return C118826c.f331423b;
    }

    /* renamed from: b */
    public final int mo72160b() {
        return 60013;
    }
}
