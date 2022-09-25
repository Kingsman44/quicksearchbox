package com.google.apps.tiktok.inject.baseclasses;

import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.C2393x;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47825fg;
import com.google.apps.tiktok.tracing.C47831fm;

/* compiled from: PG */
public final class TracedFragmentLifecycle implements C2376g {

    /* renamed from: a */
    private final C2393x f122865a;

    /* renamed from: b */
    private final C47515ab f122866b;

    public TracedFragmentLifecycle(C47515ab abVar, C2393x xVar) {
        this.f122865a = xVar;
        this.f122866b = abVar;
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        C47831fm.m85023r();
        try {
            this.f122865a.mo5793e(C2382m.ON_CREATE);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C47213i.m83983a(th, th);
        }
        throw th;
    }

    /* renamed from: gW */
    public final void mo3521gW(C2391v vVar) {
        C47573bx bxVar;
        C47515ab abVar = this.f122866b;
        C47816ey eyVar = abVar.f123353a;
        if (eyVar != null) {
            bxVar = eyVar.mo51644a();
        } else {
            C47816ey eyVar2 = abVar.f123354b;
            if (eyVar2 != null) {
                bxVar = eyVar2.mo51644a();
            } else {
                C47831fm.m85023r();
                bxVar = C47825fg.f123846a;
            }
        }
        try {
            this.f122865a.mo5793e(C2382m.ON_DESTROY);
            bxVar.close();
            return;
        } catch (Throwable th) {
            C47213i.m83983a(th, th);
        }
        throw th;
    }

    /* renamed from: gX */
    public final void mo3522gX(C2391v vVar) {
        C47831fm.m85023r();
        try {
            this.f122865a.mo5793e(C2382m.ON_PAUSE);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C47213i.m83983a(th, th);
        }
        throw th;
    }

    /* renamed from: gY */
    public final void mo3523gY(C2391v vVar) {
        C47573bx bxVar;
        C47515ab abVar = this.f122866b;
        try {
            C47816ey eyVar = abVar.f123353a;
            if (eyVar != null) {
                bxVar = eyVar.mo51644a();
            } else {
                C47816ey eyVar2 = abVar.f123354b;
                if (eyVar2 != null) {
                    bxVar = eyVar2.mo51644a();
                    abVar.f123353a = null;
                } else {
                    C47831fm.m85023r();
                    bxVar = C47825fg.f123846a;
                    abVar.f123353a = null;
                }
            }
            try {
                this.f122865a.mo5793e(C2382m.ON_RESUME);
                bxVar.close();
                return;
            } catch (Throwable th) {
                C47213i.m83983a(th, th);
            }
            throw th;
        } finally {
            abVar.f123353a = null;
        }
    }

    /* renamed from: gZ */
    public final void mo3524gZ(C2391v vVar) {
        C47831fm.m85023r();
        try {
            this.f122865a.mo5793e(C2382m.ON_START);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C47213i.m83983a(th, th);
        }
        throw th;
    }

    /* renamed from: ha */
    public final void mo3525ha(C2391v vVar) {
        C47831fm.m85023r();
        try {
            this.f122865a.mo5793e(C2382m.ON_STOP);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C47213i.m83983a(th, th);
        }
        throw th;
    }
}
