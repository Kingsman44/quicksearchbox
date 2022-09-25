package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8651g.C115485b;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.do */
/* compiled from: PG */
public final /* synthetic */ class C115299do implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C115315ed f319922a;

    public /* synthetic */ C115299do(C115315ed edVar) {
        this.f319922a = edVar;
    }

    public final void run() {
        C115315ed edVar = this.f319922a;
        C115314ec a = edVar.mo101954a();
        C115312ea eaVar = edVar.f319957e;
        C52174hz a2 = a.mo101947a();
        int i = a.f319951a.f136916d;
        C115257c cVar = new C115257c();
        cVar.mo101914e(0);
        cVar.f319811g = C58836b.f156633a;
        cVar.mo101911b(0);
        cVar.mo101910a();
        cVar.mo101912c(false);
        cVar.mo101913d();
        short s = cVar.f319818n;
        C58836b bVar = C58836b.f156633a;
        cVar.f319808d = bVar;
        cVar.f319814j = bVar;
        cVar.f319813i = bVar;
        cVar.f319812h = bVar;
        cVar.f319815k = true;
        cVar.f319816l = true;
        cVar.f319817m = true;
        cVar.f319818n = (short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (s | 512)) | 64)) | 32768)) | 2048)) | 1024)) | 2)) | 128)) | 256)) | 4096)) | 8192)) | 16384);
        cVar.f319811g = C115485b.m191567a(a2);
        cVar.mo101911b(i);
        cVar.mo101913d();
        cVar.mo101910a();
        cVar.mo101912c(true);
        cVar.mo101914e(1);
        C52568wo woVar = a2.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        cVar.f319812h = C58833ax.m90833j(C58837ba.m90856e(woVar.f137998e));
        if (cVar.f319818n != -1) {
            StringBuilder sb = new StringBuilder();
            if ((cVar.f319818n & 1) == 0) {
                sb.append(" state");
            }
            if ((cVar.f319818n & 2) == 0) {
                sb.append(" mediaSessionId");
            }
            if ((cVar.f319818n & 4) == 0) {
                sb.append(" currentMediaItemIndex");
            }
            if ((cVar.f319818n & 8) == 0) {
                sb.append(" buffering");
            }
            if ((cVar.f319818n & 16) == 0) {
                sb.append(" paused");
            }
            if ((cVar.f319818n & 32) == 0) {
                sb.append(" playing");
            }
            if ((cVar.f319818n & 64) == 0) {
                sb.append(" durationMillis");
            }
            if ((cVar.f319818n & 128) == 0) {
                sb.append(" millisPlayed");
            }
            if ((cVar.f319818n & 256) == 0) {
                sb.append(" millisPlayedInWindow");
            }
            if ((cVar.f319818n & 512) == 0) {
                sb.append(" bufferedPercentage");
            }
            if ((cVar.f319818n & 1024) == 0) {
                sb.append(" lastPositionUpdateTime");
            }
            if ((cVar.f319818n & 2048) == 0) {
                sb.append(" hasReachedEnd");
            }
            if ((cVar.f319818n & 4096) == 0) {
                sb.append(" supportsSeek");
            }
            if ((cVar.f319818n & 8192) == 0) {
                sb.append(" supportsSkipNext");
            }
            if ((cVar.f319818n & 16384) == 0) {
                sb.append(" supportsSkipPrevious");
            }
            if ((cVar.f319818n & 32768) == 0) {
                sb.append(" hasError");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        eaVar.mo77784b(new C115284d(cVar.f319805a, cVar.f319806b, cVar.f319807c, cVar.f319808d, cVar.f319809e, cVar.f319810f, cVar.f319811g, cVar.f319812h, cVar.f319813i, cVar.f319814j, cVar.f319815k, cVar.f319816l, cVar.f319817m));
    }
}
