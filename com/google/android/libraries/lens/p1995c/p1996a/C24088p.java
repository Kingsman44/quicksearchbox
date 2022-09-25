package com.google.android.libraries.lens.p1995c.p1996a;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87936jb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87953js;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87955ju;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87956jv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.lens.sdk.PendingIntentConsumer;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.lens.c.a.p */
/* compiled from: PG */
public final /* synthetic */ class C24088p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C24091s f65787a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f65788b;

    /* renamed from: c */
    public final /* synthetic */ SystemParcelableWrapper f65789c;

    public /* synthetic */ C24088p(C24091s sVar, byte[] bArr, SystemParcelableWrapper systemParcelableWrapper) {
        this.f65787a = sVar;
        this.f65788b = bArr;
        this.f65789c = systemParcelableWrapper;
    }

    public final void run() {
        Object obj;
        C24091s sVar = this.f65787a;
        byte[] bArr = this.f65788b;
        SystemParcelableWrapper systemParcelableWrapper = this.f65789c;
        int i = sVar.f65795d;
        if (i == 4 || i == 5) {
            try {
                C88246uo uoVar = (C88246uo) C62942bv.parseFrom((C62942bv) C88246uo.f238696c, bArr, C62921ba.m95368a());
                C88244um a = C88244um.m142794a(uoVar.f238699b);
                if (a == null) {
                    a = C88244um.ATTACH_WEBVIEW;
                }
                if (a == C88244um.LENS_SERVICE_API_VERSION) {
                    C62940bt r0 = C62942bv.checkIsLite(C87936jb.f237854a);
                    uoVar.mo58887l(r0);
                    Object l = uoVar.f169962ag.mo58854l(r0.f169971d);
                    if (l == null) {
                        obj = r0.f169969b;
                    } else {
                        obj = r0.mo58889c(l);
                    }
                    C87956jv jvVar = (C87956jv) obj;
                    sVar.f65796e = jvVar.f237892b;
                    C87955ju juVar = jvVar.f237893c;
                    if (juVar == null) {
                        juVar = C87955ju.f237882f;
                    }
                    sVar.f65797f = juVar;
                    C87953js jsVar = jvVar.f237894d;
                    if (jsVar == null) {
                        jsVar = C87953js.f237872i;
                    }
                    sVar.f65798g = jsVar;
                    int i2 = jvVar.f237897g;
                    sVar.f65801j = 2;
                    sVar.mo29493i(5);
                    return;
                }
                int i3 = uoVar.f238699b;
                C88244um a2 = C88244um.m142794a(i3);
                if (a2 == null) {
                    a2 = C88244um.ATTACH_WEBVIEW;
                }
                if (a2 == C88244um.LENS_SERVICE_SESSION_STARTED) {
                    long j = ((Bundle) systemParcelableWrapper.f229193a).getLong("session_id");
                    Log.d("LensServiceConnImpl", "Received session id " + j);
                    return;
                }
                C24082j jVar = sVar.f65794c;
                C88244um a3 = C88244um.m142794a(i3);
                if (a3 == null) {
                    a3 = C88244um.ATTACH_WEBVIEW;
                }
                if (a3 == C88244um.LENS_SERVICE_RESPONSE_PENDING_INTENT) {
                    Log.d("LensServiceBridge", "On response pending intent service event");
                    Parcelable parcelable = systemParcelableWrapper.f229193a;
                    if (parcelable instanceof PendingIntent) {
                        PendingIntent pendingIntent = (PendingIntent) parcelable;
                        ((C24081i) jVar).f65778a.mo29481c();
                        PendingIntentConsumer pendingIntentConsumer = ((C24081i) jVar).f65779b;
                        if (pendingIntentConsumer == null) {
                            Log.e("LensServiceBridge", "PendingIntentConsumer cannot be null");
                        } else {
                            pendingIntentConsumer.onReceivedPendingIntent(pendingIntent);
                        }
                    }
                }
            } catch (C62974ct e) {
                Log.e("LensServiceConnImpl", "Unable to parse the protobuf.", e);
                sVar.f65801j = 11;
                sVar.mo29493i(8);
            }
        } else {
            Log.w("LensServiceConnImpl", "ServiceEvent received after connection disposed.");
        }
    }
}
