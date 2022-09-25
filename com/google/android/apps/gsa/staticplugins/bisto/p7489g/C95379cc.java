package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.cc */
/* compiled from: PG */
public final class C95379cc extends ContentObserver implements AutoCloseable {

    /* renamed from: a */
    public static final C59071e f266882a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.g.cc");

    /* renamed from: b */
    public final C95355bf f266883b;

    /* renamed from: c */
    public final C22871g f266884c;

    /* renamed from: d */
    public int f266885d;

    /* renamed from: e */
    private final Context f266886e;

    /* renamed from: f */
    private final AudioManager f266887f;

    public C95379cc(Context context, C95355bf bfVar, C22871g gVar, C95850a aVar) {
        super((Handler) null);
        this.f266886e = context;
        this.f266883b = bfVar;
        this.f266884c = gVar;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.f266887f = audioManager;
        this.f266885d = audioManager.getStreamVolume(3);
        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
        C58976aa aaVar = C58975e.f156826a;
        aVar.f268408a.add(this);
    }

    /* renamed from: a */
    public final void mo89316a(int i, boolean z) {
        this.f266884c.mo28212l("sync-volume", new C95378cb(this, i, z));
    }

    public final void close() {
        this.f266886e.getContentResolver().unregisterContentObserver(this);
    }

    public final boolean deliverSelfNotifications() {
        return false;
    }

    public final void onChange(boolean z) {
        mo89316a(this.f266887f.getStreamVolume(3), false);
    }
}
