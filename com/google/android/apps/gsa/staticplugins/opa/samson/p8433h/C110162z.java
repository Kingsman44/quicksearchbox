package com.google.android.apps.gsa.staticplugins.opa.samson.p8433h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.media.C87594r;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110420g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.h.z */
/* compiled from: PG */
public class C110162z implements C110420g {

    /* renamed from: a */
    final C87594r f306977a;

    /* renamed from: b */
    private final Context f306978b;

    /* renamed from: c */
    private final C86124t f306979c;

    public C110162z(Context context, C86124t tVar, C22871g gVar, C22871g gVar2) {
        this.f306978b = context;
        this.f306979c = tVar;
        this.f306977a = new C87594r(context, gVar, gVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo98406a(Intent intent) {
    }

    /* renamed from: b */
    public final Intent mo98440b() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this.f306978b, "com.google.android.apps.gsa.staticplugins.opa.experience.OpaMActivity"));
        mo98406a(intent);
        MediaController a = this.f306977a.mo81722a((String) null, false, true);
        if (a != null) {
            PlaybackState playbackState = a.getPlaybackState();
            boolean z = playbackState != null && playbackState.getState() == 3;
            C58976aa aaVar = C58975e.f156826a;
            if (z) {
                MediaController a2 = this.f306977a.mo81722a((String) null, false, true);
                C58485gu c = this.f306979c.mo79745c(C90014bt.f247198cd);
                if (a2 == null || c.contains(a2.getPackageName())) {
                    return null;
                }
                return intent;
            }
        }
        return null;
    }
}
