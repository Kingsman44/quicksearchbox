package com.google.android.apps.gsa.smartspace.p7258b;

import android.content.LocusId;
import android.view.contentcapture.ContentCaptureManager;
import android.view.contentcapture.DataShareRequest;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.assistant.p3886c.C50819dp;
import com.google.protobuf.MessageLite;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.smartspace.b.f */
/* compiled from: PG */
public final /* synthetic */ class C92063f implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C92070m f256662a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f256663b;

    /* renamed from: c */
    public final /* synthetic */ ContentCaptureManager f256664c;

    /* renamed from: d */
    public final /* synthetic */ String f256665d;

    /* renamed from: e */
    public final /* synthetic */ Consumer f256666e;

    public /* synthetic */ C92063f(C92070m mVar, MessageLite messageLite, ContentCaptureManager contentCaptureManager, String str, Consumer consumer) {
        this.f256662a = mVar;
        this.f256663b = messageLite;
        this.f256664c = contentCaptureManager;
        this.f256665d = str;
        this.f256666e = consumer;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C92070m mVar = this.f256662a;
        MessageLite messageLite = this.f256663b;
        ContentCaptureManager contentCaptureManager = this.f256664c;
        String str = this.f256665d;
        Consumer consumer = this.f256666e;
        C31520m c = messageLite instanceof C50819dp ? C31167ax.m58112a().mo36912c() : null;
        contentCaptureManager.shareData(new DataShareRequest(new LocusId(str), "application/x-binary"), mVar.f256687d, new C92069l(mVar, messageLite, str, consumer, cVar));
        if (c == null) {
            return "BlueChip Smartspace card share";
        }
        C31167ax.m58112a().mo36918j(c, C31164au.m58092b("SmartspaceUpdate_Push_To_AiAi"), 1);
        return "BlueChip Smartspace card share";
    }
}
