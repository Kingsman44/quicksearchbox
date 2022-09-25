package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9843a;

import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.android.libraries.search.p2904c.C37362b;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.C37776k;
import com.google.android.libraries.search.p2904c.C37819l;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.a.d */
/* compiled from: PG */
public final class C129707d implements C37362b {

    /* renamed from: a */
    final /* synthetic */ C129710g f355941a;

    public C129707d(C129710g gVar) {
        this.f355941a = gVar;
    }

    /* renamed from: k */
    public final Executor mo39011k() {
        return this.f355941a.f355944b;
    }

    /* renamed from: b */
    public final void mo39010b(C37819l lVar) {
        C37680i iVar;
        int i = lVar.f100343b;
        int a = C37776k.m66678a(i);
        int i2 = a - 1;
        if (a == 0) {
            throw null;
        } else if (i2 == 0) {
            C32534ai aiVar = this.f355941a.f355950h;
            if (aiVar != null) {
                if (i == 1) {
                    iVar = (C37680i) lVar.f100344c;
                } else {
                    iVar = C37680i.f100071c;
                }
                aiVar.mo38137d(iVar.f100074b);
            }
        } else if (i2 == 1) {
            C32534ai aiVar2 = this.f355941a.f355950h;
            if (aiVar2 != null) {
                aiVar2.mo38135c((Throwable) null);
            }
            this.f355941a.f355947e.set(false);
        }
    }
}
