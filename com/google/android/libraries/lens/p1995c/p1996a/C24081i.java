package com.google.android.libraries.lens.p1995c.p1996a;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87740bv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87953js;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87955ju;
import com.google.lens.sdk.PendingIntentConsumer;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.android.libraries.lens.c.a.i */
/* compiled from: PG */
public final class C24081i implements C24082j {

    /* renamed from: a */
    public final C24083k f65778a;

    /* renamed from: b */
    public PendingIntentConsumer f65779b;

    /* renamed from: c */
    private final Queue f65780c = new ArrayDeque();

    public C24081i(Context context, C24076d dVar) {
        this.f65778a = new C24091s(context, this, dVar);
    }

    /* renamed from: h */
    private final boolean m44711h() {
        C87955ju b = mo29473b();
        return (b.f237884a & 2) != 0 && this.f65778a.mo29479a() >= b.f237886c;
    }

    /* renamed from: a */
    public final C87953js mo29472a() {
        C24092t.m44741a();
        C24092t.m44742b(this.f65778a.mo29483f(), "getLensCapabilities() called when Lens is not ready.");
        if (!this.f65778a.mo29483f()) {
            return C87953js.f237872i;
        }
        C24083k kVar = this.f65778a;
        C24092t.m44741a();
        C24091s sVar = (C24091s) kVar;
        C24092t.m44742b(C24091s.m44728l(sVar.f65795d), "Attempted to use LensCapabilities before ready.");
        return sVar.f65798g;
    }

    /* renamed from: b */
    public final C87955ju mo29473b() {
        C24092t.m44741a();
        C24092t.m44742b(this.f65778a.mo29483f(), "getServerFlags() called before ready.");
        if (!this.f65778a.mo29483f()) {
            return C87955ju.f237882f;
        }
        C24083k kVar = this.f65778a;
        C24092t.m44741a();
        C24091s sVar = (C24091s) kVar;
        C24092t.m44742b(C24091s.m44728l(sVar.f65795d), "Attempted to use ServerFlags before ready.");
        return sVar.f65797f;
    }

    /* renamed from: c */
    public final void mo29474c() {
        while (this.f65780c.peek() != null) {
            ((C24080h) this.f65780c.remove()).mo29471a(this.f65778a.mo29484g());
        }
    }

    /* renamed from: d */
    public final boolean mo29475d(Bundle bundle) {
        C24092t.m44741a();
        if (!this.f65778a.mo29483f()) {
            Log.i("LensServiceBridge", "Lens session is not ready.");
            return false;
        }
        C87740bv bvVar = (C87740bv) C87741bw.f237477c.createBuilder();
        C87739bu buVar = C87739bu.LENS_SERVICE_IMAGE_INJECT;
        bvVar.copyOnWrite();
        C87741bw bwVar = (C87741bw) bvVar.instance;
        bwVar.f237480b = buVar.f237476dL;
        bwVar.f237479a |= 1;
        try {
            this.f65778a.mo29480b(((C87741bw) bvVar.build()).toByteArray(), new SystemParcelableWrapper(bundle));
            return true;
        } catch (RemoteException | SecurityException e) {
            Log.e("LensServiceBridge", "Failed to inject image.", e);
            return false;
        }
    }

    /* renamed from: e */
    public final void mo29476e(C24080h hVar) {
        C24092t.m44741a();
        if (this.f65778a.mo29483f() || this.f65778a.mo29482d()) {
            hVar.mo29471a(this.f65778a.mo29484g());
            return;
        }
        this.f65780c.add(hVar);
        C24091s sVar = (C24091s) this.f65778a;
        int i = sVar.f65795d;
        if (!C24091s.m44726j(i) && !C24091s.m44727k(i)) {
            sVar.mo29494m();
        }
    }

    /* renamed from: f */
    public final int mo29477f() {
        C24092t.m44741a();
        if (!this.f65778a.mo29483f()) {
            return this.f65778a.mo29484g();
        }
        return m44711h() ? 2 : 13;
    }

    /* renamed from: g */
    public final int mo29478g() {
        C24092t.m44741a();
        if (!this.f65778a.mo29483f()) {
            return this.f65778a.mo29484g();
        }
        if (!m44711h()) {
            return 13;
        }
        C87955ju b = mo29473b();
        return ((b.f237884a & 8) == 0 || this.f65778a.mo29479a() < b.f237888e) ? 13 : 2;
    }
}
