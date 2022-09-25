package com.google.android.apps.gsa.speech.p7311n;

import android.content.Context;
import android.database.DataSetObservable;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p395al.p408c.p414c.p416b.C8512v;
import com.google.p395al.p408c.p414c.p416b.C8513w;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.speech.n.i */
/* compiled from: PG */
public final class C92541i extends DataSetObservable {

    /* renamed from: a */
    public final C86338r f258268a;

    /* renamed from: b */
    public final Object f258269b = new Object();

    /* renamed from: c */
    public C8513w f258270c;

    /* renamed from: d */
    public C8513w f258271d;

    /* renamed from: e */
    public volatile boolean f258272e;

    /* renamed from: f */
    private final Context f258273f;

    /* renamed from: g */
    private C8513w f258274g;

    public C92541i(Context context, C86338r rVar) {
        C8512v vVar = (C8512v) C8513w.f29529p.createBuilder();
        vVar.copyOnWrite();
        C8513w wVar = (C8513w) vVar.instance;
        wVar.f29531a |= 1;
        wVar.f29532b = BuildConfig.FLAVOR;
        this.f258274g = (C8513w) vVar.build();
        this.f258272e = false;
        this.f258273f = context;
        this.f258268a = rVar;
    }

    /* renamed from: c */
    public static C8513w m152354c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (C8513w) C62942bv.parseFrom((C62942bv) C8513w.f29529p, bArr, C62921ba.m95368a());
        } catch (C62974ct unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m152355f(C8513w wVar) {
        return wVar != null && !wVar.f29532b.isEmpty();
    }

    /* renamed from: g */
    private static void m152356g(String str, C8513w wVar, C86337q qVar) {
        if (wVar != null) {
            qVar.mo80068c(str, wVar.toByteArray());
        } else {
            qVar.mo80075j(str);
        }
    }

    /* renamed from: a */
    public final C8513w mo87316a() {
        C8513w wVar;
        synchronized (this.f258269b) {
            wVar = this.f258274g;
        }
        return wVar;
    }

    /* renamed from: b */
    public final C8513w mo87317b() {
        C58976aa aaVar = C58975e.f156826a;
        try {
            return (C8513w) C62942bv.parseFrom((C62942bv) C8513w.f29529p, C90772bp.m148288O(this.f258273f.getResources(), R.raw.default_voice_search_configuration), C62921ba.m95368a());
        } catch (C62974ct e) {
            throw new RuntimeException("Unable to parse default configuration from asset", e);
        }
    }

    /* renamed from: d */
    public final void mo87318d() {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f258269b) {
            C8513w wVar = this.f258271d;
            if (wVar == null) {
                C8513w wVar2 = this.f258270c;
                if (wVar2 != null) {
                    this.f258274g = wVar2;
                }
            } else {
                C8513w wVar3 = this.f258270c;
                if (wVar3 != null) {
                    try {
                        this.f258274g = (C8513w) ((C8512v) ((C8512v) wVar3.toBuilder()).mergeFrom(wVar.toByteArray(), C62921ba.m95368a())).build();
                    } catch (C62974ct e) {
                        throw new AssertionError(e);
                    }
                }
            }
        }
        notifyChanged();
    }

    /* renamed from: e */
    public final void mo87319e() {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f258269b) {
            C86337q b = this.f258268a.mo80076b();
            m152356g("voice_search_configuration_data", this.f258270c, b);
            m152356g("voice_search_configuration_override", this.f258271d, b);
            b.apply();
        }
    }
}
