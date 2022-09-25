package com.google.android.apps.gsa.nga.shared.p6339f;

import android.os.Build;
import com.google.android.apps.gsa.nga.api.a.bt;
import com.google.android.apps.gsa.nga.api.a.df;
import com.google.android.apps.gsa.nga.api.a.di;
import com.google.android.apps.gsa.nga.api.a.h;
import com.google.android.apps.gsa.nga.api.p5883a.C74672br;
import com.google.android.apps.gsa.nga.api.p5883a.C74673bs;
import com.google.android.apps.gsa.nga.api.p5883a.C74677cq;
import com.google.android.apps.gsa.nga.api.p5883a.C74678cw;
import com.google.android.apps.gsa.nga.api.p5883a.C74679dm;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81060a;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82302ad;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82308aj;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82368cp;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82491hd;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82510hw;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82511hx;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82530ip;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82531iq;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82568k;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82598lc;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82599ld;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82649n;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.c */
/* compiled from: PG */
public final class C81042c {

    /* renamed from: a */
    public final C83305i f222112a;

    /* renamed from: b */
    public final C21370a f222113b;

    /* renamed from: c */
    private final C84516aa f222114c;

    public C81042c(C83305i iVar, C84516aa aaVar, C21370a aVar) {
        this.f222112a = iVar;
        this.f222114c = aaVar;
        this.f222113b = aVar;
    }

    /* renamed from: a */
    public final C82598lc mo74831a() {
        C82598lc l = C82599ld.m131673l();
        C82368cp cpVar = (C82368cp) l;
        cpVar.f225013b = "BISTO";
        l.mo75889c(2);
        cpVar.f225014c = "N/A";
        cpVar.f225016e = "DSP";
        boolean isDeviceLocked = this.f222114c.f230023b.isDeviceLocked();
        C58976aa aaVar = C58975e.f156826a;
        String valueOf = String.valueOf(isDeviceLocked);
        if (valueOf != null) {
            cpVar.f225017f = valueOf;
            cpVar.f225018g = C81060a.m129008a(Build.MODEL);
            return l;
        }
        throw new NullPointerException("Null screenLocked");
    }

    /* renamed from: b */
    public final void mo74832b() {
        C83305i iVar = this.f222112a;
        C82510hw c = C82511hx.m131278c();
        ((C82568k) c).f225471b = "PARSING_FAILED";
        iVar.mo75579d(c.mo76548a());
    }

    /* renamed from: c */
    public final void mo74833c(h hVar) {
        C83305i iVar = this.f222112a;
        String name = hVar.name();
        if (name != null) {
            iVar.mo75579d(new C82308aj("HOTWORD_VERIFICATION_STATUS", name));
            return;
        }
        throw new NullPointerException("Null status");
    }

    /* renamed from: f */
    public final void mo74836f() {
        C83305i iVar = this.f222112a;
        C82530ip c = C82531iq.m131371c();
        ((C82302ad) c).f224818b = "ACCEPTED";
        iVar.mo75579d(c.mo75605a());
    }

    /* renamed from: g */
    public final void mo74837g(int i) {
        C83305i iVar = this.f222112a;
        C82530ip c = C82531iq.m131371c();
        ((C82302ad) c).f224818b = C74679dm.m120751a(i);
        iVar.mo75579d(c.mo75605a());
    }

    /* renamed from: d */
    public final void mo74834d(bt btVar) {
        String str;
        int i = btVar.a;
        int a = C74673bs.m120742a(i);
        int i2 = a - 1;
        if (a != 0) {
            if (i2 != 0) {
                int i3 = 1;
                if (i2 != 1) {
                    str = "UNKNOWN";
                } else {
                    if (i == 2) {
                        int c = C74672br.m120741c(((Integer) btVar.b).intValue());
                        if (c != 0) {
                            i3 = c;
                        }
                    } else {
                        i3 = 2;
                    }
                    str = C74672br.m120739a(i3);
                }
            } else {
                str = "ACCEPTED";
            }
            this.f222112a.mo75579d(new C82491hd("PUSH_TO_TALK_STATUS", str));
            return;
        }
        throw null;
    }

    /* renamed from: e */
    public final void mo74835e(di diVar) {
        String str;
        df dfVar;
        int i = diVar.a;
        int a = C74677cq.m120748a(i);
        int i2 = a - 1;
        if (a != 0) {
            if (i2 == 0) {
                str = "SUCCESS";
            } else if (i2 != 1) {
                str = "UNKNOWN";
            } else {
                if (i == 2) {
                    dfVar = (df) diVar.b;
                } else {
                    dfVar = df.c;
                }
                int b = C74678cw.m120750b(dfVar.a);
                String a2 = C74678cw.m120749a(b);
                if (b != 0) {
                    str = a2;
                } else {
                    throw null;
                }
            }
            this.f222112a.mo75579d(new C82649n("BISTO_TRANSCRIPTION_STATUS", str));
            return;
        }
        throw null;
    }
}
