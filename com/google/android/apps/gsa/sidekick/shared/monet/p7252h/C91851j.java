package com.google.android.apps.gsa.sidekick.shared.monet.p7252h;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91765a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91775k;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.h.j */
/* compiled from: PG */
public final class C91851j {

    /* renamed from: c */
    private static final C59071e f256156c = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.monet.h.j");

    /* renamed from: a */
    public final Map f256157a = new HashMap();

    /* renamed from: b */
    public boolean f256158b;

    /* renamed from: d */
    private final C91765a f256159d;

    /* renamed from: e */
    private boolean f256160e;

    public C91851j(C91765a aVar) {
        this.f256159d = aVar;
    }

    /* renamed from: f */
    private final void m150469f(String str, C91850i iVar) {
        if (!this.f256160e) {
            this.f256157a.put(str, iVar);
        }
    }

    /* renamed from: a */
    public final void mo86339a(String str, C22939d dVar) {
        if (dVar instanceof C91850i) {
            m150469f(str, (C91850i) dVar);
        } else if (dVar instanceof C91843b) {
            m150469f(str, ((C91843b) dVar).mo86328i());
        }
    }

    /* renamed from: b */
    public final void mo86340b(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (i <= i3) {
            for (C91850i iVar : this.f256157a.values()) {
                int a = i + this.f256159d.mo86261a(iVar.mo86335iH());
                if (this.f256159d.mo86262b(iVar.mo86335iH()) + i > i2 && a <= i3) {
                    iVar.mo86337jb(a, i2, i3, i4, i5, z);
                }
            }
            this.f256158b = true;
        }
    }

    /* renamed from: c */
    public final void mo86341c(boolean z, C91775k kVar, int i, int i2, int i3) {
        if (z) {
            this.f256160e = true;
            for (C91850i iVar : this.f256157a.values()) {
                if (iVar.mo86334d()) {
                    iVar.mo86338jc(true, kVar, i + this.f256159d.mo86261a(iVar.mo86335iH()), i2, i3);
                }
            }
            this.f256158b = false;
            this.f256160e = false;
        } else if (i <= i3) {
            for (C91850i iVar2 : this.f256157a.values()) {
                int a = i + this.f256159d.mo86261a(iVar2.mo86335iH());
                if (this.f256159d.mo86262b(iVar2.mo86335iH()) + i > i2 && a <= i3) {
                    iVar2.mo86338jc(false, kVar, a, i2, i3);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo86342d() {
        if (this.f256160e) {
            C59104x d = f256156c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ViewRecorderPropagator");
            ((C59052c) ((C59052c) d).mo56372aa(11917)).mo56386p("You should not unregister all participants during stopRecording with forceRender true.");
            int i = C90755l.f253831a;
        }
        for (C91850i ja : this.f256157a.values()) {
            ja.mo86336ja();
        }
        this.f256157a.clear();
    }

    /* renamed from: e */
    public final void mo86343e(String str) {
        C91850i iVar;
        if (!this.f256160e && (iVar = (C91850i) this.f256157a.remove(str)) != null) {
            iVar.mo86336ja();
        }
    }
}
