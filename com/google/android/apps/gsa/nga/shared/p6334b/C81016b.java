package com.google.android.apps.gsa.nga.shared.p6334b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83314ii;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82435fb;
import com.google.android.apps.gsa.shared.util.C91070p;

/* renamed from: com.google.android.apps.gsa.nga.shared.b.b */
/* compiled from: PG */
public final class C81016b {

    /* renamed from: a */
    private final Context f222058a;

    /* renamed from: b */
    private final ComponentName f222059b;

    /* renamed from: c */
    private final C83305i f222060c;

    /* renamed from: d */
    private final C83314ii f222061d;

    public C81016b(Context context, ComponentName componentName, C83305i iVar, C83314ii iiVar) {
        this.f222058a = context;
        this.f222059b = componentName;
        this.f222060c = iVar;
        this.f222061d = iiVar;
    }

    /* renamed from: a */
    public final void mo74800a(Bundle bundle) {
        ComponentName b = C91070p.m148777b(this.f222058a, new Intent("com.google.android.voiceinteraction.START_VOICE_INTERACTION").setComponent(this.f222059b).putExtras(bundle));
        this.f222060c.mo75579d(new C82435fb("NGA_START_ASSISTANT_INTERACTION_SUCCESS", b != null));
        Intent intent = (Intent) bundle.getParcelable("voice_intent");
        e eVar = e.a;
        if (intent != null) {
            eVar = e.a(intent.getIntExtra("nga_triggered_by", 0));
        }
        if (b == null) {
            this.f222061d.mo75557d(1, eVar.ca, "componentName is null");
        } else {
            this.f222061d.mo75556c(1, eVar.ca, 2);
        }
    }
}
