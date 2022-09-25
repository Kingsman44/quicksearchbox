package com.google.android.gms.usonia.directory.internal;

import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.usonia.PeerAddress;
import com.google.android.gms.usonia.auth.internal.CheckIsServiceAllowedParams;
import com.google.android.gms.usonia.p10878b.C146156b;

/* renamed from: com.google.android.gms.usonia.directory.internal.av */
/* compiled from: PG */
public final /* synthetic */ class C146232av implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ String f395087a;

    /* renamed from: b */
    public final /* synthetic */ PeerAddress f395088b;

    public /* synthetic */ C146232av(String str, PeerAddress peerAddress) {
        this.f395087a = str;
        this.f395088b = peerAddress;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        String str = this.f395087a;
        PeerAddress peerAddress = this.f395088b;
        C146248bk bkVar = new C146248bk((C146010af) obj2);
        CheckIsServiceAllowedParams checkIsServiceAllowedParams = new CheckIsServiceAllowedParams();
        checkIsServiceAllowedParams.f394858a = str;
        checkIsServiceAllowedParams.f394859b = peerAddress;
        ((C146156b) ((C146269e) obj).mo119451G()).mo122708e(bkVar, checkIsServiceAllowedParams);
    }
}
