package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.content.Intent;
import android.net.Uri;
import android.provider.Telephony;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6727dt.C85458b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.x */
/* compiled from: PG */
public final /* synthetic */ class C93052x implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ ChatPerformer f259565a;

    /* renamed from: b */
    public final /* synthetic */ boolean f259566b;

    /* renamed from: c */
    public final /* synthetic */ C85458b f259567c;

    public /* synthetic */ C93052x(ChatPerformer chatPerformer, boolean z, C85458b bVar) {
        this.f259565a = chatPerformer;
        this.f259566b = z;
        this.f259567c = bVar;
    }

    public final C60870cx apply(Object obj) {
        ChatPerformer chatPerformer = this.f259565a;
        boolean z = this.f259566b;
        C85458b bVar = this.f259567c;
        C118826c cVar = (C118826c) obj;
        if (z) {
            chatPerformer.f259390b.mo27807a(new Intent("android.intent.action.SENDTO", Uri.fromParts("sms", bVar.f231289d[0], (String) null)).setPackage(Telephony.Sms.getDefaultSmsPackage(chatPerformer.f259391c)).putExtra("android.intent.extra.TEXT", BuildConfig.FLAVOR).addFlags(32768).addFlags(268435456));
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }
}
