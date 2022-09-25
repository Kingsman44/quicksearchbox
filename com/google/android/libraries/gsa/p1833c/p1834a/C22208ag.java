package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.p6968aa.C89058n;
import com.google.common.p4552o.C60334or;
import com.google.common.p4552o.C60335os;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* renamed from: com.google.android.libraries.gsa.c.a.ag */
/* compiled from: PG */
final class C22208ag extends RequestFinishedInfo.Listener {
    public C22208ag(Executor executor) {
        super(executor);
    }

    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        Collection annotations = requestFinishedInfo.getAnnotations();
        if (annotations != null) {
            for (Object next : annotations) {
                if (next instanceof C89058n) {
                    C89058n nVar = (C89058n) next;
                    Long sentByteCount = requestFinishedInfo.getMetrics().getSentByteCount();
                    Long receivedByteCount = requestFinishedInfo.getMetrics().getReceivedByteCount();
                    long longValue = sentByteCount != null ? sentByteCount.longValue() : 0;
                    long longValue2 = receivedByteCount != null ? receivedByteCount.longValue() : 0;
                    RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
                    C60334or orVar = (C60334or) C60335os.f163295r.createBuilder();
                    boolean socketReused = metrics.getSocketReused();
                    orVar.copyOnWrite();
                    C60335os osVar = (C60335os) orVar.instance;
                    osVar.f163297a |= 32768;
                    osVar.f163313q = socketReused;
                    Date requestStart = metrics.getRequestStart();
                    if (requestStart != null) {
                        long time = requestStart.getTime();
                        orVar.copyOnWrite();
                        C60335os osVar2 = (C60335os) orVar.instance;
                        osVar2.f163297a |= 1;
                        osVar2.f163298b = time;
                    }
                    Date requestEnd = metrics.getRequestEnd();
                    if (requestEnd != null) {
                        long time2 = requestEnd.getTime();
                        orVar.copyOnWrite();
                        C60335os osVar3 = (C60335os) orVar.instance;
                        osVar3.f163297a |= 2;
                        osVar3.f163299c = time2;
                    }
                    Date dnsStart = metrics.getDnsStart();
                    if (dnsStart != null) {
                        long time3 = dnsStart.getTime();
                        orVar.copyOnWrite();
                        C60335os osVar4 = (C60335os) orVar.instance;
                        osVar4.f163297a |= 4;
                        osVar4.f163300d = time3;
                    }
                    Date dnsEnd = metrics.getDnsEnd();
                    if (dnsEnd != null) {
                        long time4 = dnsEnd.getTime();
                        orVar.copyOnWrite();
                        C60335os osVar5 = (C60335os) orVar.instance;
                        osVar5.f163297a |= 8;
                        osVar5.f163301e = time4;
                    }
                    Date connectStart = metrics.getConnectStart();
                    if (connectStart != null) {
                        long time5 = connectStart.getTime();
                        orVar.copyOnWrite();
                        C60335os osVar6 = (C60335os) orVar.instance;
                        osVar6.f163297a |= 16;
                        osVar6.f163302f = time5;
                    }
                    Date connectEnd = metrics.getConnectEnd();
                    if (connectEnd != null) {
                        long time6 = connectEnd.getTime();
                        orVar.copyOnWrite();
                        C60335os osVar7 = (C60335os) orVar.instance;
                        osVar7.f163297a |= 32;
                        osVar7.f163303g = time6;
                    }
                    Date sslStart = metrics.getSslStart();
                    if (sslStart != null) {
                        long time7 = sslStart.getTime();
                        orVar.copyOnWrite();
                        C60335os osVar8 = (C60335os) orVar.instance;
                        osVar8.f163297a |= 64;
                        osVar8.f163304h = time7;
                    }
                    Date sslEnd = metrics.getSslEnd();
                    if (sslEnd != null) {
                        long time8 = sslEnd.getTime();
                        orVar.copyOnWrite();
                        C60335os osVar9 = (C60335os) orVar.instance;
                        osVar9.f163297a |= 128;
                        osVar9.f163305i = time8;
                    }
                    Date sendingStart = metrics.getSendingStart();
                    if (sendingStart != null) {
                        long time9 = sendingStart.getTime();
                        orVar.copyOnWrite();
                        C60335os osVar10 = (C60335os) orVar.instance;
                        osVar10.f163297a |= 256;
                        osVar10.f163306j = time9;
                    }
                    Date sendingEnd = metrics.getSendingEnd();
                    if (sendingEnd != null) {
                        long time10 = sendingEnd.getTime();
                        orVar.copyOnWrite();
                        C60335os osVar11 = (C60335os) orVar.instance;
                        osVar11.f163297a |= 512;
                        osVar11.f163307k = time10;
                    }
                    Date pushStart = metrics.getPushStart();
                    if (pushStart != null) {
                        long time11 = pushStart.getTime();
                        orVar.copyOnWrite();
                        C60335os osVar12 = (C60335os) orVar.instance;
                        osVar12.f163297a |= 1024;
                        osVar12.f163308l = time11;
                    }
                    Date pushEnd = metrics.getPushEnd();
                    if (pushEnd != null) {
                        long time12 = pushEnd.getTime();
                        orVar.copyOnWrite();
                        C60335os osVar13 = (C60335os) orVar.instance;
                        osVar13.f163297a |= 2048;
                        osVar13.f163309m = time12;
                    }
                    Date responseStart = metrics.getResponseStart();
                    if (responseStart != null) {
                        long time13 = responseStart.getTime();
                        orVar.copyOnWrite();
                        C60335os osVar14 = (C60335os) orVar.instance;
                        osVar14.f163297a |= 4096;
                        osVar14.f163310n = time13;
                    }
                    Long ttfbMs = metrics.getTtfbMs();
                    if (ttfbMs != null) {
                        long longValue3 = ttfbMs.longValue();
                        orVar.copyOnWrite();
                        C60335os osVar15 = (C60335os) orVar.instance;
                        osVar15.f163297a |= 8192;
                        osVar15.f163311o = longValue3;
                    }
                    Long totalTimeMs = metrics.getTotalTimeMs();
                    if (totalTimeMs != null) {
                        long longValue4 = totalTimeMs.longValue();
                        orVar.copyOnWrite();
                        C60335os osVar16 = (C60335os) orVar.instance;
                        osVar16.f163297a |= 16384;
                        osVar16.f163312p = longValue4;
                    }
                    nVar.mo82967k(longValue, longValue2, (C60335os) orVar.build());
                    return;
                }
            }
        }
    }
}
