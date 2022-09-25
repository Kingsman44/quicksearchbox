package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.animation.TimeAnimator;
import com.google.protobuf.p4750c.C62948a;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.f */
/* compiled from: PG */
public final /* synthetic */ class C33372f implements TimeAnimator.TimeListener {

    /* renamed from: a */
    public final /* synthetic */ C33375i f89415a;

    public /* synthetic */ C33372f(C33375i iVar) {
        this.f89415a = iVar;
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        this.f89415a.f89425i.setText(C33375i.m61970a(C62948a.m95459j(j)));
    }
}
