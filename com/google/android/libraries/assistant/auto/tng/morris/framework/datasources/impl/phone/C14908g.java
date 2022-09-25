package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone;

import android.net.Uri;
import android.os.Bundle;
import android.telecom.Call;
import android.telecom.DisconnectCause;
import android.telecom.GatewayInfo;
import android.telecom.PhoneAccountHandle;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.car.CarCall;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.g */
/* compiled from: PG */
public final class C14908g {

    /* renamed from: a */
    public static final C59071e f44830a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.g");

    /* renamed from: b */
    final AtomicInteger f44831b = new AtomicInteger();

    /* renamed from: c */
    public final ConcurrentHashMap f44832c = new ConcurrentHashMap();

    /* renamed from: a */
    public final Call mo21835a(CarCall carCall) {
        for (Call call : this.f44832c.keySet()) {
            if (((CarCall) this.f44832c.get(call)).equals(carCall)) {
                return call;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final CarCall mo21836b(Call call, int i) {
        DisconnectCause disconnectCause;
        CharSequence charSequence;
        Uri uri;
        long j;
        Uri uri2;
        Uri uri3;
        Call.Details details = call.getDetails();
        GatewayInfo gatewayInfo = null;
        if (details == null) {
            disconnectCause = null;
        } else {
            disconnectCause = details.getDisconnectCause();
        }
        if (disconnectCause == null) {
            charSequence = null;
        } else {
            charSequence = disconnectCause.getLabel();
        }
        if (details != null) {
            gatewayInfo = details.getGatewayInfo();
        }
        if (details == null) {
            uri = Uri.EMPTY;
        } else {
            uri = details.getHandle();
        }
        Uri uri4 = uri;
        String callerDisplayName = details == null ? BuildConfig.FLAVOR : details.getCallerDisplayName();
        String obj = charSequence == null ? BuildConfig.FLAVOR : charSequence.toString();
        if (details == null) {
            j = 0;
        } else {
            j = details.getConnectTimeMillis();
        }
        long j2 = j;
        if (gatewayInfo == null) {
            uri2 = Uri.EMPTY;
        } else {
            uri2 = gatewayInfo.getOriginalAddress();
        }
        Uri uri5 = uri2;
        if (gatewayInfo == null) {
            uri3 = Uri.EMPTY;
        } else {
            uri3 = gatewayInfo.getGatewayAddress();
        }
        return new CarCall(i, mo21837c(call.getParent()), call.getCannedTextResponses(), call.getRemainingPostDialSequence(), call.getState(), new CarCall.Details(uri4, callerDisplayName, obj, j2, uri5, uri3, 2, (PhoneAccountHandle) null, 1, new Bundle(), new Bundle(), 4, (GatewayInfo) null), call.getChildren() != null && !call.getChildren().isEmpty(), (List) null, (List) null);
    }

    /* renamed from: c */
    public final CarCall mo21837c(Call call) {
        CarCall carCall;
        if (call == null) {
            return null;
        }
        CarCall carCall2 = (CarCall) this.f44832c.get(call);
        if (carCall2 == null) {
            carCall = mo21836b(call, this.f44831b.getAndIncrement());
        } else {
            carCall = mo21836b(call, carCall2.f387931a);
        }
        this.f44832c.put(call, carCall);
        return carCall;
    }

    /* renamed from: d */
    public final C58485gu mo21838d(List list) {
        C58480gp e = C58485gu.m89837e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CarCall c = mo21837c((Call) it.next());
            if (c != null) {
                e.mo55395g(c);
            }
        }
        return e.mo55394f();
    }
}
